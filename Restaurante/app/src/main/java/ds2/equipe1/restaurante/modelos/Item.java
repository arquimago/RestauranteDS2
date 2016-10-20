package ds2.equipe1.restaurante.modelos;

import android.content.Context;

import com.google.gson.annotations.SerializedName;

import ds2.equipe1.restaurante.controles.ControleDeAtendimento;
import ds2.equipe1.restaurante.helpers.RequestCallback;

public class Item extends Model<Item> {
	private String nome;
	private String unidade;
	private int quantidade;
	@SerializedName("limite")
	private int limiteMinimo;

	/*public Item(Context context){
		super(context);
	}*/
	public Item(){

	}

	public Item(/*Context context,*/ String nome, int quantidade, String unidade, int limiteMinimo){
		//super(context);
		this.nome = nome;
		this.unidade = unidade;
		this.quantidade = quantidade;
		this.limiteMinimo = limiteMinimo;
    }
    
    /*public void verificarItemAbaixoDoLimite(int quantidadeParaReduzir){
		if (getQuantidade()-quantidadeParaReduzir < getLimiteMinimo()){
			new Aviso(context, this).save();
		}
    }*/
    
	public String getNome(){
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

	public int getLimiteMinimo(){
        return limiteMinimo;
    }

	public String getUnidade() {
		return unidade;
	}

    public void setQuantidade(int quantidade){
		//alterar quantidade no banco
		this.quantidade = quantidade;
    }

    public void setLimiteMinimo(int limiteMinimo){
		//alterar limiteMinimo no banco
		this.limiteMinimo = limiteMinimo;
    }

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setUnidade(String unidade){
		this.unidade=unidade;
	}

    @Override
    public void save() {
        unidade = unidade.toUpperCase();
        super.save();
    }

    /*@Override
    public void save(RequestCallback<Model> callback) {
        unidade = unidade.toUpperCase();
        super.save(callback);
    }*/
}
