package entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

/**
 * Entity implementation class for Entity: Book
 *
 */

@Data
@Entity
public class Book implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "title", length =255)
	private String title;

	@Column(name = "author", length =255)
	private String author;

	@Column(name = "publishedAt")
	private int publishedAt;

	@Column(name = "pages")
	private int pages;


}
