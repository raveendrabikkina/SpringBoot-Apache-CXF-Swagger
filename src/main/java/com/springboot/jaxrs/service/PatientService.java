package com.springboot.jaxrs.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.springboot.jaxrs.model.Patient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api
@Path("/patientservice")
@Produces(MediaType.APPLICATION_JSON)
public interface PatientService {

	@GET
	@Path("/patients")
	List<Patient> getPatients();

	@GET
	@Path("/patient/{id}")
	@ApiOperation(value = "Gets all the patients.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Person corresponding to the id", response = Patient.class),
			@ApiResponse(code = 404, message = "Patient with given id not found") })
	Patient getPatient(@PathParam(value = "id") long id);
}
