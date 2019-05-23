package br.com.scargames.service;

import br.com.scargames.dao.GeneroDao;
import br.com.scargames.domain.Genero;
import br.com.scargames.util.HashMaker;
import java.util.List;

public class GeneroService {
    
    private final GeneroDao GeneroDao = new GeneroDao();
    
    public List<Genero> listar(){
        return GeneroDao.listar();
    }
    
    public Genero consultar(Integer id){
        return GeneroDao.consultar(id);
    }
    
    public Boolean inserir(Genero genero){
        
        return GeneroDao.inserir(genero);
    }
    
    public Boolean alterar(Genero genero){
        
        return GeneroDao.alterar(genero);
    }
    
    public Boolean excluir(Genero genero){
        return GeneroDao.excluir(genero);
    }
    
   
    
}