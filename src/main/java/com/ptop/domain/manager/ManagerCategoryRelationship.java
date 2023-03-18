package com.ptop.domain.manager;

import javax.persistence.*;

@Entity
@Table(name = "manager_category_relationships")
@IdClass(ManagerCategoryRelationshipId.class)
public class ManagerCategoryRelationship {
    @Id
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @Id
    @ManyToOne
    @JoinColumn(name = "category_id")
    private ManagerCategory category;
}
