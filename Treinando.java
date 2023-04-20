package exercicios;



import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Treinando {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
	
		List<String> lista = new ArrayList<>();
		
	
		
		
		lista.add("maria");
		lista.add("ana");
		lista.add("joao");
		lista.add("marcelo");
		lista.add("antonio");
		lista.add("joaquin");
		lista.add("gustavo");
		lista.add(2, "thiago");
		lista.removeIf(x -> x.charAt(0) == 'g');
		
		for (String x : lista) {
			
			System.out.println(x);
		}
		System.out.println("________________________________________");
		
		System.out.println(lista.indexOf("thiago"));

		System.out.println("________________________________________");
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());
		
        for (String x : resultado) {
			
			System.out.println(x);
		}
        
        System.out.println("________________________________________");
        String nome = lista.stream().filter(x -> x.charAt(0) == 'a').findFirst().orElse("o id informado nao existe");
        System.out.println(nome);
        
        
		sc.close();
	}

}
