package edu.icet.controller;

import edu.icet.Model.Rental;
import edu.icet.Model.RentalDetails;
import edu.icet.service.RentalDetailsServie;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/rentalDetails")
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class rentalDetailsController {

    final RentalDetailsServie service;

    @PostMapping("/add_rentalDetails")
    public ResponseEntity<String> addRentalDetail(@RequestBody RentalDetails rentalDetails){
        try{
            service.addRentalDetails(rentalDetails);
            return ResponseEntity.ok("Rental Details added successfully");
        } catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }
    @GetMapping("/search_rentalDetails_by_id/{rentalDetailID}")
    public RentalDetails searchRentalDeails(@PathVariable Long rentalDetailID){
        return service.searchRentalDetailByID(rentalDetailID);
    }


    @PutMapping("/update_rentalDetail")
    public ResponseEntity<String> updateRentalDetails(@RequestBody RentalDetails rentalDetails){
        try{
            service.updateRentalDetail(rentalDetails);
            return ResponseEntity.ok("Updated");
        } catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @DeleteMapping("/delete_rentalDetail_by_id/{rentalDetailID}")
    public ResponseEntity<String> deleteRentalDetails(@PathVariable Long rentalDetailID){
        try{
            service.deleteRentalDetailByID(rentalDetailID);
            return ResponseEntity.ok("Deleted");
        } catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @GetMapping("/get_all")
    public List<RentalDetails> getAll(){
        return service.getAllRentalDetails();
    }
}
