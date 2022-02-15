package com.mesquitadev.gofinances.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;
}

