package com.broadcast.account.repository;

import com.broadcast.account.model.AccountData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDataRepository extends JpaRepository<AccountData, Long> {
}
