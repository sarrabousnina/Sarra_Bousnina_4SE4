package tn.esprit.sarra_bousnina_4se4.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.sarra_bousnina_4se4.Entities.Skier;
import tn.esprit.sarra_bousnina_4se4.Entities.Support;
import tn.esprit.sarra_bousnina_4se4.Entities.TypeSubscription;

import java.util.List;

public interface ISkierRepository extends CrudRepository<Skier,Long> {
    //avec keyword
    List<Skier> findBySubscription_TypeSub(TypeSubscription typeSubscription);
    //avec jpql
    @Query("select s from Skier s where s.subscription.typeSub=:type")
    List<Skier> getSkierBySubscription_TypeSub(@Param("type") TypeSubscription typeSubscription);


    //@Query("select s from Skier s join s.registrations registration where registration.course.support =:support")//registration comme si un element de la liste registrations
    @Query("select s from Skier s join s.registrations registration join registration.course c where c.support =:support")//ou bien ( on a choisi la premiere car on a  1 seule course si on a une liste de courses on doit faire la jointure
    List<Skier> getByCourseSupport(@Param("support") Support support);
}
