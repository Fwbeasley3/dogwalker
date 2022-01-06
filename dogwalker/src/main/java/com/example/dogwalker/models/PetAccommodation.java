package com.example.dogwalker.models;

import javax.persistence.*;

@Entity
@Table(name = "pet_accommodations")
public class PetAccommodation {
    @Id
    @SequenceGenerator(
            name="pet_accommodations_sequence",
            sequenceName = "pet_accommodations_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pet_accommodations_sequence"
    )

    private Long id;
    private String name;
    private String description;
    private float price;

    //TODO: Add other objects for this class when created

    public PetAccommodation () {}

    public PetAccommodation(Long id, String name, String description, float price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PetAccommodation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
