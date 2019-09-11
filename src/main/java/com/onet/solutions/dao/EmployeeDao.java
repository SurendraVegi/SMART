package com.onet.solutions.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.Employee;

/**
 * @author : Otorus
 * @since : 1/4/18
 */
@Repository
public interface EmployeeDao extends PagingAndSortingRepository<Employee, String> {
    Page<Employee>findByNamaContainingIgnoreCase(String name, Pageable pageable);
}
