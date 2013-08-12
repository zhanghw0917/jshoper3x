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
 * EcouponT generated by hbm2java
 */
@Entity
@Table(name = "ecoupon_t", catalog = "jshoper3")
public class EcouponT implements java.io.Serializable {

	private String eid;
	private String goodsname;
	private double favourableprices;
	private double pricededuction;
	private String goodsid;
	private Date begintime;
	private Date endtime;
	private String ecouponstate;
	private String state;
	private String note;

	public EcouponT() {
	}

	public EcouponT(String eid, String goodsname, double favourableprices,
			double pricededuction, String goodsid, Date begintime,
			Date endtime, String ecouponstate, String state, String note) {
		this.eid = eid;
		this.goodsname = goodsname;
		this.favourableprices = favourableprices;
		this.pricededuction = pricededuction;
		this.goodsid = goodsid;
		this.begintime = begintime;
		this.endtime = endtime;
		this.ecouponstate = ecouponstate;
		this.state = state;
		this.note = note;
	}

	@Id
	@Column(name = "EID", unique = true, nullable = false, length = 20)
	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	@Column(name = "GOODSNAME", nullable = false)
	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	@Column(name = "FAVOURABLEPRICES", nullable = false, precision = 10)
	public double getFavourableprices() {
		return this.favourableprices;
	}

	public void setFavourableprices(double favourableprices) {
		this.favourableprices = favourableprices;
	}

	@Column(name = "PRICEDEDUCTION", nullable = false, precision = 10)
	public double getPricededuction() {
		return this.pricededuction;
	}

	public void setPricededuction(double pricededuction) {
		this.pricededuction = pricededuction;
	}

	@Column(name = "GOODSID", nullable = false, length = 20)
	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BEGINTIME", nullable = false, length = 0)
	public Date getBegintime() {
		return this.begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDTIME", nullable = false, length = 0)
	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	@Column(name = "ECOUPONSTATE", nullable = false, length = 1)
	public String getEcouponstate() {
		return this.ecouponstate;
	}

	public void setEcouponstate(String ecouponstate) {
		this.ecouponstate = ecouponstate;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "NOTE", nullable = false, length = 500)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
