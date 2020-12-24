package com.aliakpinar.libmngt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aliakpinar.libmngt.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
