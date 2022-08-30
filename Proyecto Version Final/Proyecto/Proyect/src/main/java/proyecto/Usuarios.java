/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author maged
 */
public class Usuarios {
    
    //Declara las variables
    String Nombres, Apellidos, ID, Telefono, Email, Hora, Precio;
    
    //Obtiene los datos enviados desde el apartado de registro, 
    //los ordena y los asocia a un metodo que cumplira la funcion
    //de retornar el dato almacenado cuando este sea invocado
    
    public Usuarios(String nombres, String apellidos, String id, String telefono, String email, String hora, String precio) {
        Nombres = nombres;
        Apellidos = apellidos;
        ID=id;
        Telefono= telefono;
        Email= email;
        Hora=hora;
        Precio=precio;
    }
    public String getNombre() {
        return Nombres;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public String getID() {
        return ID;
    }
    public String getTelefono() {
        return Telefono;
    }
    public String getEmail() {
        return Email;
    }  
   public String getHora(){
        return Hora;
    }
    public String getPrecio(){
        return Precio;
    }
}
