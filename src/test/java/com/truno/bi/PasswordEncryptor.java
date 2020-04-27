package com.truno.bi;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by alok on 1/4/2018.
 */
public class PasswordEncryptor {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("password"));
    }
}
