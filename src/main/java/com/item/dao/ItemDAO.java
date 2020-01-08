package com.item.dao;

import com.item.model.Item;

import java.util.List;

public interface ItemDAO {
    List<Item> allItems();
    void add(Item item);
    void delete(Item item);
    void edit(Item item);
    Item getById(Long id);
}
