package com.example.demo.controller;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;




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

    @RequestMapping("/getALienbyLang")
    public ModelAndView getALienbyLang(@RequestParam String lang){
        ModelAndView mv = new ModelAndView("showAlien");
       List<Alien> alienbyLang=alienRepo.findByLang(lang);
        mv.addObject("alienbylang",alienbyLang);
        return mv;

    }
}
