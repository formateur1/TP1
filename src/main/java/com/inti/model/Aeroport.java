package com.inti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class Aeroport {

	@Id
	private int id;
	private String nom;

	
	@Transient
	private String nomPilote;
	

	@Transient
	private int nbPistes;


	@OneToMany(mappedBy = "aeroport", cascade = CascadeType.ALL)
	private List<InfosEscale> listeIE;

	public Aeroport() {
		super();
	}

	public Aeroport(int id, String nom) {
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

	public String getNomPilote() {
		return nomPilote;
	}
	public void setNomPilote(String nomPilote) {
		this.nomPilote = nomPilote;
	}

	@Override
	public String toString() {
		return "Aeroport [id=" + id + ", nom=" + nom + "]";
	}

	public void test() {
		System.out.println("coucou");
	}

}
