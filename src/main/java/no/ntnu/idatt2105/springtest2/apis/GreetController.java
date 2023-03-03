package no.ntnu.idatt2105.springtest2.apis;

import org.springframework.web.bind.annotation.GetMapping;

public class GreetController {

  @GetMapping("/greet")
  public String greet(){
    return "yo";
  }

}
