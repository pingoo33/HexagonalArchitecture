package com.example.hexagonalarchitecture.application.spi;

import com.example.hexagonalarchitecture.application.dto.ExampleDetailDto;
import com.example.hexagonalarchitecture.application.dto.ExampleDto;

import java.util.Optional;

public interface ExamplePort {
    Optional<ExampleDetailDto> findById(String id);
    ExampleDetailDto save(ExampleDto exampleDomain);
}
