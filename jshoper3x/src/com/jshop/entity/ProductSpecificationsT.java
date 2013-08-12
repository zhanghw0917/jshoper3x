package com.jshop.entity;

// Generated 2013-8-11 9:45:25 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ProductSpecificationsT generated by hbm2java
 */
@Entity
@Table(name = "product_specifications_t", catalog = "jshoper3")
public class ProductSpecificationsT implements java.io.Serializable {

	private String specificationsid;
	private String name;
	private String note;
	private String sort;
	private String specificationsType;
	private String specificationsValue;
	private Date createtime;
	private String creatorid;
	private String state;

	public ProductSpecificationsT() {
	}

	public ProductSpecificationsT(String specificationsid, String name,
			String specificationsType, String specificationsValue,
			Date createtime, String creatorid, String state) {
		this.specificationsid = specificationsid;
		this.name = name;
		this.specificationsType = specificationsType;
		this.specificationsValue = specificationsValue;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.state = state;
	}

	public ProductSpecificationsT(String specificationsid, String name,
			String note, String sort, String specificationsType,
			String specificationsValue, Date createtime, String creatorid,
			String state) {
		this.specificationsid = specificationsid;
		this.name = name;
		this.note = note;
		this.sort = sort;
		this.specificationsType = specificationsType;
		this.specificationsValue = specificationsValue;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.state = state;
	}

	@Id
	@Column(name = "SPECIFICATIONSID", unique = true, nullable = false, length = 20)
	public String getSpecificationsid() {
		return this.specificationsid;
	}

	public void setSpecificationsid(String specificationsid) {
		this.specificationsid = specificationsid;
	}

	@Column(name = "NAME", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "NOTE", length = 45)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "SORT", length = 45)
	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	@Column(name = "SPECIFICATIONS_TYPE", nullable = false, length = 1)
	public String getSpecificationsType() {
		return this.specificationsType;
	}

	public void setSpecificationsType(String specificationsType) {
		this.specificationsType = specificationsType;
	}

	@Column(name = "SPECIFICATIONS_VALUE", nullable = false, length = 5000)
	public String getSpecificationsValue() {
		return this.specificationsValue;
	}

	public void setSpecificationsValue(String specificationsValue) {
		this.specificationsValue = specificationsValue;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
