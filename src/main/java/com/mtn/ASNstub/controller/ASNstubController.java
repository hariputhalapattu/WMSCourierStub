package com.mtn.ASNstub.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mtn.ASNstub.dto.ASNRequestDto;
import com.mtn.ASNstub.dto.BaseResponseDto;
import com.mtn.ASNstub.dto.ErrorMessageDto;
import com.mtn.ASNstub.dto.WMSRequestDto;
import com.mtn.ASNstub.enums.ResponseStatusEnums;
import com.mtn.ASNstub.services.ASNservice;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
public class ASNstubController {
	@Autowired
	ASNservice asnService;

	@Operation(operationId = "courierASN", summary = "courierASN", tags = { "courierASN" }, responses = {
			@ApiResponse(responseCode = "200", description = "Created", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponseDto.class)) }),

			@ApiResponse(responseCode = "400", description = "Bad Request", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = ErrorMessageDto.class)) }),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = ErrorMessageDto.class)) }),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = ErrorMessageDto.class)) }),
			@ApiResponse(responseCode = "405", description = "Method Not allowed", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = ErrorMessageDto.class)) }),
			@ApiResponse(responseCode = "409", description = "Conflict", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = ErrorMessageDto.class)) }),
			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = ErrorMessageDto.class)) }) })
	@PostMapping(value = "/courierASN", produces = { "application/json;charset=utf-8", "application/xml" }, consumes = {
			"application/json;charset=utf-8", "application/xml" })
	public ResponseEntity<BaseResponseDto> asnStub(@Valid @RequestBody(required = true) ASNRequestDto request){
		asnService.asnresp(request);
		BaseResponseDto resp = new BaseResponseDto();
		resp.setStatus(ResponseStatusEnums.SUCCESS);
		return new ResponseEntity<BaseResponseDto>(resp, HttpStatus.OK);
	}
	
	@Operation(operationId = "wmsHardReserve", summary = "wmsHardReserve", tags = { "wmsHardReserve" }, responses = {
			@ApiResponse(responseCode = "200", description = "Created", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponseDto.class)) }),

			@ApiResponse(responseCode = "400", description = "Bad Request", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = ErrorMessageDto.class)) }),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = ErrorMessageDto.class)) }),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = ErrorMessageDto.class)) }),
			@ApiResponse(responseCode = "405", description = "Method Not allowed", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = ErrorMessageDto.class)) }),
			@ApiResponse(responseCode = "409", description = "Conflict", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = ErrorMessageDto.class)) }),
			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = ErrorMessageDto.class)) }) })
	@PostMapping(value = "/wmsHardReserve", produces = { "application/json;charset=utf-8", "application/xml" }, consumes = {
			"application/json;charset=utf-8", "application/xml" })
	public ResponseEntity<BaseResponseDto> asnStub(@Valid @RequestBody(required = true) WMSRequestDto request){
		asnService.wmsHardReserve(request);
		BaseResponseDto resp = new BaseResponseDto();
		resp.setStatus(ResponseStatusEnums.SUCCESS);
		return new ResponseEntity<BaseResponseDto>(resp, HttpStatus.OK);
	}

}
