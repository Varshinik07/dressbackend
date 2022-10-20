package com.nestdigital.dressbackendapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dress")
public class DressModel {
    @Id
    @GeneratedValue
    private int id;
    private String dressname;
    private String dressmodel;
    private int quantity;
    private String description;
    public DressModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDressname() {
        return dressname;
    }

    public void setDressname(String dressname) {
        this.dressname = dressname;
    }

    public String getDressmodel() {
        return dressmodel;
    }

    public void setDressmodel(String dressmodel) {
        this.dressmodel = dressmodel;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DressModel(int id, String dressname, String dressmodel, int quantity, String description) {
        this.id = id;
        this.dressname = dressname;
        this.dressmodel = dressmodel;
        this.quantity = quantity;
        this.description = description;
    }


}
