package com.example.dogwalker.models;

import javax.persistence.*;

@Entity
@Table(name = "biographies")
public class Biography {
    @Id
    @SequenceGenerator(
            name = "biography_sequence",
            sequenceName = "biography_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "biography_sequence"
    )

    private Long id;
    private String name;

    //TODO: Add other objects for this class when created

    public Biography (){}


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

    @Override
    public String toString() {
        return "Biography{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

