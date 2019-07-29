package com.javadevjournal.demoproject.com.javadevjournal.demoproject.controller;

import com.javadevjournal.demoproject.com.javadevjournal.demoproject.dto.DebitTransactionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;

@RestController
@RequestMapping(path = "/transaction", produces = "application/json")
public class TransactionController {

    @RequestMapping(path = "/debit/{id}", method = RequestMethod.POST)
    public ResponseEntity<?> Debit(@PathVariable("id") long id, @RequestBody DebitTransactionDto debit){

        return null;
    }

    @RequestMapping(path="/credit/{id}", method = RequestMethod.POST)
    public ResponseEntity<T> Credit(@PathVariable("id") long id, @RequestBody DebitTransactionDto){
        return null;
    }
}
