package com.ptop.domain.manager;

import com.ptop.domain.common.Audit;
import com.ptop.domain.user.User;

import javax.persistence.*;

@Entity
@Table(name = "managers")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "manager_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String bio;

    @Embedded
    private Audit audit;
}
