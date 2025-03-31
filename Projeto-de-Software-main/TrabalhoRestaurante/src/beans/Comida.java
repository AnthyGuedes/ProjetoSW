/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author guede
 */
public class Comida extends Item{
    private int id;
    private String nome;
    private double preco;
    private int estoque;

    public Comida(int id, String nome, double preco, int estoque) {
        super(id, nome, preco, estoque);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int getEstoque() {
        return estoque;
    }

    @Override
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

}
