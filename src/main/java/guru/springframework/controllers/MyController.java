package guru.springframework.controllers;

import guru.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller //Bean gerenciado pelo contexto do Spring - Vai criar uma instancia no contexto do Spring
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!!! - MyController");
        return greetingService.sayGreeting();
    }

}
