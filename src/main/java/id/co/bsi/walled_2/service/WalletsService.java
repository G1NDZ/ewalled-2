package id.co.bsi.walled_2.service;

import id.co.bsi.walled_2.repository.UsersRepository;
import id.co.bsi.walled_2.repository.WalletsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletsService {
    @Autowired
    private WalletsRepository walletsRepository;
}
