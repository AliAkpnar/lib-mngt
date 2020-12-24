package com.aliakpinar.libmngt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.aliakpinar.libmngt.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
	
}
