package com.esprit.integrationContinue.model;

import java.io.Serializable;

public class Operande implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Integer operande1;
	Integer operande2;

	public Integer getOperande1() {
		return operande1;
	}

	public void setOperande1(Integer operande1) {
		this.operande1 = operande1;
	}

	public Integer getOperande2() {
		return operande2;
	}

	public void setOperande2(Integer operande2) {
		this.operande2 = operande2;
	}
}
