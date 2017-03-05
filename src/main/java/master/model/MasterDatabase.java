package master.model;

import master.personalData.Master;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;


public class MasterDatabase {
    @PersistenceContext (unitName = "springHibernate", type = PersistenceContextType.EXTENDED)
    EntityManager em;

    @Transactional
    public boolean addMaster (String phoneNumber, String email, String password, String name, String lastName, String info){
        if(em.find(Master.class, phoneNumber)!=null){
            return false;
        }
        Master master = new Master(phoneNumber,email,password,name,lastName);
        em.persist(master);


        return true;
    }


}
