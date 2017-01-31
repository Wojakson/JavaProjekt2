package com.example.eDoc.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.eDoc.model.*;

public interface IMapResultSetIntoEntity<TEntity extends IHaveId> {

	public TEntity map(ResultSet rs) throws SQLException;
	
}