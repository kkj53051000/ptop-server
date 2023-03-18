package com.ptop.domain.event;

import com.ptop.domain.common.Audit;

import javax.persistence.*;

@Entity
@Table(name = "event_categories")
public class EventCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private Long id;

    private String name;

    private String description;

    @Embedded
    private Audit audit;

}