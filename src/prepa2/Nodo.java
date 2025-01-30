/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepa2;

/**
 *
 * @author Luis
 */
public class Nodo {

    //Estandar lista simplemente enlazada
    Nodo pNext;
    int data;

    public Nodo(Nodo pNext, int data) {
        this.pNext = pNext;
        this.data = data;
    }

    public Nodo(int data) {
        this.data = data;
        this.pNext = null;
    }

}
