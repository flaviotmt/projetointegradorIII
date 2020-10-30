/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flavio
 */
public class Crianca {
    private String nomeCrianca;
    private int idadeCrianca;
    private boolean necessidadeEspecial;
    private String descricaoNecessidade;
    private String observacao;

    public Crianca(String nomeCrianca, int idadeCrianca, boolean necessidadeEspecial, String descricaoNecessidade, String observacao){
        this.nomeCrianca = nomeCrianca;
        this.idadeCrianca = idadeCrianca;
        this.necessidadeEspecial = necessidadeEspecial;
        this.descricaoNecessidade = descricaoNecessidade;
        this.observacao = observacao; 
    }

    public void setNomeCrianca(String nomeCrianca){
        this.nomeCrianca = nomeCrianca;
        System.out.println("Nome da criança adicionado.");
    }

    public void setIdadeCrianca(int idadeCrianca){
        this.idadeCrianca = idadeCrianca;
        System.out.println("Idade da criança adicionada.");
    }

    public void setNecessidadeEspecial(boolean necessidadeEspecial){
        this.necessidadeEspecial = necessidadeEspecial;
        System.out.println("Necessidade especial adicionada.");
    }

    public void setDescricaoNecessidade(String descricaoNecessidade){
        this.descricaoNecessidade = descricaoNecessidade;
        System.out.println("Descrição da necessidade especial adicionada.");
    }

    public void setObservacao(String observacao){
        this.observacao = observacao;
        System.out.println("Observação adicionada.");
    }

    public String getNomeCrianca(){
        return nomeCrianca;
    }

    public int getIdadeCrianca(){
        return idadeCrianca;
    }

    public boolean getNecessidadeEspecial(){
        return necessidadeEspecial;
    }

    public String getDescricaoNecessidade(){
        return descricaoNecessidade;
    }

    public String getObservacao(){
        return observacao;
    }
    
}
