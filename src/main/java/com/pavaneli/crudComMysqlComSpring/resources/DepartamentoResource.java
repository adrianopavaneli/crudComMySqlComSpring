package com.pavaneli.crudComMysqlComSpring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavaneli.crudComMysqlComSpring.entities.Departamento;

@RestController
@RequestMapping(value = "/departamento")
public class DepartamentoResource {
	
	public ResponseEntity<Departamento> findAll(){
		Departamento d = new Departamento(1L, "Eletronicos");	
		return ResponseEntity.ok().body(d);
	}

}
