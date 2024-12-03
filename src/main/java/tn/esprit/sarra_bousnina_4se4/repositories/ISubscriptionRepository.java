package tn.esprit.sarra_bousnina_4se4.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.sarra_bousnina_4se4.Entities.Subscription;
import tn.esprit.sarra_bousnina_4se4.Entities.TypeSubscription;

import java.util.Set;

public interface ISubscriptionRepository extends CrudRepository<Subscription,Long> {
    Set<Subscription> findByTypeSubOrderByStartDate(TypeSubscription typeSubscription);
    @Query("SELECT sub from Subscription sub where sub.typeSub =:type order by sub.startDate asc ")
    Set<Subscription> getByType(@Param("type") TypeSubscription typeSubscription);
}
