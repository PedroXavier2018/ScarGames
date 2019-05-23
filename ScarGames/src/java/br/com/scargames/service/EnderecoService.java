package br.com.scargames.service;

import br.com.scargames.dao.EnderecoDao;
import br.com.scargames.domain.Endereco;
import br.com.scargames.util.HashMaker;
import java.util.List;

public class EnderecoService {
    
    private final EnderecoDao EnderecoDao = new EnderecoDao();
    
    public List<Endereco> listar(){
        return EnderecoDao.listar();
    }
    
    public Endereco consultar(Integer id){
        return EnderecoDao.consultar(id);
    }
    
    public Boolean inserir(Endereco endereco){
        
        return EnderecoDao.inserir(endereco);
    }
    
    public Boolean alterar(Endereco endereco){
        
        return EnderecoDao.alterar(endereco);
    }
    
    public Boolean excluir(Endereco endereco){
        return EnderecoDao.excluir(endereco);
    }
    
   
    
}