package com.aaes.abfactory.sindicatos;

public class FabricaProfessores implements FabricaSindical {

    @Override
    public CarteiraSindical criarCarteira() {
        return new CarteiraProfessores();
    }

    @Override
    public BoletimSindical criarBoletim() {
        return new BoletimProfessores();
    }
}
