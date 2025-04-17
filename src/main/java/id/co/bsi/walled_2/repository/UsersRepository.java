package id.co.bsi.walled_2.repository;

import id.co.bsi.walled_2.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
