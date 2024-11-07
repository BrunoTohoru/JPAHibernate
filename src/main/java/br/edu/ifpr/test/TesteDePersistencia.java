/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.test;

import br.edu.ifpr.model.entity.Endereco;
import br.edu.ifpr.model.entity.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Aluno
 */
public class TesteDePersistencia {
    public static void main(String[] args) {
        Endereco end = new Endereco();
        end.setLogradouro("Av. teste, 9999");
        
        
        Pessoa p = new Pessoa();
        p.setNome("Armando Tramoia");
        p.setEndereco(end);
        
        end.getPessoa();
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql_db");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(end);
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
