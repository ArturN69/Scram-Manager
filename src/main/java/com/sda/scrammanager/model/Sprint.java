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
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sprintName;
    private Date startDate;
    private Date stopDate;

    //@Enumerated(EnumTy......)

    @ManyToOne
    //@EqualsAndHashCode.Exclude
    //@ToString.Exclude
    private Project projectName;

}
