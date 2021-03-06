package com.sda.scrammanager.model;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sprintName;
    private Date startDate;
    private Date stopDate;


    @ManyToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Project projectName;

    @ManyToMany(mappedBy = "sprints")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<Task> tasks;

}
