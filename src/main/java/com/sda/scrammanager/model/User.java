package com.sda.scrammanager.model;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String userPassword;
    private String FirstName;
    private String lastName;
    private String projectRole;
    private String userEmail;

    @CreationTimestamp
    private LocalDateTime creationTime;

    @OneToMany
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<Project> createdProjects;

    @OneToMany
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<TaskAssignee> assigneeTasks;

}
