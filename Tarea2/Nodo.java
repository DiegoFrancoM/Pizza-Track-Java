package Tarea2;

public class Nodo {
    Pizza pizza;
    Nodo siguiente; // Puntero al siguiente elemento en la pila

    public Nodo(Pizza pizza) {
        this.pizza = pizza;
        this.siguiente = null;
    }
}
