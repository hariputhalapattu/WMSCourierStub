package com.mtn.ASNstub.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum ResponseStatusEnums {
	SUCCESS("0"), BUSINESS_ERROR("1"), TECHNICAL_ERROR("2");

	private final String value;
}
