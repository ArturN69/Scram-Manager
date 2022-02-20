package com.sda.scrammanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Date startDate;


    @Enumerated(EnumType.STRING)
    private ProjectStatus status;

    @ManyToOne
    //@EqualsAndHashCode.Exclude
    //@ToString.Exclude
    private User projectOwner;
}
