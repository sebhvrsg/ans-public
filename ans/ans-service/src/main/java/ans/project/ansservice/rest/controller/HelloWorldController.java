package ans.project.ansservice.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


  @GetMapping(value = "/hello-world", produces = "text/plain")
  public ResponseEntity<String> hello() {
    return ResponseEntity.ok("Hello World !");
  }
}
