package core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyJaxBean {
	public MyJaxBean() {
		super();
	}

	public MyJaxBean(String param1, String param2) {
		super();
		this.param1 = param1;
		this.param2 = param2;
	}

	public String param1;

	public String param2;

	@JsonProperty
	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	@JsonProperty
	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

}
