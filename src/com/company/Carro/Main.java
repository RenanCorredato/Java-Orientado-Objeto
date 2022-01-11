package com.company.Carro;

public class Main {

    // 2- Peça para algum familiar ou amigo escolher um atividade do dia dele.
    // Repeita o mesmo processo do exercicio anterior

    public static void main(String[] args) {
        Carro carroUm = new CarroUm();
        carroUm.cor = "Cor: Preta";
        System.out.println(carroUm.cor);

        carroUm.marca = "Marca: FIAT";
        System.out.println(carroUm.marca);

        carroUm.qtaPortas = "Quantidade de Portas: 2";
        System.out.println(carroUm.qtaPortas);

        carroUm.elogioUm();

        System.out.println();

        Carro carroDois = new CarroDois();
        carroDois.cor = "Cor: Prata";
        System.out.println(carroDois.cor);

        carroDois.marca = "Marca: BMW";
        System.out.println(carroDois.marca);

        carroDois.qtaPortas = "Quantidade de Portas: 4";
        System.out.println(carroDois.qtaPortas);

        carroDois.elogioDois();

    }
}
