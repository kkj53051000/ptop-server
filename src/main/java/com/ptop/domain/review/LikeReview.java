package com.ptop.domain.review;

import com.ptop.domain.common.Audit;
import com.ptop.domain.community.CommunityPost;

import com.ptop.domain.user.User;
import javax.persistence.*;

@Entity
public class LikeReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "like_review_id")
    private Long id;

    private boolean isLike;

    private boolean isDislike;

    @ManyToOne
    @JoinColumn(name = "review_id", nullable = false)
    private Review review;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Embedded
    private Audit audit;
}
