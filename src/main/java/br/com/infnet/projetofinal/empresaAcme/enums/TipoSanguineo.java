package br.com.infnet.projetofinal.empresaAcme.enums;

public enum TipoSanguineo {

    O(1), A(2), B(3), AB(4);

    private int codigoTipoSanguineo;

    TipoSanguineo(int codigoTipoSanguineo) {
        this.codigoTipoSanguineo = codigoTipoSanguineo;
    }

    public int getCodigoTipoSanguineo() {
        return codigoTipoSanguineo;
    }
}
