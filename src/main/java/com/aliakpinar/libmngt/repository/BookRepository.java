package com.aliakpinar.libmngt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aliakpinar.libmngt.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	@Query("SELECT b FROM Book b WHERE b.name LIKE %?1% AND b.name LIKE lower ('%b.name%')" + " OR b.isbn LIKE %?1%" + " OR b.serialName LIKE %?1%")
	public List<Book> findByBooksIgnoreCase(String keyword);
}
