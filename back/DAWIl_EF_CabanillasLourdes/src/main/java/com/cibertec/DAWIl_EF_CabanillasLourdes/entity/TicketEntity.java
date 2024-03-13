package com.cibertec.DAWIl_EF_CabanillasLourdes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ticket")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "created_at")
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name="kind_id")
    private KindEntity kind;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserEntity user;

    @Column(name = "aisgned_id")
    private Long aisgnedId;

    @ManyToOne
    @JoinColumn(name="project_id")
    private ProjectEntity project;

    @ManyToOne
    @JoinColumn(name="category_id")
    private CategoryEntity category;

    @ManyToOne
    @JoinColumn(name="priority_id")
    private PriorityEntity priority;

    @ManyToOne
    @JoinColumn(name="status_id")
    private StatusEntity status;

}
