package com.co.cbg.sbt.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.co.cbg.sbt.app.models.entity.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{
		
}
