package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop {
    private long lid;
    private String brand;

    public Laptop() {
    }

    public Laptop(final long incrementAndGet, String format) {
        this.lid = incrementAndGet;
        this.brand = format;
    }

    public long getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void compile(){
        System.out.println("Compiling");
    }
}
