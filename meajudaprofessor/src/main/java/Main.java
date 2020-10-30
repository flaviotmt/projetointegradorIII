/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flavio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Adicionando Profissional
        Profissional prof = new Profissional("José", "jose@gmail.com", "123", "00000000000", "31-33334444", "Rua A");
        System.out.println(prof.getCpf());
        prof.setCpf("11111111111");
        System.out.println(prof.getCpf());
        prof.setFormacaoAcademica("Pedagogo");
        prof.setUniversidade("Newton Paiva");
        prof.setDescricaoProfissional("Especialização em ...");
        prof.setCurriculo("curriculo.pdf");
        prof.setDiploma("diploma.doc");
        prof.setDiploma("diploma.pdf");
        
        //Adicionando Responsavel
        Responsavel resp1 = new Responsavel("Maria", "maria@gmail.com", "321", "22222222222", "31-55556666", "Rua B");
        Crianca crianca1 = new Crianca("Pedro", 3, false, "", "Não para de chorar");
        resp1.novaCrianca(crianca1);
        Crianca crianca2 = new Crianca("Ana", 5, true, "Autista", "");
        resp1.novaCrianca(crianca2);
        Crianca crianca3 = new Crianca("-", 0, true, "-", "-");
        resp1.novaCrianca(crianca3);
        System.out.println(resp1.getCriancas());
        resp1.removeCrianca(crianca3);
        System.out.println(resp1.getCriancas());
        
        //Definindo lista de Conexoes, Lista de Mensagens e Lista de Atividades
        Conexoes listaConexoes = new Conexoes();
        Mensagem mensagensTrocadas = new Mensagem(listaConexoes);
        Atividade aditivadesAdicionadas = new Atividade(listaConexoes);
        
        //Estabelecendo conexão
        Par contato1 = new Par(resp1, prof);
        listaConexoes.aceitaResponsavel(contato1);
        listaConexoes.adicionaProfissional(contato1);
        listaConexoes.aceitaResponsavel(contato1);
        
        //Enviando Mensagem
        mensagensTrocadas.setMensagem(contato1, "Olá, tudo bem?");
        mensagensTrocadas.setMensagem(contato1, "Sim, e vc?");
        mensagensTrocadas.setMensagem(contato1, "Bom dia!");
        mensagensTrocadas.setMensagem(contato1, "(...)");
        System.out.println(mensagensTrocadas.getMensagem(contato1));
        
        //Criando Atividades
        aditivadesAdicionadas.enviaAtividade(contato1, "Atividade 1", "http:/...com.br/", "Descrição da atividade 1", "arquivo1.pdf", crianca1);
        System.out.println(aditivadesAdicionadas.listaAtividades(contato1, crianca2));
        aditivadesAdicionadas.enviaAtividade(contato1, "Atividade 2", "http:/...com.br/", "Descrição da atividade 2", "arquivo2.pdf", crianca2);
        aditivadesAdicionadas.enviaAtividade(contato1, "Atividade 3", "http:/...com.br/", "Descrição da atividade 3", "arquivo3.pdf", crianca2);
        System.out.println(aditivadesAdicionadas.listaAtividades(contato1));
        System.out.println(aditivadesAdicionadas.listaAtividades(contato1, crianca2));
        
        
        
    }
    
}
