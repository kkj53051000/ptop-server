package com.ptop.domain.manager;

import java.io.Serializable;
import java.util.Objects;

public class ManagerCategoryRelationshipId implements Serializable {
    private Long manager;
    private Long category;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManagerCategoryRelationshipId that = (ManagerCategoryRelationshipId) o;
        return Objects.equals(manager, that.manager) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manager, category);
    }
}