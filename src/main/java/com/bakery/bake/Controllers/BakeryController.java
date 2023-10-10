package com.bakery.bake.Controllers;

import com.bakery.bake.Models.Bakery;
import com.bakery.bake.Repositories.BakeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bakery")
public class BakeryController {

    @Autowired
    private BakeryRepository service;



    @GetMapping("/all")
    public List<Bakery> getAllBakery(){
        return service.findAll();
    }

    @PostMapping("/add")
    public Bakery addBakery(Bakery bakery){
        return service.save(bakery);
    }
    @GetMapping("/{id}")
    public Optional<Bakery> findById(@PathVariable(value = "id") Long id){
        return service.findById(id);
    }

    @PostMapping("/create")
    public Bakery createBakery(@RequestBody Bakery bakery){
        return service.save(bakery);
    }

    @DeleteMapping("/{id}")
    public void deleteBakery(@PathVariable(value = "id") Long id){
        service.deleteById(id);
    }

    @PutMapping("/update")
    public Bakery updateBakery(@RequestBody Bakery bakery){
        return service.save(bakery);
    }



}
