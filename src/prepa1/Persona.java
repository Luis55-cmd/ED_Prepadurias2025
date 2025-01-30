/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepa1;

/**
 *
 * @author Luis
 */
public class Persona {
    String nombre;
    int edad;
    /*Este es el constructor - Alt+enter*/
/*los contructores siempre son public*/
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    /*Esta funcion muestra los datos*/
    public void ImprimirInfo(){
        System.out.println(this.nombre);
        System.out.println(this.edad);
    }

}
