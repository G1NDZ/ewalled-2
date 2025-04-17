package id.co.bsi.walled_2.repository;

import id.co.bsi.walled_2.model.Transactions;
import id.co.bsi.walled_2.model.Users;
import id.co.bsi.walled_2.model.Wallets;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransactionsRepository extends JpaRepository<Transactions, Integer> {



}
