package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class list {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // Instanciando ArrayList
		
		list.add("Pedro"); // Adicionando dinamicamente dados nesse array
		list.add("Ruao");
		list.add("Zez�");
		list.add(0, "Ricardo"); // Adicionando dados em um local ja definido no array, nesse caso � o primeiro elemento
		
		for(String names : list) {
			System.out.println(names);
		}
		
		System.out.println("--------------------");
		list.remove(2); // Removendo dados da casa 2 do array, no caso o Ruao;
		list.removeIf(x -> x.charAt(0) == 'Z'); // Usando express�o lambda pra remover dados q come�am com a letra Z
		
		for(String NamesAtualizados : list) {
			System.out.println(NamesAtualizados);
		}
		
		System.out.println("----------------------------------------------");
		
		System.out.println("INDEX OF Pedro: " + list.indexOf("Pedro")); // Procurando elemento PEDRO na lista
		System.out.println("INDEX OF BOB: " + list.indexOf("BOB"));
	
		System.out.println("----------------------------------------");
		
		// Mostrando dados de s� quem possui a letra P
		
		List<String> result = list.stream().filter(z -> z.charAt(0) == 'P').collect(Collectors.toList());
		System.out.println(result);
		
	}

}
