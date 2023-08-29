/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;


/**
 *
 * @author cetecom
 */
public class Solicitud {
    //numero, fecha, total, cliente, productos
    private int numero,total;
    private String fecha,productos;
    private Cliente cliente;

    public Solicitud(int numero, String fecha, Cliente cliente) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    

    //Metodos customer
    //Agregar - detalle - descuento - obtenerID
    
    public void agregarProducto(Producto nuevo){
        //sumar al total
        total += nuevo.getPrecio();
        //Agregar producto a la lista de productos
        productos += nuevo.getDescripcion() + " $" +nuevo.getPrecio()+
                     " "+nuevo.getCantidad()+ " "+nuevo.getMedida()+" ;";
    }
        //Ver detalle  
    public String verDetalle(){
        //Id - Fecha - Total - Rut Cliente - Nombre - Productos
        String detalle = "";
        
        detalle +="Detalle del Pedido\n";
        detalle +="Id del pedido: "+this.numero+"\n";
        detalle +="Fecha del pedido: "+this.fecha+"\n";
        detalle +="Total del pedido: $"+this.total+"\n";
        detalle +="Rut del cliente: "+this.cliente.getRun()+"-"+this.cliente.getDv()+"\n";
        detalle +="Nombre del cliente: "+this.cliente.getNombre()+"\n";
        detalle +="Lista de productos: "+this.productos;
        
        return detalle;
    }
    
    //Descuento
    public void aplicarDescuento(double descuento){
        double porc = descuento/100;
        total -= (total*porc);
    }
    
    //Obtener Id del pedido
    
    private int obtenerID(){
        
        return this.numero;
    }    
}
