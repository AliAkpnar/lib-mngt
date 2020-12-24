package com.aliakpinar.libmngt.service;

import java.util.List;

import com.aliakpinar.libmngt.entity.Author;
import com.aliakpinar.libmngt.entity.Book;

public interface AuthorService {

	public List<Author> findAllAuthors();
	
	public Author findAuthorById(Long id);

	public void createAuthor(Author author);

	public void updateAuthor(Author author);

	public void deleteAuthor(Long id);

}
