package sueldo;

public class EmpleadoExtra extends Empleado {

	private double valorHoraExtra;
	private int horasExtra;
	public EmpleadoExtra(double sueldoFijo ,String nombre ,  int horasExtra,double valorHoraExtra) {
		super(sueldoFijo , nombre);
		this.valorHoraExtra = valorHoraExtra;
		this.horasExtra = horasExtra;
	}
	
	public double calcularSueldo() {
		return this.getSueldoFijo() + (valorHoraExtra * horasExtra);
	}
}
