package com.ptop.domain.verification;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "verification_history")
public class VerificationHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "mobile_country_code", nullable = false)
    private String mobileCountryCode;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    @Column(name = "verification_code", nullable = false)
    private String verificationCode;

    @Column(name = "sent_date", nullable = false)
    private LocalDateTime sentDate;

    @Column(name = "verification_date")
    private LocalDateTime verificationDate;

    @Column(name = "is_used", nullable = false)
    private Boolean isUsed;

    @Column(name = "available_start_date", nullable = false)
    private LocalDateTime availableStartDate;

    @Column(name = "available_end_date", nullable = false)
    private LocalDateTime availableEndDate;

    @Embedded
    private VerificationType verificationType;
}
