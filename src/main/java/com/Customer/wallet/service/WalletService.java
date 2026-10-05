package com.Customer.wallet.service;

import com.Customer.wallet.model.Wallet;
import com.Customer.wallet.repository.TransactionRepo;
import com.Customer.wallet.repository.WalletRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WalletService
{

    private WalletRepo walletRepo;
    private TransactionRepo transactionRepo;


    //create the wallet
    public ResponseEntity<Wallet>createWallet(Long userId){
      return null;
    }
}
