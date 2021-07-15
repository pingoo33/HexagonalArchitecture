package com.example.hexagonalarchitecture.application.dto;

import com.example.hexagonalarchitecture.adapters.db.Example;
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

    public static ExampleDetailDto from(Example example) {
        return new ExampleDetailDto(example.getId(), example.getValue());
    }
}
