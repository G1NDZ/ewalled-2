package id.co.bsi.walled_2.repository;

import id.co.bsi.walled_2.model.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository<Transactions, Integer> {

}
