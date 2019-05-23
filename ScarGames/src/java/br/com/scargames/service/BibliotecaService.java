package br.com.scargames.service;

import br.com.scargames.dao.BibliotecaDao;
import br.com.scargames.domain.Biblioteca;
import br.com.scargames.util.HashMaker;
import java.util.List;

public class BibliotecaService {
    
    private final BibliotecaDao BibliotecaDao = new BibliotecaDao();
    
    public List<Biblioteca> listar(){
        return BibliotecaDao.listar();
    }
    
    public Biblioteca consultar(Integer id){
        return BibliotecaDao.consultar(id);
    }
    
    public Boolean inserir(Biblioteca biblioteca){
        
        return BibliotecaDao.inserir(biblioteca);
    }
    
    public Boolean alterar(Biblioteca biblioteca){
        
        return BibliotecaDao.alterar(biblioteca);
    }
    
    public Boolean excluir(Biblioteca biblioteca){
        return BibliotecaDao.excluir(biblioteca);
    }
    
   
    
}