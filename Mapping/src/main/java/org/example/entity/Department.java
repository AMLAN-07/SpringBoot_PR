package org.example.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int d_id;
    private String d_name;
    @OneToMany
    private List<Employee> ListEmp=new ArrayList<>();

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public void setListEmp(List<Employee> listEmp) {
        ListEmp = listEmp;
    }

    @Override
    public String toString() {
        return "Department{" +
                "d_id=" + d_id +
                ", d_name='" + d_name + '\'' +
                ", ListEmp=" + ListEmp +
                '}';
    }
}
