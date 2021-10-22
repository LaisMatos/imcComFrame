package br.senai.sp.jandira.calculadora;

public class CalculadoraImc {
	
	//atributos (s�o sempre privados)
	private double peso;
	private double altura;
	
	
	//metodos de acesso dos atributos peso e altura, pois s�o privados
	public void setAltura (String altura) {
		this.altura= Double.parseDouble(altura); // parseDouble converte double em string 	
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setPeso (String peso) {
		this.peso=Double.parseDouble(peso); //this se relaciona com a classe e n�o de maneira hierarquica
	}
	
	public double getPeso () {
		return peso;
	}
	
	
	//metodo p/ converter o resultado do m�todo calculoImc de string em double
	public String mostrarImcComoString() {
		return String.valueOf(calculoImc());
	}
	
	
	//metodos p/ calcular imc e mostrar status(a��es do meu obj calculadoraIMC)
	public double calculoImc() { // parenteses recebe os par�metros 
		double imc=peso/(this.altura*this.altura); //da programa��o � feita dentro do m�todo e � dentro dos parenteses
		return imc;
	}
	
		
	// metodo para motrar status
	public String mostrarStatus() {
								
				if(calculoImc()<=18){
					return "Abaixo do peso";					
				}else if(calculoImc()>=18.5&&calculoImc()<=25)
				{
					return "Peso ideal";
				}else if(calculoImc()>=25.1&&calculoImc()<=30)
				{
					return "Acima do peso";
				}else if(calculoImc()>=30.1&&calculoImc()<=35)
				{
					return "Obesidade grau 1";
				}else if(calculoImc()>=35.1&&calculoImc()<=40)
				{
					return "Obesidade severa";
				}else {
					return "Obesidade m�rbida";
				}
				
		
	}
	
	 
	
	
	
	
	
	

}
