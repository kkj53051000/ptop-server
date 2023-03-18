package com.ptop.domain.event;

import com.ptop.domain.common.Audit;
import com.ptop.domain.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "event_participants")
public class EventParticipant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "event_participant_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @Column(nullable = false)
    private LocalDateTime joinedAt;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private EventParticipantStatus status;

    @Embedded
    private Audit audit;
}
