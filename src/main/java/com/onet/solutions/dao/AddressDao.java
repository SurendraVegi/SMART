package com.onet.solutions.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.Address;
import com.onet.solutions.entity.Employee;

import java.util.List;

/**
 * @author : Otorus
 * @since : 1/10/18
 */
@Repository
public interface AddressDao extends PagingAndSortingRepository<Address, String> {
    List<Address> findByKaryawan(Employee karyawan);

    Page<Address> findByNamaContainingIgnoreCase(String name, Pageable pageable);
}