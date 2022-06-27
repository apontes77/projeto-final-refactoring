package br.com.infnet.projetofinal.calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraDeDistanciaNoPlanoCartesianoTest {

    @Test
    @DisplayName("deve retornar distancias validas no plano cartesiano")
    public void validaDistanciasNoPlanoCartesiano() {

        Double distanciaEntrePontos = retornaDistanciaNoPlanoCartesiano(4.0, 8.0, 6.0, 12.0);
        NumberFormat formatter = new DecimalFormat("#0.0000");
        assertEquals(formatter.format(distanciaEntrePontos), formatter.format(7.2111));
    }

    @Test
    @DisplayName("deve retornar que o ponto está na origem do plano cartesiano")
    public void distanciaZeroNoPlanoCartesiano() {

        Double distanciaEntrePontos = retornaDistanciaNoPlanoCartesiano(0.0, 0.0, 0.0, 0.0);
        NumberFormat formatter = new DecimalFormat("#0.0");
        assertEquals(formatter.format(distanciaEntrePontos), formatter.format(0.0));
    }
    private Double retornaDistanciaNoPlanoCartesiano(Double x1, Double x2, Double y1, Double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

}
