package guru.springframework.controllers;

import guru.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl") //Usamos o qualifier para indicar qual bean sera injetado, ou seja, qual bean queremos usar
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
