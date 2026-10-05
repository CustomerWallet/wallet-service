package com.Customer.wallet.controller;

import com.Customer.wallet.model.Wallet;
import com.Customer.wallet.repository.WalletRepo;
import com.Customer.wallet.service.WalletService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wallet")
public class WalletController
{
    private WalletService walletService;

    private WalletRepo walletRepo;

    public WalletController(WalletService walletService, WalletRepo walletRepo){
        this.walletService=walletService;
        this.walletRepo=walletRepo;
    }

    //create the wallet
    public ResponseEntity<Wallet> createWallet(@RequestParam(required = true) Long userId)
    {
         return ResponseEntity.status(HttpStatus.CREATED).body(walletService.createWallet(userId));
    }



}
