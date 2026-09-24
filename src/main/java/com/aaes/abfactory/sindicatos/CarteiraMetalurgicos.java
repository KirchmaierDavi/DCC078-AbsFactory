package com.aaes.abfactory.sindicatos;

public class CarteiraMetalurgicos implements CarteiraSindical {

    @Override
    public String emitir(String nomeAssociado) {
        return "Carteira dos Metalurgicos emitida para " + nomeAssociado;
    }
}
