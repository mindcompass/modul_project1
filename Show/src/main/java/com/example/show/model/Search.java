package com.example.show.model;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import lombok.Data;
	
@Entity
@Data	
public class Search {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String title;
	private String description;
	private String thumbnail;
	private String url;
}
