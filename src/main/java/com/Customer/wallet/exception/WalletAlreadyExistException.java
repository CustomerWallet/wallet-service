package com.Customer.wallet.exception;

public class WalletAlreadyExistException extends RuntimeException{

    public WalletAlreadyExistException(Long userId) {
        super("Wallet already exists for userId: " + userId);
    }
}
