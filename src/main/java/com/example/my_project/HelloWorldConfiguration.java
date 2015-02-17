package com.example.my_project;

import io.dropwizard.Configuration;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloWorldConfiguration extends Configuration {
	@NotEmpty
	private String template;

	@NotEmpty
	private String defaultName = "Default-Name";

	@JsonProperty
	public String getTemplate() {
		return template;
	}

	@JsonProperty
	public void setTemplate(String template) {
		this.template = template;
	}

	@JsonProperty
	public String getDefaultName() {
		return defaultName;
	}

	@JsonProperty
	public void setDefaultName(String name) {
		defaultName = name;
	}
}