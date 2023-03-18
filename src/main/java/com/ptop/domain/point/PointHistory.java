package com.ptop.domain.point;

import com.ptop.domain.common.Audit;

import javax.persistence.*;

@Entity
@Table(name = "point_history")
public class PointHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pointHistoryId;

    @ManyToOne
    @JoinColumn(name = "point_id", nullable = false)
    private Point point;

    @Column(nullable = false)
    private String pointType;

    @Embedded
    private Audit audit;
}
