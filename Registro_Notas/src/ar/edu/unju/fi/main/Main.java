package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNotas;

public class Main {

	
	public static void main(String[] args) {
		// CREAR PAR UN ALUMNO EL REGISTRO DE NOTAS FINALES DE 4 MATERIAS
		
		Alumno alumno = generarAlumno();
		
		registrarNota(alumno, 1);
		
	}
	
	public static Alumno generarAlumno() {
		
		Scanner scanner = new Scanner(System.in);
		
		Alumno alumno = new Alumno();

		System.out.print("Ingrese el legajo: ");
		Integer legajo = scanner.nextInt();
		
		System.out.print("Ingrese el apellido: ");
		String apellido = scanner.next();

		System.out.print("Ingrese el nombre: ");
		String nombre = scanner.next();
			
		alumno.setLegajo(legajo);
		alumno.setAoellido(apellido);
		alumno.setNombre(nombre);
		//scanner.close();

		return alumno;
		
	}
		
	public static void registrarNota(Alumno alumno, int numMaterias) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(numMaterias <= 4) {
			//Cargar Materias
			
			System.out.print("Ingrese el codigo de la materia: ");
			String codigoMateria = scanner.next();
			System.out.print("Ingrese el nombre de la materia: ");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			
			System.out.print("Ingrese el codigo del registro de nota:  ");
			String codigoNota = scanner.next();
			System.out.print("Ingrese nota final: ");
			Float nota = scanner.nextFloat();
			
			RegistroNotas registroNota = new RegistroNotas(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNota.toString());
			
			numMaterias++;
			
		}
		
		scanner.close();
	}
	
}
