package com.ptop.domain.community;

import com.ptop.domain.common.Audit;
import com.ptop.domain.user.User;

import javax.persistence.*;

@Entity
public class LikePost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "like_post_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private CommunityPost post;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private boolean isLike;

    private boolean isDislike;

    @Embedded
    private Audit audit;
}
