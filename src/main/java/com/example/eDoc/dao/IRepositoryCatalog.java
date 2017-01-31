package com.example.eDoc.dao;


public interface IRepositoryCatalog {

	public IPacjentRepository pacjenci();
	public IWniosekRepository wnioski();
	public IWiadomoscRepository wiadomosci();
	public ILekarzRepository lekarze();
	
	public void saveAndClose();
	public void save();
	
}