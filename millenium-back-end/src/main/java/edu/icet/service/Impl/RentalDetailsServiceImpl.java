package edu.icet.service.Impl;

import edu.icet.Entity.RentalDetailsEntity;
import edu.icet.Entity.RentalEntity;
import edu.icet.Model.Rental;
import edu.icet.Model.RentalDetails;
import edu.icet.dao.RentalDao;
import edu.icet.dao.RentalDetailsDao;
import edu.icet.service.RentalDetailsServie;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class RentalDetailsServiceImpl implements RentalDetailsServie {
    final RentalDetailsDao rentalDetailsDao;
    final ModelMapper mapper;

    @Override
    public void addRentalDetails(RentalDetails rentalDetails) {
        rentalDetailsDao.save(mapper.map(rentalDetails, RentalDetailsEntity.class));
    }

    @Override
    public RentalDetails searchRentalDetailByID(Long rentalDetailID) {
        return mapper.map(rentalDetailsDao.findById(rentalDetailID),RentalDetails.class);
    }

    @Override
    public void updateRentalDetail(RentalDetails rentalDetails) {
        rentalDetailsDao.save(mapper.map(rentalDetails,RentalDetailsEntity.class));
    }

    @Override
    public void deleteRentalDetailByID(Long rentalDetailID) {
        rentalDetailsDao.deleteById(rentalDetailID);
    }

    @Override
    public List<RentalDetails> getAllRentalDetails() {
        List<RentalDetails> rentalDetailList = new ArrayList<>();
        rentalDetailsDao.findAll().forEach(rentalDetailEntity -> {
            rentalDetailList.add(mapper.map(rentalDetailEntity,RentalDetails.class));
        });
        return  rentalDetailList;
    }
}
