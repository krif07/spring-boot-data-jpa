package com.co.cbg.sbt.app.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.co.cbg.sbt.app.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

	@Query("SELECT p FROM Producto p WHERE p.nombre like %?1%")
	public List<Producto> findByNombre(String nombre);
	
	public List<Producto> findByNombreLikeIgnoreCase(String nombre);
}
