package ds2.equipe1.restaurante.modelos;

import android.content.Context;

public class Garcom extends Funcionario {
    public Garcom(/*Context context, */String nome, Endereco endereco, String telefone, String cpf, String nome_de_usuario) {
        super(/*context, */nome, endereco, telefone, cpf, nome_de_usuario, GARCOM);
    }
}
