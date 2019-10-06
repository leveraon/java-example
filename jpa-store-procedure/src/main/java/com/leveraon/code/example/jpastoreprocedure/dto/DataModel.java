/**
 * LEVERAON INC
 *
 * 2015 - 2019 ALL RIGHTS RESERVED
 */
package com.leveraon.code.example.jpastoreprocedure.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yves.sang
 *
 *         Created on: Oct. 6, 2019
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "code", "value" })
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DataModel {
	@JsonProperty("code")
	public String code;
	/**
	 * 
	 * (Required)
	 * 
	 */
	@NotNull
	@JsonProperty("value")
	public String value;
}
