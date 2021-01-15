package com.example.demo.controller;

import com.example.demo.dao.UserRespository;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserController{

    @Autowired
    private UserRespository userRespository;
    @GetMapping("getAllusers")
    public List<User> getusers(){
        return this.userRespository.findAll();

    }

    @PostMapping("register")
    private String register(@RequestBody User user){
        userRespository.save(user);
        return "Hi"+ user.getFirstName()+"Congrats for registering";
//Jason body
//        {
//            "firstName":"JimBean",
//                "lastname":"jue",
//                "email":"vintage@g.com"
 //       }
    }

    @DeleteMapping("cancel/{id}")
    public List<User> cancelRegistration(@PathVariable Long id){
        userRespository.deleteById(id);
        return userRespository.findAll();
    }

}

/*@Controller
class HomerController {
    @RequestMapping("/home")
    public String home(Model model, HttpServletRequest req){
        model.addAttribute("home", "Welcome to Spring Boot");

        String name=req.getParameter("name");
        System.out.println("Hi"+name);
        model.addAttribute("name", name);

        return "home";


    }

}*/

@Controller
class HomerController {
    @RequestMapping("/home")
    public ModelAndView home(@RequestParam("name") String myName) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", myName);
        mv.setViewName("home");

        return mv;


    }
}
