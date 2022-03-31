package com.example.reactivedemo.web;

import com.example.reactivedemo.domain.Foo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.ConnectableFlux;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/foos")
public class FooController {

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    private Flux<Foo> getFoos() {
        return Flux.interval(Duration.ofSeconds(1))
                .map(val -> new Foo(val, String.format("number %s", val)));
    }

}
