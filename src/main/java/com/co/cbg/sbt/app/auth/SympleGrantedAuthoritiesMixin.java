package com.co.cbg.sbt.app.auth;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class SympleGrantedAuthoritiesMixin {

	@JsonCreator
	public SympleGrantedAuthoritiesMixin(@JsonProperty("authority") String role) {}

	
}
