package com.example.hexagonalarchitecture.adapters.web;

import com.example.hexagonalarchitecture.application.ExampleService;
import com.example.hexagonalarchitecture.application.dto.ExampleDetailDto;
import com.example.hexagonalarchitecture.application.dto.ExampleDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/example")
public class ExampleController {
    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public ExampleDetailDto findById(@PathVariable String id) {
        return this.exampleService.findById(id);
    }

    @PostMapping(value = "/")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ExampleDetailDto save(@RequestBody ExampleDto exampleDto) {
        return this.exampleService.save(exampleDto);
    }
}
