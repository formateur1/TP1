package com.inti.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table (name = "Paiement_per_class")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
//@DiscriminatorColumn( name="discriminator", discriminatorType = DiscriminatorType.INTEGER )
//@DiscriminatorValue("0")
public abstract class Paiement {
	
	@Id
	protected int idPaiement;
	protected double montant;
	protected LocalDate dateP;
	
	
	public Paiement() {
		super();
	}
	
	public Paiement(int idPaiement, double montant, LocalDate dateP) {
		super();
		this.idPaiement = idPaiement;
		this.montant = montant;
		this.dateP = dateP;
	}
	
	public int getIdPaiement() {
		return idPaiement;
	}
	public void setIdPaiement(int idPaiement) {
		this.idPaiement = idPaiement;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public LocalDate getDateP() {
		return dateP;
	}
	public void setDateP(LocalDate dateP) {
		this.dateP = dateP;
	}
	@Override
	public String toString() {
		return "Paiement [idPaiement=" + idPaiement + ", montant=" + montant + ", dateP=" + dateP + "]";
	}
	
	

}
