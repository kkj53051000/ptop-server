package com.ptop.domain.community;

import com.ptop.domain.common.Audit;
import com.ptop.domain.user.User;

import javax.persistence.*;

@Entity
public class CommunityComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "community_comment_id")
    private Long id;

    private String content;

    @Column(name = "parent_comment_id")
    private Long parentCommentId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private CommunityPost post;

    @Embedded
    private Audit audit;
}
