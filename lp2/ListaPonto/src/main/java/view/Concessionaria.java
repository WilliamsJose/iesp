/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import javax.swing.JOptionPane;
import model.Proprietario;
import model.Carro;
import model.Endereco;
import model.Marca;
/**
 *
 * @author Williams
 */
public class Concessionaria {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("João do Barro", "Oito Zero", "Jampa", "PB", 58989878, "Aqui ó");
        
        Proprietario will = new Proprietario("Williams", 48512565983l, 45153, endereco);
        will.setDataNascimento("28/12/1998");
        JOptionPane.showMessageDialog(null, will);
        
        endereco.setBairro("Jardim Oceania");
        will.setEndereco(endereco);
        
        JOptionPane.showMessageDialog(null, will);
        
        Marca marca = new Marca("Fuscão Preto", "Volkswagen", 1980, "87454sdffff21");
        
        Carro fusca = new Carro("Preto", marca, will, 300, 0, 2, true, 5, false, 120, 0, false);
        JOptionPane.showMessageDialog(null, fusca);
        
        JOptionPane.showMessageDialog(null, fusca.getAutonomia(120, 35));
    }
}
