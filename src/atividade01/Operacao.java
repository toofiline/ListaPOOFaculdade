package atividade01;

public class Operacao {
	protected int numDep;
	protected double salarioMin;
	protected double horasTrab;
	protected double qtdHorasExt;
	
	protected double valorHoraTrab() {
		return salarioMin/5;
	}
	
	protected double slrMensal() {
		return horasTrab * valorHoraTrab();
	}
	
	protected int bolsaDepend() {
		return 32 * numDep;
	}
	
	protected double horaExt() {
		return ((qtdHorasExt * 50) /100) + qtdHorasExt;
	}
	
	protected double valorHoraExt() {
		return horaExt() * valorHoraTrab();
	}
	
	protected double salarioBruto() {
		return slrMensal() + bolsaDepend() + valorHoraExt();
	}
	
	protected double salarioLiq() {
		return salarioBruto() - impostoRenda();
	}
	
	protected double impostoRenda() {
		if (salarioBruto() < 200) {
        	return 0;
        }
        else if(salarioBruto() >=200 || salarioBruto() <=500){
        	return salarioBruto() * 0.10;
        }
        else {
        	return salarioBruto() * 0.20;
        }
	}
	
	
	protected double enviaBonus() {
		if (salarioLiq() <= 350) {
        	return bonus100();
        }
        else {
        	return bonus50();
        }
	}
	
	protected double bonus100() {
		return 100;
	}
	
	protected double bonus50() {
		return 50;
	}

}
