package com.endava.TicketManagement;

import com.endava.TicketManagement.repository.model.Account;
import com.endava.TicketManagement.service.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TicketManagementApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(TicketManagementApplication.class, args);

		Account account = new Account("012");
		System.out.println(account);

		//a bean, so I just get it from the context
		AccountService as1 = context.getBean(AccountService.class);
		AccountService as2 = context.getBean(AccountService.class);
		System.out.println(as1.toString());
		System.out.println(as2.toString());
	}
}
