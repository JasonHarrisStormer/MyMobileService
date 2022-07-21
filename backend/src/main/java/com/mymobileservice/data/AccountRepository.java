package com.mymobileservice.data;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//import com.mymobileservice.beans.Account;
import com.mymobileservice.model.AccountModel;

public interface AccountRepository extends CrudRepository<AccountModel, Integer>{
    
}
