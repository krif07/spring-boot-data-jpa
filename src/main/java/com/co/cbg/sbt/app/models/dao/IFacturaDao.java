package com.co.cbg.sbt.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.co.cbg.sbt.app.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long>{

}
