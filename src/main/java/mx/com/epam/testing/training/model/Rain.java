package mx.com.epam.testing.training.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "3h" })
public class Rain {
	@JsonProperty("3h")
	private Integer _3h;

	public Integer get_3h() {
		return _3h;
	}

	public void set_3h(Integer _3h) {
		this._3h = _3h;
	}
}
