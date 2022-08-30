/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author maged
 */
public class UsuariosPrueba {
    
    String Nombres, Apellidos, ID, Telefono, Email, Hora, Precio;
  
    public UsuariosPrueba(String nombres, String apellidos, String id, String telefono, String email, String hora, String precio) {
        this.Nombres = nombres;
        this.Apellidos = apellidos;
        this.ID=id;
        this.Telefono = telefono;
        this.Email = email;
        this.Hora=hora;
        this.Precio=precio;
        
        
        
        
    }

    public String getNombre() {
        return Nombres;
    }

    //public void setNombre(String nombres) {
       // this.Nombres = nombres;
    //}

    public String getApellidos() {
        return Apellidos;
    }

   // public void setApellidos(String apellidos) {
     //   this.Apellidos = apellidos;
    //}
    
    public String getID() {
        return ID;
    }

   // public void setID(String cedula) {
      //  this.ID = cedula;
    //}

    public String getTelefono() {
        return Telefono;
    }

    //public void setTelefono(String telefono) {
       // this.Telefono = telefono;
    //}

    public String getEmail() {
        return Email;
    }

    //public void setCorreo(String email) {
       // this.Email = email;
    //}
    
   public String getHora(){
        
        return Hora;
    }
    
    //public void setHora (String hora){
        
       // this.Hora = hora;
    //}
    
    public String getPrecio(){
       
        return Precio;
    }
    
    //public void setPrecio (String precio){
        
       // this.Precio = precio;
        
    //}
}
