package edu.icet.controller;

import edu.icet.Model.Rental;
import edu.icet.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/rental")
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class rentalController {

    @Autowired
    final RentalService service;

    @PostMapping("/add_rental")
    public ResponseEntity<String> addRental(@RequestBody Rental rental){
        try{
            service.addRental(rental);
            return ResponseEntity.ok("Rental added successfully");
        } catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @GetMapping("/search_rental_by_id/{rentalID}")
    public Rental searchRental(@PathVariable Long rentalID){
        return service.searchRentalByID(rentalID);
    }


    @PutMapping("/update_rental")
    public ResponseEntity<String> updateRental(@RequestBody Rental rental){
        try{
            service.updateRental(rental);
            return ResponseEntity.ok("Updated");
        } catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @DeleteMapping("/delete_rental_by_id/{rentalID}")
    public ResponseEntity<String> deleteRental(@PathVariable Long rentalID){
        try{
            service.deleteRentalByID(rentalID);
            return ResponseEntity.ok("Deleted");
        } catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @GetMapping("/get_all")
    public List<Rental> getAll(){
        return service.getAllRentals();
    }
}
