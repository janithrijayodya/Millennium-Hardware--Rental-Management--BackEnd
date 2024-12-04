package edu.icet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalDetailsDao extends JpaRepository<edu.icet.Entity.RentalDetailsEntity,Long> {
}
