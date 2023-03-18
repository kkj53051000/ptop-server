package com.ptop.domain.common;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
    @Column(name = "address_line_1")
    private String addressLine1;

    @Column(name = "address_line_2")
    private String addressLine2;

    private String city;

    @Column(name = "state_province")
    private String stateProvince;

    private String country;

    @Column(name = "postal_code")
    private String postalCode;
}