package com.ufes.br.patterns;

class PadraoDetectado {
    public String classe;
    public String padrao;
    public String grupo;
    public boolean statusOk;
    public String mensagemErro;

    public PadraoDetectado(String classe, String padrao, String grupo, boolean statusOk, String mensagemErro) {
        this.classe = classe;
        this.padrao = padrao;
        this.grupo = grupo;
        this.statusOk = statusOk;
        this.mensagemErro = mensagemErro;
    }

    
}
