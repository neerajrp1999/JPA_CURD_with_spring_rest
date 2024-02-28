package com.example.finaltest.POJO;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import lombok.Data;
import lombok.ToString;


@Data
@Table(name = "student")
@Entity
@ToString
public class student {
    @Id
    int id;
    String name;
    String mobile;
}
