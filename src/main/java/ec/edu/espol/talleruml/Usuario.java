/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.talleruml;

import java.util.List;

public class Usuario {
    
    protected String usuario;
    protected String contrasenia;
    protected String nombre;
    protected String apellido;
    
    protected List<Incidente>  incidentes;
    
    protected boolean logIn(){
        //Logic
        return true;
    }
    
    protected boolean logOut(){
        //Logic
        return true;
    }
    
}
