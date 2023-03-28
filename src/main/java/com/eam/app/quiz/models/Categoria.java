package com.eam.app.quiz.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "codigo",nullable = false,length = 50)
    private String  codigo;

    @Column(name = "nomProducto",nullable = false,length = 50)
    private String  nomProducto;

    @Column(name = "descripcion",nullable = false,length = 50,unique = true)
    private String  descripcion;

    public Categoria() {
    }

    public Categoria(Long id, String codigo, String nomProducto, String descripcion) {
        this.id = id;
        this.codigo = codigo;
        this.nomProducto = nomProducto;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
