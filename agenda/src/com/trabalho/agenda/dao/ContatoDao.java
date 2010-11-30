/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalho.agenda.dao;

import java.sql.Connection;

/**
 *
 * @author Marcus Vinicius
 */
public class ContatoDao {

    private Connection connection;

    public ContatoDao(Connection connection) {
        this.connection = connection;
    }
}
