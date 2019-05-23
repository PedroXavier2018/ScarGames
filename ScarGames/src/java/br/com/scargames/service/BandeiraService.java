package br.com.scargames.service;

import br.com.scargames.dao.BandeiraDao;
import br.com.scargames.domain.Bandeira;
import br.com.scargames.util.HashMaker;
import java.util.List;

public class BandeiraService {
    
    private final BandeiraDao BandeiraDao = new BandeiraDao();
    
    public List<Bandeira> listar(){
        return BandeiraDao.listar();
    }
    
    public Bandeira consultar(Integer id){
        return BandeiraDao.consultar(id);
    }
    
    public Boolean inserir(Bandeira bandeira){
        
        return BandeiraDao.inserir(bandeira);
    }
    
    public Boolean alterar(Bandeira bandeira){
        
        return BandeiraDao.alterar(bandeira);
    }
    
    public Boolean excluir(Bandeira bandeira){
        return BandeiraDao.excluir(bandeira);
    }
    
   
    
}