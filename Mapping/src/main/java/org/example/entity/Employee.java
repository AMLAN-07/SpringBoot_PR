package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int e_id;
    private String e_name;

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "e_id=" + e_id +
                ", e_name='" + e_name + '\'' +
                '}';
    }
}









