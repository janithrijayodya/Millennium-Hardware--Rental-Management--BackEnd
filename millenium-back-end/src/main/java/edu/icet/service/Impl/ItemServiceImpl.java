package edu.icet.service.Impl;

import edu.icet.Entity.HardwareItemEntity;
import edu.icet.Entity.RentalDetailsEntity;
import edu.icet.Model.HardwareItem;
import edu.icet.Model.Rental;
import edu.icet.Model.RentalDetails;
import edu.icet.dao.ItemDao;
import edu.icet.dao.RentalDetailsDao;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    final ItemDao itemDao;
    final ModelMapper mapper;

    @Override
    public void addItem(HardwareItem item) {
        itemDao.save(mapper.map(item, HardwareItemEntity.class));
    }

    @Override
    public HardwareItem searchItemByID(Long itemID) {
        return mapper.map(itemDao.findById(itemID), HardwareItem.class);
    }

    @Override
    public void updateItem(HardwareItem item) {
        itemDao.save(mapper.map(item,HardwareItemEntity.class));
    }

    @Override
    public void deleteItemByID(Long itemID) {
        itemDao.deleteById(itemID);
    }

    @Override
    public List<HardwareItem> getAllItems() {
        List<HardwareItem> ItemList = new ArrayList<>();
        itemDao.findAll().forEach(itemEntity -> {
            ItemList.add(mapper.map(itemEntity,HardwareItem.class));
        });
        return  ItemList;
    }
}
