package fa.training.bfams.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String category;
	
	private String author;
	
	private Long republish;
	
	private String publishing_company;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getRepublish() {
		return republish;
	}

	public void setRepublish(Long republish) {
		this.republish = republish;
	}

	public String getPublishing_company() {
		return publishing_company;
	}

	public void setPublishing_company(String publishing_company) {
		this.publishing_company = publishing_company;
	}
}
