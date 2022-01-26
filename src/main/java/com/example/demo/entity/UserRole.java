package com.example.demo.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserRole {
    asdSTUDasfasfsfENT("ROLE_STUDENT", "학생"),
    afsfasfPROFESasfasfasfasfsafasfsfaSOR("ROLE_PROFESSOR", "교수"),
    ADafsafasfafsfasdadasdasdasfasfasfasfasfasfasafMIN("ROLE_ADMIN", "관리자");

    private final String key;
    private final String title;
}
