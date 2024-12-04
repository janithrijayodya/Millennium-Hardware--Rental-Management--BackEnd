package edu.icet.service;

import edu.icet.Model.Rental;

import java.util.List;

public interface RentalService {
    void addRental(Rental rental);
    void deleteRentalByID(Long rentalID);
    Rental searchRentalByID(Long rentalID);
    void updateRental(Rental rental);
    List<Rental> getAllRentals();

}
