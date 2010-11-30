/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trabalho.agenda;

import com.trabalho.agenda.dao.DaoFactory;

/**
 *
 * @author Marcus Vinicius
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DaoFactory dao = new DaoFactory();
        dao.getPessoaDao();
    }

}
