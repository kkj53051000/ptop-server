package com.ptop.domain.point;

import com.ptop.domain.common.Audit;
import com.ptop.domain.user.User;

import javax.persistence.*;

@Entity
@Table(name = "points")
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "point_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "point_amount")
    private Integer pointAmount;

    @Embedded
    private Audit audit;
}
