package mx.com.epam.testing.training.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"temp",
"pressure",
"humidity",
"temp_min",
"temp_max",
"sea_level",
"grnd_level"
})
public class Main {

@JsonProperty("temp")
private Double temp;
@JsonProperty("pressure")
private Double pressure;
@JsonProperty("humidity")
private Double humidity;
@JsonProperty("temp_min")
private Double tempMin;
@JsonProperty("temp_max")
private Double tempMax;
@JsonProperty("sea_level")
private Double seaLevel;
@JsonProperty("grnd_level")
private Double grndLevel;

/**
*
* @return
* The temp
*/
@JsonProperty("temp")
public Double getTemp() {
return temp;
}

/**
*
* @param temp
* The temp
*/
@JsonProperty("temp")
public void setTemp(Double temp) {
this.temp = temp;
}

/**
*
* @return
* The pressure
*/
@JsonProperty("pressure")
public Double getPressure() {
return pressure;
}

/**
*
* @param pressure
* The pressure
*/
@JsonProperty("pressure")
public void setPressure(Double pressure) {
this.pressure = pressure;
}

/**
*
* @return
* The humidity
*/
@JsonProperty("humidity")
public Double getHumidity() {
return humidity;
}

/**
*
* @param humidity
* The humidity
*/
@JsonProperty("humidity")
public void setHumidity(Double humidity) {
this.humidity = humidity;
}

/**
*
* @return
* The tempMin
*/
@JsonProperty("temp_min")
public Double getTempMin() {
return tempMin;
}

/**
*
* @param tempMin
* The temp_min
*/
@JsonProperty("temp_min")
public void setTempMin(Double tempMin) {
this.tempMin = tempMin;
}

/**
*
* @return
* The tempMax
*/
@JsonProperty("temp_max")
public Double getTempMax() {
return tempMax;
}

/**
*
* @param tempMax
* The temp_max
*/
@JsonProperty("temp_max")
public void setTempMax(Double tempMax) {
this.tempMax = tempMax;
}

public Double getSeaLevel() {
	return seaLevel;
}

public void setSeaLevel(Double seaLevel) {
	this.seaLevel = seaLevel;
}

public Double getGrndLevel() {
	return grndLevel;
}

public void setGrndLevel(Double grndLevel) {
	this.grndLevel = grndLevel;
}

@Override
public String toString() {
	return "Main [temp=" + temp + ", pressure=" + pressure + ", humidity=" + humidity + ", tempMin=" + tempMin
			+ ", tempMax=" + tempMax + ", seaLevel=" + seaLevel + ", grndLevel=" + grndLevel + "]";
}




}