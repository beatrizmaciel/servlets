package br.com.bibs.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaDeEmpresas = new ArrayList<>();

	public void adiciona(Empresa empresa) {
		Banco.listaDeEmpresas.add(empresa);
	}
	
	
	/** GETTER */
	
	public List<Empresa> getEmpresas(){
		return Banco.listaDeEmpresas;
	}
	

}

/** 
 * Por que não this.listaDeEmpresas? Pq o this. serve
 * para objetos, não para atributos estáticos. Quando
 * usamos private static List<Empresa> listaDeEmpresas,
 * estamos criando um atributo estático e não um objeto,
 * então ao invés de retornarmos this.listaDeEmpresas usamos
 * Banco.listaDeEmpresas().
 * */
