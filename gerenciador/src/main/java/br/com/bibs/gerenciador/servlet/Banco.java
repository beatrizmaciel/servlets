package br.com.bibs.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	
	/** Código estático (static) é executado quando a máquina
	 * virtual carrega a classe. */
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("JavaEnterprise");
		
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("JavaScript Enterprise");
		
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		Banco.lista.add(empresa);
	}
	
	/** GETTER */
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
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
