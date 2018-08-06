package com.community.dto;

public class LandOwnerDto {
		
		private String uuid;
		private long profileView;
		private short star;
		
		
		public LandOwnerDto(String uuid, long profileView, short star) {
			super();
			this.uuid = uuid;
			this.profileView = profileView;
			this.star = star;
		}
		
		
		public String getUuid() {
			return uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
		public long getProfileView() {
			return profileView;
		}
		public void setProfileView(long profileView) {
			this.profileView = profileView;
		}
		public short getStar() {
			return star;
		}
		public void setStar(short star) {
			this.star = star;
		}
		
		
		@Override
		public String toString() {
			return "LandOwnerDto [uuid=" + uuid + ", profileView=" + profileView + ", star=" + star + "]";
		}
		
		
}
