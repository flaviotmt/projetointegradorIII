/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flavio
 */
public class Profissional extends Usuario{
    private String formacaoAcademica = "";
    private String universidade = "";
    private String diploma = "";
    private String descricaoProfissional = "";
    private String curriculo = "";

    public Profissional(String nome, String email, String senha, String cpf, String telefone, String endereco){
        super(nome, email, senha, cpf, telefone, endereco);
    }  

    public void setFormacaoAcademica(String formacaoAcademica){
        this.formacaoAcademica = formacaoAcademica;
        System.out.println("Formação acadêmica adicionada.");
    }

    public void setUniversidade(String universidade){
        this.universidade = universidade;
        System.out.println("Universidade adicionada.");
    }

    public void setDiploma(String diploma){
        int index = diploma.lastIndexOf('.');
        if(index == -1 || diploma.substring(index).length() <4){
            System.out.println("Arquivo inválido. Arquivo sem extensão.");
        }
        else if(diploma.substring(index+1, index+4).compareTo("pdf") == 0){
            this.diploma = diploma;
            System.out.println("Arquivo válido.");
        }else{
            System.out.println("Arquivo inválido. Extensão deve ser .pdf.");
        }
    }

    public void setDescricaoProfissional(String descricaoProfissional){
        this.descricaoProfissional = descricaoProfissional;
        System.out.println("Descrição profissional adicionada.");
    }

    public void setCurriculo(String curriculo){
        int index = curriculo.lastIndexOf('.');
        if(index == -1 || curriculo.substring(index).length() != 4){
            System.out.println("Arquivo inválido. Arquivo sem extensão.");
        }
        else if(curriculo.substring(index+1, index+4).compareTo("pdf") == 0){
            this.curriculo = curriculo;
            System.out.println("Arquivo válido.");
        }else{
            System.out.println("Arquivo inválido. Extensão deve ser .pdf.");
        }
    }

    public String getFormacaoAcademica(){
        return formacaoAcademica;
    }

    public String getUniversidade(){
        return universidade;
    }

    public String getDiploma(){
        return diploma;
    }

    public String getDescricaoProfissional(){
        return descricaoProfissional;
    }

    public String getCurriculo(){
        return curriculo;
    }
    
}
