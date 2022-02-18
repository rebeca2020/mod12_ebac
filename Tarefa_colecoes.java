//package br.com.exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

//	TAREFA 1:
//ler no console o nome de pessoas separado por virgula(ok)
//seperar os valores lidos, guardar em um tipo de variável, fazer a ordenação e imprimir no console.
//-recomendado SPLIT
//
//	TAREFA 2:
//ler no console o nome traço sexo(nome - sexo);
//	ex: luana-F, rodrigo-M....
//separar por grupo masculino e feminino 
//imprimir no console com os grupos separados.
//
//tarefa_colecoes - pasta.

public class Tarefa_colecoes {

	
	static Map<String,String> sexo = new TreeMap<>();
	
	
	public static void main(String[] args) {

		listaDeNomesDesordenados();
		listaDeNomes();
		leituraNomeSexo();
		divisaoDosGrupos();

	}

	private static void listaDeNomesDesordenados() {
		
		System.out.println("*****Lista dos nomes desordenados: ***** ");
		List<String> nomes = Arrays.asList("Josué Magalhães", "Lucas Maia", "Quemuel Branch", "Carla de moura", "Rebeca Fernandes", "João Carius");
		
		
		for(int i=0; i<nomes.size(); i++) {
		    System.out.format("%s%s", nomes.get(i), 
		        i != nomes.size() - 1 ? ", " : " ");
		   
		}
		
	}

	private static void listaDeNomes() {
		System.out.println("");
		Map<Integer, String> lista = new TreeMap<>(); // Já ordenada
		
		System.out.println("*****Lista dos nomes ordenados: ***** ");

		lista.put(4, "Josué Magalhães");
		lista.put(2, "Lucas Maia");
		lista.put(5, "Quemuel Branch");
		lista.put(1, "Carla de moura");
		lista.put(6, "Rebeca Fernandes");
		lista.put(3, "João Carius");

		System.out.println(lista);

		System.out.println("");
	}

	private static void leituraNomeSexo() {

		System.out.println("****Lista dos grupos Feminino e Masculino****");

		Map<Integer, String> pessoas = new TreeMap<>();

		pessoas.put(4, "Josué Magalhães - M");
		pessoas.put(2, "Lucas Maia - M");
		pessoas.put(5, "Quemuel Branch - M");
		pessoas.put(1, "Carla de moura - F");
		pessoas.put(6, "Rebeca Fernandes - F");
		pessoas.put(3, "João Carius - M");

		for (String value : pessoas.values()) {
			System.out.println(value);
		}
		System.out.println("");
	}


	private static void divisaoDosGrupos() {
		System.out.println("******Divisao Dos Grupos masculino e feminino******");	
		
		sexo.put( "Josué Magalhães", " M");
		sexo.put( "Lucas Maia", " M");
		sexo.put( "Quemuel Branch", " M");
		sexo.put( "Carla de moura", " F");
		sexo.put( "Rebeca Fernandes", " F");
		sexo.put( "João Carius",  " M");
		
		System.out.println(sexo);


		iterateUsingEntrySet(sexo);
		
	}
		
	public static void iterateUsingEntrySet(Map<String, String> map) {
		Map<String,String> sexoFeminino = new TreeMap<>();
		Map<String,String> sexoMasculino = new TreeMap<>();
		
	    for (Map.Entry<String, String> entry : map.entrySet()) {
	    	if(entry.getValue().equals(" F")) {
	    		sexoFeminino.put(entry.getKey(), entry.getValue());
	    	}else {
	    		sexoMasculino.put(entry.getKey(), entry.getValue());
	    	}
	    	
	        
	    }
	    System.out.println();
	    System.out.println("SEXO MASCULINO " + " - " + sexoMasculino);
		System.out.println("SEXO FEMININO "+ " - " + sexoFeminino);


	}
	
	

}





















