/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prepa1;

/**
 *
 * @author Luis
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        puntero es una variable que almacena la direccion de memoria
        int *p crear mi apuntador - me devuelve una variable apuntador
        *p desempaquetar - me devuelve la variable a la que apunta -- cambiar la el valor de la variable
        &p direccion - me devuelve la direccion a la que apunta -- cambiar la direccion a donde aputna
        p=5 variable - me devuelve 5

        int math[]={1,2,3,4}
        int *math
        math[0] - me devuelve 1
        &math[0] - me devuelve la direccion de 1
        &math[1] - me devuelve la direccion de 2
        *math[0] - me devuelve 1
        *(math+1) - me devuelve 2
        
        int *p2
        int b
        p2 = &b: p2 ahora apunta a la dirección de memoria de la variable b.
        *p2 = 2: Asigna el valor 2 a la variable b a través del apuntador p2. Ahora b = 2.
        p1 = p2: Ahora, p1 apunta a la misma dirección de memoria que p2, es decir, p1 ahora apunta a b.
        *p1 = 0: Como p1 apunta a b, asigna el valor 0 a b. Ahora b = 0.
         */
 /*
        A continuación se te presenta un algoritmo en el que se aplica un conjunto de instrucciones referentes a apuntadores. Determina el resultado de cada una de ellas:

Inicio

var a,b,c: entero;

p, p1, p2: * entero;

p: NULL;

p1= &a;

*p1=1;

p2=&b;

*p2=2;

p1=p2;

*p1=0;

p2=&c;

*p2=3;

imprimir a, b, c; 1 0 3

p=&p1;

p1=p2;

*p1=1;

imprimir a, b, c; 1 0 1

fin
        
        
        /*
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        public class Nodo(){
            //atributos
            Nodo next;
            Object element;
        }
        get and setter:
        get abrir nodo, obtener la info
        set modificar la info del nodo, 
        
         */
 /*
        Try catch: atrapar errores
        hacer algo que podria generar un error en el programa, para que no explote
        
        Procedimientos: para reutilizar codigo
        cuando se haga la misma accion en distintas partes y lo vamos a usar todo el tiempo
        en vez de copiar 5 lineas de codigo se crea un procedimiento que haga ese codigo
        para tener 1 sola llamada
        No retorna nada, es decir es void y puede recibir parametros
        public void
        
        Metodos: retorna una variable al finalizar
        si la quiero imprimir debo hacer un sout del metodo
        public "Tipo de dato que quiero retornar"
        return "Lo que quiero retornar"
        
        Debug: es el paso a paso del codigo, para ver en que nos equivocamos y entenderlo
        
         */
 /*
        Tipos de datos:
        arrays
        int[] ArregloString= new int[5];
        System.out.println(ArregloString);
        primitivas: int
        objetos: Integer (estas tienen metodos)
        Cambiar tipos de datos
        String v=String.valueOf(123);
        Integer n=Integer.valueOf("123"); 
        String n=Integer.toString(123); 
        int v=Integer.parseInt("123");
         */
 /*
        Persona persona1=new Persona("Luis",24);
        persona1.ImprimirInfo();
         */

 /*
        Funcion F=new Funcion();
        int[]arr=new int[10];
        F.Rellenar(arr);
        F.Contar(5);
         */
 /*
        //Crear un array
        
        
        //creo el array
        //arreglo de int, variable,lo que contiene
        int[] nums = {1, 2, 3, 4,5 };
        int suma = 0;

        //Para sumar los datos dentro del arreglo
        for (int i = 0; i < nums.length; i++) {
            suma += nums[i];

        }
        //Para mostrar el arreglo
        for (int i = 0; i < nums.length; i++) {
            //nums.length es el tamaño del array
            //i es la posicion  
            //nums[i] te da lo que contiene la posicion i, es decir el valor
            System.out.println(nums[i] + " ");
            

        }
        System.out.println(nums.length);
        System.out.println("La suma de los elementos: " + suma);
         */
 /*
        //Crear una martiz
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        //Suma de los elementos de la matriz
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println(suma);
        //Mostrar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }
         */
    }

}
