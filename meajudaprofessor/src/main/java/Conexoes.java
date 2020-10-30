
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flavio
 */
public class Conexoes {
    private ArrayList<Par> aguardandoAceite = new ArrayList<Par>();
    private ArrayList<Par> listaConexoes = new ArrayList<Par>();

    public void adicionaProfissional(Par conexaoProfissional){
        if(!aguardandoAceite.contains(conexaoProfissional) && !listaConexoes.contains(conexaoProfissional)){
            aguardandoAceite.add(conexaoProfissional);
            System.out.println("Aguardando aceite do profissional.");
        } else {
            System.out.println("Já adicionado.");
        }  
    }

    public void aceitaResponsavel(Par conexaoResponsavel){
        if(!aguardandoAceite.contains(conexaoResponsavel)){
            aguardandoAceite.remove(conexaoResponsavel);
            System.out.println("Solicitação não existente ou removida.");
        }else if(!listaConexoes.contains(conexaoResponsavel)){
            aguardandoAceite.remove(conexaoResponsavel);
            listaConexoes.add(conexaoResponsavel);
            System.out.println("Conexão aceita.");
        } else {
            System.out.println("Já adicionado.");
        }
    }

    public void recusaResponsavel(Par conexaoResponsavel){
        if(aguardandoAceite.contains(conexaoResponsavel)){
            aguardandoAceite.remove(conexaoResponsavel);
            System.out.println("Recusado.");
        } else {
            System.out.println("Já recusado.");
        }
    }

    public boolean validaConexao(Par conexao){
        if(listaConexoes.indexOf(conexao) >= 0){
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Par> getListaConexoes(){
        return listaConexoes;
    }

    public ArrayList<Par> getListaAguardandoAceite(){
        return aguardandoAceite;
    }
    
}
