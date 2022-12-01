package com.demo.phones.entity;

import jakarta.persistence.*;
import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import java.util.List;

@Entity(name = "phones")
@Data
public class Phone {

    @Id
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    private Long phoneId;
    @Embedded
    private PhoneName phoneName;
    private Long price;
    private String ram;

    @JsonIgnore
    @ManyToMany(mappedBy = "phones")
    private List<User> users;
}
