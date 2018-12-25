
package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

public class Item {
    @Id
    private Long id;
    private String name;
    @Column("DateEntered")
    private LocalDateTime dateEntered;

    public Item(Long id, String name, LocalDateTime dateEntered) {
        this.id = id;
        this.name = name;
        this.dateEntered = dateEntered;
    }

    public static Item create(String name) {
        return new Item(null, name, LocalDateTime.now());
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateEntered=" + dateEntered +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateEntered() {
        return dateEntered;
    }
}
