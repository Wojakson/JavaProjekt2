package com.example.eDoc.dao;

import java.util.List;

import com.example.eDoc.model.Lekarz;


public interface ILekarzRepository extends IRepository<Lekarz> {
	
	public List<Lekarz> withName(String name);

}
