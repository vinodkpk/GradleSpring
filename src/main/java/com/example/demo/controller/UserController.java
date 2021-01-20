package com.example.demo.controller;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @ResponseBody  //If we are returning data and not a spring model view.List<Alien> nstead of String to use JPA repository and get Jason format
    public List<Alien> alien() {

        return repo.findAll();
    }


    @RequestMapping("/alien/{aid}")
    @ResponseBody  //If we are returning data and not a spring model view. Optional<Alien> nstead of String to use JPA repository and get Jason format
    public Optional<Alien> getAlien(@PathVariable("aid") Long aid) {
        Optional<Alien> alienbyId=repo.findById(aid);
        return alienbyId;
    }
    @RequestMapping("/addAlien")//if we want to add from aien.jsp
    public String addAlien(Alien alien) {
        repo.save(alien);
        return "alien";

    }

    @RequestMapping(value="/addAlienPost",method=RequestMethod.POST)
    public ResponseEntity<String> addAlienPost(@RequestBody Alien  alien) {

        repo.save(alien);
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();

    }

    @DeleteMapping("/DeleteAlien/{aid}")
    public void deleteAlien(@PathVariable long aid) {
        Alien a= repo.getOne(aid);
        repo.delete(a);

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
