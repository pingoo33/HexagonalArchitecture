package com.example.hexagonalarchitecture.domain.model;

import lombok.Getter;

@Getter
public class ExampleDomain {
    private String id;
    private Integer value;

    private ExampleDomain(String id, Integer value) {
        this.id = id;
        this.value = value;
    }

    private ExampleDomain(Integer value) {
        this.value = value;
    }

    public static ExampleDomain of(
            String id,
            Integer value
    ) {
        return new ExampleDomain(
                id,
                value);
    }
}
