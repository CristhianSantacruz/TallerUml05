/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.talleruml;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private Profesor responsable;
    private List<Estudiante> estudianteInscritos;
    private List<Estudiante> estudianteEnEsperaDeInscripcion;
    private List<Foro> foros;
    
    
    private List<ActividadSumativa> actividadeSumativas;
    
    public Curso(){
        this.actividadeSumativas = new ArrayList<>();
    }
    
}
