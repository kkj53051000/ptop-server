package com.ptop.domain.coupon;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "coupons")
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "coupon_id")
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "coupon_code", unique = true)
    private String couponCode;

    @Column(name = "discount_percent")
    private Double discountPercent;

    @Column(name = "expiration_date", nullable = false)
    private LocalDate expirationDate;

    @Column(name = "is_active", nullable = false)
    private boolean active;
}
