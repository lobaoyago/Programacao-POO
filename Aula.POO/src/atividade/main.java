package atividade;

import java.util.Random;

public class main {
	public static void main (String [] args) {


	       Random random = new Random();


	       ContaBancaria contaJoao = new ContaBancaria();


	       contaJoao.titular = "João";
	       contaJoao.saldo = 500.00;
	       contaJoao.numero = random.nextInt(100);


	       ContaBancaria contaMaria = new ContaBancaria();
	       contaMaria.titular ="Maria";
	       contaMaria.saldo = 1000.00;
	       contaMaria.numero = random.nextInt(100);


	       contaJoao.depositar(200);
	       contaMaria.sacar(300);


	       contaJoao.exibirDados();
	       contaMaria.exibirDados();
	      


	       }
	}


