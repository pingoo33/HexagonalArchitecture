package com.example.hexagonalarchitecture.application.dto;

import com.example.hexagonalarchitecture.domain.model.ExampleDomain;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExampleDetailDto {
    private String id;
    private Integer value;

    private ExampleDetailDto(String id, Integer value) {
        this.id = id;
        this.value = value;
    }

    public static ExampleDetailDto of(ExampleDomain example) {
        return new ExampleDetailDto(example.getId(), example.getValue());
    }
}
