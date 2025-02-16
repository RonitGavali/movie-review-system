package com.project.entity;


import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "reviews")
public class Review {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String comment;
    private int rating;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    @JsonBackReference // Prevents serialization of the movie field
    private Movie movie;
}

