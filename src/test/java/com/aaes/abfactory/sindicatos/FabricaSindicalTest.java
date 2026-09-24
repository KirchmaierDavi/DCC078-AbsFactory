package com.aaes.abfactory.sindicatos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class FabricaSindicalTest {

    @Test
    void fabricaMetalurgicosCriaProdutosDaMesmaFamilia() {
        FabricaSindical fabrica = new FabricaMetalurgicos();

        assertInstanceOf(CarteiraMetalurgicos.class, fabrica.criarCarteira());
        assertInstanceOf(BoletimMetalurgicos.class, fabrica.criarBoletim());
    }

    @Test
    void fabricaProfessoresCriaProdutosDaMesmaFamilia() {
        FabricaSindical fabrica = new FabricaProfessores();

        assertInstanceOf(CarteiraProfessores.class, fabrica.criarCarteira());
        assertInstanceOf(BoletimProfessores.class, fabrica.criarBoletim());
    }

    @Test
    void produtosMetalurgicosGeramMensagensCorretas() {
        assertEquals(
                "Carteira dos Metalurgicos emitida para Joao",
                new CarteiraMetalurgicos().emitir("Joao")
        );
        assertEquals(
                "Boletim dos Metalurgicos: campanha salarial em andamento",
                new BoletimMetalurgicos().publicar()
        );
    }

    @Test
    void produtosProfessoresGeramMensagensCorretas() {
        assertEquals(
                "Carteira dos Professores emitida para Ana",
                new CarteiraProfessores().emitir("Ana")
        );
        assertEquals(
                "Boletim dos Professores: assembleia de carreira agendada",
                new BoletimProfessores().publicar()
        );
    }

    @Test
    void assembleiaUsaApenasAAbstracaoDaFabrica() {
        AssembleiaSindical assembleia = new AssembleiaSindical(new FabricaProfessores());

        assertEquals(
                "Carteira dos Professores emitida para Maria | "
                        + "Boletim dos Professores: assembleia de carreira agendada",
                assembleia.prepararMateriais("Maria")
        );
    }
}
