package estruturadados1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import structures.ListaComArray;
import structures.ListaComEncadeamento;

public class EstruturaDados1 {

    public static void main(String[] args) {
        /*ListaComArray array = new ListaComArray();
        
        array.add(10);
        array.add(false);
        array.add(12);
        array.add(13);
        array.add(13);
        array.add(9);
        array.add("Pedro");
        System.out.println(array.size());
        System.out.println(Arrays.toString(array.toArray()));
        System.out.println("\n----------");
        array.add(2, 8);
        System.out.println(Arrays.toString(array.toArray()));
        System.out.println("\n----------");
        array.remove(2);
        System.out.println(Arrays.toString(array.toArray()));
        System.out.println(array.size());
        System.out.println(array.get(2));*/
    	
    	ListaComEncadeamento<Integer> lista = new ListaComEncadeamento<>();
    	lista.add(1);
    	lista.add(2);
    	lista.add(3);

    	for (int i = 0; i < lista.size(); i++){
			System.out.println(lista.get(i));
		}
		System.out.println("------------------");

		lista.add(1, 0);

		for (int i = 0; i < lista.size(); i++){
			System.out.println(lista.get(i));
		}
		System.out.println("------------------");

//		lista.clear();
//		System.out.println(lista == null);
//		for (int i = 0; i < lista.size(); i++){
//			System.out.println(lista.get(i));
//		}
		System.out.println(lista.remove(1));;
		for (int i = 0; i < lista.size(); i++){
			System.out.println(lista.get(i));
		}
    }
}
