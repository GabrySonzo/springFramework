package it.itispaleocapa.sonzognig.myapp;

import jakarta.persistence.*;

@Entity
public class Publisher {
    
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   @Column(nullable = false, unique = false)
   private String name;
   
   public Long getId() {
       return id;
   }
   
   public String getName() {
       return name;
   }
   
   public String toString() {
       return "Publisher: " + name;
   }
   // Other methods...
}
   

