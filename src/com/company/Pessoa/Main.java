package com.company.Pessoa;

import com.company.Pessoa.Cleber;
import com.company.Pessoa.Renan;

public class Main {

    public static void main(String[] args) {
        // 1- Escolha uma ativadade do seu dia-a-dia e cria a classe para ela.
        // Lembre de colocar as caracteristicas que ela possui e quais os métodos
        // necessários para executa-la

        Renan renan = new Renan();
        renan.acorda = "Acorda: Bom dia, Renan";
        System.out.println(renan.acorda);

        renan.levantar = "Levanta: Você lenvantou, até que em fim!";
        System.out.println(renan.levantar);

        renan.vestirRoupa = "Roupa: Ja estou vestido";
        System.out.println(renan.vestirRoupa);

        renan.escovarDentes = "Escove os Dentes: Dentes Brancos";
        System.out.println(renan.escovarDentes);

        renan.preguica();

        renan.trabalhar = "Trabalhar: To, indo trabalhar";
        System.out.println(renan.trabalhar);


        System.out.println();

        Cleber cleber = new Cleber();
        cleber.acorda = "Acorda: Bom dia, Cleber";
        System.out.println(cleber.acorda);

        cleber.levantar = "Levanta: Você lenvantou, até que em fim!";
        System.out.println(cleber.levantar);

        cleber.vestirRoupa = "Roupa: Já estou vestido";
        System.out.println(cleber.vestirRoupa);

        cleber.escovarDentes = "Escove os Dentes: Dentes Brancos";
        System.out.println(cleber.escovarDentes);

        cleber.correr();

        cleber.trabalhar = "Trabalhar: To, indo trabalhar";
        System.out.println(cleber.trabalhar);


    }
}
