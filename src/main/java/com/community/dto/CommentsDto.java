package com.community.dto;

import java.util.Date;

public class CommentsDto {
	private String uuid;
	private String cBody;
	private Date createdAt;
	
	public CommentsDto(String uuid, String cBody, Date createdAt) {
		super();
		this.uuid = uuid;
		this.cBody = cBody;
		this.createdAt = createdAt;
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
	
	@Override
	public String toString() {
		return "CommentsDto [uuid=" + uuid + ", cBody=" + cBody + ", createdAt=" + createdAt + "]";
	}

}
