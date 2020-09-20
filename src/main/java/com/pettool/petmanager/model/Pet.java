package com.pettool.petmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//comentario!

@Entity
@Table(name = "pets")
public class Pet {

    private long id_pet;
    private String name;
    private String type;
    private String owner;

    public Pet() {

    }

    public Pet(String name, String type, String owner) {
        this.name = name;
        this.type = type;
        this.owner = owner;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return this.id_pet;
    }
    public void setId(long id_pet) {
        this.id_pet = id_pet;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "type", nullable = false)
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "owner", nullable = false)
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet [id_pet=" + id_pet + ", name=" + name + ", type=" + type + ", owner=" + owner
                + "]";
    }

}