package com.example.eDoc.dao;
 
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.example.eDoc.dao.mappers.IMapResultSetIntoEntity;
import com.example.eDoc.dao.uow.IUnitOfWork;
import com.example.eDoc.model.Wiadomosc;
import com.example.eDoc.model.Pacjent;

    public class WiadomoscRepository extends RepositoryBase<Wiadomosc> implements IWiadomoscRepository {
 
 
    	public WiadomoscRepository(Connection connection,
    			IMapResultSetIntoEntity<Wiadomosc> mapper,
    			IUnitOfWork uow) {
    		super(connection, mapper, uow);
    	}
        
    	@Override
    	protected String tableName() {
    		return "wiadomosc";
    	}
 
        protected String createTableSql() {
        		return "CREATE TABLE wiadomosc("
                + "id INT GENERATED BY DEFAULT AS IDENTITY,"
                + "fromPacjent INT,"
                + "toPacjent INT,"
                + "title VARCHAR(20),"
                + "content VARCHAR(30),"
                + "sendDate VARCHAR(30)"
				//+ "FOREIGN KEY (fromUser) REFERENCES user (id),"
				//+ "FOREIGN KEY (toUser) REFERENCES user (id),"
				+ ")";
        }
        
        @Override
    	protected String insertSql() {
    		return "INSERT INTO wiadomosc(fromPacjent,toPacjent,title,content,sendDate) VALUES(?,?,?,?,?)";
    	}
        
    	@Override
    	protected String updateSql() {
    		return "UPDATE wiadomosc set fromPacjent=?, toPacjent=?, title=?, content=?, sendDate=? WHERE id=?";
    	}

        protected void setupInsert(Wiadomosc entity) throws SQLException {
                insert.setInt(1, entity.getFromPacjent());
                insert.setInt(2, entity.getToPacjent());
                insert.setString(3, entity.getTitle());
                insert.setString(4, entity.getContent());
			    insert.setString(5, entity.getSendDate().toString());
		}
 
        protected void setupUpdate(Wiadomosc entity) throws SQLException {
            	update.setInt(1, entity.getFromPacjent());
                update.setInt(2, entity.getToPacjent());
                update.setString(3, entity.getTitle());
                update.setString(4, entity.getContent());
				update.setString(5, entity.getSendDate().toString());
        }

		public java.util.List<Wiadomosc> byPacjent(Pacjent pacjent) {
			// TODO Auto-generated method stub
			return null;
		}
    }