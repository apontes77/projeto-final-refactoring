package br.com.infnet.projetofinal.empresaAcme;

import br.com.infnet.projetofinal.empresaAcme.enums.TipoSanguineo;
import br.com.infnet.projetofinal.empresaAcme.exceptions.NaoPodeReceberBonusException;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Vendedor extends Funcionario{
    private Long matricula;
    private Long quantidadeDeVendas;

    private static Double VALOR_INCREMENTO_BONUS = 4.5;
    private List<Map<String, Integer>> cursos;

    public Vendedor(TipoSanguineo tipoSanguineo) {
        super(tipoSanguineo);
    }

    @Override
    public Double calculaBonus() {
        if(getTempoDeServicoEMAnos() == 0) {
            throw new NaoPodeReceberBonusException("Vendedor sem tempo de casa suficiente para ter direito a bônus.");
        }
        return getTempoDeServicoEMAnos() * VALOR_INCREMENTO_BONUS;
    }

    @Override
    public String getNumeroConselho() {
        return String.valueOf(Optional.of(""));
    }

    public List<Map<String, Integer>> getCursos() {
        return cursos;
    }

    public boolean isPlatinumEBateuMeta(Boolean metaBatida){
        isNotPlatinum();
        int quantidadeDeCursos = cursos.size();
        return isPlatinum(metaBatida, isNotPlatinum(), quantidadeDeCursos);
    }

    private boolean isPlatinum(Boolean metaBatida, boolean isPlatinum, int quantidadeDeCursos) {
        if(quantidadeDeVendas > 35 && quantidadeDeCursos > 3 && metaBatida){
            isPlatinum = true;
        }
        return isPlatinum;
    }

    private boolean isNotPlatinum() {
        return false;
    }

}
