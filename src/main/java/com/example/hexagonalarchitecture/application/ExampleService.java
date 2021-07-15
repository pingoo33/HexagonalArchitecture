package com.example.hexagonalarchitecture.application;

import com.example.hexagonalarchitecture.application.dto.ExampleDetailDto;
import com.example.hexagonalarchitecture.application.dto.ExampleDto;
import com.example.hexagonalarchitecture.application.spi.ExamplePort;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    private final ExamplePort examplePort;

    public ExampleService(ExamplePort examplePort) {
        this.examplePort = examplePort;
    }

    public ExampleDetailDto findById(String id) {
        return this.examplePort.findById(id);
    }

    public ExampleDetailDto save(ExampleDto example) {
        return this.examplePort.save(example);
    }
}
