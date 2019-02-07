package com.springboot.jaxrs.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.springboot.jaxrs.model.Patient;
import com.springboot.jaxrs.service.PatientService;


@Service
public class PatientServiceImpl implements PatientService {
	Map<Long, Patient> patients = new HashMap<>();
	long currentId = 123;

	public PatientServiceImpl() {
		Patient patient1 = new Patient();
		patient1.setId(currentId);
		patient1.setName("John");
		patients.put(patient1.getId(), patient1);
	}

	@Override
	public List<Patient> getPatients() {
		Collection<Patient> patientList = patients.values();
		return new ArrayList<>(patientList);
	}

	@Override
	public Patient getPatient(long id) {
		return patients.get(id);
	}
}
