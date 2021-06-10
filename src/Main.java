import java.util.Stack;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
/*
        Stack<Libro> pila = new Stack<Libro>();
        Libro l1 = new Libro("Título 1", "Autor 1");
        Libro l2 = new Libro("Título 2", "Autor 2");
        Libro l3 = new Libro("Título 3", "Autor 3");

        pila.push(l1); // adiciona un libro a la pila
        pila.push(l2);
        pila.push(l3);

    // El método peek() nos permite ver el valor del último elemento
        System.out.println(pila.peek().getTitulo());

        while (!pila.isEmpty()) { // mostrar pila completa
            System.out.println(pila.pop().getTitulo()); //  pop(), borra el último elemento de la pila
        }
*/

        Queue<Persona> cola = new PriorityQueue<Persona>();

        // Daniel / Katherine - 1er Katherine (-1) 2do Daniel
        // Katherine / Julio - 1er Katherine  Julio(1)
        // Maria Daniel / Daniel Maria (0)
        // Daniel Julio / Daniel (1)
        // Maria Julio / Maria 1



        //Daniel
        //Maria
        //Julio
        //Katherine

        cola.add(new Persona("Daniel", 1));
        cola.add(new Persona("Katherine", 3));
        cola.add(new Persona("Julio", 2));
        cola.add(new Persona("Maria", 1));

        while (!cola.isEmpty()) {
            Persona a = cola.remove();
            System.out.println(a.getNombre() + " " + a.getTipo());
        }

    }
}