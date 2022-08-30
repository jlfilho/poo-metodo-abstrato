package entidades;

import entidades.enums.Cor;

public class Circulo extends Forma {
	
	Double raio;
	
	Circulo() {
		super();
	}
	

	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}


	public Double getRaio() {
		return raio;
	}


	public void setRaio(Double raio) {
		this.raio = raio;
	}


	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}

}
