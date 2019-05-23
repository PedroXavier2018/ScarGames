package br.com.scargames.service;

import br.com.scargames.dao.ProdutoraDao;
import br.com.scargames.domain.Produtora;
import br.com.scargames.util.HashMaker;
import java.util.List;

public class ProdutoraService {
    
    private final ProdutoraDao ProdutoraDao = new ProdutoraDao();
    
    public List<Produtora> listar(){
        return ProdutoraDao.listar();
    }
    
    public Produtora consultar(Integer id){
        return ProdutoraDao.consultar(id);
    }
    
    public Boolean inserir(Produtora produtora){
        
        return ProdutoraDao.inserir(produtora);
    }
    
    public Boolean alterar(Produtora produtora){
        
        return ProdutoraDao.alterar(produtora);
    }
    
    public Boolean excluir(Produtora produtora){
        return ProdutoraDao.excluir(produtora);
    }
    
   
    
}