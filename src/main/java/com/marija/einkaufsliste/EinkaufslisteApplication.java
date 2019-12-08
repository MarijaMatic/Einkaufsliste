package com.marija.einkaufsliste;

import com.marija.einkaufsliste.model.Einkaufsliste;
import com.marija.einkaufsliste.repository.EinkaufslisteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.LongStream;

@SpringBootApplication
public class EinkaufslisteApplication {
	public static void main(String[] args) {
		SpringApplication.run(EinkaufslisteApplication.class, args);
	}

//	@Bean
//	CommandLineRunner init(EinkaufslisteRepository repository) {
//		return args -> {
//			repository.deleteAll();
//			LongStream.range(1, 11)
//					.mapToObj(i -> {
//						Einkaufsliste einkaufsliste = new Einkaufsliste();
//						einkaufsliste.setName("Einkaufsliste " + i);
//						return einkaufsliste;
//					})
//					.map(v -> repository.save(v))
//					.forEach(System.out::println);
//		};
//	}

}
