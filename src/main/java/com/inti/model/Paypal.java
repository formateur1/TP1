package com.inti.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Paypal_per_class")
//@PrimaryKeyJoinColumn(name = "idPaiement")
//@DiscriminatorValue("1")
public class Paypal extends Paiement {
	
	private int numeroCompte;

	public Paypal() {
		super();
	}

	public Paypal(int numeroCompte) {
		super();
		this.numeroCompte = numeroCompte;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	@Override
	public String toString() {
		return "Paypal [numeroCompte=" + numeroCompte + ", idPaiement=" + idPaiement + ", montant=" + montant
				+ ", dateP=" + dateP + "]";
	}
	
	

}
