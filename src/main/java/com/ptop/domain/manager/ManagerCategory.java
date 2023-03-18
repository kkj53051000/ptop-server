package com.ptop.domain.manager;

import com.ptop.domain.common.Audit;

import javax.persistence.*;

@Entity
@Table(name = "manager_categories")
public class ManagerCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private Long id;

    private String name;

    private String description;

    @Embedded
    private Audit audit;

}
