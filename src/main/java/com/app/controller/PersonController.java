package com.app.controller;

import com.app.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {
    @GetMapping
    public List<Person> findAll() {
        return List.of(
                Person.builder().name("AAAA").build(),
                Person.builder().name("BBBB").build(),
                Person.builder().name("CCCC").build()
        );
    }

    @GetMapping
    public List<Person> findAll2() {
        return List.of(Person.builder().name("ZZZZ").build());
    }
}
