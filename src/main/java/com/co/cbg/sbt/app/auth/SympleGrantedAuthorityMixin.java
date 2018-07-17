package com.co.cbg.sbt.app.auth;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class SympleGrantedAuthorityMixin {

	@JsonCreator
	public SympleGrantedAuthorityMixin(@JsonProperty("authority") String role) {}

	
}
