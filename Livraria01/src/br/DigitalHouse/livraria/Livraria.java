package br.DigitalHouse.livraria;

import java.util.ArrayList;
import java.util.List;

public class Livraria {

    private List<Livro> Livros = new ArrayList<>();

    public int compareBookObjects(Livro b1, Livro b2){

        if (b1.getNome().equalsIgnoreCase(b2.getNome())){

            System.out.println("esse livro já existe");
            return 0;

        }
        if (b1.getId()==b2.getId()){

            System.out.println("Esse livro já existe");
            return 0;
        }
        return 1;
    }

    //Criar método de cadastro de livros

    public void cadastrarlivro(Livro b){

       Livros.add(b);

    }

    //Criar método de busca pelo livro

    public void consultaLivro(int codigo){

        System.out.println(Livros.get(codigo));

    }

    public void consultaPorNome(String codigo){

    }

//    public void consultaLivro(Livro b){
//
//        System.out.println(Livros.get(b.getId()).toString());
//
//    }

//Criando o método vender livros

    public void venderLivros(Livro b){

        Livros.remove(b);

            }

        }
