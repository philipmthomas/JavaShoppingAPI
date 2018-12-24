package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    ItemRepository itemRepository;

    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    public Item newCustomer(Item item) {
        return itemRepository.save(item);

    }

}
