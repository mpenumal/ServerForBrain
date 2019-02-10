package com.asu.tutorcompanion.server.repository;

import com.asu.tutorcompanion.server.model.Input;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface InputRepository extends JpaRepository<Input, Integer> {
	List<Input> findByStudentId(int studentId);
}