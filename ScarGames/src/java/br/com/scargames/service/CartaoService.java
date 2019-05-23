package br.com.scargames.service;

import br.com.scargames.dao.CartaoDao;
import br.com.scargames.domain.Cartao;
import br.com.scargames.util.HashMaker;
import java.util.List;

public class CartaoService {
    
    private final CartaoDao CartaoDao = new CartaoDao();
    
    public List<Cartao> listar(){
        return CartaoDao.listar();
    }
    
    public Cartao consultar(Integer id){
        return CartaoDao.consultar(id);
    }
    
    public Boolean inserir(Cartao cartao){
        
        return CartaoDao.inserir(cartao);
    }
    
    public Boolean alterar(Cartao cartao){
        
        return CartaoDao.alterar(cartao);
    }
    
    public Boolean excluir(Cartao cartao){
        return CartaoDao.excluir(cartao);
    }
    
   
    
}