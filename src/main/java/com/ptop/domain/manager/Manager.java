package com.ptop.domain.manager;

import com.ptop.domain.common.Audit;
import com.ptop.domain.user.User;
import com.ptop.domain.user.UserRole;

import javax.persistence.*;

@Entity
@Table(name = "managers")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "manager_id")
    private Long id;

    @Lob
    private String description;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Embedded
    private Audit audit;

    @PrePersist
    public void prePersist() {
        if (!UserRole.MANAGER.equals(user.getRole())) {
            throw new IllegalStateException("Only users with Manager role can be saved as Managers");
        }
    }
}
