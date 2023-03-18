package com.ptop.domain.event;

public enum EventParticipantStatus {
    PENDING("대기 중"),
    APPROVED("참여 승인됨"),
    CANCELED("참여 취소됨"),
    ATTENDED("참석 완료");

    private String description;

    EventParticipantStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
