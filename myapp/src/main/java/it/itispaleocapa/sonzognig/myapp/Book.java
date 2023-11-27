package it.itispaleocapa.sonzognig.myapp;

import jakarta.persistence.*;
@Entity
public class Book {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   @Column(nullable = false, unique = false)
   private String title;

   @ManyToOne
   @JoinColumn(name = "publisher", referencedColumnName = "id")
   private Publisher publisher;

   public Long getId() {
       return id;
   }
   
   public String getTitle() {
       return title;
   }

   public Publisher getPublisher(){
        return publisher;
   }
   
   // Other methods...
}
   

