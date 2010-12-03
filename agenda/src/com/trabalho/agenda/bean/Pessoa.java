/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalho.agenda.bean;

/**
 *
 * @author Marcus Vinicius
 */
public class Pessoa {

    private Long id;
    private String nome;
    private String sobrenome;
    private Contato contato;

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    

    
}
