package id.co.bsi.walled_2.service;

import id.co.bsi.walled_2.dto.request.TransferRequest;
import id.co.bsi.walled_2.model.Transactions;
import id.co.bsi.walled_2.model.Users;
import id.co.bsi.walled_2.model.Wallets;
import id.co.bsi.walled_2.repository.TransactionsRepository;
import id.co.bsi.walled_2.repository.UsersRepository;
import id.co.bsi.walled_2.repository.WalletsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionsService {
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private WalletsRepository walletsRepository;

    @Autowired
    private TransactionsRepository transactionsRepository;

    public Transactions transfer(TransferRequest transferRequest) {
        Optional <Users> checkAmountByUser = this.usersRepository.findByEmail("gibran@gmail.com");

        Users user = checkAmountByUser.get();
        System.out.println(user.getId());
        Optional <Wallets> checkBalanceByUserId = this.walletsRepository.findById(user.getId());
        Wallets wallet = checkBalanceByUserId.get() ;
        if (transferRequest.getAmount() > wallet.getBalance()){
            throw new RuntimeException("Saldo Anda kurang");
        }
        Transactions transaction = new Transactions();
        transaction.setAmount(transferRequest.getAmount());

        return  this.transactionsRepository.save(transaction);
    }

}
