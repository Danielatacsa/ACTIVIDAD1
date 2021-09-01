package com.medicamento.controller;




import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicamento.entity.Medicamento;
import com.medicamento.service.medicamentoSevice;




@RestController
@RequestMapping("/rest/medicamento")
public class Medicamentocontroller {

	@Autowired
	private medicamentoSevice service;

	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Medicamento>> listaMedicamento(){
		List<Medicamento> lista = service.listaMedicamento();
		return ResponseEntity.ok(lista);
		
	}
	
    @PostMapping
	@ResponseBody

	public ResponseEntity<Medicamento> registraAlumno(@RequestBody Medicamento obj){
		Medicamento objSalida = service.insertaActualiza(obj);
		if(objSalida == null) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(objSalida);
		}
		
		
	}

    @DeleteMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Medicamento> elminarMedicamento(@PathVariable("id")int idMe){
		Optional<Medicamento> optMedicamento = service.medicamentoId(idMe);
		if(optMedicamento.isPresent()) {
			service.EliminarMedicamento(idMe);
			return ResponseEntity.ok(optMedicamento.get());
		}
		else {
			return ResponseEntity.notFound().build();
		}
		
		
	}
}


	

