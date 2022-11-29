package com.densoft.springboot.web.service;

import java.util.List;

import com.densoft.springboot.web.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
	List<Todo> findByUser(String user);
}