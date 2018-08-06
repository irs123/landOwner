package com.community.dto;

import java.util.ArrayList;
import java.util.Date;

public class RepliesDto {
		private String uuid;
		private String rBody;
		private Date createdAt;
		private ArrayList<String> img;
		
		
		public RepliesDto(String uuid, String rBody, Date createdAt, ArrayList<String> img) {
			super();
			this.uuid = uuid;
			this.rBody = rBody;
			this.createdAt = createdAt;
			this.img = img;
		}


		public String getUuid() {
			return uuid;
		}


		public void setUuid(String uuid) {
			this.uuid = uuid;
		}


		public String getrBody() {
			return rBody;
		}


		public void setrBody(String rBody) {
			this.rBody = rBody;
		}


		public Date getCreatedAt() {
			return createdAt;
		}


		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}


		public ArrayList<String> getImg() {
			return img;
		}


		public void setImg(ArrayList<String> img) {
			this.img = img;
		}


		@Override
		public String toString() {
			return "RepliesDto [uuid=" + uuid + ", rBody=" + rBody + ", createdAt=" + createdAt + ", img=" + img + "]";
		}

		
}
