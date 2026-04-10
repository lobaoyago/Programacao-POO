package atividade;

public class ContaBancaria {
	int numero;
	   double saldo;
	   String titular;


	   void depositar(double valor) {


	       this.saldo += valor;
	       System.out.println("seu depósito no valor de:" + valor + " foi realizado com sucesso !!! O novo saldo de " + titular + " é de " + saldo);
	   }


	   void sacar(double valor) {
	       if (saldo >= valor) {
	           this.saldo -= valor;
	           System.out.println("seu saque no valor de:" + valor + " foi realizado com sucesso !!! O novo saldo de " + titular + " é de " + saldo);
	       } else {
	           System.out.println("Saldo insuficiente");
	       }
	   }




	   void exibirDados() {
	       System.out.println(numero);
	       System.out.println(titular);
	       System.out.println(saldo);


	   }


	   public int getNumero() {
	       return numero;
	   }


	   public void setNumero(int numero) {
	       this.numero = numero;
	   }


	   public double getSaldo() {
	       return saldo;
	   }


	   public void setSaldo(double saldo) {
	       this.saldo = saldo;
	   }


	   public String getTitular() {
	       return titular;
	   }


	   public void setTitular(String titular) {
	       this.titular = titular;
	   }

}
