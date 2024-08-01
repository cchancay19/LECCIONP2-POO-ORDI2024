package org.example;

public class Pajaro extends Animal implements Volador{

    //Atributos de la clase hija Pajaro
    private String nombre;


    //Constructor
    public Pajaro(String nombreC) {
        this.nombre = nombreC;
    }

    //Método propio de la clase hija Pajaro
    public String cantar(String tipoCanto){
        return ("El ave canta: " + tipoCanto );
    }

    //Método de la Interface
    @Override
    public void volar(){
        System.out.println("Le gusta ir de árbol en árbol");
    }

    //Métodos GETTER y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
