
package mx.com.epam.testing.training.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"all"
})
public class Clouds {

@JsonProperty("all")
private Integer all;

/**
*
* @return
* The all
*/
@JsonProperty("all")
public Integer getAll() {
return all;
}

/**
*
* @param all
* The all
*/
@JsonProperty("all")
public void setAll(Integer all) {
this.all = all;
}

}
