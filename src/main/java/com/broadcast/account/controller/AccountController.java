package com.broadcast.account.controller;

import com.broadcast.account.record.AccountResponseRecord;
import com.broadcast.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    public AccountResponseRecord get() {
        return accountService.get();
    }

    @GetMapping("/all")
    public List<AccountResponseRecord> getAllByIds(List<Long> ids) {
        return accountService.getAllByIds(ids);
    }

    @PostMapping("/online")
    public void changeOnlineStatus() {
        accountService.changeOnlineStatus();
    }

//    @PutMapping
//    public AccountResponseRecord update(@PathVariable(name = "id") Long accountId) {
//        return accountService.update(accountId);
//    }
//
//    @PutMapping
//    public AccountResponseRecord update(@PathVariable(name = "id") Long accountId) {
//        return accountService.getAll(accountId);
//    }
//
//    @DeleteMapping()
//    public void delete() {
//        return accountService.delete();
//    }

}
