/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author laboratorio
 */
public class ItemDAO {
    
    
    
    
    public List<Item> getItensPorPedido(int idPedido) {
    String sql = "SELECT i.* FROM item i " +
                 "JOIN pedido_item pi ON i.id = pi.id_item " +
                 "WHERE pi.id_pedido = ?";
    // Implemente a consulta
}
    
}
