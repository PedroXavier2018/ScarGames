package br.com.scargames.service;

import br.com.scargames.dao.JogoDao;
import br.com.scargames.domain.Jogo;
import br.com.scargames.util.HashMaker;
import java.util.List;

public class JogoService {
    
    private final JogoDao JogoDao = new JogoDao();
    
    public List<Jogo> listar(){
        return JogoDao.listar();
    }
    
    public Jogo consultar(Integer id){
        return JogoDao.consultar(id);
    }
    
    public Boolean inserir(Jogo jogo){
        
        return JogoDao.inserir(jogo);
    }
    
    public Boolean alterar(Jogo jogo){
        
        return JogoDao.alterar(jogo);
    }
    
    public Boolean excluir(Jogo jogo){
        return JogoDao.excluir(jogo);
    }
    
   
    
}