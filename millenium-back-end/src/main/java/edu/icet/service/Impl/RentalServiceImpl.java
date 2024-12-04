package edu.icet.service.Impl;

import edu.icet.Entity.RentalEntity;
import edu.icet.Model.Rental;
import edu.icet.dao.RentalDao;
import edu.icet.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor

public class RentalServiceImpl implements RentalService {
    final RentalDao rentalDao;
    final ModelMapper mapper;

    @Override
    public void addRental(Rental rental) {
        rentalDao.save(mapper.map(rental, RentalEntity.class));
    }

    @Override
    public void deleteRentalByID(Long rentalID) {
        rentalDao.deleteById(rentalID);
    }

    @Override
    public Rental searchRentalByID(Long rentalID) {
        return mapper.map(rentalDao.findById(rentalID),Rental.class);
    }

    @Override
    public void updateRental(Rental rental) {
        rentalDao.save(mapper.map(rental,RentalEntity.class));
    }

    @Override
    public List<Rental> getAllRentals() {
        List<Rental> rentalList = new ArrayList<>();
        rentalDao.findAll().forEach(rentalEntity -> {
            rentalList.add(mapper.map(rentalEntity,Rental.class));
        });
        return  rentalList;
    }

}
