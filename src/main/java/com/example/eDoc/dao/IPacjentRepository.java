package com.example.eDoc.dao;

import java.util.List;

import com.example.eDoc.model.*;

public interface IPacjentRepository extends IRepository<Pacjent> {
	
	public List<Pacjent> withName(String name);
}
