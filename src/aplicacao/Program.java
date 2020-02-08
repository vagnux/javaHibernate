package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.pessoa;

public class Program {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		pessoa p1 = new pessoa(null,"Vagner Rodrigues","vagnux@gmail.com");
		pessoa p2 = new pessoa(null,"Larissa Rodrigues","larissa@gmail.com");
		pessoa p3 = new pessoa(null,"Samuel Rodrigues","samuel@gmail.com");
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexao-jpa");
		EntityManager em  = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
	
		System.out.println("Feito");
	}

}
