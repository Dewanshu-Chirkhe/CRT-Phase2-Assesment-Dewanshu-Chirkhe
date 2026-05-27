package com.post.test.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

// Q3: DTO validation with Bean Validation annotations.
public class StudentDTO {

    @NotBlank(message = "Name is required")
    private String name;

    @Min(value = 18, message = "Age must be at least 18")
    private int age;

    public StudentDTO() {
    }

    public StudentDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
