package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

//week 4 task 2
//@Controller
//public class controller { //put into local browser localhost:8080/helloo to see this work!!
//    @GetMapping("/helloo") //this is what comes after the website name e.g. localhost:8080/helloo
//    @ResponseBody //returns plain text
//    public String helloWorld() { //method which executes when users request a GET at /helloo
//        return "hello ambika!!"; //can be any text
//    }
//}

//week 4 task 3
//@Controller
//public class controller {//put into local browser localhost:8080/hello?name=kaps to see this work!!
//    @GetMapping("/hello") //this is what comes after the website name e.g. localhost:8080/hello
//    @ResponseBody //returns plain text
//    public String helloWorld(@RequestParam(defaultValue ="world", required=false) String name) { //method which executes when users request a GET at /hello
//        //request param shows that the parameter (name in this case) will be fed from the REQUEST url. Having a default value means if no parameter is given, it can easily replace it.
//        return "hello " + name; //can be any text
//    }
//}
//

////week 4 task 4
//@Controller
//public class controller {//put into local browser localhost:8080/hello?name=kaps to see this work!!
//    @GetMapping("/hello") //this is what comes after the website name e.g. localhost:8080/hello
//    public String helloWorld(@RequestParam(defaultValue = "world", required = false) String name, Model model) { //method which executes when users request a GET at /hello
//        //request param shows that the parameter (name in this case) will be fed from the REQUEST url. Having a default value means if no parameter is given, it can easily replace it.
//        //Model is a type parameter as part of the Model-View Controller (MVC)
//        model.addAttribute("username", name); //this adds the name parameter from above to the model so we can pass it to the HTML.
//        return "hello"; //returns hello.html
//    }
//}



//week 4 task 5
@Controller
public class controllers {//put into local browser localhost:8080/hello?name=kaps to see this work!!
    public List<String> names = new ArrayList<>(); //initiates new list
    int x = 7;

    @GetMapping("/hello") //this is what comes after the website name e.g. localhost:8080/hello
    @ResponseBody // shows response will be plain text

    public boolean helloWorld(@RequestParam(required = false) String name) { //method which executes when users request a GET at /hello
        if (name != null) { //checks if a parameter has been given
            names.add(name);
            return true;
        }
        return false;
    }
}
