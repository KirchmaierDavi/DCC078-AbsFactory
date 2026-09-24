package com.aaes.abfactory.sindicatos;

public class CarteiraProfessores implements CarteiraSindical {

    @Override
    public String emitir(String nomeAssociado) {
        return "Carteira dos Professores emitida para " + nomeAssociado;
    }
}
