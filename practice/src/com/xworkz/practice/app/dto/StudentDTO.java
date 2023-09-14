package com.xworkz.practice.app.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {

	private int id;
	private String name;
	private String usn;
	private String branch;
	private String location;
	private String clgName;
	private String clgLocation;
	private int pinocde;
	private int clgCode;
	private float sgpa;
	private float cgpa;
	private int startYear;
	private int endYear;
	private boolean isIdValid;
	private boolean hasID;
	private boolean receiveMarksCard;
	private double fee;
	private String hostelName;
	private String hostelLocation;
	private double hostelFee;
	private int passedYear;
	private double scholerShip;
	private int totalMarks;
	private float totalPercentage;
	private boolean hasPass;

	public StudentDTO() {
		// TODO Auto-generated constructor stub
	}

	public StudentDTO(int id, String name, String usn, String branch, String location, String clgName,
			String clgLocation, int pinocde, int clgCode, float sgpa, float cgpa, int startYear, int endYear,
			boolean isIdValid, boolean hasID, boolean receiveMarksCard, double fee, String hostelName,
			String hostelLocation, double hostelFee, int passedYear, double scholerShip, int totalMarks,
			float totalPercentage, boolean hasPass) {
		super();
		this.id = id;
		this.name = name;
		this.usn = usn;
		this.branch = branch;
		this.location = location;
		this.clgName = clgName;
		this.clgLocation = clgLocation;
		this.pinocde = pinocde;
		this.clgCode = clgCode;
		this.sgpa = sgpa;
		this.cgpa = cgpa;
		this.startYear = startYear;
		this.endYear = endYear;
		this.isIdValid = isIdValid;
		this.hasID = hasID;
		this.receiveMarksCard = receiveMarksCard;
		this.fee = fee;
		this.hostelName = hostelName;
		this.hostelLocation = hostelLocation;
		this.hostelFee = hostelFee;
		this.passedYear = passedYear;
		this.scholerShip = scholerShip;
		this.totalMarks = totalMarks;
		this.totalPercentage = totalPercentage;
		this.hasPass = hasPass;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", usn=" + usn + ", branch=" + branch + ", location="
				+ location + ", clgName=" + clgName + ", clgLocation=" + clgLocation + ", pinocde=" + pinocde
				+ ", clgCode=" + clgCode + ", sgpa=" + sgpa + ", cgpa=" + cgpa + ", startYear=" + startYear
				+ ", endYear=" + endYear + ", isIdValid=" + isIdValid + ", hasID=" + hasID + ", receiveMarksCard="
				+ receiveMarksCard + ", fee=" + fee + ", hostelName=" + hostelName + ", hostelLocation="
				+ hostelLocation + ", hostelFee=" + hostelFee + ", passedYear=" + passedYear + ", scholerShip="
				+ scholerShip + ", totalMarks=" + totalMarks + ", totalPercentage=" + totalPercentage + ", hasPass="
				+ hasPass + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof StudentDTO) {
				StudentDTO dto = (StudentDTO) obj;
				if (dto.id == id && dto.name.equals(name) && dto.usn.equals(usn) && dto.branch.equals(branch)
						&& dto.location.equals(location) && dto.clgName.equals(clgName)
						&& dto.clgLocation.equals(clgLocation) && dto.pinocde == pinocde && dto.clgCode == clgCode
						&& dto.sgpa == sgpa && dto.cgpa == cgpa && dto.startYear == startYear && dto.endYear == endYear
						&& dto.fee == fee && dto.totalMarks == totalMarks && dto.totalPercentage == totalPercentage
						&& dto.passedYear == passedYear && dto.scholerShip == scholerShip
						&& dto.hostelName.equals(hostelName) && dto.hostelLocation.equals(hostelLocation))

				{
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

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public String getClgLocation() {
		return clgLocation;
	}

	public void setClgLocation(String clgLocation) {
		this.clgLocation = clgLocation;
	}

	public int getPinocde() {
		return pinocde;
	}

	public void setPinocde(int pinocde) {
		this.pinocde = pinocde;
	}

	public int getClgCode() {
		return clgCode;
	}

	public void setClgCode(int clgCode) {
		this.clgCode = clgCode;
	}

	public float getSgpa() {
		return sgpa;
	}

	public void setSgpa(float sgpa) {
		this.sgpa = sgpa;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	public int getEndYear() {
		return endYear;
	}

	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}

	public boolean isIdValid() {
		return isIdValid;
	}

	public void setIdValid(boolean isIdValid) {
		this.isIdValid = isIdValid;
	}

	public boolean isHasID() {
		return hasID;
	}

	public void setHasID(boolean hasID) {
		this.hasID = hasID;
	}

	public boolean isReceiveMarksCard() {
		return receiveMarksCard;
	}

	public void setReceiveMarksCard(boolean receiveMarksCard) {
		this.receiveMarksCard = receiveMarksCard;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public String getHostelLocation() {
		return hostelLocation;
	}

	public void setHostelLocation(String hostelLocation) {
		this.hostelLocation = hostelLocation;
	}

	public double getHostelFee() {
		return hostelFee;
	}

	public void setHostelFee(double hostelFee) {
		this.hostelFee = hostelFee;
	}

	public int getPassedYear() {
		return passedYear;
	}

	public void setPassedYear(int passedYear) {
		this.passedYear = passedYear;
	}

	public double getScholerShip() {
		return scholerShip;
	}

	public void setScholerShip(double scholerShip) {
		this.scholerShip = scholerShip;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public float getTotalPercentage() {
		return totalPercentage;
	}

	public void setTotalPercentage(float totalPercentage) {
		this.totalPercentage = totalPercentage;
	}

	public boolean isHasPass() {
		return hasPass;
	}

	public void setHasPass(boolean hasPass) {
		this.hasPass = hasPass;
	}

}
