package com.mymobileservice.services;

import com.mymobileservice.Account;
import java.util.List;

public interface IAccount {

    List<Account> findByEmail();

    List<Account> findById();
}
