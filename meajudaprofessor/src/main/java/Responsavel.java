
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
public class Responsavel extends Usuario{
    private ArrayList<Crianca> criancas = new ArrayList<Crianca>();
 
    public Responsavel(String nome, String email, String senha, String cpf, String telefone, String endereco){
        super(nome, email, senha, cpf, telefone, endereco);
    }

    public String getCriancas() {
        if(criancas.isEmpty()){
           return "Não há crianças cadastradas."; 
        }else{
            String listagem= "Crianças: ";
            for(int i=0; i<criancas.size();i++){
                listagem += criancas.get(i).getNomeCrianca() + ", ";
            }
            
            return listagem.substring(0, listagem.length()-2);
        }  
    }
    
    public boolean verificaCrianca(Crianca crianca){
        if(criancas.contains(crianca)){
            return true;
        } else{
            return false;
        }    
    }

    public void novaCrianca(Crianca crianca){
        this.criancas.add(crianca);
        System.out.println("Criança adicionada.");
    }

    public boolean removeCrianca(Crianca crianca){
        if(criancas.contains(crianca)){
            this.criancas.remove(crianca);
            System.out.println("Criança removida.");
            return true;
        } else{
            System.out.println("Criança não listada.");
            return false;
        } 
    }
    
}
