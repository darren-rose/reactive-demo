package com.example.reactivedemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foo {
    private Long id;
    private String name;

    public Foo(Long id) {
        this.id = id;
    }
}
