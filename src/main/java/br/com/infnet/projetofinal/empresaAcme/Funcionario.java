package br.com.infnet.projetofinal.empresaAcme;

public abstract class Funcionario {
    public static final int O = 1;
    public static final int A = 2;
    public static final int B = 3;
    public static final int AB = 4;

    public int grupoSanguineo;

    public Funcionario(int grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    private String id;
    private String nome;
    private String sobrenome;
    private Long tempoDeServicoEMAnos;

    public String logradouro;
    public String cidade;
    public String numero;
    public String cep;
    public String bairro;


    public String numeroConselho;

    public Long getTempoDeServicoEMAnos() {
        return tempoDeServicoEMAnos;
    }

    public void setTempoDeServicoEMAnos(Long tempoDeServicoEMAnos) {
        this.tempoDeServicoEMAnos = tempoDeServicoEMAnos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public abstract Double calculaBonusEngenheiro();

    public abstract String getNumeroConselho();
}
