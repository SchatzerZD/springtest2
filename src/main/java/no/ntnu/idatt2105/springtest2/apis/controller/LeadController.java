package no.ntnu.idatt2105.springtest2.apis.controller;

import no.ntnu.idatt2105.springtest2.apis.service.CalculatorService;
import no.ntnu.idatt2105.springtest2.entities.Lead;
import no.ntnu.idatt2105.springtest2.repositories.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/lead")
@RestController
@CrossOrigin("*")
public class LeadController {

  private LeadRepository leadRepository;

  @Autowired
  private CalculatorService calculatorService;

  public LeadController(LeadRepository leadRepository){
    this.leadRepository = leadRepository;
  }

  @GetMapping("/")
  public List<Lead> findAll(){
    return leadRepository.findAll();
  }

  @PutMapping("/insert")
  public double insertLead(Lead lead){

    switch (lead.getOperation()) {
      case "add":
        lead.setEquals(calculatorService.add(lead));
        break;
      case "subtract":
        lead.setEquals(calculatorService.subtract(lead));
        break;
      case "multiply":
        lead.setEquals(calculatorService.multiply(lead));
        break;
      case "divide":
        lead.setEquals(calculatorService.divide(lead));
        break;
      default:
        return -1;
    }

    leadRepository.save(lead);

    return lead.getEquals();
  }

}
