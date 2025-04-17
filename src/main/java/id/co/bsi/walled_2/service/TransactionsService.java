package id.co.bsi.walled_2.service;

import id.co.bsi.walled_2.repository.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionsService {
    @Autowired
    private TransactionsRepository transactionsRepository;

}
