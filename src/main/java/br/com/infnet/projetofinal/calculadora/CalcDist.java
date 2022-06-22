package br.com.infnet.projetofinal.calculadora;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CalcDist {
    //deve calcular a distancia entre dois pontos no plano cartesiano
    //usando a formula
    public void distancia(){
        Integer x1, x2, y1,y2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite x1");
        x1 = entrada.nextInt();
        System.out.println("Digite x2");
        x2 = entrada.nextInt();
        System.out.println("Digite y1");
        y1 = entrada.nextInt();
        System.out.println("Digitey21");
        y2 = entrada.nextInt();
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) +  Math.pow((y2 - y1), 2));
        NumberFormat formatter = new DecimalFormat("#0.0000");
        System.out.println(formatter.format(distancia));

    }

    public static void main(String[] args) {
        CalcDist calcDist = new CalcDist();
        calcDist.distancia();
    }
}
