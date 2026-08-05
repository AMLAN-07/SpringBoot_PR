package org.example.Entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
    @Value("1")
    int D_id;
    @Value("MCA")
    String D_name;

    public Department() {
    }

    public Department(int d_id, String d_name) {
        D_id = d_id;
        D_name = d_name;
    }

    public int getD_id() {
        return D_id;
    }

    public void setD_id(int d_id) {
        D_id = d_id;
    }

    public String getD_name() {
        return D_name;
    }

    public void setD_name(String d_name) {
        D_name = d_name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "D_id=" + D_id +
                ", D_name='" + D_name + '\'' +
                '}';
    }
}
