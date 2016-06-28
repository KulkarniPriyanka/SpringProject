package org.pritech.onlineexamapp.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="Web_Page_Details")
public class WebPageDetails {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="Web_Page_Name") 
	private String pageName;
	
	@Lob
	@Column(name="Web_Page_Content")
	private String pageContent;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageContent() {
		return pageContent;
	}

	public void setPageContent(String pageContent) {
		this.pageContent = pageContent;
	}

	

}
