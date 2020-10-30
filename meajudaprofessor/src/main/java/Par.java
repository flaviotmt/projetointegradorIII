/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flavio
 */
public class Par {
  private Responsavel responsavel;
  private Profissional profissional;

  public Par(Responsavel responsavel, Profissional profissional){
    this.responsavel = responsavel;
    this.profissional = profissional;
  }

  public Responsavel getResponsavel(){
    return responsavel;
  }

  public Profissional getProfissional(){
    return profissional;
  }
    
}
