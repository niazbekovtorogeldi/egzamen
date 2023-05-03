package repository.impl;

import jakarta.persistence.EntityManager;
import org.example.confic.Confic;
import org.example.repository.AftoShop;
import repository.AftoShopRepository;

import java.util.List;

public class AftoShopImpl implements AftoShopRepository {
    private final EntityManager entityManager = Confic.getEntityManagerFactory();

    public String saveAftoShop(AftoShop aftoShop) {
        entityManager.getTransaction().begin();
        entityManager.persist(aftoShop);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "save..";
    }

    public List<AftoShop> getalldataviaid(Long id) {
        entityManager.getTransaction().begin();
        List<AftoShop> aftoShop = entityManager.createQuery("select c.cars from AftoShop  c where c.id=:id ", AftoShop.class).setParameter("id", id).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return aftoShop;
    }

    public List<AftoShop> getAllAftoShop() {
        entityManager.getTransaction().begin();
        List<AftoShop> aa = entityManager.createQuery("select a  from  AftoShop  a ", AftoShop.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return aa;
    }

    public String updateAftoShop(Long id, AftoShop aftoShop) {
        entityManager.getTransaction().begin();

        AftoShop aftoShop1 = entityManager.find(AftoShop.class, id);
        if (aftoShop1 == null) {
            System.out.println("not is afroshop...");
        }
        aftoShop1.setName(aftoShop.getName());
        aftoShop1.setAdress(aftoShop.getAdress());
        entityManager.merge(aftoShop1);
        entityManager.getTransaction().commit();
        entityManager.close();

        return "update..";
    }

    public void deleteAftoShopById(Long id) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(AftoShop.class, id));
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}