package com.ptop.domain.common;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class Audit {
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
