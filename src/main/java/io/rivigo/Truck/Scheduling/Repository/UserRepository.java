package io.rivigo.Truck.Scheduling.Repository;

import io.rivigo.Truck.Scheduling.Application.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
