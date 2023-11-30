package com.xworz.servlets.userIfo;

public class UserCredentialDTO {

	private String slNo;
	private String fName;
	private String mName;
	private String lName;
	private String email;
	private String gender;
	private String mobile;
	private String area;
	private String district;
	private String state;
	private String pincode;

	public UserCredentialDTO(String slNo, String fName, String mName, String lName, String email, String gender, String mobile,
			String area, String district, String state, String pincode) {
		super();
		this.slNo = slNo;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.email = email;
		this.gender = gender;
		this.mobile = mobile;
		this.area = area;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}

	public String getSlNo() {
		return slNo;
	}

	public void setSlNo(String slNo) {
		this.slNo = slNo;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [slNo=" + slNo + ", fName=" + fName + ", mName=" + mName + ", lName=" + lName + ", email="
				+ email + ", gender=" + gender + ", mobile=" + mobile + ", area=" + area + ", district=" + district
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}

}
