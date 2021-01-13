package com.example.demo.controller;

import com.example.demo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {
    @GetMapping("home")
    public String home(HttpServletRequest req){

        String name=req.getParameter("name");
        System.out.println("Hi"+name);
       HttpSession session=req.getSession();
       session.setAttribute("name",name);
        return "home";

    }



}
@RestController
class ServiceInstanceRestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }
}
@RestController
class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/laptop")
    public Laptop laptop(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Laptop(counter.incrementAndGet(), String.format(template, name));
    }
}
