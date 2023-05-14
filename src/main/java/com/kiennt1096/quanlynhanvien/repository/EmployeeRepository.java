package com.kiennt1096.quanlynhanvien.repository;

import com.kiennt1096.quanlynhanvien.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
