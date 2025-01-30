/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepa2;

/**
 *
 * @author Luis
 */
public class Lista {
    //Lista simple
    Nodo pFirst;
    Nodo pLast;
    int size;

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return pFirst == null;
    }

    public void Empty() {
        pFirst = pLast = null;
        size = 0;
    }
    //agregar final
    public void Append(int data) {
        Nodo nuevo = new Nodo(data);
        if (!isEmpty()) {
            pLast.pNext = nuevo;
            pLast = nuevo;

        } else {
            pFirst = pLast = nuevo;
        }
        size++;
    }
    //agregar inicio
    public void InsertFirst(int data) {
        Nodo nuevo = new Nodo(data);
        if (!isEmpty()) {
            nuevo.pNext = pFirst;
            pFirst = nuevo;

        } else {
            pFirst = pLast = nuevo;
        }
        size++;

    }

    public void Mostrar() {
        Nodo aux = pFirst;
        while (aux != null) {
            System.out.println(aux.data);
            aux = aux.pNext;
        }
    }

    //Cuantas veces aparece la sublista l2 en la lista l1
    //123123
    //12
    public void Contar(Lista l1, Lista l2) {
        Nodo inicio = l1.pFirst;
        Nodo a1 = inicio;
        Nodo a2 = l2.pFirst;
        int aparaciones = 0;
        while (a1 != null) {//para solo el primero llega null
            while (a1 != null && a1.data == a2.data) {//
                a1 = a1.pNext;
                a2 = a2.pNext;
                if (a2 == null) {
                    aparaciones++;
                    break;
                }
            }
            inicio = inicio.pNext;
            a1 = inicio;
            a2 = l2.pFirst;
        }
        System.out.println(aparaciones);
    }

    //Ordena una nueva lista a partir de 2 listas ordenadas

    public void Ordenar(Lista l1, Lista l2) {
        
        Nodo aux1 = l1.pFirst;
        Nodo aux2 = l2.pFirst;
        Lista resultado = new Lista();
        while (aux1 != null && aux2 != null) { //para el primero que llegue a null
            if (aux1.data > aux2.data) {
                resultado.Append(aux2.data);
                aux2 = aux2.pNext;
            } else {
                resultado.Append(aux1.data);
                aux1 = aux1.pNext;

            }

        }
        if (aux1 == null) {
            while (aux2 != null) {
                resultado.Append(aux2.data);
                aux2 = aux2.pNext;
            }

        } else if (aux2 == null) {
            while (aux1 != null) {
                resultado.Append(aux1.data);
                aux1 = aux1.pNext;
            }

        }

        resultado.Mostrar();

    }

    // Método para eliminar elementos repetidos
    public void eliminarRepetidos() {
        if (pFirst == null || pFirst.pNext == null) {
            return; // Si la lista está vacía o tiene un solo elemento, no hay nada que hacer
        }

        Nodo actual = pFirst;

        // Recorremos la lista nodo por nodo
        while (actual != null) {
            Nodo previo = actual;
            Nodo siguiente = actual.pNext;

            // Comparar el nodo actual con los siguientes
            while (siguiente != null) {
                if (actual.data == siguiente.data) {
                    // Eliminar el nodo repetido
                    previo.pNext = siguiente.pNext;
                } else {
                    previo = siguiente; // Avanzar al siguiente nodo
                }
                siguiente = siguiente.pNext;
            }
            actual = actual.pNext; // Avanzar al siguiente nodo principal
        }
    }

    // Método para ordenar  modificando nodos
    public void Ordenar1Lista() {
        if (pFirst == null || pFirst.pNext == null) {
            return; // No hay nada que ordenar
        }

        boolean intercambio;
        do {
            intercambio = false;
            Nodo aux = pFirst;
            while (aux.pNext != null) {
                if (aux.data > aux.pNext.data) {
                    // Intercambiar los valores de los nodos
                    int temp = aux.data;
                    aux.data = aux.pNext.data;
                    aux.pNext.data = temp;
                    intercambio = true;
                }
                aux = aux.pNext;
            }
        } while (intercambio);
    }

    // Método para ordenar comparando el primer elemento con el resto modificando nodos
    public void Ordenarmim() {
        if (pFirst == null || pFirst.pNext == null) {
            return; // No hay nada que ordenar
        }

        Nodo actual = pFirst;

        // Recorrer la lista nodo por nodo
        while (actual != null) {
            Nodo menor = actual; // Inicialmente asumimos que el menor es el nodo actual
            Nodo siguiente = actual.pNext;

            // Comparar el nodo actual con el resto de los nodos
            while (siguiente != null) {
                if (siguiente.data < menor.data) {
                    menor = siguiente; // Actualizar el nodo con el menor valor encontrado
                }
                siguiente = siguiente.pNext;
            }

            // Intercambiar los valores si se encontró un menor
            if (menor != actual) {
                int temp = actual.data;
                actual.data = menor.data;
                menor.data = temp;
            }

            actual = actual.pNext; // Pasar al siguiente nodo
        }

    }
    // Método para ordenar creando una nueva lista

    public void ordenarYCrearNueva() {
        Lista listaOrdenada = new Lista();

        // Mientras la lista original no esté vacía
        while (pFirst != null) {
            // Encontrar el nodo con el valor mínimo
            Nodo menor = pFirst;
            Nodo actual = pFirst;
            Nodo anteriorMenor = null;
            Nodo anterior = null;

            // Recorrer la lista para encontrar el menor valor
            while (actual.pNext != null) {
                if (actual.pNext.data < menor.data) {
                    menor = actual.pNext;
                    anteriorMenor = actual;
                }
                actual = actual.pNext;
            }

            // Eliminar el nodo menor de la lista original
            if (anteriorMenor != null) {
                anteriorMenor.pNext = menor.pNext; // Saltar el nodo menor
            } else {
                pFirst = pFirst.pNext; // El menor es la cabeza
            }

            menor.pNext = null; // Desconectar el nodo menor
            listaOrdenada.Append(menor.data); // Agregar el valor del nodo menor a la nueva lista
        }

        listaOrdenada.Mostrar();
    }
}
