package com.asu.tutorcompanion.server.repository;

import com.asu.tutorcompanion.server.model.Assignment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AssignmentRepository extends JpaRepository<Assignment, Integer> {
	public Assignment findByAssignmentName(String assignmentName);
}
