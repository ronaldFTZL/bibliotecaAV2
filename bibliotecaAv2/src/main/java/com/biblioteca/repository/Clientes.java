package com.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{

}
