package com.example.eDoc.domain;


import com.example.eDoc.dao.IRepositoryCatalog;
import com.example.eDoc.dao.RepositoryCatalog;
import com.example.eDoc.dao.uow.UnitOfWork;
import com.example.eDoc.model.Wniosek;
import com.example.eDoc.model.Wiadomosc;
import com.example.eDoc.model.Lekarz;
import com.example.eDoc.model.Pacjent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class App {

	@SuppressWarnings("deprecation")
	public static void main( String[] args )
	{

		String url = "jdbc:hsqldb:hsql://localhost/workdb";
		try {

			Connection connection = DriverManager.getConnection(url);
			IRepositoryCatalog catalog = new RepositoryCatalog(new UnitOfWork(connection), connection);


			Pacjent pacjent1 = new Pacjent();
			pacjent1.setName("Wojciech");
			pacjent1.setSurname("Antoniuk");
			pacjent1.setAdress("Legnicka 8/2");
			pacjent1.setZipcode("80-150");
			pacjent1.setCity("Gdańsk");
			pacjent1.setRegion("Pomorskie");
			pacjent1.setCountry("Polska");
			pacjent1.setPhone("797667775");
			pacjent1.setEmail("wanttie@gmail.com");
			pacjent1.setPassword("JestemNajlepszy123");
			pacjent1.setAge(22);
			pacjent1.setPESEL("95081808557");

			catalog.pacjenci().add(pacjent1);

			System.out.println( "Pierwszy pacjent zarejestrowany." );

			Pacjent pacjent2 = new Pacjent();
			pacjent2.setName("Andrzej");
			pacjent2.setSurname("Gołota");
			pacjent2.setAdress("Słoneczna 14/7");
			pacjent2.setZipcode("64-260");
			pacjent2.setCity("Warszawa");
			pacjent2.setRegion("Mazowieckie");
			pacjent2.setCountry("Polska");
			pacjent2.setPhone("657654395");
			pacjent2.setEmail("a.golota@wp.pl");
			pacjent2.setPassword("wielkibokser20");
			pacjent2.setAge(53);
			pacjent2.setPESEL("63052806335");

			catalog.pacjenci().add(pacjent2);

			System.out.println( "Drugi pacjent zarejestrowany." );
			
			Lekarz lekarz1 = new Lekarz();
			lekarz1.setName("Daria");
			lekarz1.setSurname("Ratke");
			lekarz1.setAdress("Legnicka 8/2");
			lekarz1.setZipcode("80-150");
			lekarz1.setCity("Gdańsk");
			lekarz1.setRegion("Pomorskie");
			lekarz1.setCountry("Polska");
			lekarz1.setPhone("507956208");
			lekarz1.setEmail("daria.ratke@gmail.com");
			lekarz1.setPassword("wojtekrulez");
			lekarz1.setSpecialization("Dermatolog / Lekarz rodzinny");

			catalog.lekarze().add(lekarz1);

			System.out.println( "Pierwszy lekarz dodany." );
			
			Lekarz lekarz2 = new Lekarz();
			lekarz2.setName("Amelia");
			lekarz2.setSurname("Asmus");
			lekarz2.setAdress("Legnicka 8/2");
			lekarz2.setZipcode("80-150");
			lekarz2.setCity("Gdańsk");
			lekarz2.setRegion("Pomorskie");
			lekarz2.setCountry("Polska");
			lekarz2.setPhone("885961087");
			lekarz2.setEmail("amelia.asmus@gmail.com");
			lekarz2.setPassword("wojtekrulez123");
			lekarz2.setSpecialization("Kardiolog");

			catalog.lekarze().add(lekarz2);

			System.out.println( "Drugi lekarz dodany." );
			
			Lekarz lekarz3 = new Lekarz();
			lekarz3.setName("Kinga");
			lekarz3.setSurname("Gajdamowicz");
			lekarz3.setAdress("Legnicka 8/2");
			lekarz3.setZipcode("80-150");
			lekarz3.setCity("Gdańsk");
			lekarz3.setRegion("Pomorskie");
			lekarz3.setCountry("Polska");
			lekarz3.setPhone("802675196");
			lekarz3.setEmail("k.gajdamowicz@gmail.com");
			lekarz3.setPassword("wojtektokrol");
			lekarz3.setSpecialization("Neurolog");

			catalog.lekarze().add(lekarz3);

			System.out.println( "Trzeci lekarz dodany." );
			
			Wniosek w1 = new Wniosek();
			w1.setSymptoms("Wirusowe zapalenie gardła");
			w1.setPreviousMeds("Gripex Max 2x300mg");
			w1.setInfectious(true);
			w1.setSendDate(new Date());

			catalog.wnioski().add(w1);

			List<Wniosek> wnioski = catalog.wnioski().byPacjent(pacjent1);

			System.out.println( "Pacjent1 dodaje wniosek." );
			
			Wiadomosc msg1 = new Wiadomosc();
			msg1.setFromPacjent(0);
			msg1.setToLekarz(1);
			msg1.setTitle("Za duży puls");
			msg1.setContent("Witam. Mój puls to 150. Co robić?");
			msg1.setSendDate(new Date());

			catalog.wiadomosci().add(msg1);

			List<Wiadomosc> message1 = catalog.wiadomosci().byPacjent(pacjent1);

			System.out.println( "Pacjent1 wysyła wiadomość." );

			Wiadomosc msg2 = new Wiadomosc();
			msg2.setFromLekarz(1);
			msg2.setToPacjent(0);
			msg2.setTitle("RE: Za duży puls");
			msg2.setContent("proszę wziąć to i tamto");
			msg2.setSendDate(new Date());

			catalog.wiadomosci().add(msg2);

			List<Wiadomosc> message2 = catalog.wiadomosci().byPacjent(pacjent2);

			System.out.println( "Lekarz2 wysyła wiadomość." );

			catalog.saveAndClose();

			}
			catch (SQLException e) {
				e.printStackTrace();
			}
	    	
	        System.out.println( "Koniec" );
	        
	    }
	}




