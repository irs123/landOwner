package com.community.dto;

public class DiscussionDto {
		
		private String uuid;
		private int like;
		private int dislike;
		private String body;
		private String title;
		
		
		
		public DiscussionDto(String uuid, int like, int dislike, String body, String title) {
			super();
			this.uuid = uuid;
			this.like = like;
			this.dislike = dislike;
			this.body = body;
			this.title = title;
		}
		
		
		public String getUuid() {
			return uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
		public int getLike() {
			return like;
		}
		public void setLike(int like) {
			this.like = like;
		}
		public int getDislike() {
			return dislike;
		}
		public void setDislike(int dislike) {
			this.dislike = dislike;
		}
		public String getBody() {
			return body;
		}
		public void setBody(String body) {
			this.body = body;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		
		
		@Override
		public String toString() {
			return "DiscussionDto [uuid=" + uuid + ", like=" + like + ", dislike=" + dislike + ", body=" + body
					+ ", title=" + title + "]";
		}
		
		
	
}
