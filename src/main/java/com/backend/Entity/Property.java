package com.backend.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="property")
public class Property {
	
	

		
		
		
		@Id
		@Column(name = "id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		
		@Column(name="Location")
		private String username;
		
		
		@Column(name="size")
		private String size;
		
		@Column(name="price")
		private Integer price;
		
		
		@Column(name="Contact")
		private String contact;
		
		
		@Column(name="posted")
		private String posted;
		
		
		@Column(name="images")
		private String images;

		public Property() {
			super();
		}
		public Property(Integer id, String username, String size, Integer price, String contact, String posted,
				String images) {
			super();
			this.id = id;
			this.username = username;
			this.size = size;
			this.price = price;
			this.contact = contact;
			this.posted = posted;
			this.images = images;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getPosted() {
			return posted;
		}
		public void setPosted(String posted) {
			this.posted = posted;
		}
		public String getImages() {
			return images;
		}
		public void setImages(String images) {
			this.images = images;
		}
		@Override
		public String toString() {
			return "Property [id=" + id + ", username=" + username + ", size=" + size + ", price=" + price
					+ ", contact=" + contact + ", posted=" + posted + ", images=" + images + "]";
		}
		
		
		
}

