package com.frankie.playspringboot.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: Yao Frankie
 * @date: 2020/3/23 15:17
 */
@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "student1")
public class Student {

    private int    age;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
