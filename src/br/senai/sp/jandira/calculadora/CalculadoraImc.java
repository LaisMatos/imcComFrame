package br.senai.sp.jandira.calculadora;

public class CalculadoraImc {

	private double peso;
	private double altura;
	private double imc;
	
	 

	// metodo para peso
	public void peso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return this.peso;
	}

	// metodo para altura
	public void altura(double altura) {
		this.altura = altura;
	}

	public double getAltura(double altura) {
		return this.altura;
	}

	// metodo para calculo do imc
	public void imc(double imc) {
		this.imc = imc;
	}

	public double getImc(double imc) {
			return this.imc;
		}

		
	
	// precisa criar um metodo para calcular
	
	
	
	/* imc=peso/(altura*altura);

	if(imc<18)

	{
		System.out.println("Abaixo do peso");
	}else if(imc>=18.5&&imc<=25)
	{
		System.out.println("Peso ideal");
	}else if(imc>=25.1&&imc<=30)
	{
		System.out.println("Acima do peso");
	}else if(imc>=30.1&&imc<=35)
	{
		System.out.println("Obesidade grau 1");
	}else if(imc>=35.1&&imc<=40)
	{
		System.out.println("Obesidade severa");
	}else if(imc>=40.1)
	{
		System.out.println("Obesidade mórbida");
	}*/

}
