package br.com.infnet.projetofinal.empresaAcme;

import br.com.infnet.projetofinal.empresaAcme.enums.TipoSanguineo;
import br.com.infnet.projetofinal.empresaAcme.exceptions.NaoPodeReceberBonusException;

import java.time.LocalDate;
import java.util.Date;

public class Engenheiro extends Funcionario{
    private Long matricula;
    private Boolean temMestrado;
    private Integer notaMestrado;
    private Boolean temDoutorado;
    private Integer notaDoutorado;
    private Boolean fluenteEmIngles;

    private static Integer APROVADO = 1;
    private static Integer REPROVADO = -1;

    private static Integer NOTA_CORTE_MESTRADO = 7;
    private static Integer NOTA_CORTE_DOUTORADO = 5;
    private static Double VALOR_INCREMENTO_BONUS = 3.7;

    public Engenheiro(TipoSanguineo tipoSanguineo) {
        super(tipoSanguineo);
    }

    @Override
    public Double calculaBonus() {
        if(getTempoDeServicoEMAnos() == 0) {
            throw new NaoPodeReceberBonusException("Engenheiro sem tempo de casa suficiente para ter direito a bônus.");
        }
        return getTempoDeServicoEMAnos() * VALOR_INCREMENTO_BONUS;
    }

    @Override
    public String getNumeroConselho() {
        return numeroConselho.concat(String.valueOf(LocalDate.now().getYear()));
    }

    public Integer verificaQualificacoesParaTrabalhoFora(){

        if (fluenteEmIngles) {
            Integer aprovadoComMestrado = possuiMestrado(temMestrado, notaMestrado);
            Integer aprovadoComDoutorado = possuiDoutorado(temDoutorado, notaDoutorado);
            if (aprovadoComDoutorado == APROVADO|| aprovadoComMestrado == APROVADO) {
                return APROVADO;
            }
        }

        return REPROVADO;
    }

    private Integer possuiMestrado(boolean temMestrado, Integer notaMestrado) {
        if(temMestrado && notaMestrado > NOTA_CORTE_MESTRADO) {
            return APROVADO;
        } else {
            return REPROVADO;
        }
    }

    private Integer possuiDoutorado(boolean temDoutorado, Integer notaDoutorado) {
        if(temDoutorado && notaDoutorado > NOTA_CORTE_DOUTORADO) {
            return APROVADO;
        } else {
            return REPROVADO;
        }
    }


}
