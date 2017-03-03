/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diazmanzanresdavid;

import java.util.ArrayList;

/**
 *
 * @author david
 * @since 1-3-2017
 * @version 1.0
 */
public class Personaje {
    protected String nombre;
    protected int latitud;
    protected int longitud;
    protected String ciudadNacimiento;
    protected int edad;
    private static int personajesCreados=0;//Contador para los personajes creados
    
    public Personaje(){
        this.nombre=generarNombre();
        this.edad=(int)(Math.random()*40+21);//Le asigna una edad al azar entre 20 y 60
        this.ciudadNacimiento=generarNombreCiudad();
        personajesCreados++;
    }
    /**
     * Genera un nombre para el personaje y lo asigna a un personaje
     * @return nombre 
     */
    public String generarNombre(){
      
        switch((int)(Math.random()*7+1)){
            case 1:
                nombre="Pepe";
                break;
            case 2:
                nombre="Juan";
                break;
            case 3:
                nombre="Ana";
                break;
            case 4:
                nombre="Sonia";
                break;
            case 5:
                nombre="Pedro";
                break;
            case 6:
                nombre="Chiquito";
                break;
            case 7:
                nombre="Elena";
                break;
            default:
                 nombre="Elena";
        }         
     return nombre;
    }
    /**
     * Genera el nombre de una ciudad al azar
     * @return ciudadNaciemiento
     */
    public String generarNombreCiudad(){
      
        switch((int)(Math.random()*6+1)){
            case 1:
                ciudadNacimiento="Nueva York";
                break;
            case 2:
                ciudadNacimiento="Pekín";
                break;
            case 3:
                ciudadNacimiento="Roma";
                break;
            case 4:
                 ciudadNacimiento="Paris";
                break;
            case 5:
                 ciudadNacimiento="Londres";
                break;
            case 6:
                 ciudadNacimiento="Caracuel";
                break;
            default:
                  ciudadNacimiento="Caracuel";
        }         
     return ciudadNacimiento;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the latitud
     */
    public int getLatitud() {
        return latitud;
    }

    /**
     * @param latitud the latitud to set
     */
    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    /**
     * @return the longitud
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    /**
     * @return the ciudadNacimiento
     */
    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    /**
     * @param ciudadNacimiento the ciudadNacimiento to set
     */
    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the personajesCreados
     */
    public static int getPersonajesCreados() {
        return personajesCreados;
    }

    /**
     * @param aPersonajesCreados the personajesCreados to set
     */
    public static void setPersonajesCreados(int aPersonajesCreados) {
        personajesCreados = aPersonajesCreados;
    }
   
    
    
}

