package com.example.mybatissample.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class Parent {
    private Long id;

    @NotBlank
    private String name;

    @Min(20)
    private Integer age;
}
