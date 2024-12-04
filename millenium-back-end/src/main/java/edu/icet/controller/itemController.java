package edu.icet.controller;

import edu.icet.Model.HardwareItem;
import edu.icet.Model.Rental;
import edu.icet.service.ItemService;
import edu.icet.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
@CrossOrigin
public class itemController {
    @Autowired
    final ItemService service;

    @PostMapping("/add_item")
    public ResponseEntity<String> addItem(@RequestBody HardwareItem item){
        try{
            service.addItem(item);
            return ResponseEntity.ok("Item added successfully");
        } catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @GetMapping("/search_item_by_id/{itemID}")
    public HardwareItem searchItem(@PathVariable Long itemID){
        return service.searchItemByID(itemID);
    }


    @PutMapping("/update_item")
    public ResponseEntity<String> updateRental(@RequestBody HardwareItem item){
        try{
            service.updateItem(item);
            return ResponseEntity.ok("Updated");
        } catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @DeleteMapping("/delete_item_by_id/{itemID}")
    public ResponseEntity<String> deleteItem(@PathVariable Long itemID){
        try{
            service.deleteItemByID(itemID);
            return ResponseEntity.ok("Deleted");
        } catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @GetMapping("/get_all")
    public List<HardwareItem> getAllItems(){
        return service.getAllItems();
    }
}
