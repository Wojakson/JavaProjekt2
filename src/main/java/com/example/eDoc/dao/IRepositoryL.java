package com.example.eDoc.dao;
import java.util.List;

import com.example.eDoc.model.IHaveId;

public interface IRepositoryL<TEntity extends IHaveId>{
	
	public TEntity get(int lekarzId);

	public List<TEntity> getAll();

	public void add(TEntity entity);

	public void update(TEntity entity);

	public void delete(TEntity entity);

}
