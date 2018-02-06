/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.njc;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProyectoNJC {
 
 //ArrayList<Clientes> ArregloClientes = new ArrayList<>();


    public static void main(String[] args) {
 PersistenciaCliente PCLIENTE = new PersistenciaCliente();
        
 ArrayList<Carrito> ArregloCarrito = new ArrayList<>();
 ArrayList<Clientes> ArregloClientes = PCLIENTE.CargarTodo();
       String texto = "";
        char opcion = '1';
        while ((opcion == '1') || (opcion == '2') || (opcion == '3') || (opcion == '4') || (opcion == '5') || (opcion == '6') || (opcion == '7')) {
            opcion = JOptionPane.showInputDialog("......................" + "\n INVENT PLUS 3000" + "\n......................"
                    + "\n 1-Mostrar Clientes" + "\n 2-Mostrar Contactos" + "\n 3-Ordenar Contacto" + "\n 4-Modificar Contacto"
                    + "\n 5-Eliminar" + "\n 6-Buscar" + "\n 7-Información").charAt(0);
 
            switch (opcion) {
                case '1': JOptionPane.showMessageDialog(null, ArregloClientes);
            }
        }
    }
    Variablita = Variablita + "\n" + ArregloCarrito.get(ArregloCarrito.size() - 1).getNombre + "\n Precio total: " + total;
}

