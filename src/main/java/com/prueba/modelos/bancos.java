package com.prueba.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bancos")
public class bancos implements Serializable{

	
	private static final long serialVersionUID = -3221287730103935726L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@ManyToOne()
	@JoinColumn(name = "cliente_id", nullable = false)
	private usuarios Usuarios;
	
	@Column(name = "nombre" , nullable = false , length = 10)
	String nombre;
	
	@Column(name = "deuda" , nullable = false , length = 10)
	int deuda;
	
	

	
	
}
