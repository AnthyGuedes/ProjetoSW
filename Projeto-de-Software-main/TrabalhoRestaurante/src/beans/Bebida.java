/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author guede
 */
public class Bebida extends Item{
    int id;
    private String nome;
    private double preco;
    private int estoque;

    public Bebida(int id, String nome, double preco, int estoque) {
        super(id, nome, preco, estoque);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int getEstoque() {
        return super.getEstoque();
    }

    public void setEstoque(int estoque) {
        super.setEstoque(estoque);
    }

}

