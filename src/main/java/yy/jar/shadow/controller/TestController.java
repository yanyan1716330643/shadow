package yy.jar.shadow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import yy.jar.shadow.model.MyTest;
import yy.jar.shadow.service.MyTestService;

import java.util.List;

@Controller
@RequestMapping
public class TestController extends BaseController{

    @Autowired
    MyTestService myTestService;

    @GetMapping
    public String test(){
        List<MyTest> myTests = myTestService.selectAll();
        myTests.forEach(a->{
            System.out.println("id"+a.getId());
            System.out.println("value:"+a.gettValue());
        });
        for (MyTest test:myTests){
            System.out.println(test.gettValue());
        }
        System.out.println("index ......................................");
        return "/index";
    }
}
