package org.example.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int s_id;
    String s_name;

    @ManyToMany
    List<Course> allCourse=new ArrayList<>();

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public List<Course> getAllCourse() {
        return allCourse;
    }

    public void setAllCourse(List<Course> allCourse) {
        this.allCourse = allCourse;
    }
}
