package Tarea2;

public class PilaManual {
    private Nodo cima;
    public PilaManual() {
        this.cima = null;
    }

    public void push(Pizza pizza) {
        Nodo nuevoNodo = new Nodo(pizza);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }
    public Pizza pop() {
        if (isEmpty()) {
            return null;
        }
        Pizza pizzaExtraida = cima.pizza;
        cima = cima.siguiente;
        return pizzaExtraida;
    }

    public Pizza peek() {
        if (isEmpty()) {
            return null;
        }
        return cima.pizza;
    }

    public boolean isEmpty() {
        return cima == null;
    }
}
