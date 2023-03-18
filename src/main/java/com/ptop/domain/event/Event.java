package com.ptop.domain.event;

import com.ptop.domain.common.Audit;
import com.ptop.domain.common.Currency;
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

    private String title;

    private String description;

    private LocalDateTime start_date;

    private LocalDateTime end_date;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    private Double price;

    private String location;

    @Column(name = "image_url")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private EventCategory category;

    @Embedded
    private Audit audit;

    public void setPrice(Double price, Currency currency) {
        this.price = price;
        this.currency = currency;
    }
}