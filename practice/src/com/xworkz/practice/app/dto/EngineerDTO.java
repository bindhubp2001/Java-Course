package com.xworkz.practice.app.dto;

import java.io.Serializable;

public class EngineerDTO implements Serializable {

	private int id;
	private String name;
	private String clgName;

	public EngineerDTO() {

	}

	public EngineerDTO(int id, String name, String clgName) {
		super();
		this.id = id;
		this.name = name;
		this.clgName = clgName;
	}

	@Override
	public String toString() {
		return "EngineerDTO [id=" + id + ", name=" + name + ", clgName=" + clgName + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof EngineerDTO) {
				EngineerDTO dto = (EngineerDTO) obj;
				if (dto.name.equals(name) && dto.clgName.equals(clgName) && dto.id == id) {
					return true;
				}
			}
		}

		return super.equals(obj);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

}
