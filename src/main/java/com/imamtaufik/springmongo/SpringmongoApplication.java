package com.imamtaufik.springmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmongoApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(StudentRepo repo) {
//        return args -> {
//            Address address = new Address("Address","City","Code");
//            String email = "jamila2@ahmed.com";
//            Student student = new Student(
//                    "jamilla",
//                    "ahmed",
//                    email,
//                    Gender.FEMALE,
//                    address,
//                    List.of("Computer","Ad aja"),
//                    BigDecimal.TEN,
//                    LocalDateTime.now()
//            );
//            repo.findStudentByEmail(email).ifPresentOrElse(s -> {
//                System.out.println("Already Exist" + s);
//            },()->{
//                System.out.println("Inserting Student" + student);
//                repo.insert(student);
//            });
//        };
//    }
}
