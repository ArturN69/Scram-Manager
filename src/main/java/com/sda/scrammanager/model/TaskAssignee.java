package com.sda.scrammanager.model;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class TaskAssignee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime date;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private User assigneeUser;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Task assigneeTask;


}
