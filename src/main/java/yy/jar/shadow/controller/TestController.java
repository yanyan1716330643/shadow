package yy.jar.shadow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping
public class TestController {

    @GetMapping
    public String test(){
        System.out.println("index ......................................");
        return "/index";
    }
}
