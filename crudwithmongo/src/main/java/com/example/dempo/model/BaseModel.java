package com.example.dempo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Document
public class BaseModel {
	@Id
	private String id;
	private String createdBy;
	private String modifiedBy;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date createdDate;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date modifiedDate;

	private boolean isActive;

}
