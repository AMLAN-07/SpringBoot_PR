package com.org.hotelms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {

    @Id
    Long id;
    @Column(length = 25, nullable = false)
    String Name;
    String Email;
    String about;
}
