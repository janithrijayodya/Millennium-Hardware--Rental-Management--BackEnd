package edu.icet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<edu.icet.Entity.CustomerEntity,Long> {
}
