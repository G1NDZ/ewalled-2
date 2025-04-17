package id.co.bsi.walled_2.repository;

import id.co.bsi.walled_2.model.Wallets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletsRepository extends JpaRepository<Wallets, Integer> {
}
