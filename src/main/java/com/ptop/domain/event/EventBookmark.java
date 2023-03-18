package com.ptop.domain.event;

import com.ptop.domain.common.Audit;
import com.ptop.domain.user.User;

import javax.persistence.*;

@Entity
@Table(name = "event_bookmarks")
@IdClass(EventBookmarkId.class)
public class EventBookmark {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
