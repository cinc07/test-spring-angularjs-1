package org.cinc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {


    @RequestMapping("/")
    public String root() {
        return "Hello test-spring-angularjs-1";
    }


    @RequestMapping("/echo")
    public String echo() {
        return "Echo test-spring-angularjs-1";
    }

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }
}
