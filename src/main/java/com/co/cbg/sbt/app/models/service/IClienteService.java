package com.co.cbg.sbt.app.models.service;

import com.co.cbg.sbt.app.models.entity.Cliente;
import com.co.cbg.sbt.app.models.entity.Factura;
import com.co.cbg.sbt.app.models.entity.Producto;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IClienteService {

	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Cliente findOne(Long id);
	
	public void save(Cliente cliente);
		
	public void delete(Long id);
	
	public List<Producto> findByNombre(String nombre);
	
	public void saveFactura(Factura factura);
	
	public Producto findProductoById(Long id);
	
}
