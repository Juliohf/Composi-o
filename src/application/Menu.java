package application;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

public class Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Entre com dados do cliente:");
		System.out.println("Nome:");
		String nome = sc.nextLine();
		System.out.println("Email");
		String email = sc.nextLine();
		System.out.println("Data de Nascimento");
		String data1 = sc.nextLine();
		LocalDate contractDate = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Cliente cliente = new Cliente(nome, email, contractDate); 
		
		System.out.println("Entre com dados do pedido:");
		System.out.println("Status");
		String status = sc.next();
		StatusPedido stat = StatusPedido.valueOf(status);
		
		LocalDateTime d01 = LocalDateTime.now();
		Pedido pedido = new Pedido(d01, stat, cliente);
		
		System.out.println("Quantos items?");
		int n = sc.nextInt();

		
		for (int i = 1; i<=n;i++) {
			System.out.println("Entre com os dados do #" + i + "produto:");
			System.out.println("Nome do Produto");
			sc.nextLine();
			String name = sc.nextLine();			
			System.out.println("Preço do produto");
			double preço = sc.nextDouble();
			System.out.println("Quantidade");
			int quantidade = sc.nextInt();
			Produto produto = new Produto(name,preço);
			ItemPedido itempedido= new ItemPedido(quantidade, preço, produto);
			pedido.addItem(itempedido);
			
		}
		
		System.out.println(pedido);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		sc.close();
	}

}
