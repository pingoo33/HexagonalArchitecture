package com.example.hexagonalarchitecture.application.spi;

import com.example.hexagonalarchitecture.application.dto.ExampleDetailDto;
import com.example.hexagonalarchitecture.application.dto.ExampleDto;

public interface ExamplePort {
    ExampleDetailDto findById(String id);
    ExampleDetailDto save(ExampleDto exampleDomain);
}
