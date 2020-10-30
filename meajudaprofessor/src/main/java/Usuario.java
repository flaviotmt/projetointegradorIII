/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flavio
 */
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String telefone;
    private String endereco;

    public Usuario(String nome, String email, String senha, String cpf, String telefone, String endereco){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
        System.out.println("Nome adicionado.");
    }

    public void setEmail(String email){
        this.email = email;
        System.out.println("E-mail adicionado.");
    }

    public void setSenha(String senha){
        this.senha = senha;
        System.out.println("Senha adicionada.");
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
        System.out.println("Cpf adicionado.");
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
        System.out.println("Telefone adicionado.");
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
        System.out.println("Endereço adicionado.");
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String getSenha(){
        return senha;
    }

    public String getCpf(){
        return cpf;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getEndereco(){
        return endereco;
    }
    
}
