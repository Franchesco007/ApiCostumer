/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.eCommerce.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.eCommerce.Entity.Costumer;
import pe.cibertec.eCommerce.service.CostumerService;

@RestController
@RequestMapping("/api/costumer")
public class CostumerController {
    
    @Autowired
    private CostumerService costumerService;
    
    @GetMapping("/findAll")
    public List<Costumer> findAll(){
        return costumerService.FinAll();
    }
    
    @GetMapping("/findById/(id)")
    public Costumer findById (@PathVariable Long id){
        return costumerService.findById(id);
    }
}
