package br.com.infnet.projetofinal.calculadora;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CalculadoraDeDistanciaCartesiana {
    Scanner entrada = new Scanner(System.in);
    public void obtemValoresParaCalcularDistanciaCartesiana(){
        System.out.println("Digite x1, x2, y1 e y2, em sequência:");
        int x1 = entrada.nextInt();
        int x2 = entrada.nextInt();
        int y1 = entrada.nextInt();
        int y2 = entrada.nextInt();
        double distancia = obtemDistanciaCartesiana(x1, x2, y1, y2);

       exibeValorCalculadoDaDistanciaCartesiana(distancia);
    }

    private void exibeValorCalculadoDaDistanciaCartesiana(double distancia){
        NumberFormat formatter = new DecimalFormat("#0.0000");
        System.out.println(formatter.format(distancia));
    }

    private double obtemDistanciaCartesiana(Integer x1, Integer x2, Integer y1, Integer y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }


    public static void main(String[] args) {
        CalculadoraDeDistanciaCartesiana calculadora = new CalculadoraDeDistanciaCartesiana();
        calculadora.obtemValoresParaCalcularDistanciaCartesiana();
    }
}
