package com.example.hexagonalarchitecture.infra.port;

import com.example.hexagonalarchitecture.domain.model.ExampleDomain;
import com.example.hexagonalarchitecture.domain.spi.ExamplePort;
import com.example.hexagonalarchitecture.infra.Example;
import com.example.hexagonalarchitecture.infra.ExampleRepository;
import org.springframework.stereotype.Component;

@Component
public class ExamplePortImpl implements ExamplePort {
    private final ExampleRepository exampleRepository;

    public ExamplePortImpl(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    @Override
    public ExampleDomain findById(String id) {
        return ExampleDomain.of(exampleRepository.findById(id).orElseThrow());
    }

    @Override
    public ExampleDomain save(ExampleDomain exampleDomain) {
        return ExampleDomain.of(exampleRepository.save(Example.of(exampleDomain.getValue())));
    }
}
