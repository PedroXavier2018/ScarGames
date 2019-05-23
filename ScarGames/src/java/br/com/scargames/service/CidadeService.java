package br.com.scargames.service;

import br.com.scargames.dao.CidadeDao;
import br.com.scargames.domain.Cidade;
import br.com.scargames.util.HashMaker;
import java.util.List;

public class CidadeService {
    
    private final CidadeDao CidadeDao = new CidadeDao();
    
    public List<Cidade> listar(){
        return CidadeDao.listar();
    }
    
    public Cidade consultar(Integer id){
        return CidadeDao.consultar(id);
    }
    
    public Boolean inserir(Cidade cidade){
        
        return CidadeDao.inserir(cidade);
    }
    
    public Boolean alterar(Cidade cidade){
        
        return CidadeDao.alterar(cidade);
    }
    
    public Boolean excluir(Cidade cidade){
        return CidadeDao.excluir(cidade);
    }
    
   
    
}