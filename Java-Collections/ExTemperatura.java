package one.digitalinnovation;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> temps = new ArrayList<Double>();

        System.out.println("Digite as temperaturas (em Graus Celsius): ");
        for (int i = 0; i < 6; i++) {
            double temp = sc.nextDouble();
            temps.add(temp);
            System.out.println("--------------");
        }

        System.out.println("Todas as temperaturas listadas (em Graus Celsius): " + temps);

        Double media = 0d;

        for (Double next : temps) { // o while abaixo pode ser transformado neste for para otimização
            media += next;
        }
//        while (iterator.hasNext()) {
//            Double next = iterator.next();
//            media += next;
//        }

        media /= temps.size();
        System.out.println("Média das temperaturas do semestre: " + media + "°C");

        List<Double> tempsMaioresQueMedia = new ArrayList<Double>();
        List<Integer> indicesTempsMaiores = new ArrayList<Integer>();

        for (int i = 0; i < temps.size(); i++) {
            Double temp = temps.get(i);
            if (temp > media) {
                tempsMaioresQueMedia.add(temp);
                indicesTempsMaiores.add(i);
            }
        }

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};

        if (tempsMaioresQueMedia.isEmpty()) {
            System.out.println("Nenhuma temperatura esteve acima da média.");
        } else {
            System.out.println("Temperaturas maiores que a média e seus meses correspondentes:");

            for (int i = 0; i < tempsMaioresQueMedia.size(); i++) {
                int index = indicesTempsMaiores.get(i);
                String mes = meses[index];
                double temp = tempsMaioresQueMedia.get(i);
                System.out.println(mes + ": " + temp + "°C");
            }
        }
    }
}
