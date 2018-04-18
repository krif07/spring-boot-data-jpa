package com.co.cbg.sbt.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.co.cbg.sbt.app.models.dao.IClienteDao;
import com.co.cbg.sbt.app.models.dao.IFacturaDao;
import com.co.cbg.sbt.app.models.dao.IProductoDao;
import com.co.cbg.sbt.app.models.entity.Cliente;
import com.co.cbg.sbt.app.models.entity.Factura;
import com.co.cbg.sbt.app.models.entity.Producto;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	//@Qualifier("ClienteDaoJPA") //Se usa para seleccionar la implementacion en concreto, por si hay mas de una
	private IClienteDao clienteDao;
	
	@Autowired
	private IProductoDao productoDao;
	
	@Autowired
	private IFacturaDao facturaDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Cliente> findAll(Pageable pageable) {
		return clienteDao.findAll(pageable);
	}
	
	@Override
	@Transactional(readOnly=true)
	public Cliente findOne(Long id) {
		return clienteDao.findOne(id);
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.delete(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Producto> findByNombre(String nombre) {
		return productoDao.findByNombreLikeIgnoreCase("%"+nombre+"%");
	}

	@Override
	@Transactional
	public void saveFactura(Factura factura) {
		facturaDao.save(factura);
	}

	@Override
	@Transactional(readOnly=true)
	public Producto findProductoById(Long id) {		
		return productoDao.findOne(id);
	}

	@Override
	@Transactional(readOnly=true)
	public Factura findFacturaById(Long id) {		
		return facturaDao.findOne(id);
	}

	@Override
	@Transactional
	public void deleteFactura(Long id) {
		facturaDao.delete(id);
	}

	@Override
	@Transactional(readOnly=true)
	public Factura fetchFacturaByIdWithClienteWithItemFacturaWithProducto(Long id) {		
		return facturaDao.fetchByIdWithClienteWithItemFacturaWithProducto(id);
	}
	
}
