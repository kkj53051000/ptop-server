package com.ptop.domain.community;

import com.ptop.domain.common.Audit;

import javax.persistence.*;

@Entity
@Table(name = "community_categories")
public class CommunityCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private Long id;

    private String name;

    private String description;

    @Embedded
    private Audit audit;
}
