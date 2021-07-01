package com.example.hexagonalarchitecture.domain.model;

import com.example.hexagonalarchitecture.infra.Example;
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

    public static ExampleDomain of(Example example) {
        return new ExampleDomain(example.getId(), example.getValue());
    }

    public static ExampleDomain of(Integer value) {
        return new ExampleDomain(value);
    }

    public void modify(Integer value) {
        this.value = value;
    }
}
