package com.ControleEstoque.ControleEstoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ControleEstoque.ControleEstoque.model.Produto;



@RestController

@RequestMapping("/api/produto")
public class ProdutoController {
    
    @Autowired
    private Produto service;
    
    public List<Produto> listarTodos(){
        return service.listarTodos();
    }

    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id)
        
    }

}
