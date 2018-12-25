package com.example.curso.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.curso.entity.MovimientoBancario;

public interface IMovimientoBancarioDao extends CrudRepository<MovimientoBancario, Long> {

	public List<MovimientoBancario> findByUserId(Long id);
	
}
