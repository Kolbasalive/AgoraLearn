package org.kolbasa.agoralearn.fw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication(scanBasePackages = "org.kolbasa.agoralearn")
@EntityScan("org.kolbasa.agoralearn.domain")
public class AgoraLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgoraLearnApplication.class, args);
    }

}
