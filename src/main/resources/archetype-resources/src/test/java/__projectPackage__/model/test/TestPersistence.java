package ${groupId}.${projectPackage}.model.test;

import javax.persistence.EntityManager;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;

public class TestPersistence {

	public static void main(String[] args) {
		JpaPersistModule jpaPersistModule = new JpaPersistModule("mysql");
		Injector injector = Guice.createInjector(jpaPersistModule);
		
		PersistService persistService = injector.getInstance(PersistService.class);
		persistService.start();
		
		EntityManager em = injector.getInstance(EntityManager.class);

		em.getTransaction().begin();
		
		em.getTransaction().commit();
		
	}

}




