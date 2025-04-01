package com.broadcast.account.mapper;

import com.broadcast.account.model.Account;
import com.broadcast.account.record.AccountCreateRecord;
import com.broadcast.account.record.AccountResponseRecord;
import org.mapstruct.Mapper;

@Mapper
public interface AccountMapper {

    AccountResponseRecord toResponse(Account entity);

    Account toEntity(AccountCreateRecord record);

}
