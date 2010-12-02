/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trabalho.agenda.bean;

import java.util.List;

/**
 *
 * @author Marcus Vinicius
 */
public class Contato {
private Long id;
private String endereco;
private String aptNo;
private String bairro;
private String cidade;
private String CEP;
private String estado;
private String email;
private List<Telefone> telefones;
private String observacao;

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getAptNo() {
        return aptNo;
    }

    public void setAptNo(String aptNo) {
        this.aptNo = aptNo;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(long l) {
        this.id = l;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }



}
