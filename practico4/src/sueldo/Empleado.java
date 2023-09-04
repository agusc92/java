package sueldo;

public class Empleado {
	private String nombre;
private double sueldoFijo;

public Empleado(double sueldoFijo , String nombre) {
	this.sueldoFijo = sueldoFijo;
	this.nombre = nombre;
}

public double calcularSueldo() {
	return sueldoFijo;
}


public double getSueldoFijo() {
	return sueldoFijo;
}

public void setSueldoFijo(double sueldoFijo) {
	this.sueldoFijo = sueldoFijo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}


}
