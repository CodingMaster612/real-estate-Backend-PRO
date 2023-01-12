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
		
		
		@Column(name="location")
		private String location;
		
		
		@Column(name="size")
		private String size;
		
		@Column(name="price")
		private Integer price;
		
		
		@Column(name="contact")
		private String contact;
		
		
		@Column(name="posted")
		private String posted;
		
		
		@Column(name="images")
		private String images;
		
		@Column(name="date")
		private Integer date;
		
		@Column(name="discounted")
		private Integer discounted;
		
		//if date = 90 days muliply orginal price by 0.10%

		public Property() {
			super();
		}

		public Property(Integer id, String location, String size, Integer price, String contact, String posted,
				String images, Integer date, Integer discounted) {
			super();
			this.id = id;
			this.location = location;
			this.size = size;
			this.price = price;
			this.contact = contact;
			this.posted = posted;
			this.images = images;
			this.date = date;
			this.discounted = discounted;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
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

		public Integer getDate() {
			return date;
		}

		public void setDate(Integer date) {
			this.date = date;
		}

		public Integer getDiscounted() {
			return discounted;
		}

		public void setDiscounted(Integer discounted) {
			this.discounted = discounted;
		}

		@Override
		public String toString() {
			return "Property [id=" + id + ", location=" + location + ", size=" + size + ", price=" + price
					+ ", contact=" + contact + ", posted=" + posted + ", images=" + images + ", date=" + date
					+ ", discounted=" + discounted + "]";
		}


		
		

		
		
		
		//if prduct date is 90 days apply a 10% discount from the orginal price of the property
		
		
		
}

