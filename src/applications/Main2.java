
package applications;

import java.util.Scanner;

import entities.Conta2;



public class Main2 {
    
    
    public static void main(String[] args){
        
        String nome;
        String tipo;
        double inicial;
        
        Scanner entradaA = new Scanner(System.in);
        System.out.println("Cadastrando Cliente Conta A.");
        tipo = "A";
        System.out.print("Entre com seu nome: ");
        nome = entradaA.nextLine();
        System.out.print("Entre com o valor inicial depositado na conta: ");
        inicial = entradaA.nextDouble();
        Conta2 ContaPessoaA = new Conta2(tipo, nome, inicial);
        

        Scanner entradaB = new Scanner(System.in);
        System.out.println("Cadastrando Cliente Conta B.");
        tipo = "B";
        System.out.print("Entre com seu nome: ");
        nome = entradaB.nextLine();
        System.out.print("Entre com o valor inicial depositado na conta: ");
        inicial = entradaB.nextDouble();
        Conta2 ContaPessoaB = new Conta2(tipo, nome, inicial);
       
        
        while (true) {
        	String tipoConta;
        	Scanner tipoc = new Scanner(System.in);
        	
        	System.out.println("Qual conta deseja movimentar(A/B)?");
        	tipoConta = tipoc.nextLine();
        	
        	if (tipoConta == "A") {
     	   		ContaPessoaA.iniciar();
     
     	   	}else{
     	   		ContaPessoaB.iniciar();
     	   	
        }
        	tipoc.close();           
        }
    }

	   
}