package id.co.bsi.walled_2.repository;

import id.co.bsi.walled_2.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {

    public Optional<Users> findByEmail(String email);
}
