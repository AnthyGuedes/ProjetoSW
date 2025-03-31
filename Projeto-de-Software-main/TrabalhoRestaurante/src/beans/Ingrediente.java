/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author guede
 */
public class Ingrediente extends Item{

    public Ingrediente(int id, String nome, double preco, int estoque) {
        super(id, nome, preco, estoque);
    }

    @Override
    public int getEstoque() {
        return super.getEstoque();
    }

    @Override
    public void setEstoque(int estoque) {
        super.setEstoque(estoque);
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }
}
