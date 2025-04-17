package id.co.bsi.walled_2.controller;

import id.co.bsi.walled_2.repository.TransactionsRepository;
import id.co.bsi.walled_2.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionsController {
    @Autowired
    private TransactionsService transactionsService;
}
