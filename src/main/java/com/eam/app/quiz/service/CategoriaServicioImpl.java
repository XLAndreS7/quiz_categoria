package com.eam.app.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eam.app.quiz.models.Categoria;
import com.eam.app.quiz.repositorie.CategoriaRepositorio;

@Service
public class CategoriaServicioImpl implements CategoriaServicio {

    @Autowired
    private CategoriaRepositorio repositorio;

    @Override
    public List<Categoria> listarCategoria() {
        return repositorio.findAll();
    }

    @Override
    public Categoria registrarCategoria(Categoria categoria) {
        return repositorio.save(categoria);
    }

    @Override
    public Categoria obtenerCategoria(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Categoria actualizCategoria(Categoria categoria) {
        return repositorio.save(categoria);
    }

    @Override
    public void eliminarCategoria(Long id) {
        repositorio.deleteById(id);
    }

}
