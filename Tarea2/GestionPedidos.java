package Tarea2;

public class GestionPedidos {
    private PilaManual pilaPrincipal;
    private PilaManual pilaSecundaria;
    public GestionPedidos() {
        pilaPrincipal = new PilaManual();
        pilaSecundaria = new PilaManual();
    }

    public void registrarPedido(Pizza pizza) {
        pilaPrincipal.push(pizza);
        
        pilaSecundaria = new PilaManual(); 
        System.out.println("✅ Pedido registrado exitosamente: " + pizza.getNombre());
    }

    public void deshacer() {
        if (pilaPrincipal.isEmpty()) {
            System.out.println("⚠️ No hay pedidos en el historial para deshacer.");
            return;
        }
        Pizza pizzaDeshecha = pilaPrincipal.pop();
        pilaSecundaria.push(pizzaDeshecha);
        System.out.println("↩️ Se deshizo el pedido: " + pizzaDeshecha.getNombre());
    }

    public void rehacer() {
        if (pilaSecundaria.isEmpty()) {
            System.out.println("⚠️ No hay pedidos recientes para rehacer.");
            return;
        }
        Pizza pizzaRehecha = pilaSecundaria.pop();
        pilaPrincipal.push(pizzaRehecha);
        System.out.println("↪️ Se rehizo el pedido: " + pizzaRehecha.getNombre());
    }

    public void mostrarPedidoActual() {
        Pizza actual = pilaPrincipal.peek();
        if (actual == null) {
            System.out.println("📭 La pila está vacía. No hay pedidos en producción actualmente.");
        } else {
            System.out.println("🍕 Pedido actual en el tope de la pila: " + actual.toString());
        }
    }
}
