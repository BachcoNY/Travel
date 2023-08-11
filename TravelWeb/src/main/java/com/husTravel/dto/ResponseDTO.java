package com.husTravel.dto;

import com.husTravel.enumtype.USER_ROLE;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
	public String message;
	public Object data;
}
