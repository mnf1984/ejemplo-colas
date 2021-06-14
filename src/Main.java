import java.util.*;

public class Main {

    public static void main(String[] args) {

    /*    Stack<Libro> pila = new Stack<Libro>();
        Libro l1 = new Libro("Título 1", "Autor 1");
        Libro l2 = new Libro("Título 2", "Autor 2");
        Libro l3 = new Libro("Título 3", "Autor 3");

        pila.push(l1); // adiciona un libro a la pila
        pila.push(l2);
        pila.push(l3);

        while (!pila.isEmpty()) { // mostrar pila completa
            // El método peek() nos permite ver el valor del último elemento
            System.out.println(pila.peek().getTitulo());

           pila.pop(); //  pop(), borra el último elemento de la pila
        }
*/
/*
        Queue<Persona> cola = new PriorityQueue<Persona>();

        cola.add(new Persona("Katherine", 1));

        cola.add(new Persona("Daniel", 3));

        cola.add(new Persona("Julio", 2));

        cola.add(new Persona("Maria", 1));


        // remove () y poll () eliminan el primer elemento de la cola
        // element () y peek () devuelven el primer elemento de la cola

        while (!cola.isEmpty()) {
            System.out.println(cola.element().getNombre());
            cola.remove();
        }
        cola.peek();
 */

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Casillas");		map.put(15, "Ramos");
        map.put(3, "Pique");		map.put(5, "Puyol");
        map.put(11, "Capdevila");	map.put(14, "Xabi Alonso");
        map.put(16, "Busquets");	map.put(8, "Xavi Hernandez");
        map.put(18, "Pedrito");		map.put(6, "Iniesta");
        map.put(7, "Villa");

        // Imprimimos el Map con un Iterador
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }


    }
}