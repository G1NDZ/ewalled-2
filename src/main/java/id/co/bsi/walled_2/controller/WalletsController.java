package id.co.bsi.walled_2.controller;

import id.co.bsi.walled_2.service.WalletsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletsController {
    @Autowired
    private WalletsService walletsService;
}
