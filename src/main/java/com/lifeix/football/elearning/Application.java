package com.lifeix.football.elearning;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lifeix.football.common.ApplicationUtil;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationUtil.run(Application.class, args);
    }

}
