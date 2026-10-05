package com.Customer.wallet.exception;

import com.Customer.wallet.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
public class GlobalException
{
    @ExceptionHandler(WalletAlreadyExistException.class)
    public ResponseEntity<ErrorDTO>walletAlreadyException(WalletAlreadyExistException ex)
    {
        ErrorDTO errorDTO=new ErrorDTO(
                ex.getMessage(),
                "WALLET_ALREADY_EXISTS",
                HttpStatus.CONFLICT.value()
        );

        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorDTO);
    }
}
