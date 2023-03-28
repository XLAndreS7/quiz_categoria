package com.eam.app.quiz.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eam.app.quiz.models.Categoria;
@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Long>{
    
}
