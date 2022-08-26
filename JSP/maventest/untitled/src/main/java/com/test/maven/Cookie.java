package com.test.maven;

import java.io.Serializable;

public class Cookie implements Cloneable, Serializable {
    public Cookie(String name, String value) {
    }

    private String name;
    private String value;

    private String comment;
    private String domain;
    private int maxAge = -1; // seconds, 0면 삭제 음수는 브라우저닫으면 삭제됨

    private String path;
    private boolean secure; // true 면 https에서만 전송
    private int version = 0;
    private boolean isHttpOnly = false; // true면 javascript로 쿠키 접근못함
}




