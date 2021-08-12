package com.scv.trk;

import com.scv.trk.model.CheckInfo;
import com.scv.trk.repository.CheckRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;


@Configuration
public class InitDatabase {
    private static final Logger log  = LoggerFactory.getLogger(InitDatabase.class);

    @Bean
    CommandLineRunner init(CheckRepository repository) {
        CheckInfo check = new CheckInfo();
        check.setDateTime(LocalDateTime.now());
        check.setValue(25.6);
        check.setDesc("description");
        check.setComment("comment");
        return args -> {
            log.info("Preloading " + repository.save(check));
        };
    }
}
