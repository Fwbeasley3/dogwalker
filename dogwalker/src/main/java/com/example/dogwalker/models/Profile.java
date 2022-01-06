package com.example.dogwalker.models;

import javax.persistence.*;

@Entity
@Table(name = "profiles")
public class Profile {
    @Id
    @SequenceGenerator(
            name="profile_sequence",
            sequenceName = "profile_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "profile_sequence"
    )

    private Long id;
    private String name;

    //TODO: Add other objects for this class when created

    public Profile () {}

    public Profile(Long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
