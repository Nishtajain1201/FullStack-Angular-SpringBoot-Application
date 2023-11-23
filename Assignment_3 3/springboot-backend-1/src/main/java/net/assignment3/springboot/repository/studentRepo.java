package net.assignment3.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.assignment3.springboot.model.student;

@Repository
public interface studentRepo extends JpaRepository<student, Long>{

}
