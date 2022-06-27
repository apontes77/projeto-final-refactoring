package br.com.infnet.projetofinal.empresaAcme.exceptions;

public class NaoPodeReceberBonusException extends RuntimeException{
    private static final long serialVersionUID = 1l;

    public NaoPodeReceberBonusException(String mensagem) {
        super(mensagem);
    }

    public NaoPodeReceberBonusException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
