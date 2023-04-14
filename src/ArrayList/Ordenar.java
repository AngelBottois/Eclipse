package ArrayList;

import java.util.ArrayList;

public class Ordenar {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista= new ArrayList();
		ArrayList<Double> num= new ArrayList();
		System.out.println("Validad una prueba de git");
		System.out.println("Otra validacion");
		for(int i=0;i<lista.size();i++){ 
			for(int j=i+1;i<lista.size() ;i++) { 
				if(lista.get(j).compareTo(lista.get(i))<0){ 
					String aux=lista.get(i); 
					Double auxv=num.get(i); 
					lista.set(i,lista.get(j)); 
					num.set(i,num.get(j)); 
					lista.set(j,aux); 
					num .set(j,auxv); 
					} 
				} 
			}

	}
}
