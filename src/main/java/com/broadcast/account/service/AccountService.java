package com.broadcast.account.service;

import com.broadcast.account.record.AccountResponseRecord;
import com.broadcast.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    private final EducationService educationService;

    public AccountResponseRecord get() {
        //Account account = accountRepository.findById()
        return null;
    }

    public void create() {
    }

    public List<AccountResponseRecord> getAllByIds(List<Long> ids) {
        //Account account = accountRepository.findById(
        return null;
    }

    public void changeOnlineStatus() {

    }

}
