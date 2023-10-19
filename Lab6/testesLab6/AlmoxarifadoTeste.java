package testesLab6;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sistemasLab6.Almoxarifado;

public class AlmoxarifadoTeste {

    Almoxarifado almoxarifado1;
    ArrayList <String> itens;
    ArrayList <Integer> quantidades;

    @BeforeEach
    void setUp() throws Exception{

        almoxarifado1 = new Almoxarifado();

        itens = new ArrayList<>();
        itens.add("Calculadora");
        itens.add("Caneta");

        quantidades = new ArrayList<>();
        quantidades.add(2);
        quantidades.add(3);

    }
    
    @Test
    public void testeEstoque(){
        Assertions.assertEquals(almoxarifado1.exibirEstoque(itens, quantidades).toString(),
        "[Calculadora x2,\nCaneta x3]");
    }

    @Test
    public void testePedidoCompra(){
        Assertions.assertEquals(almoxarifado1.exibirPedidoCompra("Calculadora", itens).toString(),
        "Calculadora");
    }
    
}