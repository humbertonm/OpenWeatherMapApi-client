package mx.com.epam.testing.training.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"speed",
"deg"
})
public class Wind {

@JsonProperty("speed")
private Double speed;
@JsonProperty("deg")
private Double deg;

/**
*
* @return
* The speed
*/
@JsonProperty("speed")
public Double getSpeed() {
return speed;
}

/**
*
* @param speed
* The speed
*/
@JsonProperty("speed")
public void setSpeed(Double speed) {
this.speed = speed;
}

/**
*
* @return
* The deg
*/
@JsonProperty("deg")
public Double getDeg() {
return deg;
}

/**
*
* @param deg
* The deg
*/
@JsonProperty("deg")
public void setDeg(Double deg) {
this.deg = deg;
}

}