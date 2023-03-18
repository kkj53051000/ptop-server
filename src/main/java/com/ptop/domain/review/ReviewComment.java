package com.ptop.domain.review;

import com.ptop.domain.common.Audit;
import com.ptop.domain.user.User;

import javax.persistence.*;

public class ReviewComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "review_comment_id")
    private Long id;

    private String content;

    @Column(name = "parent_comment_id")
    private Long parentCommentId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "review_id", nullable = false)
    private Review review;

    @Embedded
    private Audit audit;
}
