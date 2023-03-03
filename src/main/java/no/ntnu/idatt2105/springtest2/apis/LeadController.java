package no.ntnu.idatt2105.springtest2.apis;

import no.ntnu.idatt2105.springtest2.entities.Lead;
import no.ntnu.idatt2105.springtest2.repositories.LeadRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/lead")
@RestController
public class LeadController {

  private LeadRepository leadRepository;

  public LeadController(LeadRepository leadRepository){
    this.leadRepository = leadRepository;
  }

  @GetMapping("/")
  public List<Lead> findAll(){
    return leadRepository.findAll();
  }

  @PutMapping("/insert")
  public String insertLead(Lead lead){

    switch (lead.getOperation()) {
      case "add":
        lead.setEquals(lead.getFirstNumber() + lead.getSecondNumber());
        break;
      case "subtract":
        lead.setEquals(lead.getFirstNumber() - lead.getSecondNumber());
        break;
      case "multiply":
        lead.setEquals(lead.getFirstNumber() * lead.getSecondNumber());
        break;
      case "divide":
        lead.setEquals( (double) lead.getFirstNumber() / (double) lead.getSecondNumber());
        break;
      default:
        return "Invalid operation string: " + lead.getOperation();
    }

    leadRepository.save(lead);

    return "SUCCESSFUL!";
  }

}
