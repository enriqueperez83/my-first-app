package es.soprasteria.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/1/hello")
public class HelloWorldController {

  @GetMapping
  public String helloWorld() {
    return "Hello world";
  }
}
