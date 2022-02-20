package com.sda.scrammanager.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskName;
    private String taskDescription;
    private Long storyPoints;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @ManyToOne
    //@EqualsAndHashCode.Exclude
    //@ToString.Exclude
    private Project projectName;

}
