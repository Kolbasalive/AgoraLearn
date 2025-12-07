package org.kolbasa.agoralearn.fw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(scanBasePackages = "org.kolbasa.agoralearn")
@EntityScan("org.kolbasa.agoralearn.domain")
@CrossOrigin(origins = "http://localhost:3000")
public class AgoraLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgoraLearnApplication.class, args);
    }

}
