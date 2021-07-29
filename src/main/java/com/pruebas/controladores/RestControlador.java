package com.pruebas.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.repositorios.bancos;
import com.prueba.repositorios.usuarios;

@RestController
@CrossOrigin(origins = "*" , methods = {RequestMethod.GET , RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/api")
public class RestControlador {

	@Autowired
	usuarios Usuarios;
	
	@Autowired
	bancos Bancos;
	
	 @GetMapping()
	   public ArrayList<com.prueba.modelos.usuarios> obtenerUsuarios(){
		   return (ArrayList<com.prueba.modelos.usuarios>) Usuarios.findAll();
	 }
	
	 @PostMapping()
	 public com.prueba.modelos.usuarios registrar(com.prueba.modelos.usuarios usuario){
		 return Usuarios.save(usuario);
	 }
	 
	 @GetMapping(name = "/bancos")
	   public ArrayList<com.prueba.modelos.bancos> obtenerBancos(){
		   return (ArrayList<com.prueba.modelos.bancos>) Bancos.findAll();
	 }
	
	 @PostMapping(name = "/bancos")
	 public com.prueba.modelos.bancos registrarBancos(com.prueba.modelos.bancos bancos){
		 return Bancos.save(bancos);
	 }
	 
	 
	 
}
