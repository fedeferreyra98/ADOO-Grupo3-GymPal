package ar.edu.uade.model;

import java.util.LinkedList;
import java.util.List;

public class Rutina {

	private final int duracionSemanas = 4;
	private List<Entrenamiento> entrenamientos = new LinkedList<Entrenamiento>();

	public void reforzar(){
		Entrenamiento entrenamientoReforzado = this.entrenamientos.get(entrenamientos.size()-1);
		entrenamientoReforzado.reforzar();
		entrenamientos.set(entrenamientos.size() - 1, entrenamientoReforzado);
	}
	public boolean rutinaCompleta(){
		throw new UnsupportedOperationException();
	}

}
