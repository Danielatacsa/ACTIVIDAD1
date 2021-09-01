package com.medicamento.service;

import java.util.List;
import java.util.Optional;

import com.medicamento.entity.Medicamento;

public interface medicamentoSevice {
	public  Medicamento insertaActualiza(Medicamento obj);

	public List<Medicamento> listaMedicamento();
	void  EliminarMedicamento(int idMe);
	  
	public Optional<Medicamento> medicamentoId(int idMe);

}
