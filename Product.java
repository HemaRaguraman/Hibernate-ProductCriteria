package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="Product")
	public class Product {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="slno")
		Integer slno;
		@Column(name="pname")
		String pname;
		@Column(name="pquantity")
		Integer pquantity;
		@Column(name="price")
		Integer price;
		
		public Product() {
			super();
		}

		public Product(int slno, String pname, int pquantity, int price) {
			super();
			this.slno = slno;
			this.pname = pname;
			this.pquantity = pquantity;
			this.price = price;
		}

		public int getSlno() {
			return slno;
		}

		public void setSlno(int slno) {
			this.slno = slno;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public int getPquantity() {
			return pquantity;
		}

		public void setPquantity(int qty) {
			this.pquantity = pquantity;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
		
		
		

	}

