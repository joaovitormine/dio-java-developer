package one.digitalinnovation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> unsGatin = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(unsGatin);

        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(unsGatin);
        System.out.println(unsGatin);

        System.out.println("--\tOrdem natural (Nome)\t---");
        Collections.sort(unsGatin);
        System.out.println(unsGatin);

        System.out.println("--\tOrdem Idade\t--");
//        Collections.sort(unsGatin, new ComparatorIdade());
        unsGatin.sort(new ComparatorIdade());
        System.out.println(unsGatin);

        System.out.println("--\tOrdem Cor\t--");
//        Collections.sort(unsGatin, new ComparatorCor());
        unsGatin.sort(new ComparatorCor());
        System.out.println(unsGatin);

        System.out.println("--\tOrdem Nome/Cor/Idade\t--");
        Collections.sort(unsGatin, new ComparatorNomeCorIdade());
//        unsGatin.sort(new ComparatorNomeCorIdade());
        System.out.println(unsGatin);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());

        if(cor !=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
