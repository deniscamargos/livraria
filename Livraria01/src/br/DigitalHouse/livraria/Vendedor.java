package br.DigitalHouse.livraria;

import java.util.ArrayList;

public interface Vendedor {

    public void consultaLivro(Integer id);

    public void cadastrarLivro(ArrayList dadosLivro);

    public void venderLivro(Integer id);
}
