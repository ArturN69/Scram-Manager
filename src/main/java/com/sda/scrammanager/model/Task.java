package com.sda.scrammanager.model;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

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
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Project projectName;

    @OneToMany
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<TaskAssignee> assigneeTasks;

    @ManyToMany
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<Sprint> sprints;

}
