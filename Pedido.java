package com.example.ac1lab.model;

public class Pedido {
    private int codigo;
    private double valor;
    private String descricao;
    private String cliente;
    private String datadopedido;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDatadopedido() {
        return datadopedido;
    }

    public void setDatadopedido(String datadopedido) {
        this.datadopedido = datadopedido;
    }
}
