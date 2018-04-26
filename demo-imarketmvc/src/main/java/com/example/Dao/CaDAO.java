package com.example.Dao;

import java.util.List;

import com.example.demo.domain.Carrinho;

public interface CaDAO {
	
	
	public interface CargoDao {

		   void save(Carrinho carrinho );

		    void update(Carrinho carrinho);

		    void delete(Long id);

		    Carrinho findById(Long id);

		    List<Carrinho> findAll();

}
	
}
