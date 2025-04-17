package id.co.bsi.walled_2.repository;

import id.co.bsi.walled_2.model.Wallets;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WalletsRepository extends JpaRepository<Wallets, Integer> {
    Optional<Wallets> findById(Long user_id);
}
