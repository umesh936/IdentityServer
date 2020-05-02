package in.sminfo.authserver;

import static org.springframework.boot.SpringApplication.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IdentityServerApplication {

    public static void main(String[] args) {
        run(IdentityServerApplication.class, args);
    }

}
