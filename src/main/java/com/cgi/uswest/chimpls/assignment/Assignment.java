package com.cgi.uswest.chimpls.assignment;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Assignment {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	
	private BigDecimal id_assignment;
    private BigDecimal id_prsn;
    private BigDecimal id_case_prvd;
    private String cd_type;
    private BigDecimal cd_role;
    private String nm_prsn;
    private Timestamp dt_start;
    private Timestamp dt_end;
    
	public BigDecimal getId_assignment() {
		return id_assignment;
	}
	public void setId_assignment(BigDecimal id_assignment) {
		this.id_assignment = id_assignment;
	}
	public BigDecimal getId_prsn() {
		return id_prsn;
	}
	public void setId_prsn(BigDecimal id_prsn) {
		this.id_prsn = id_prsn;
	}
	public BigDecimal getId_case_prvd() {
		return id_case_prvd;
	}
	public void setId_case_prvd(BigDecimal id_case_prvd) {
		this.id_case_prvd = id_case_prvd;
	}
	public String getNm_prsn() {
		return nm_prsn;
	}
	public void setNm_prsn(String nm_prsn) {
		this.nm_prsn = nm_prsn;
	}
	public Timestamp getDt_start() {
		return dt_start;
	}
	public void setDt_start(Timestamp dt_start) {
		this.dt_start = dt_start;
	}
	public Timestamp getDt_end() {
		return dt_end;
	}
	public void setDt_end(Timestamp dt_end) {
		this.dt_end = dt_end;
	}
	public String getCd_type() {
		return cd_type;
	}
	public void setCd_type(String cd_type) {
		this.cd_type = cd_type;
	}
	public BigDecimal getCd_role() {
		return cd_role;
	}
	public void setCd_role(BigDecimal cd_role) {
		this.cd_role = cd_role;
	}
    
    
}
