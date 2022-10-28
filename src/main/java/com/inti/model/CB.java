package com.inti.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "CB_per_class")
//@PrimaryKeyJoinColumn(name = "idPaiement")
//@DiscriminatorValue("2")
public class CB extends Paiement {
	
	private int numeroCarte;
	private LocalDate dateExpiration;
	
	
	public CB() {
		super();
	}
	
	public CB(int numeroCarte, LocalDate dateExpiration) {
		super();
		this.numeroCarte = numeroCarte;
		this.dateExpiration = dateExpiration;
	}
	
	
	
	public CB(int idPaiement, double montant, LocalDate dateP, int numeroCarte, LocalDate dateExpiration) {
		super(idPaiement, montant, dateP);
		this.numeroCarte = numeroCarte;
		this.dateExpiration = dateExpiration;
	}

	public int getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(int numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	public LocalDate getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(LocalDate dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	@Override
	public String toString() {
		return "CB [numeroCarte=" + numeroCarte + ", dateExpiration=" + dateExpiration + ", idPaiement=" + idPaiement
				+ ", montant=" + montant + ", dateP=" + dateP + "]";
	}

}
