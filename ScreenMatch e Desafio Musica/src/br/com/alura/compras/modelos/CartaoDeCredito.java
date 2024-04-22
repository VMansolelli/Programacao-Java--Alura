package br.com.alura.compras.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> Compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.Compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.Compras.add(compra);
            return true;
        } else {
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return Compras;
    }
}
