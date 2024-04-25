package com.example.segundoalmacenados.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.segundoalmacenados.Entity.Libro;

@Repository
public interface LibroRepo extends JpaRepository<Libro, Long>{
    
    
}
