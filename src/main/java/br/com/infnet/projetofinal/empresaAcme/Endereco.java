package br.com.infnet.projetofinal.empresaAcme;

public class Endereco {
    public String logradouro;
    public String cidade;
    public String numero;
    public String cep;
    public String bairro;

    public Endereco() {
    }

    public Endereco(String logradouro, String cidade, String numero, String cep, String bairro) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }
}
