package com.co.cbg.sbt.app.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.co.cbg.sbt.app.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long>{

	@Query("SELECT f FROM Factura f JOIN FETCH f.cliente c JOIN FETCH f.items l JOIN FETCH l.producto p WHERE f.id=?1")
	public Factura fetchByIdWithClienteWithItemFacturaWithProducto(Long id);
}
