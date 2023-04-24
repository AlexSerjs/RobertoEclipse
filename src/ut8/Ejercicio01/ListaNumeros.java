package ut8.Ejercicio01;
import java.util.*;

public class ListaNumeros {
	 public static void main(String[] args) {
	        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
	        
	        leerValoresUsuario(listaNumeros);
	        
	        System.out.println("Número de valores cargados: " + listaNumeros.size());
	        System.out.println("Media de los valores: " + calcularMedia(listaNumeros));
	        System.out.println("Valor máximo: " + obtenerMaximo(listaNumeros));
	        System.out.println("Valor mínimo: " + obtenerMinimo(listaNumeros));
	    }
	    
	    public static void leerValoresUsuario(ArrayList<Integer> listaNumeros) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Introduce valores enteros (introduce -9999 para terminar):");
	        int valor = sc.nextInt();
	        while (valor != -9999) {
	            listaNumeros.add(valor);
	            valor = sc.nextInt();
	        }
	        sc.close();
	    }
	    
	    public static double calcularMedia(ArrayList<Integer> listaNumeros) {
	        int suma = 0;
	        for (int num : listaNumeros) {
	            suma += num;
	        }
	        return (double) suma / listaNumeros.size();
	    }
	    
	    public static int obtenerMaximo(ArrayList<Integer> listaNumeros) {
	        int maximo = Integer.MIN_VALUE;
	        for (int num : listaNumeros) {
	            if (num > maximo) {
	                maximo = num;
	            }
	        }
	        return maximo;
	    }
	    
	    public static int obtenerMinimo(ArrayList<Integer> listaNumeros) {
	        int minimo = Integer.MAX_VALUE;
	        for (int num : listaNumeros) {
	            if (num < minimo) {
	                minimo = num;
	            }
	        }
	        return minimo;
	    }
}
