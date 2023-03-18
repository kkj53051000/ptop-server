package com.ptop.domain.review;

import com.ptop.domain.common.Audit;
import com.ptop.domain.event.Event;
import com.ptop.domain.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "review_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    private String content;

    private Integer rating;

    @Embedded
    private Audit audit;
}
