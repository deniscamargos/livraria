package br.DigitalHouse.livraria;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Livro livro1 = new Livro("Grand Hotel",0,1994,6454,6,1.3);
        Livro livro2 = new Livro("Grand Pousada",1,1994,6454,6,1.3);


        Livraria catalogo = new Livraria();

        catalogo.cadastrarlivro(livro1);
        catalogo.cadastrarlivro(livro2);

        Scanner marcador = new Scanner(System.in);
        int codigo = marcador.nextInt();

        catalogo.consultaLivro(codigo);





    }
}