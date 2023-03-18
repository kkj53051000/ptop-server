package com.ptop.domain.event;

import javax.persistence.*;

@Entity
@Table(name = "event_images")
public class EventImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Long id;

    private String url;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
