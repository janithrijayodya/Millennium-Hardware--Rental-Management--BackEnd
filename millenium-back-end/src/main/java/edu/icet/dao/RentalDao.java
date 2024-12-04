package edu.icet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalDao extends JpaRepository<edu.icet.Entity.RentalEntity,Long> {
}
