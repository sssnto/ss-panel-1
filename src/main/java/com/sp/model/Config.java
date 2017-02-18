package com.sp.model;

import java.io.Serializable;
import java.util.Date;
import com.blade.jdbc.annotation.Table;

//
@Table(name = "sp_config", pk = "id")
public class Config implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String key;

	private String value;

	private Date created_at;

	private Date updated_at;

	public Config(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}


}