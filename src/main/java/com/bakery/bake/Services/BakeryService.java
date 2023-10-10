package com.bakery.bake.Services;


import com.bakery.bake.Models.Bakery;
import com.bakery.bake.Repositories.BakeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class BakeryService {
    @Autowired
    BakeryRepository repository;

    private final AtomicLong id = new AtomicLong();
    private final Logger logger = Logger.getLogger(BakeryService.class.getName());

    public List<Bakery> getAllBakery(){
        logger.info("Getting all bakery");
        return repository.findAll();
    }
    public Bakery findById(Long id){
        logger.info("Getting bakery by id");
        return repository.findById(id).orElse(null);
    }

    public Bakery addBakery(Bakery bakery){
        logger.info("Adding bakery");
        if (bakery.getFlavor() == null || bakery.getName() == null || bakery.getPrice()  <= 0) {
            throw new IllegalArgumentException("Campos obrigatórios estão em branco.");
        }
        return repository.save(bakery);
    }

    public Bakery deleteBakery(Long id){
        var del = repository.findById(id).orElse(null);
        logger.info("Deleting bakery");
        assert del != null;
        repository.delete(del);
        return del;
    }
    public Bakery updateBakery(Bakery bakery){
        logger.info("Updating bakery");
        return repository.save(bakery);
    }


}
