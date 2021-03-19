package com.cg.sl1.beans;
import java.util.List;


public class SBU3 {
	
	private String sbuID;
	private String sbuName;
	private String sbuHead;
	private List<Employee3> empList;
	public List<Employee3> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee3> empList) {
		this.empList = empList;
	}
	public String getSbuID() {
		return sbuID;
	}
	public void setSbuID(String sbuID) {
		this.sbuID = sbuID;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "SBU [sbuID=" + sbuID + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "\nempList=" + empList + "]";
		
	}

}
