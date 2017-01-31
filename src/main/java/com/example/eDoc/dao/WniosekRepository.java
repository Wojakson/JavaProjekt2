package com.example.eDoc.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.eDoc.dao.mappers.*;
import com.example.eDoc.dao.uow.IUnitOfWork;
import com.example.eDoc.model.*;

import java.util.*;

public class WniosekRepository extends RepositoryBase<Wniosek> implements IWniosekRepository {


	public WniosekRepository(Connection connection,
						IMapResultSetIntoEntity<Wniosek> mapper,
					 IUnitOfWork uow) {
		super(connection, mapper, uow);
	}
	
	@Override
	protected String tableName() {
		return "wniosek";
	}
	
	protected String createTableSql() {
		return "CREATE TABLE wniosek("
					+ "id INT GENERATED BY DEFAULT AS IDENTITY,"
					+ "pacjentId INT,"
					+ "symptoms VARCHAR(250),"
					+ "previousMeds VARCHAR(150),"
					+ "infectious BOOLEAN,"
					+ "sendDate VARCHAR(50)"
				//    + "FOREIGN KEY (pacjentId) REFERENCES pacjent (id)"
				    + ")";
	}

	@Override
	protected String insertSql() {
		return "INSERT INTO wniosek(pacjentId,symptoms,previousMeds,infectious,sendDate) VALUES(?,?,?,?,?)";
	}

	@Override
	protected String updateSql() {
		return "UPDATE ad set pacjentId=?, symptoms=?, previousMeds=?, infectious=?, sendDate=? WHERE id=?";
	}


	@Override
	protected void setupInsert(Wniosek entity) throws SQLException {
		insert.setInt(1, entity.getPacjentId());
		insert.setString(2, entity.getSymptoms());
		insert.setString(3, entity.getPreviousMeds());
		insert.setBoolean(4, entity.isInfectious());
		insert.setString(5, entity.getSendDate().toString());
		
	}

	@Override
	protected void setupUpdate(Wniosek entity) throws SQLException {
		update.setString(2,entity.getSymptoms());
		update.setString(3,entity.getPreviousMeds());
		update.setBoolean(4,entity.isInfectious());
		update.setString(5,entity.getSendDate().toString());
		
	}

	public List<Wniosek> byPacjent(Pacjent pacjent) {
		return null;
	}

}
