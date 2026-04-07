package com.example.bibliotecaduoc.controller;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesSource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listarLibros() {
        return libroService.getLibros();
    }

    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro) {
        return libroService.savLibro(libro);
    }

    @GetMapping("{id}")
    public Libro buscarLibro(@PathVariable int id) {
        return libroService.getLibroId(id);
    }

    @PutMapping("{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro) {
        return libroService.updateLibro(libro);
    }

    @DeleteMapping("{id}")
    public String eliminarLibro(@PathVariable int id) {
        return libroService.deleteLibro(id);
    }

    @GetMapping("/total")
    public int totalLibrosV2() {
        return libroService.totalLibrosV2();
    }

    // buscar por isbn
    @GetMapping("/isbn/{isbn}")
    public Libro getbuscarPorIsbn(@PathVariable String isbn) {
        return libroService.getbuscarPorIsbn(isbn);
    }

    // buscar por ano
    @GetMapping("/anopublicado")
    public Libro getbuscarPorano(@PathVariable int fechaPublicacion) {
        return libroService.getbuscarAno(fechaPublicacion);
    }

    // Profe
    @GetMapping("/cantidadAno/{ano}")
    public int cantidadLibrosPorAno(@PathVariable int ano) {
        return libroService.cantidadLibrosPorAno(ano);
    }

    @GetMapping("/Autor/{autor}")
    public List<Libro> obtenerPorAutor(@PathVariable String autor) {
        return libroService.obtenerPorAutor(autor);
    }
}
