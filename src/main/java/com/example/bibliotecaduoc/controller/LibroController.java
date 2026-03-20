package com.example.bibliotecaduoc.controller;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping 
    public List<Libro> listarLibros(){
        return libroService.getLibros();
    }

    @GetMapping 
    public List<Libro> listarLibros(){
        return libroService.getLibros();
    }

    //vamos a añadir un nuevo endpoint para agregar un libro

}

//vamos añadira cositas para ver si funciona
