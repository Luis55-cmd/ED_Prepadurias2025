/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepa2;

/**
 *
 * @author Luis
 */
public class main {

    public static void main(String[] args) {

        
        //La lista l1 y l2 deben estar ordenadas previamente
        //Tener 2 listas ordenadas y crear una nueva ordenada con las 2 anteriores
        /*
        Lista milista= new Lista();
        Lista l1 = new Lista();
        Lista l2 = new Lista();
        
        
        
        l1.Append(1);
        l1.Append(2);
        l1.Append(4);
        l1.Append(5);
        l2.Append(1);
        l2.Append(3);
        l2.Append(4);
        l2.Append(5);
        milista.Ordenar(l1, l2);
        */
        
        //Ordenar 1 lista
        Lista l3= new Lista();
        Lista milista= new Lista();
        
        l3.Append(4);
        l3.Append(1);
        l3.Append(2);
        l3.Append(5);
        l3.Append(3);
        l3.Append(4);
        l3.Append(1);
        l3.Append(2);
        l3.Append(5);
        l3.Append(3);
        
       
        l3.Mostrar();
        System.out.println("");
        
        l3.eliminarRepetidos();
        l3.ordenarYCrearNueva();
        l3.Mostrar();
        
        
        /*
        l3.Mostrar();
        System.out.println("");
        l3.Ordenar1Lista();
        l3.Mostrar();
        */
        
        
        

        
        
        
        //Cuantas veces aparece la lista 2 en lista 1
        /*
        Lista milista= new Lista();
        Lista l1 = new Lista();
        Lista l2 = new Lista();

        l1.Append(1);
        l1.Append(1);
        l1.Append(2);
        l1.Append(1);
        l1.Append(2);

        l2.Append(1);
        l2.Append(2);
        l2.Append(1);
        
        milista.Contar(l1, l2);
         */
    }

}
