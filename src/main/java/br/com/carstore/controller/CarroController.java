package br.com.carstore.controller;

import br.com.carstore.dto.CarDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // <- este Model
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/carros")
public class CarroController {

    @GetMapping("/novo")
    public String exibirFormulario(Model model) {
        model.addAttribute("carDTO", new CarDTO());
        return "index"; // templates/index.html
    }

    @PostMapping // atende POST /carros
    public String salvarCarro(@Valid @ModelAttribute("carDTO") CarDTO carDTO,
                              BindingResult result) {
        if (result.hasErrors()) {
            return "index";
        }
        System.out.println("Carro validado: Nome=" + carDTO.getName() + ", Cor=" + carDTO.getCor());
        return "redirect:/carros/sucesso";
    }

    @GetMapping("/sucesso")
    public String sucesso() {
        return "sucesso"; // templates/sucesso.html
    }
}
