package com.api.technicalshare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.technicalshare.model.Categoria;
import com.api.technicalshare.model.Setor;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria>findAllBydescricaoContainingIgnoreCase(String descricaoCategoria);
	
	public List<Categoria>findAllBySetor(Setor setor);
	
	

}
