package testes;



import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Date;

import ds2.equipe1.restaurante.modelos.*;

import static junit.framework.Assert.assertEquals;


/**
 * Created by Th on 19/10/2016.
 */


public class TesteUnidade {

   Item item = new Item("Farinha",50,"kg",10);
   Fornecedor fornecedor = new Fornecedor("Fernando","234-5678","123456789/11","email@email.com");
   Compra compra = new Compra(item,100,100,"10/10/16",fornecedor);
   Endereco endereco = new Endereco("logradouro", "rua", 10, "String bairro", "Aracaju", "SE", "49000-000");
   Garcom garcom = new Garcom("Messias",endereco,"234-5678","123456789-00","messias");
   Gerente gerente = new Gerente("Melo",endereco,"234-5678","123456789-00","melo");
   Ingrediente ingrediente = new Ingrediente(item, 2);
   Mesa mesa = new Mesa(1);
   ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
   ArrayList <Produto> produtos = new  ArrayList <Produto>();
   ArrayList <Pedido> tempPedidos = null;

   /* vamos testaresssas classes acima e ver no que dá*/
   @Test
   public void TestItemgetNome() throws Exception{
      assertEquals("Farinha",item.getNome());
      item.setNome("Farofa");
      assertEquals("Farofa",item.getNome());
   }

   @Test
   public void TestItemGetQuantidade()throws Exception{
      assertEquals(50,item.getQuantidade());
      item.setQuantidade(200);
      assertEquals(200,item.getQuantidade());
   }

   @Test
   public void TestItemGetLimiteMinimo()throws Exception{
      assertEquals(10,item.getLimiteMinimo());
      item.setLimiteMinimo(5);
      assertEquals(5,item.getLimiteMinimo());
   }

   @Test
   public void TestItemGetUnidade()throws Exception{
      assertEquals("kg",item.getUnidade());
      item.setUnidade("litro");
      assertEquals("litro",item.getUnidade());
   }

   @Test
   public void TestComandaGetCustoTotal() throws Exception {
      ingredientes.add(ingrediente);
      Produto produto = new Produto("Pizza",10,ingredientes);
      produtos.add(produto);
      Pedido pedido = new Pedido(produtos);
      Comanda comanda = new Comanda("Ze",1,pedido);
      assertEquals(10,comanda.getCustoTotal(),0.0);
   }

   @Test
   public void TestComandaRemoverPedido() throws Exception {
      ingredientes.add(ingrediente);
      Produto produto = new Produto("Pizza",10,ingredientes);
      produtos.add(produto);
      Pedido pedido = new Pedido(produtos);
      Comanda comanda = new Comanda("Ze",1,pedido);
      comanda.removerPedido(pedido);
      tempPedidos = comanda.getPedidos();
      assertEquals(0,tempPedidos.size());
   }

   @Test
   public void TestComandaIsAtiva() throws Exception {
      ingredientes.add(ingrediente);
      Produto produto = new Produto("Pizza",10,ingredientes);
      produtos.add(produto);
      Pedido pedido = new Pedido(produtos);
      Comanda comanda = new Comanda("Ze",1,pedido);
      assertEquals(true,comanda.isAtiva());
   }

   @Test
   public void TestComandaDesativar() throws Exception {
      ingredientes.add(ingrediente);
      Produto produto = new Produto("Pizza",10,ingredientes);
      produtos.add(produto);
      Pedido pedido = new Pedido(produtos);
      Comanda comanda = new Comanda("Ze",1,pedido);
      comanda.desativar();
      assertEquals(false,comanda.isAtiva());
   }

   @Test
   public void TestComandaGetPedido() throws Exception {
      ingredientes.add(ingrediente);
      Produto produto = new Produto("Pizza",10,ingredientes);
      produtos.add(produto);
      Pedido pedido = new Pedido(produtos);
      Comanda comanda = new Comanda("Ze",1,pedido);
      assertEquals(pedido,comanda.getPedido(0));
   }

   @Test
   public void TestComandaGetData() throws Exception {
      ingredientes.add(ingrediente);
      Produto produto = new Produto("Pizza",10,ingredientes);
      produtos.add(produto);
      Pedido pedido = new Pedido(produtos);
      Comanda comanda = new Comanda("Ze",1,pedido);
      Date agora = new Date();
      assertEquals(agora.toString(), comanda.getData().toString());
   }

   @Test
   public void TestComandaGetMesa() throws Exception {
      ingredientes.add(ingrediente);
      Produto produto = new Produto("Pizza",10,ingredientes);
      produtos.add(produto);
      Pedido pedido = new Pedido(produtos);
      Comanda comanda = new Comanda("Ze",1,pedido);
      assertEquals(1,comanda.getMesa());
   }
}