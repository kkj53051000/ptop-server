package com.ptop.domain.event;

import com.ptop.domain.common.Audit;
import com.ptop.domain.manager.Manager;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "event_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "manager_id")

    private Manager manager;

    private String title;

    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private EventCategory category;

    private LocalDateTime start_date;

    private LocalDateTime end_date;

    private Double price;

    private String location;

    private String image_url;

    @Embedded
    private Audit audit;

}
