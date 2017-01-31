package com.example.eDoc.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.eDoc.model.Wniosek;

public class WniosekMapper implements IMapResultSetIntoEntity<Wniosek>{

	public Wniosek map(ResultSet rs) throws SQLException {
		Wniosek w = new Wniosek();
		w.setId(rs.getInt("id"));
		w.setSymptoms(rs.getString("symptoms"));
		w.setPreviousMeds(rs.getString("previousMeds"));
		w.setInfectious(rs.getBoolean("infectious"));
		w.setSendDate(rs.getDate("sendDate"));
		return w;
	}

}
