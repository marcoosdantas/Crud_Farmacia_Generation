package com.generation.farmacia.repository;

import java.util.List;

import com.generation.farmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmacia.model.Categoria;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public List <Produto> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);

}