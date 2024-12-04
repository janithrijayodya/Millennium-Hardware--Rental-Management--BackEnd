package edu.icet.service;

import edu.icet.Model.Rental;
import edu.icet.Model.RentalDetails;

import java.util.List;

public interface RentalDetailsServie {

     void addRentalDetails(RentalDetails rentalDetails);

     Rental searchRentalDetailByID(Long rentalDetailID);

     void updateRentalDetail(RentalDetails rentalDetails);

     void deleteRentalDetailByID(Long rentalDetailID);

     List<RentalDetails> getAllRentalDetails();
}
