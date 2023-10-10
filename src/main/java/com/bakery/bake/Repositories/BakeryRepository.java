package com.bakery.bake.Repositories;

import com.bakery.bake.Models.Bakery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BakeryRepository extends JpaRepository<Bakery, Long> {
}
