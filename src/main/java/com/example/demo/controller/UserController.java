package com.example.demo.controller;

import com.example.demo.dao.AlienRepo;
import com.example.demo.dao.UserRespository;
import com.example.demo.model.Alien;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

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

@Controller
class AlienController {
    @Autowired
    AlienRepo repo;
    @RequestMapping("/alien")
    public ModelAndView alien(@RequestParam("name") String myName) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", myName);
        mv.setViewName("alien");

        return mv;
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien) {
        repo.save(alien);
        return "alien";
     //   ModelAndView mv = new ModelAndView();
     //   mv.setViewName("alien");
      //  return mv;
    }


    @Autowired
    private AlienRepo alienRepo;
    @RequestMapping("/getAlien")
    public ModelAndView getALien(@RequestParam Long aid){
        ModelAndView mv = new ModelAndView("showAlien");
        Optional<Alien> alienbyId=alienRepo.findById(aid);
        System.out.println(alienbyId.get().getName());
        mv.addObject("alienbyId",alienRepo.findById(aid));
       return mv;

    }
}
