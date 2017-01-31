package com.example.eDoc.dao.mappers;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.eDoc.model.Lekarz;

public class LekarzMapper implements IMapResultSetIntoEntity<Lekarz>{
	
	public Lekarz map(ResultSet rs) throws SQLException {
		Lekarz l = new Lekarz();
		l.setId(rs.getInt("id"));
		l.setName(rs.getString("name"));
		l.setSurname(rs.getString("surname"));
		l.setAdress(rs.getString("adress"));
		l.setZipcode(rs.getString("zipcode"));
		l.setCity(rs.getString("city"));
		l.setRegion(rs.getString("region"));
		l.setCountry(rs.getString("country"));
		l.setPhone(rs.getString("phone"));
		l.setEmail(rs.getString("email"));
		l.setPassword(rs.getString("password"));
		l.setSpecialization(rs.getString("specialization"));
		return l;
	}

}
