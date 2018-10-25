package com.example.demo.model;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_Employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = -6066136852753718761L;
	@Id
	private String empId;
	private String skill;
	private String resourceName;
	private String sowName;
	private String locationType;
	private String clientManager;
	private String vendor;
	private String project;
	private String workLocation;
	private String comments;
	private String msaRate;
	private String rate;
	private double discountedFee;
	private String year;
	private double janHrs;
	private double febHrs;
	private double marHrs;
	private double aprHrs;
	private double mayHrs;
	private double junHrs;
	private double julHrs;
	private double augHrs;
	private double sepHrs;
	private double octHrs;
	private double novHrs;
	private double decHrs;
	//@OneToMany(mappedBy = "empId", cascade = CascadeType.ALL)
	//private Set<MonthlyData> monthData = new LinkedHashSet<MonthlyData>();

	protected Employee() {
	}

	@GeneratedValue(strategy = GenerationType.AUTO)
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(final String empId) {
		this.empId = empId;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(final String skill) {
		this.skill = skill;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(final String resourceName) {
		this.resourceName = resourceName;
	}

	public String getSowName() {
		return sowName;
	}

	public void setSowName(final String sowName) {
		this.sowName = sowName;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(final String locationType) {
		this.locationType = locationType;
	}

	public String getClientManager() {
		return clientManager;
	}

	public void setClientManager(final String clientManager) {
		this.clientManager = clientManager;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(final String vendor) {
		this.vendor = vendor;
	}

	public String getProject() {
		return project;
	}

	public void setProject(final String project) {
		this.project = project;
	}

	public String getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(final String workLocation) {
		this.workLocation = workLocation;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(final String comments) {
		this.comments = comments;
	}

	public String getMsaRate() {
		return msaRate;
	}

	public void setMsaRate(final String msaRate) {
		this.msaRate = msaRate;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(final String rate) {
		this.rate = rate;
	}

	public double getDiscountedFee() {
		return discountedFee;
	}

	public void setDiscountedFee(final double discountedFee) {
		this.discountedFee = discountedFee;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getJanHrs() {
		return janHrs;
	}

	public void setJanHrs(double janHrs) {
		this.janHrs = janHrs;
	}

	public double getFebHrs() {
		return febHrs;
	}

	public void setFebHrs(double febHrs) {
		this.febHrs = febHrs;
	}

	public double getMarHrs() {
		return marHrs;
	}

	public void setMarHrs(double marHrs) {
		this.marHrs = marHrs;
	}

	public double getAprHrs() {
		return aprHrs;
	}

	public void setAprHrs(double aprHrs) {
		this.aprHrs = aprHrs;
	}

	public double getMayHrs() {
		return mayHrs;
	}

	public void setMayHrs(double mayHrs) {
		this.mayHrs = mayHrs;
	}

	public double getJunHrs() {
		return junHrs;
	}

	public void setJunHrs(double junHrs) {
		this.junHrs = junHrs;
	}

	public double getJulHrs() {
		return julHrs;
	}

	public void setJulHrs(double julHrs) {
		this.julHrs = julHrs;
	}

	public double getAugHrs() {
		return augHrs;
	}

	public void setAugHrs(double augHrs) {
		this.augHrs = augHrs;
	}

	public double getSepHrs() {
		return sepHrs;
	}

	public void setSepHrs(double sepHrs) {
		this.sepHrs = sepHrs;
	}

	public double getOctHrs() {
		return octHrs;
	}

	public void setOctHrs(double octHrs) {
		this.octHrs = octHrs;
	}

	public double getNovHrs() {
		return novHrs;
	}

	public void setNovHrs(double novHrs) {
		this.novHrs = novHrs;
	}

	public double getDecHrs() {
		return decHrs;
	}

	public void setDecHrs(double decHrs) {
		this.decHrs = decHrs;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
