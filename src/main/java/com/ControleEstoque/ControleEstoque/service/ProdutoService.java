package com.ControleEstoque.ControleEstoque.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ControleEstoque.ControleEstoque.model.Produto;
import com.ControleEstoque.ControleEstoque.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    /**
     * @return 
     */

    public List<Produto> listarTodos(){
        return repository.findAll();
    }

    /**
     * @param id Identificador da pessoa.
     * @return Um Optional contendo a pessoa encontrada, ou vazio se não encontrar. 
     */

    public Optional<Produto> buscarporId(long id){
        return repository.findById(id);
    }

    /**
     * @param produto Objeto da entidade PessoasModel contendo os dados.
     * @return A entidade salva ou atualizada.
     */

    public Produto salvar(Produto produto){
        return repository.save(produto);
    }

    /**
     * @param id Identificador da pessoa a ser deletada.
     */

    public void deletar(Long id){
        repository.deleteById(id);
    }
 
}
