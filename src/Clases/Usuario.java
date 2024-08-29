/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Usuario {
    String Nombre;
    String Apellido;
    String Direccion;
    int ID;
    String Email;
    
    
    public Usuario(String Nombre, String Apelido, String Direccion, int ID, String Email){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.ID = ID;
        this.Email = Email;
    }
    
    public String getNombre(){
    return Nombre;    
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getApellido(){
        return Apellido;
    }
    
    public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }
    
    public String getDireccion(){
        return Direccion;
    }
    
    public void setDireccion(String Direccion){
        this.Direccion = Direccion; 
    }
    
    public int getID(){
        return ID;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    
}
