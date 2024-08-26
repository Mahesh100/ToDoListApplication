package com.ToDoList.ToDo.model;


import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_name")  // Add column annotation for consistency
    private String itemName;

    // Default constructor
    public Item() {
    }

    // Parameterized constructor
    public Item(Long id, String itemName) {
        this.id = id;
        this.itemName = itemName;
    }

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for itemName
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
