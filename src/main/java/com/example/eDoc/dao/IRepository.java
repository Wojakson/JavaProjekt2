package com.example.eDoc.dao;

import java.util.List;

import com.example.eDoc.model.*;

public interface IRepository<TEntity extends IHaveId> {

	public TEntity get(int pacjentId);

	public List<TEntity> getAll();

	public void add(TEntity entity);

	public void update(TEntity entity);

	public void delete(TEntity entity);

}

