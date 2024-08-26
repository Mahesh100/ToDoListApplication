package com.ToDoList.ToDo.controllers;

import com.ToDoList.ToDo.model.Item;
import com.ToDoList.ToDo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @PostMapping("/addItem")
    public Item addItem(@RequestBody Item item){
        return itemRepository.save(item);
    }

    @GetMapping("/getAllItems")
    public List<Item> getAllItem(){
        return itemRepository.findAll();
    }
}
