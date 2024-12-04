package edu.icet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDao extends JpaRepository<edu.icet.Entity.HardwareItemEntity,Long> {
}
