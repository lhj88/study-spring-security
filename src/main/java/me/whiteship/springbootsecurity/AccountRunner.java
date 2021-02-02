package me.whiteship.springbootsecurity;

import me.whiteship.springbootsecurity.account.Account;
import me.whiteship.springbootsecurity.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    AccountService accountService;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account heeju = accountService.createAccount("heeju", "1234");
        System.out.println(heeju.getUsername() + " password : " + heeju.getPassword());
    }
}
