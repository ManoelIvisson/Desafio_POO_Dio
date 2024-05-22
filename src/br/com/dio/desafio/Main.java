package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Curso Java Básico", "Cursinho Bom", 4);
		Curso curso2 = new Curso("Curso JavaScript Básico", "Cursinho Bom Dimai", 4);
		
		Mentoria mentoria = new Mentoria("Pesando Javamente", "Aprenda a pensar do jeitinho Java", LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Desenvolvedor Java");
		bootcamp.setDescricao("Bootcamp Bão");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devJohn = new Dev();
		devJohn.setNome("John");
		
		Dev devJo = new Dev();
		devJo.setNome("Jô Buenos Ares");
		
		devJohn.inscreverBootcamp(bootcamp);
		devJo.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteúdos inscritos de " + devJohn.getNome() + ": " + devJohn.getConteudosInscritos());
		System.out.println("Conteúdos inscritos de " + devJo.getNome() + ": " + devJo.getConteudosInscritos());
		
		devJohn.progredir();
		devJohn.progredir();
		devJohn.progredir();
		
		System.out.println(" --- ---- --- ");
		System.out.println("Conteúdos inscritos de " + devJohn.getNome() + ": " + devJohn.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos de " + devJohn.getNome() + ": " + devJohn.getConteudosConcluidos());
		System.out.println("XP Total de " + devJohn.getNome() + ": " + devJohn.calcularTotalXp());
	}
}
