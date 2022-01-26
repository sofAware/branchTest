package com.example.demo.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserRole {

    thisisyghSTUDENT("ROLE_STUDENT", "학생"),
    thisisyghPROFESSOR("ROLE_PROFESSOR", "교수"),
    thisisyghADMIN("ROLE_ADMIN", "관리자");

    // ygh remark

    /*
    test test
     */

    private final String key;
    private final String title;
}
