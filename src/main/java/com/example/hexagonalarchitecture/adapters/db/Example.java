package com.example.hexagonalarchitecture.adapters.db;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "EXAMPLE")
public class Example {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "value")
    private Integer value;

    private Example(Integer value) {
        this.value = value;
    }

    public static Example of(Integer value) {
        return new Example(value);
    }
}
