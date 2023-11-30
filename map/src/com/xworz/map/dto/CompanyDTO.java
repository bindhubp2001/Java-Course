package com.xworz.map.dto;

import java.util.Objects;

public class CompanyDTO implements Comparable<CompanyDTO>{

	private String name;
	private String location;
	private String gstNUmber;

	public CompanyDTO(String name, String location, String gstNUmber) {
		super();
		this.name = name;
		this.location = location;
		this.gstNUmber = gstNUmber;
	}

	@Override
	public String toString() {
		return "CompanyDTO [name=" + name + ", location=" + location + ", gstNUmber=" + gstNUmber + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGstNUmber() {
		return gstNUmber;
	}

	public void setGstNUmber(String gstNUmber) {
		this.gstNUmber = gstNUmber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(gstNUmber, location, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyDTO other = (CompanyDTO) obj;
		return Objects.equals(gstNUmber, other.gstNUmber) && Objects.equals(location, other.location)
				&& Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(CompanyDTO o) {
		
		return name.compareTo(gstNUmber);
	}

}
