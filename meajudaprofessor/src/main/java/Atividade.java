
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
public class Atividade {
    private Map<Par, ArrayList<String[]>> dicionarioAtividades = new HashMap<Par, ArrayList<String[]>>();
    private Conexoes verificaConexao;

    public Atividade(Conexoes conexao){
        this.verificaConexao = conexao;
    }
    
    public void enviaAtividade(Par par, String tituloAtividade, String link, String descricao, String arquivo, Crianca crianca){
        if(verificaConexao.validaConexao(par)){
            if(dicionarioAtividades.containsKey(par)){
                if(par.getResponsavel().verificaCrianca(crianca)){
                    String[] atividade1 = {crianca.getNomeCrianca(), tituloAtividade, link, descricao, arquivo};
                    dicionarioAtividades.get(par).add(atividade1);
                    System.out.println("Atividade adicionada.");
                }else{
                    System.out.println("Não foi possível adicionar atividade. Selecione uma criança válida.");
                }   
            }else{
                if(par.getResponsavel().verificaCrianca(crianca)){
                    dicionarioAtividades.put(par, new ArrayList<String[]>());
                    String[] atividade1 = {crianca.getNomeCrianca(), tituloAtividade, link, descricao, arquivo};
                    dicionarioAtividades.get(par).add(atividade1);
                    System.out.println("Atividade adicionada.");
                }else{
                    System.out.println("Não foi possível adicionar a atividade. Selecione uma criança válida.");
                }    
            }
        }else{
            System.out.println("Não é possível adicionar a atividade. Pessoas não conectadas.");
        }
    }
    
    public String listaAtividades(Par par){
        if(dicionarioAtividades.get(par) != null){
            String atividadesEnviadas = "-------------\n";
            for(int i=0; i<dicionarioAtividades.get(par).size();i++){
                atividadesEnviadas += "      -------------\n";
                for(int j=0; j<dicionarioAtividades.get(par).get(i).length; j++){
                    atividadesEnviadas += "      " + dicionarioAtividades.get(par).get(i)[j] + "\n";   
                }
                atividadesEnviadas += "      -------------\n";
            }
            atividadesEnviadas += "-------------";
            return atividadesEnviadas;
        }else{
            return "Não há atividades adicionadas.";
        }  
    } 
    
    public String listaAtividades(Par par, Crianca crianca){
        if(dicionarioAtividades.get(par) != null){
            boolean possuiAtividade = false;
            String atividadesEnviadas = "-------------\n";
            for(int i=0; i<dicionarioAtividades.get(par).size();i++){
                if(crianca.getNomeCrianca().compareTo(dicionarioAtividades.get(par).get(i)[0])==0){
                    possuiAtividade = true;
                    atividadesEnviadas += "      -------------\n";
                    for(int j=0; j<dicionarioAtividades.get(par).get(i).length; j++){
                        atividadesEnviadas += "      " + dicionarioAtividades.get(par).get(i)[j] + "\n";   
                    }
                    atividadesEnviadas += "      -------------\n";   
                } 
            }
            atividadesEnviadas += "-------------";
            if(possuiAtividade){
                return atividadesEnviadas;
            }else{
                return "Não há atividades cadastradas para essa criança.";
            }
            
        }else{
            return "Não há atividades adicionadas.";
        }  
    }  
    
}
