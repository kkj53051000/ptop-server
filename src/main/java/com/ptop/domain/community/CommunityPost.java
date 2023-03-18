package com.ptop.domain.community;

import com.ptop.domain.common.Audit;
import com.ptop.domain.user.User;

import javax.persistence.*;

@Entity
@Table(name = "community_posts")
public class CommunityPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "post_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String title;

    private String content;

    private String imageUrl;

    private Long views;

    private Long likes;

    private Long dislikes;

    private boolean isPublic;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private CommunityCategory category;

    @Embedded
    private Audit audit;
}