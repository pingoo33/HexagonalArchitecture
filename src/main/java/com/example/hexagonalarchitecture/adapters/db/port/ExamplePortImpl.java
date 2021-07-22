package com.example.hexagonalarchitecture.adapters.db.port;

import com.example.hexagonalarchitecture.application.dto.ExampleDetailDto;
import com.example.hexagonalarchitecture.application.dto.ExampleDto;
import com.example.hexagonalarchitecture.application.spi.ExamplePort;
import com.example.hexagonalarchitecture.adapters.db.Example;
import com.example.hexagonalarchitecture.adapters.db.ExampleRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ExamplePortImpl implements ExamplePort {
    private final ExampleRepository exampleRepository;

    public ExamplePortImpl(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    @Override
    public Optional<ExampleDetailDto> findById(String id) {
        return this.exampleRepository.findById(id).map(ExampleDetailDto::from);
    }

    @Override
    public ExampleDetailDto save(ExampleDto example) {
        return ExampleDetailDto.from(this.exampleRepository.save(Example.of(example.getValue())));
    }
}
