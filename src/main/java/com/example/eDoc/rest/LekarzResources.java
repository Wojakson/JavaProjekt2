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

import com.example.eDoc.model.Lekarz;
import com.example.eDoc.rest.dto.LekarzDto;


@Stateless
public class LekarzResources {

Mapper mapper = new DozerBeanMapper();
	
    @PersistenceContext
    EntityManager entityManager;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
    	List<LekarzDto> result = new ArrayList<LekarzDto>();
    	for(Lekarz l: entityManager.createNamedQuery("lekarz.all",Lekarz.class).getResultList()){
        	result.add(mapper.map(l, LekarzDto.class));
        }
        return Response.ok(new GenericEntity<List<LekarzDto>>(result){}).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") int id) {
    	Lekarz result = entityManager.createNamedQuery("lekarz.id", Lekarz.class)
                .setParameter("id", id)
                .getSingleResult();
        if (result == null) {
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }

}

	

