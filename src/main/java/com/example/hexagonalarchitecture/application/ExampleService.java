package com.example.hexagonalarchitecture.application;

import com.example.hexagonalarchitecture.application.dto.ExampleDetailDto;
import com.example.hexagonalarchitecture.application.dto.ExampleDto;
import com.example.hexagonalarchitecture.domain.model.ExampleDomain;
import com.example.hexagonalarchitecture.domain.spi.ExamplePort;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    private final ExamplePort examplePort;

    public ExampleService(ExamplePort examplePort) {
        this.examplePort = examplePort;
    }

    public ExampleDetailDto findById(String id) {
        return ExampleDetailDto.of(this.examplePort.findById(id));
    }

    public ExampleDetailDto save(ExampleDto example) {
        return ExampleDetailDto.of(this.examplePort.save(ExampleDomain.of(example.getValue())));
    }
}
