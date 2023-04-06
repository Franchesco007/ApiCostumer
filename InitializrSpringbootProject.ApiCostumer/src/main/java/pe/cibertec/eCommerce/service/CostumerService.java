/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.eCommerce.service;

import java.util.List;
import pe.cibertec.eCommerce.Entity.Costumer;


public interface CostumerService {
    public List<Costumer> FinAll ();
    public Costumer findById (Long id);
    
}
