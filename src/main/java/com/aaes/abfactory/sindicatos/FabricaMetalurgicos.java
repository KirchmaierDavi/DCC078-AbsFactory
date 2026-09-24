package com.aaes.abfactory.sindicatos;

public class FabricaMetalurgicos implements FabricaSindical {

    @Override
    public CarteiraSindical criarCarteira() {
        return new CarteiraMetalurgicos();
    }

    @Override
    public BoletimSindical criarBoletim() {
        return new BoletimMetalurgicos();
    }
}
