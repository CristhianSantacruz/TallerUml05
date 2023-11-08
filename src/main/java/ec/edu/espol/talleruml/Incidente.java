/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.talleruml;

import java.util.Date;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Incidente {
    protected int id;
    protected Date fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    
    protected List log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;
    
    private Usuario responsable;
    protected PersonalAcademico beneficiario;
}
