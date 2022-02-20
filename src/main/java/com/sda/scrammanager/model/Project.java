package com.sda.scrammanager.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

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
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private User projectOwner;

    @OneToMany
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<Sprint> sprints;

    @OneToMany
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<Task> tasks;

}
