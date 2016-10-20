package testes;



import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import ds2.equipe1.restaurante.modelos.*;



/**
 * Created by Th on 19/10/2016.
 */


public class TesteUnidade {

   public TesteUnidade(){
      Item item = new Item("Farinha",50,"kg",10);
      Fornecedor fornecedor = new Fornecedor("Fernando","234-5678","123456789/11","email@email.com");
      Compra compra = new Compra(item,100,100,"10/10/16",fornecedor);
      Endereco endereco = new Endereco("logradouro", "rua", 10, "String bairro", "Aracaju", "SE", "49000-000");
      Garcom garcom = new Garcom("Messias",endereco,"234-5678","123456789-00","messias");
      Gerente gerente = new Gerente("Melo",endereco,"234-5678","123456789-00","melo");
      Ingrediente ingrediente = new Ingrediente(item, 2);
      Mesa mesa = new Mesa(1);
      ArrayList<Ingrediente> ingredientes = null;
      ingredientes.add(ingrediente);
      Produto produto = new Produto("Pizza",10,ingredientes);
      ArrayList<Produto> produtos = null;
      produtos.add(produto);
      Pedido pedido = new Pedido(produtos);
   }

  /* vamos testaresssas classes acima e ver no que dá*/

}