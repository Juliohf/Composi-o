package entities;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	
	LocalDateTime momento;
	StatusPedido status;	
	Cliente cliente;

	List<ItemPedido> lista = new ArrayList<>();

	public Pedido(LocalDateTime momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addItem(ItemPedido item) {
		lista.add(item);
	}
	
	public void removeItem(ItemPedido item) {
		lista.remove(item);
	}
	
	public double total() {
		double sum = 0;
		for (ItemPedido i : lista) {
			sum += i.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(momento + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Order items:\n");
		for (ItemPedido it : lista) {
			sb.append(it + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}	

	
	
}
