package edu.icet.service;

import edu.icet.Model.HardwareItem;
import edu.icet.Model.Rental;

import java.util.List;

public interface ItemService {

     void addItem(HardwareItem item);

     HardwareItem searchItemByID(Long itemID);

     void updateItem(HardwareItem item);

     void deleteItemByID(Long itemID);
     List<HardwareItem> getAllItems();
}
