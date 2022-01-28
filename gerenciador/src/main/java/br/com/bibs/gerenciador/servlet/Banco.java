package br.com.bibs.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
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
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}
	
	/** GETTER */
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	
public void removeEmpresa(Integer id) {
		
		/** Iterator: forma "tradicional" de fazer um laço. Cada Coleção 
		 * (List, Map, Set) possui um objeto para iteração chamado Iterator */
		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}
		
		/** A solução acima é melhor do que um for, porque passamos no
		 * objeto em si através do iterador, e não pela lista */
		
	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		// TODO Auto-generated method stub
		return null;
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
