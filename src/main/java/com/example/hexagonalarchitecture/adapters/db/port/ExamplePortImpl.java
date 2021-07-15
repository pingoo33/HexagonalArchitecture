package com.example.hexagonalarchitecture.adapters.db.port;

import com.example.hexagonalarchitecture.application.dto.ExampleDetailDto;
import com.example.hexagonalarchitecture.application.dto.ExampleDto;
import com.example.hexagonalarchitecture.application.spi.ExamplePort;
import com.example.hexagonalarchitecture.adapters.db.Example;
import com.example.hexagonalarchitecture.adapters.db.ExampleRepository;
import org.springframework.stereotype.Component;

@Component
public class ExamplePortImpl implements ExamplePort {
    private final ExampleRepository exampleRepository;

    public ExamplePortImpl(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    @Override
    public ExampleDetailDto findById(String id) {
        return ExampleDetailDto.from(exampleRepository.findById(id).orElseThrow());
    }

    @Override
    public ExampleDetailDto save(ExampleDto example) {
        return ExampleDetailDto.from(exampleRepository.save(Example.of(example.getValue())));
    }
}
