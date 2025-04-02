package CollectionsExerciciosPropostosSet;
/*
 Crie uma classe LinguagemFavorita que possua os atributos
nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
3 linguagens e faça um programa que ordene esse conjunto
por:

- Ordem de Inserção
- Ordem Natural (nome)
- IDE
- Ano de criação e nome
- Nome, ano de criacao e IDE
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioLinguagemFavorita {
		public static void main(String[] args) {
	        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
	        minhasLinguagensFavoritas.add(new LinguagemFavorita("c++", 1998, "VsCode"));
	        minhasLinguagensFavoritas.add(new LinguagemFavorita("GDScript", 2014, "Godot"));
	        minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Eclipse"));

	        System.out.println("Ordem de Inserção");
	        Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(
	                Arrays.asList(
	                        new LinguagemFavorita("c++", 1998, "VsCode"),
	                        new LinguagemFavorita("GDScript", 2014, "Godot"),
	                        new LinguagemFavorita("Java", 1991, "Eclipse")
	                )
	        );
	        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas1) System.out.println(linguagem);

	        System.out.println("Ordem Natural (nome) ");
	        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
	        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas2) System.out.println(linguagem);

	        System.out.println("Ordem (ide)");
	        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
	        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
	        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas3) System.out.println(linguagem);

	        System.out.println("Ordem Ano de Criacao e Nome");
	        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
	        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
	        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas4) System.out.println(linguagem);

	        System.out.println("Ordem Nome, Ano de Criacao e IDE");
	        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
	        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
	        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas5) System.out.println(linguagem);

	    }
	}

	class LinguagemFavorita implements Comparable<LinguagemFavorita> {
	    public String nome;
	    public Integer anoDeCriacao;
	    public String ide;

	    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
	        this.nome = nome;
	        this.anoDeCriacao = anoDeCriacao;
	        this.ide = ide;
	    }

	    @Override
	    public String toString() {
	        return "{" +
	                "nome='" + nome + '\'' +
	                ", anoDeCriacao=" + anoDeCriacao +
	                ", ide='" + ide + '\'' +
	                '}';
	    }

	    @Override
	    public int compareTo(LinguagemFavorita linguagemFavorita) {
	        return this.nome.compareTo(linguagemFavorita.nome);
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        LinguagemFavorita that = (LinguagemFavorita) o;
	        return nome.equals(that.nome);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(nome);
	    }
	}

	class ComparatorIde implements Comparator<LinguagemFavorita>{

	    @Override
	    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
	        return l1.ide.compareToIgnoreCase(l2.ide);
	    }
	}

	class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{

	    @Override
	    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
	        int anoDeCriacao = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
	        if (anoDeCriacao != 0) return anoDeCriacao;
	        return l1.nome.compareToIgnoreCase(l2.nome);
	    }
	}

	class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

	    @Override
	    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
	        int nome = l1.nome.compareToIgnoreCase(l2.nome);
	        int anoDeCriacao = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
	        if (nome != 0) return nome;
	        if (anoDeCriacao != 0) return anoDeCriacao;
	        return l1.ide.compareToIgnoreCase(l2.ide);
	    }
	}