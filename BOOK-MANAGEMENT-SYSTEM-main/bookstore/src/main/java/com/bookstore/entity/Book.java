package com.bookstore.entity;

// Importing necessary annotations for JPA (Java Persistence API)
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// This annotation indicates that this class is an entity and will be mapped to a database table.
@Entity
// Specifies the table name in the database that this entity will be mapped to. If the name is not provided, 
// the table name will be the same as the class name.
@Table
public class Book {

    // This annotation marks the field 'id' as the primary key of the entity.
    @Id
    // Specifies that the ID should be generated automatically, using the identity column feature of the database.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Fields representing the columns in the database table.
    private String name;
    private String author;
    private String price;

    // Parameterized constructor to initialize the entity with values.
    public Book(int id, String name, String author, String price) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Default constructor - required by JPA.
    public Book() {
        super();
        // TODO Auto-generated constructor stub
    }

    // Getter method for 'id' - returns the value of the id field.
    public int getId() {
        return id;
    }

    // Setter method for 'id' - sets the value of the id field.
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for 'name' - returns the value of the name field.
    public String getName() {
        return name;
    }

    // Setter method for 'name' - sets the value of the name field.
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'author' - returns the value of the author field.
    public String getAuthor() {
        return author;
    }

    // Setter method for 'author' - sets the value of the author field.
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method for 'price' - returns the value of the price field.
    public String getPrice() {
        return price;
    }

    // Setter method for 'price' - sets the value of the price field.
    public void setPrice(String price) {
        this.price = price;
    }
}

