package br.com.infnet.projetofinal.empresaAcme;

import java.util.List;
import java.util.Map;

public class Vendedor extends Funcionario{
    private Long matricula;
    private Long quantidadeDeVendas;

    //Armazena um curso e sua nota;
    private List<Map<String, Integer>>cursos;

    public Vendedor(int grupoSanguineo) {
        super(grupoSanguineo);
    }


    @Override
    public Double calculaBonusEngenheiro() {
        return 0.0;
    }

    public Double calculaBonusVendedor() {
        if(getTempoDeServicoEMAnos() <= 0) {
            throw new RuntimeException("Vendedor sem tempo de casa suficiente para ter direito a bônus.");
        }
        return getTempoDeServicoEMAnos()*4.5;
    }

    @Override
    public String getNumeroConselho() {
        return null;
    }

    public List<Map<String, Integer>> getCursos() {
        return cursos;
    }

    public void setCursos(List<Map<String, Integer>> cursos) {
        this.cursos = cursos;
    }
    public boolean isPlatinumEBateuMeta(Boolean metaBatida){
        boolean isPlatinum = false;
        int quantidadeDeCursos = cursos.size();
        if(quantidadeDeVendas > 35 && quantidadeDeCursos > 3 && metaBatida){
            isPlatinum = true;
        }
        return  isPlatinum;
    }
    public Integer getQuantidadeEmpregadosFabrica(){
        return 34;
    }

}
