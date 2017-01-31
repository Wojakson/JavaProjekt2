package com.example.eDoc.dao;

import java.util.List;

import com.example.eDoc.model.*;

public interface IWniosekRepository extends IRepository<Wniosek> {
	
	public List<Wniosek> byPacjent(Pacjent pacjent);
}