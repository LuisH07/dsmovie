package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	//Vai entrar em contato com o banco de dados com as querys
	
}
