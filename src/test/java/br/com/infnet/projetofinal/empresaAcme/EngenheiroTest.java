package br.com.infnet.projetofinal.empresaAcme;


import br.com.infnet.projetofinal.empresaAcme.Engenheiro;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class EngenheiroTest {

    @Mock
    private Engenheiro engenheiro;

    @Test
    @DisplayName("dado que quero calcular o bonus que um engenheiro receberá então obtenho o resultado esperado")
    public void deveCalcularOBonusdoEngenheiro() {
        Long tempoDeServicoEmAnos = 12L;
        Double bonus = tempoDeServicoEmAnos * 3.7;
        DecimalFormat decimalFormat = new DecimalFormat("#0.0");


        assertEquals(decimalFormat.format(44.4), decimalFormat.format(bonus));
    }

    @Test
    @DisplayName("engenheiro pode trabalhar no exterior")
    public void podeTrabalharNoExterior() {

        Mockito.when(engenheiro.verificaQualificacoesParaTrabalhoFora(true, 8, true, 8,
                true, true)).thenReturn(1);

        Integer qualificacaoParaTrabalhoExterior = engenheiro.verificaQualificacoesParaTrabalhoFora(true, 8, true, 8,
                true, true);

        assertEquals(qualificacaoParaTrabalhoExterior, 1);
    }

    @Test
    @DisplayName("engenheiro não pode trabalhar no exterior")
    public void naoPodeTrabalharNoExterior() {
        Mockito.when(engenheiro.verificaQualificacoesParaTrabalhoFora(true, 8, true, 8,
                true, false)).thenReturn(-1);

        Integer qualificacaoParaTrabalhoExterior = engenheiro.verificaQualificacoesParaTrabalhoFora(true, 8, true, 8,
                true, false);

        assertEquals(qualificacaoParaTrabalhoExterior, -1);
    }


}

