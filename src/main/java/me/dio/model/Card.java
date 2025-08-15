package me.dio.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(unique = true)
   private String number;

   @Column (name = "additional_limit", scale = 2, precision = 13) // additional_limit evita que tenhamos um problema caso "limit" seja uma keyword em algum bd
   private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId (Long id){
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber (String number){
        this.number = number;
    }

    public BigDecimal getLimit (){
        return limit;
    }
    public void setLimit (BigDecimal limit){
        this.limit = limit;
    }
}
