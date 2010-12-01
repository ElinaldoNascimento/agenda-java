/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalho.agenda.dao;

import com.trabalho.agenda.lib.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author Marcus Vinicius
 */
public class DaoFactory {

    private final Connection connection;

    public DaoFactory() {
        connection = ConnectionFactory.getConnection();
    }

    public PessoaDao getPessoaDao(){
        return new PessoaDao(connection);
    }
}
