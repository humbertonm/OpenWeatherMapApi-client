package mx.com.epam.testing.training.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import mx.com.epam.testing.training.CurrentWeather;
import mx.com.epam.testing.training.exception.CurrentWeatherException;
import mx.com.epam.testing.training.model.CurrentWeatherResponse;
import mx.com.epam.testing.training.request.Language;
import mx.com.epam.testing.training.request.OptionalParams;
import mx.com.epam.testing.training.request.TempUnit;
import mx.com.epam.testing.training.request.Mode;

public class CurrentWeatherDanteClient implements CurrentWeather {

	private URL url;
	private CurrentWeatherResponse response;
	private String output;
	private static final Gson gson = new Gson();

	public CurrentWeatherResponse findByCityName(String cityName, String countryCode, OptionalParams optionalParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public CurrentWeatherResponse findByCityId(int cityId, OptionalParams optionalParams)
			throws CurrentWeatherException {
		String outputString = "";

		try {
			URL url = new URL("http://api.openweathermap.org/data/2.5/weather?id=" + cityId
					+ "&appid=44db6a862fba0b067b1930da0d769e98" + "&mode=" + optionalParams.getMode() + "&unit="
					+ optionalParams.getTempUnit() + "&lang=" + optionalParams.getLanguage());

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/json");

			if (connection.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + connection.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((connection.getInputStream())));
			System.out.println("Output from Server:");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				outputString += output;
			}
			connection.disconnect();

		} catch (Exception e) {
			throw new CurrentWeatherException(e);
		}

		Mode lan = optionalParams.getMode();
		if (lan == Mode.JSON) {

			String formatedOutput = formatOutputToConvert(outputString);
			System.out.println("response formated: \n" + formatedOutput);
			response = gson.fromJson(formatedOutput, CurrentWeatherResponse.class);
			System.out.println("response converted : \n" + response.toString());
			System.out.println("max temp: \n" + response.getMain().getTempMax());
		}

		return response;
	}

	public URL urlBuilderWithId(int cityId, OptionalParams optionalParams) throws MalformedURLException {
		StringBuilder urlBuild = new StringBuilder("http://api.openweathermap.org/data/2.5/weather?id=" + cityId
				+ "&appid=44db6a862fba0b067b1930da0d769e98");
		
		if (optionalParams.getMode() != null || optionalParams.getMode() != Mode.JSON) {
			urlBuild.append("&mode="+ optionalParams.getMode());
		}
		if (optionalParams.getLanguage() != null || optionalParams.getLanguage() != Language.EN_US) {
			urlBuild.append("&language="+ optionalParams.getLanguage());
		}
		if (optionalParams.getTempUnit() != null || optionalParams.getTempUnit() != TempUnit.STANDARD) {
			urlBuild.append("&units="+ optionalParams.getTempUnit());
		}
		url = new URL(urlBuild.toString());
		return url;
	}

	public static String formatOutputToConvert(String output) {
		StringBuilder formatedOutput = new StringBuilder();
		boolean capitalizeNext = false;
		for (char character : output.toCharArray()) {
			if (character == '_') {
				capitalizeNext = true;
			} else {
				if (capitalizeNext) {
					formatedOutput.append(Character.toUpperCase(character));
					capitalizeNext = false;
				} else {
					formatedOutput.append(character);
				}
			}
		}
		return formatedOutput.toString();
	}

	public boolean checkIfParameterNotNull(OptionalParams optionalParams) {
		if (optionalParams.getMode() != null || optionalParams.getLanguage() != null
				|| optionalParams.getTempUnit() != null)
			return false;
		return true;
	}

	public static boolean checkJSONFormat(String textResponse) {
		try {
			gson.fromJson(textResponse, Object.class);
			return true;
		} catch (com.google.gson.JsonSyntaxException ex) {
			return false;
		}
	}

}
