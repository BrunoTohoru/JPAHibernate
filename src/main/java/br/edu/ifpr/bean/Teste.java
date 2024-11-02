/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.bean;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Aluno
 */
public class Teste {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql_db");
        EntityManager em = emf.createEntityManager();
        
        /**
        *Categoria categoria = new Categoria();
        *categoria.setNome("Moveis");
        *
        *em.getTransaction().begin();
        *em.persist(categoria);
        *em.getTransaction().commit();
        *em.close();
        *emf.close();
        **/
        
        Ator ator = new Ator();
        ator.setNome("Keanu Reeves");
        ator.setCidade("New York");
        ator.setIdade(52);
        ator.setSalario(22.50);
        ator.setSexo('M');
        
        em.getTransaction().begin();
        em.persist(ator);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }
}
