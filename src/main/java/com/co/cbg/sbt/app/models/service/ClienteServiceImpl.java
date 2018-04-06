package com.co.cbg.sbt.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.co.cbg.sbt.app.models.dao.IClienteDao;
import com.co.cbg.sbt.app.models.dao.IProductoDao;
import com.co.cbg.sbt.app.models.entity.Cliente;
import com.co.cbg.sbt.app.models.entity.Producto;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	//@Qualifier("ClienteDaoJPA") //Se usa para seleccionar la implementacion en concreto, por si hay mas de una
	private IClienteDao clienteDao;
	
	@Autowired
	private IProductoDao productoDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
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
	public List<Producto> findByNombre(String nombre) {
		return productoDao.findByNombreLikeIgnoreCase("%"+nombre+"%");
	}
	
}
