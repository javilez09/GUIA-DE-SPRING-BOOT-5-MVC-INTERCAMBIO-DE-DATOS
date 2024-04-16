/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.misiontic.ciclo3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author USUARIO
 */
@Controller
@Slf4j
public class ControladorInicio {
    @Value("${index.mensaje}")
    String dato;
    @GetMapping("/")
    public String inicio (Model modelo){
        String mensaje = "Saludos desde Spring MVC";
        modelo.addAttribute ("mensaje", mensaje);
        modelo.addAttribute("dato", dato);
        log.info("Ejecutando el controlador Inicio");
        return "index";
    }
    
}
