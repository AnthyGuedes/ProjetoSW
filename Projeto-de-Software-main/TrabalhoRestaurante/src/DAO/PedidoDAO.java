/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import beans.Pedido;
import Restaurante.Conexao;
import java.sql.Connection;

/**
 *
 * @author guede
 */
public class PedidoDAO {
    private Conexao conexao;
    private Connection conn;
    
    public PedidoDAO() {  
    this.conexao = new Conexao();
    this.conn = this.conexao.getConexao();
}
        public void inserir(Pedido pedido) {
       
    }
        
    public List<Pedido> getPedidosPorComanda(int idComanda) {
    String sql = "SELECT * FROM pedido WHERE id_comanda = ?";
    // Implemente a consulta
}
    
}
