package br.com.infnet.projetofinal.empresaAcme;

import br.com.infnet.projetofinal.empresaAcme.enums.TipoSanguineo;

public abstract class Funcionario {
    private TipoSanguineo tipoSanguineo;
    private String id;
    private String nome;
    private String sobrenome;
    private Long tempoDeServicoEMAnos;

    public String numeroConselho;

    private Endereco endereco;

    public Funcionario(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Long getTempoDeServicoEMAnos() {
        return tempoDeServicoEMAnos;
    }

    public void setTempoDeServicoEMAnos(Long tempoDeServicoEMAnos) {
        this.tempoDeServicoEMAnos = tempoDeServicoEMAnos;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public abstract Double calculaBonus();

    public abstract String getNumeroConselho();
}
