package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(ItemRepository itemRepository) {
		return args ->
		{
			/*Item item = Item.create("Pickles");
			item = itemRepository.save(item);*/

			//System.console().(item);
		};
	}
}

