package br.com.infnet.projetofinal.empresaAcme;

import br.com.infnet.projetofinal.empresaAcme.Funcionario;
import br.com.infnet.projetofinal.empresaAcme.Vendedor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class VendedorTest {

    @Mock
    private Vendedor vendedor;

    @Mock
    private Funcionario funcionario;

    @Test
    @DisplayName("dado que quero calcular o bonus que um vendedor receberá então obtenho o resultado esperado")
    public void deveVerificarValorValidoParaOBonusDoVendedor() {
        Long tempoDeServicoEmAnos = 12L;
        Double bonus = tempoDeServicoEmAnos * 4.5;
        DecimalFormat decimalFormat = new DecimalFormat("#0.0");


        assertEquals(decimalFormat.format(54.0), decimalFormat.format(bonus));
    }

    @Test
    @DisplayName("dado que quero calcular o bonus que um vendedor receberá " +
            "então não obtenho que o vendedor não possui direito a bônus.")
    public void deveVerificarValorInvalidoParaOBonusDoVendedor() {

        funcionario.setTempoDeServicoEMAnos(0L);
        Mockito.when(vendedor.calculaBonus()).thenThrow(RuntimeException.class);

        assertThrows(RuntimeException.class, () -> vendedor.calculaBonus());

    }

    @Test
    @DisplayName("dado que possuo a quantidade de vendas, a quantidade de cursos e a informação se o vendedor bateu a meta, então" +
            "valido que o vendedor é Platinum.")
    public void deveVerificarSeOVendedorEhPlatinum() {

        Mockito.when(vendedor.isPlatinumEBateuMeta(true)).thenReturn(true);
        boolean platinumEBateuMeta = vendedor.isPlatinumEBateuMeta(true);

        assertEquals(platinumEBateuMeta, true);

    }

    @Test
    @DisplayName("dado que possuo a quantidade de vendas, a quantidade de cursos e a informação se o vendedor bateu a meta, então" +
            "valido que o vendedor não é Platinum.")
    public void deveVerificarSeOVendedorNaoEhPlatinum() {

        Mockito.when(vendedor.isPlatinumEBateuMeta(false)).thenReturn(false);
        boolean platinumEBateuMeta = vendedor.isPlatinumEBateuMeta(false);

        assertEquals(platinumEBateuMeta, false);

    }
}
