package com.ptop.domain.common;

public enum Currency {
    KRW("KRW"),
    USD("USD"),
    EUR("EUR"),
    JPY("JPY");

    private final String code;

    Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
