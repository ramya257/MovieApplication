package com.cg.movie.bean;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="movie_category")
public class Category {
	private int categoryId;
	private int categoryName;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(int categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName="
				+ categoryName + "]";
	}

}
