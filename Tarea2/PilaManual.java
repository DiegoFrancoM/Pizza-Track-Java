package Tarea2;

public class PilaManual {
    private Nodo cima; // Puntero que indica el tope de la pila

    public PilaManual() {
        this.cima = null;
    }

    // Insertar un objeto Pizza en el tope de la pila
    public void push(Pizza pizza) {
        Nodo nuevoNodo = new Nodo(pizza);
        // Lógica de punteros: El nuevo nodo apunta al que antes era la cima
        nuevoNodo.siguiente = cima;
        // Ahora la nueva cima es este nuevo nodo
        cima = nuevoNodo;
    }

    // Retirar el objeto del tope y devolver su contenido
    public Pizza pop() {
        if (isEmpty()) {
            return null;
        }
        Pizza pizzaExtraida = cima.pizza;
        // Lógica de punteros: La cima se desplaza al nodo siguiente, "desconectando" el actual
        cima = cima.siguiente;
        return pizzaExtraida;
    }

    // Visualizar la pizza en el tope sin retirarla
    public Pizza peek() {
        if (isEmpty()) {
            return null;
        }
        return cima.pizza;
    }

    // Validar si la pila está vacía
    public boolean isEmpty() {
        return cima == null;
    }
}
