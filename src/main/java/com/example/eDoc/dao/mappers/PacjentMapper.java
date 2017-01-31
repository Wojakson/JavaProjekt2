package com.example.eDoc.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.eDoc.model.*;

public class PacjentMapper implements IMapResultSetIntoEntity<Pacjent>{

	public Pacjent map(ResultSet rs) throws SQLException {
		Pacjent p = new Pacjent();
		p.setId(rs.getInt("id"));
		p.setName(rs.getString("name"));
		p.setSurname(rs.getString("surname"));
		p.setAdress(rs.getString("adress"));
		p.setZipcode(rs.getString("zipcode"));
		p.setCity(rs.getString("city"));
		p.setRegion(rs.getString("region"));
		p.setCountry(rs.getString("country"));
		p.setPhone(rs.getString("phone"));
		p.setEmail(rs.getString("email"));
		p.setPassword(rs.getString("password"));
		p.setAge(rs.getInt("age"));
		p.setPESEL(rs.getString("PESEL"));
		return p;
	}

}
