package com.example.demo.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserRole {
    I_WANT_APPLE_STUDENT("ROLE_STUDENT", "학생"),
    I_WANT_BANANA_PROFESSOR("ROLE_PROFESSOR", "교수"),
    I_WANT_COCONUT_ADMIN("ROLE_ADMIN", "관리자");

    private final String key;
    private final String title;
}
