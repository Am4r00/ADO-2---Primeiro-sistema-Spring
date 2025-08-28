package br.com.carstore.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/carros")
public class CarroController {

    @PostMapping
    public Map<String, String> criar (@RequestParam String nome,
                                      @RequestParam String cor){
        return Map.of("nome",nome,"cor",cor);
    }
}
