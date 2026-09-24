package com.aaes.abfactory.sindicatos;

public class AssembleiaSindical {

    private final FabricaSindical fabrica;

    public AssembleiaSindical(FabricaSindical fabrica) {
        this.fabrica = fabrica;
    }

    public String prepararMateriais(String nomeAssociado) {
        CarteiraSindical carteira = fabrica.criarCarteira();
        BoletimSindical boletim = fabrica.criarBoletim();
        return carteira.emitir(nomeAssociado) + " | " + boletim.publicar();
    }
}
