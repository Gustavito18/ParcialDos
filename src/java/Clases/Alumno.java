/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Alumno {
    private int codigo;
    private String nombre;
    private String modelo;
    private String direccion;
    private String fabricacion;
    private int tipo;

    
    public Alumno(int codigo, String nombre, String modelo, String direccion, String fabricacion, int tipo){
        this.codigo=codigo;
        this.nombre=nombre;
        this.modelo=modelo;
        this.direccion=direccion;     
        this.fabricacion=fabricacion;
        this.tipo=tipo;  
    }
    
    public Alumno(){
        this.nombre="Alumno de ejemplo";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;     
    }
    
        public String getFabricacion() {
        return direccion;
    }
        
         public void setabricacion(String fabricacion) {
        this.direccion = fabricacion;     
    }
    
        public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
