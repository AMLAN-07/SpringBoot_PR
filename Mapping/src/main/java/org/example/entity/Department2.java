package org.example.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int d_id;
    private String d_name;
    @OneToMany
    List<Employee> e;

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public List<Employee> getE() {
        return e;
    }

    public void setE(List<Employee> e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Department2{" +
                "d_id=" + d_id +
                ", d_name='" + d_name + '\'' +
                ", e=" + e +
                '}';
    }
}
