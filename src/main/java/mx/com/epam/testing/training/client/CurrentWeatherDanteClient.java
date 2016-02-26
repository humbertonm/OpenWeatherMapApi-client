package mx.com.epam.testing.training.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import mx.com.epam.testing.training.CurrentWeather;
import mx.com.epam.testing.training.exception.CurrentWeatherException;
import mx.com.epam.testing.training.model.CurrentWeatherResponse;
import mx.com.epam.testing.training.request.OptionalParams;

public class CurrentWeatherDanteClient implements CurrentWeather {

	public CurrentWeatherResponse findByCityName(String cityName, String countryCode, OptionalParams optionalParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public CurrentWeatherResponse findByCityId(int cityId, OptionalParams optionalParams)
			throws CurrentWeatherException {
		String output;
		String jsonString = "";
		try {

			URL url = new URL("http://api.openweathermap.org/data/2.5/weather?id="+ cityId
					+ "&appid=44db6a862fba0b067b1930da0d769e98");
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				jsonString += output;
			}

			conn.disconnect();

		} catch (Exception e) {

			throw new CurrentWeatherException(e);

		}
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		CurrentWeatherResponse response = gson.fromJson(jsonString, CurrentWeatherResponse.class);
		System.out.println(response.toString());
		// CurrentWeatherResponse response
		return response;
	}

}
