package com.example.hexagonalarchitecture.application.dto;


import com.example.hexagonalarchitecture.domain.model.ExampleDomain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ExampleDto {
    private Integer value;

    private ExampleDto(Integer value) {
        this.value = value;
    }

    public static ExampleDto of(ExampleDomain example) {
        return new ExampleDto(example.getValue());
    }
}
