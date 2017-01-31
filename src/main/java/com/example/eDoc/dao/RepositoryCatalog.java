package com.example.eDoc.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.eDoc.dao.mappers.*;
import com.example.eDoc.dao.uow.IUnitOfWork;

public class RepositoryCatalog implements IRepositoryCatalog {

	IUnitOfWork uow;
	Connection connection;
	
	
	public RepositoryCatalog(IUnitOfWork uow, Connection connection) {
		super();
		this.uow = uow;
		this.connection = connection;
	}

	
	public RepositoryCatalog(String string) {
		// TODO Auto-generated constructor stub
	}





	public IPacjentRepository pacjenci() {
		return new PacjentRepository(connection, new PacjentMapper(), uow);
	}

	public IWniosekRepository wnioski() {
		return new WniosekRepository(connection, new WniosekMapper(), uow);
	}

	public IWiadomoscRepository wiadomosci() {
		return new WiadomoscRepository(connection, new MessageMapper(), uow);
	}
	
	public ILekarzRepository lekarze() {
		return new LekarzRepository(connection, new LekarzMapper(), uow);
	}

	public void saveAndClose() {
		try{
		uow.commit();
		connection.close();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		
	}


	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

}
