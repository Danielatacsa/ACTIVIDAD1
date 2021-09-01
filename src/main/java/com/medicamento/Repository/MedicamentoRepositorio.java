package com.medicamento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicamento.entity.Medicamento;

public interface MedicamentoRepositorio extends JpaRepository<Medicamento, Integer> {

}
