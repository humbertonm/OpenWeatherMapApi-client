
package mx.com.epam.testing.training.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Humberto_Noriega
 *
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "coord",
        "weather",
        "base",
        "main",
        "visibility",
        "wind",
        "clouds",
        "rain",
        "snow",
        "dt",
        "sys",
        "id",
        "name",
        "cod",
        "message"
        }) 

public class CurrentWeatherResponse {

	@JsonProperty("coord")
	  private Coord coord;
	  @JsonProperty("weather")
	  private List<Weather> weather = new ArrayList<Weather>();
	  @JsonProperty("base")
	  private String base;
	  @JsonProperty("main")
	  private Main main;
	  @JsonProperty("visibility")
	  private Integer visibility;
	  @JsonProperty("wind")
	  private Wind wind;
	  @JsonProperty("clouds")
	  private Clouds clouds;
	  @JsonProperty("rain")
	  private Rain rain;
	  @JsonProperty("dt")
	  private Integer dt;
	  @JsonProperty("sys")
	  private Sys sys;
	  @JsonProperty("id")
	  private Integer id;
	  @JsonProperty("name")
	  private String name;
	  @JsonProperty("cod")
	  private Integer cod;
	  @JsonProperty("message")
	  private String message; 

	/**
	 *
	 * @return The coord
	 */
	public Coord getCoord() {
		return coord;
	}

	/**
	 *
	 * @param coord
	 *            The coord
	 */
	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	/**
	 *
	 * @return The weather
	 */
	public List<Weather> getWeather() {
		return weather;
	}

	/**
	 *
	 * @param weather
	 *            The weather
	 */
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	/**
	 *
	 * @return The base
	 */
	public String getBase() {
		return base;
	}

	/**
	 *
	 * @param base
	 *            The base
	 */
	public void setBase(String base) {
		this.base = base;
	}

	/**
	 *
	 * @return The main
	 */
	public Main getMain() {
		return main;
	}

	/**
	 *
	 * @param main
	 *            The main
	 */
	public void setMain(Main main) {
		this.main = main;
	}

	/**
	 *
	 * @return The wind
	 */
	public Wind getWind() {
		return wind;
	}

	/**
	 *
	 * @param wind
	 *            The wind
	 */
	public void setWind(Wind wind) {
		this.wind = wind;
	}

	/**
	 *
	 * @return The clouds
	 */
	public Clouds getClouds() {
		return clouds;
	}

	/**
	 *
	 * @param clouds
	 *            The clouds
	 */
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	/**
	 *
	 * @return The dt
	 */
	public Integer getDt() {
		return dt;
	}

	/**
	 *
	 * @param dt
	 *            The dt
	 */
	public void setDt(Integer dt) {
		this.dt = dt;
	}

	/**
	 *
	 * @return The sys
	 */
	public Sys getSys() {
		return sys;
	}

	/**
	 *
	 * @param sys
	 *            The sys
	 */
	public void setSys(Sys sys) {
		this.sys = sys;
	}

	/**
	 *
	 * @return The id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 *
	 * @param id
	 *            The id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 *
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 *
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 *
	 * @return The cod
	 */
	public Integer getCod() {
		return cod;
	}

	/**
	 *
	 * @param cod
	 *            The cod
	 */
	public void setCod(Integer cod) {
		this.cod = cod;
	}

	@Override
	public String toString() {
		return "CurrentWeatherResponse [coord=" + coord + ", weather=" + weather + ", base=" + base + ", main=" + main
				+ ", wind=" + wind + ", clouds=" + clouds + ", dt=" + dt + ", sys=" + sys + ", id=" + id + ", name="
				+ name + ", cod=" + cod  +"]";
	}
	
	

}
