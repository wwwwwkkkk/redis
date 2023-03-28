package com.example.spring.DTO;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Data
@Table(name = "Teacher")
public class Teacher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true, length = 20)
    private String gender;
    @Column(nullable = false, unique = true, length = 20)
    private  String name;
    @Column(nullable = false, unique = true, length = 20)
    private Date birthday;

}
