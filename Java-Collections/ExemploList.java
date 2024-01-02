package one.digitalinnovation;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<Double>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println(notas.indexOf(5.0));

        notas.add(4, 8.0);
        System.out.println(notas);

        notas.set(3, 6.0);
        System.out.println(notas);

        System.out.println(notas.contains(5.0));

        for (Double nota : notas) System.out.println(nota);

        System.out.println(notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exibindo a menor nota: " + Collections.min(notas));

        System.out.println("Exibindo a maior nota: " + Collections.max(notas));

        Double soma = 0d;
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibindo a soma dos valores: " + soma);

        System.out.println("Exibindo a media dos valores: " + soma/notas.size());

        System.out.println("Removendo a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Removendo a posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Removendo as notas menores que 7 e exibindo a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apagando toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println((notas.isEmpty() ? "Tá vazia!" : ("Tem coisa ali ó " + notas)));
    }
}
