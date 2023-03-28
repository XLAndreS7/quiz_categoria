package com.eam.app.quiz.service;

import java.util.List;

import com.eam.app.quiz.models.Categoria;

public interface CategoriaServicio {

    public List<Categoria> listarCategoria();

    public Categoria registrarCategoria(Categoria categoria);

    public Categoria obtenerCategoria(Long id);

    public Categoria actualizCategoria(Categoria categoria);

    public void eliminarCategoria(Long id);

}
