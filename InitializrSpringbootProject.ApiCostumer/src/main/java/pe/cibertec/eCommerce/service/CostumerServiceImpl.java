/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.eCommerce.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.eCommerce.Dao.CostumerRepository;
import pe.cibertec.eCommerce.Entity.Costumer;


@Service
public class CostumerServiceImpl implements CostumerService{

    @Autowired
    private CostumerRepository costumerRepository;
    
    @Override
    public List<Costumer> FinAll() {
        return (List<Costumer>) costumerRepository.findAll();
    }

    @Override
    public Costumer findById(Long id) {
        return costumerRepository.findById(id).orElse(null);
    }
    
    
    
}
