package br.com.alura.listavip;

import br.com.alura.listavip.service.ConvidadoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ListaVipApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListaVipApplication.class, args);
    }

    @Bean
    public ConvidadoService convidadoService() {
        return new ConvidadoService();
    }
}
