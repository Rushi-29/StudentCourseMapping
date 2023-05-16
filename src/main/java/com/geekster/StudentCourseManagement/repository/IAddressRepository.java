package com.geekster.StudentCourseManagement.repository;

import com.geekster.StudentCourseManagement.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address, Long> {
}
