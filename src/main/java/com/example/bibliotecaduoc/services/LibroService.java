package com.example.bibliotecaduoc.services;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.obteneLibros();
    }

    public Libro savLibro(Libro libro) {
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id) {
        return libroRepository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro) {
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id) {
        libroRepository.eliminar(id);
        return "producto eliminado";
    }

    public int totalLibros() {
        return libroRepository.obteneLibros().size();
    }

    public int totalLibrosV1() {
        return libroRepository.obteneLibros().size();
    }

    public int totalLibrosV2() {
        return libroRepository.totalLibros();
    }

    // buscar libro por isbn
    public Libro getbuscarPorIsbn(String isbn) {
        return libroRepository.getbuscarPorIsbn(isbn);
    }

    // buscar cantidad de libros por año
    public Libro getbuscarAno(int fechaPublicacion) {
        return libroRepository.buscarAno(fechaPublicacion);
    }

    // Profe
    public int cantidadLibrosPorAno(int ano) {
        return libroRepository.cantidadLibrosPorAno(ano);
    }

    public List<Libro> obtenerPorAutor(String autor) {
        return libroRepository.obtenerPorAutor(autor);
    }

}
