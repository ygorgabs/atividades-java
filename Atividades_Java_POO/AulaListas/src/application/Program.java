package application;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();
		list.add("Maria"); // inserir item
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Marco"); // inserindo item em uma posição especifica
		
		System.out.println(list.size()); // retorna o tamanho da lista
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		
		//list.remove("Anna"); remove elemento que atende ao parametro
		// list.remove(1); remove o elemento de acordo com o indice da lista
		list.removeIf(x -> x.charAt(0) == 'M'); // remove itens de acordo com um predicado (expressao lambda)
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		
		System.out.println("Indice do Bob: " + list.indexOf("Bob")); //procura um elemento na lista e retorna o indice
		System.out.println("Indice do Marco: " + list.indexOf("Marco")); // retorna -1 se o elemento nao estiver na lista
		
		System.out.println("------------------");
		
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); 
		
		/*
		 * Essa trecho busca deixar na lista somente elementos que começam com A. Para
		 * realizar isso ele cria uma nova lista e converte a lista anterior list para
		 * stream, com o list.stream(). Realiza uma busca com uma expressao lambda, com
		 * o filter(); e depois converte o stream para lista denovo com o
		 * collect(Collectors.toList()).
		 */
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		
		/*
		 * Busca o primeiro elemento, usando o metodo findFirst() de acordo com a
		 * expressao informada no metodo filter(). O metodo orElse(null) com o parametro
		 * null é para retornar o valor nulo se nao encontrar resultado para a busca.
		 */
		
		System.out.println(name);
	}

}
