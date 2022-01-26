package com.example.demo.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserRole {
    asdSTUDENT("ROLE_STUDENT", "학생"),
    afsfasfPROFESSOR("ROLE_PROFESSOR", "교수"),
    ADafsafasfafsfafMIN("ROLE_ADMIN", "관리자");

    private final String key;
    private final String title;
}
