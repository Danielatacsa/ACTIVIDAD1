package com.medicamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicamento.Repository.MedicamentoRepositorio;
import com.medicamento.entity.Medicamento;

@Service
public class medicamentoServicelmpl implements medicamentoSevice{
	@Autowired
	
	private MedicamentoRepositorio repository;



	@Override
	public List<Medicamento> listaMedicamento() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}




	@Override
	public void EliminarMedicamento(int  idMe) {
		// TODO Auto-generated method stub
		repository.deleteById(idMe);
	}



	@Override
	public Medicamento insertaActualiza(Medicamento obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}




	@Override
	public Optional<Medicamento> medicamentoId(int idMe) {
		// TODO Auto-generated method stub
		return repository.findById(idMe);
	}





}
