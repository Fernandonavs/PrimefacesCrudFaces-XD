package org.controller.persona;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.dao.persona.DaoPersona;
import org.modelo.persona.Persona;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class ControllerPersona implements Serializable {
	private List<Persona> listPersonas;
	private Persona persona;
	
	//SUPER CLASS
	public ControllerPersona() {
		super();
		// TODO Auto-generated constructor stub
	}

	//GETTERS AND SETTERS DE listPersonas;
	public List<Persona> getListPersonas() {
		DaoPersona daoPersona = new DaoPersona();
		listPersonas = daoPersona.ListPersona();
		return listPersonas;
	}

	public void setListPersonas(List<Persona> listPersonas) {
		this.listPersonas = listPersonas;
	}

	//GETTERS AN SETTERS DE persona
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	//METHODS DE PERSONA
	public void limpiarPersona() {
		persona = new Persona();
		
	}
	
	public String agregarPersona() {
		DaoPersona daoPersona = new DaoPersona();
		daoPersona.addPersona(persona);
		return "/index.xhtml?faces-redirecture=true";
	}
	
	public String modificarPersona() {
		DaoPersona dao = new DaoPersona();
		dao.updatePersona(persona);
		return "/index.xhtml?faces-redirecture=true";
	}
	
	public String eliminarPersona() {
		DaoPersona daoPersona = new DaoPersona();
		daoPersona.deletePersona(persona);
		return "/index.xhtml?faces-redirecture=true";
	}

}
