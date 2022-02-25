package com.tiraj.profiles.spring_profiles.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String name;

}
