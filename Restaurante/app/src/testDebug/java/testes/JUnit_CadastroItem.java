package testes;



import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import ds2.equipe1.restaurante.modelos.*;



/**
 * Created by Th on 19/10/2016.
 */
@Mock
Context mMockContext;

@Test
public class JUnit_CadastroItem {
   Context mMockContext = new Context();
   Compra compra = new Compra(new Item(mMockContext,"Farinha",50,"kg",10),100.00,"10/10/16",new Fornecedor(mMockContext,"Fernando","234-5678","123456789/11","email@email.com"));
}