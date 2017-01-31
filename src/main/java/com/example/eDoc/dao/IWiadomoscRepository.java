package com.example.eDoc.dao;

import java.util.List;

import com.example.eDoc.model.*;

public interface IWiadomoscRepository extends IRepository<Wiadomosc> {

	public List<Wiadomosc> byPacjent(Pacjent pacjent);

}
