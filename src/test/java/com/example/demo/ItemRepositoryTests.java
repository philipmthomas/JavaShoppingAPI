package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ItemRepositoryTests {
    @Autowired
    ItemRepository itemRepository;

    @Test
    public void When_ItemIsCreated_Save_Successfully() {
        Item item = Item.create("Puzzle");
        item = itemRepository.save(item);

        assertEquals("Puzzle", item.getName());
    }
}
