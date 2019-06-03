package com.jibrus.jibrus.entities;

public enum RoleName {
    STUDENT(1),
    TEACHER (2),
    ADMIN(3);

    private final int number;

    RoleName(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
