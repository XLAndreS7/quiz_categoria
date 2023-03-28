package com.eam.app.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.eam.app.quiz.models.Categoria;
import com.eam.app.quiz.service.CategoriaServicio;

@Controller
public class CategoriaController {
    @Autowired
    private CategoriaServicio servicio;

    @GetMapping({ "/categorias", "/" })
    public String listarcategorias(Model modelo) {
        modelo.addAttribute("categorias", servicio.listarCategoria());
        return "categorias"; // nos retorna al archivo categorias
    }

    @GetMapping("/categorias/nuevo")
    public String mostrarFormularioDeRegistrarcategoria(Model modelo) {
        Categoria categoria = new Categoria();
        modelo.addAttribute("categoria", categoria);
        return "crear_categoria";
    }

    @PostMapping("/categorias")
    public String guardarCategoria(@ModelAttribute("categoria") Categoria categoria) {
        servicio.registrarCategoria(categoria);
        return "redirect:/categorias";
    }


    @GetMapping("/categorias/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("categoria", servicio.obtenerCategoria(id));
        return "editar_categoria";
    }

    @PostMapping("/categorias/{id}")
    public String actualizarCategoria(@PathVariable Long id, @ModelAttribute("categoria") Categoria categoria,
                                       Model modelo) {
Categoria categoriaExistente = servicio.obtenerCategoria(id);
          categoriaExistente.setId(id);
          categoriaExistente.setNomProducto(categoria.getNomProducto());
          categoriaExistente.setDescripcion(categoria.getDescripcion());

        servicio.actualizCategoria(categoriaExistente);
        return "redirect:/categorias";
    }

    @GetMapping("/categorias/{id}")
    public String eliminarCategoria(@PathVariable Long id) {
        servicio.eliminarCategoria(id);
        return "redirect:/categorias";
    }

}
