package com.example.hexagonalarchitecture.domain.spi;

import com.example.hexagonalarchitecture.domain.model.ExampleDomain;

public interface ExamplePort {
    ExampleDomain findById(String id);
    ExampleDomain save(ExampleDomain exampleDomain);
}
