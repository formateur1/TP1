package com.inti.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Vol {
	
	@Id
	private int id;
	private String nom;
	
	@OneToMany(mappedBy = "vol")
	private List<InfosEscale> listeIE;
	
	
	public Vol() {
		super();
	}
	public Vol(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<InfosEscale> getListeIE() {
		return listeIE;
	}
	public void setListeIE(List<InfosEscale> listeIE) {
		this.listeIE = listeIE;
	}
	@Override
	public String toString() {
		return "Vol [id=" + id + ", nom=" + nom + "]";
	}
	
	

}
