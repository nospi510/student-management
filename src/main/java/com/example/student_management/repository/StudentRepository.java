package com.example.student_management.repository;

import com.example.student_management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository pour gérer les opérations CRUD sur l'entité Student.
 * Hérite des méthodes standards de JpaRepository.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}