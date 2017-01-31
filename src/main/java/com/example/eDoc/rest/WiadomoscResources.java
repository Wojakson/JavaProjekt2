package com.example.eDoc.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import com.example.eDoc.model.Wiadomosc;
import com.example.eDoc.rest.dto.WiadomoscDto;

@Stateless
public class WiadomoscResources {

Mapper mapper = new DozerBeanMapper();
	
    @PersistenceContext
    EntityManager entityManager;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
    	List<WiadomoscDto> result = new ArrayList<WiadomoscDto>();
    	for(Wiadomosc w: entityManager.createNamedQuery("wiadomosc.all",Wiadomosc.class).getResultList()){
        	result.add(mapper.map(w, WiadomoscDto.class));
        }
        return Response.ok(new GenericEntity<List<WiadomoscDto>>(result){}).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") int id) {
    	Wiadomosc result = entityManager.createNamedQuery("wiadomosc.id", Wiadomosc.class)
                .setParameter("id", id)
                .getSingleResult();
        if (result == null) {
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }

}
	

