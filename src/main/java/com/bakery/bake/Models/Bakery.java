package com.bakery.bake.Models;


import jakarta.persistence.*;

import java.io.Serial;
import java.util.Objects;

@Entity
@Table(name = "bakery")
public class Bakery implements java.io.Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   @Column(name = "name", nullable = false, length = 80) private String name;
    @Column(name = "flavor", nullable = false,length = 80) private String flavor;
   @Column(name = "price", nullable = false, columnDefinition = "double") private double price;

    public Bakery() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bakery bakery)) return false;
        return Double.compare(price, bakery.price) == 0 && Objects.equals(id, bakery.id) && Objects.equals(name, bakery.name) && Objects.equals(flavor, bakery.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, flavor, price);
    }

    public Bakery(String name, String flavor, double price) {
        this.name = name;
        this.flavor = flavor;
        this.price = price;
    }

    /**
     * get field @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)


      *
      * @return id @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)


     */
    public Long getId() {
        return this.id;
    }

    /**
     * set field @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)


      *
      * @param id @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)


     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get field
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set field
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field
     *
     * @return flavor
     */
    public String getFlavor() {
        return this.flavor;
    }

    /**
     * set field
     *
     * @param flavor
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * get field
     *
     * @return price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * set field
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}





