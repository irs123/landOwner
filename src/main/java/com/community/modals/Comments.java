package com.community.modals;

import java.util.Date;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comments {

	@Id
	private int cid;
	private String uuid;
	private String cBody;
	@Column(name="Created_at")
	private Date createdAt;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Replies commReplie;

	
	public Comments(int cid, String uuid, String cBody, Date createdAt) {
		super();
		this.cid = cid;
		this.uuid = uuid;
		this.cBody = cBody;
		this.createdAt = createdAt;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getcBody() {
		return cBody;
	}

	public void setcBody(String cBody) {
		this.cBody = cBody;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Replies getCommReplie() {
		return commReplie;
	}

	public void setCommReplie(Replies commReplie) {
		this.commReplie = commReplie;
	}
	
}
