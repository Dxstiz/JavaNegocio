/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author cetecom
 */
public class Validaciones {
    
    //precio mayor a 0
    public boolean validarPrecio(int precio){
        
        if(precio>0){
            return true;
        }
        
        return false;
        
    }
    
    //codigo largo 4
    public boolean validarCodigo(int codigo){
        if(codigo > 999 && codigo<=9999){
            return true;
        }
        
        return false;
    }
    
    public boolean validarCategoria (String descripcion){
        if(descripcion.equalsIgnoreCase("Fruta") || descripcion.equalsIgnoreCase("Verdura")){
            return true;
        }
        
        return false;
    }
    
    //Telefono 
    public boolean validarTelefono(int telefono){
        if(telefono>999999 && telefono <= 9999999){
            return true;
        }
        
        return false;
    }
    
    public boolean validarCorreo (String correo){
        if(correo.length()>=6){
            return true;
        }
        return false;
    }
}
