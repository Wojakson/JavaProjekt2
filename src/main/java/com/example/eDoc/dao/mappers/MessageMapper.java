package com.example.eDoc.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.eDoc.model.*;

public class MessageMapper implements IMapResultSetIntoEntity<Wiadomosc>{

	public Wiadomosc map(ResultSet rs) throws SQLException {
		Wiadomosc m = new Wiadomosc();
		m.setId(rs.getInt("id"));
		m.setFromPacjent(rs.getInt("fromUser"));
		m.setToPacjent(rs.getInt("toUser"));
		m.setTitle(rs.getString("title"));
		m.setContent(rs.getString("content"));
		m.setSendDate(rs.getDate("date"));
		return m;
	}

}
