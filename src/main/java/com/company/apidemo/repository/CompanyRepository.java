package com.company.apidemo.repository;

import com.company.apidemo.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    List<Company> findByStatus(boolean status);

    List<Company> findByNameContaining(String title);

}
