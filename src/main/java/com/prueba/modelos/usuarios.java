package com.prueba.modelos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "usuarios")
public class usuarios implements Serializable {


	private static final long serialVersionUID = -302097984253906225L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@OneToMany(mappedBy = "Usuarios")
	private List<bancos> bancos;
	
	
	@Column(name = "nombre" , nullable = false , length = 10)
	String nombre;
	
	@Column(name = "cedula" , nullable = false , length = 10)
	String cedula;
	
	@Column(name = "correo" , nullable = false , length = 10)
	String correo;
	
	@Column(name = "contraseña" , nullable = false , length = 10)
	String contraseña;

}
