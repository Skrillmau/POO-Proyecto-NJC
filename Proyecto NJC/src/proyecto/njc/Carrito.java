/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.njc;
import java.util.ArrayList;



public class Carrito {
   
    private int IDCarrito;
    private int CedulaCliente;

    public Carrito() {
    }
    
    
public Carrito (int idcarrito, int cedulacliente){
    this.IDCarrito = idcarrito;
    this.CedulaCliente = cedulacliente;
}
public int getIDCarrito() {
        return IDCarrito;
    }

    public void setIDCarrito(int IDCarrito) {
        this.IDCarrito = IDCarrito;
    }

    public int CedulaCliente() {
        return CedulaCliente;
    }

    public void setCedulaCliente(int CedulaCliente) {
        this.CedulaCliente = CedulaCliente;
    }

}