package com.example.controller;

//import java.util.Arrays;
//import java.util.List;
//import java.util.ArrayList;
import com.example.model.User;
//import com.example.dao.UserDAO;
import com.example.service.UserService;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class User_Controller 
{
    @Value("${index.strTitle}")
    private String strTitle;
    
    //@Autowired
    //private UserDAO usuarioDAO;
    
    @Autowired
    private UserService usuarioService;
    
    @GetMapping("/")
    public String index(Model model)
    {
        String strNombre = "Jimmy A. Espinosa A.";
        String strCarrera = "Especialización en Desarrollo de Software";
        String strUN = "UNIMINUTO";
        String strProfe = "Prof: Ing. Ricardo Andrés Fonseca";
        log.info("Estoy ejecutando el controller Spring MVC.");
        
        //Iterable<User> Usuarios = usuarioDAO.findAll();
        Iterable<User> Usuarios = usuarioService.ListUsers();
        
        /* INSERTA DATOS DE PRUEBA DE FORMA MANUAL
        
        User Usuario = new User();
        Usuario.setName("Jimmyco Espinosa");
        Usuario.setEmail("jimmycoespinosa@gmail.com");
        
        User Usuario2 = new User();
        Usuario2.setName("Jimmyco Espinosa");
        Usuario2.setEmail("jimmycoespinosa@gmail.com");
        
        // PRIMER OPCIÓN - CREACIÓN LISTADO
        List<User> Usuarios = new ArrayList();
        Usuarios.add(Usuario);
        Usuarios.add(Usuario2);
        
        // SEGUNDA OPCIÓN - CREACIÓN LISTADO
        List Usuarios = Arrays.asList(Usuario, Usuario2);
        model.addAttribute("user", Usuario);*/
        
        model.addAttribute("strTitle", strTitle);
        model.addAttribute("strNombre", strNombre);
        model.addAttribute("strCarrera", strCarrera);
        model.addAttribute("strUN", strUN);
        model.addAttribute("strProfe", strProfe);
        model.addAttribute("users", Usuarios);
        
      return "index";
    }
    
    @GetMapping("/anexar")
    public String anexar(Model model){
        model.addAttribute("users", new User());
        return "crear";
    }
    
    @PostMapping("/guardar")
    public String guardar(User usuario){
        usuarioService.SaveUser(usuario);
        return "redirect:/";
    }
    
    @GetMapping("/modificar/{id}")
    public String modificar(User usuario, Model model){
        User OldUser = usuarioService.SearchUser(usuario);
        model.addAttribute("users", OldUser);
        return "crear";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminar(User usuario, Model model){
        usuarioService.DeleteUser(usuario);
        return "redirect:/";
    }
}
