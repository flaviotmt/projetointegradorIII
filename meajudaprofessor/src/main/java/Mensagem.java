
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flavio
 */
public class Mensagem {
    private String mensagem;
    private Map<Par, ArrayList<String>> dicionarioMensagens = new HashMap<Par, ArrayList<String>>();
    
    private Conexoes verificaConexao;
    
    public Mensagem(Conexoes conexao){
        this.verificaConexao = conexao;
    }

    public void setMensagem(Par par, String mensagem){
        if(verificaConexao.validaConexao(par)){
            if(dicionarioMensagens.containsKey(par)){
                dicionarioMensagens.get(par).add(mensagem);
            }else{
                dicionarioMensagens.put(par, new ArrayList<String>());
                dicionarioMensagens.get(par).add(mensagem); 
            }
            System.out.println("Mensagem enviada.");
        }else{
            System.out.println("Não é possível enviar a mensagem. Pessoas não conectadas.");
        }
        
    }

    public String getMensagem(Par par){
        if(dicionarioMensagens.get(par) != null){
            String mensagensTrocadas = "-------------\n";
            for(int i=0; i<dicionarioMensagens.get(par).size();i++){
                mensagensTrocadas += dicionarioMensagens.get(par).get(i).toString() + "\n";
            }
            mensagensTrocadas += "-------------";
            return mensagensTrocadas;
        }else{
            return "Não há mensagens.";
        }  
    }
    
}
