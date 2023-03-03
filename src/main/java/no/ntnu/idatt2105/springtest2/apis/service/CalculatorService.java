package no.ntnu.idatt2105.springtest2.apis.service;

import no.ntnu.idatt2105.springtest2.entities.Lead;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

  public double add(Lead lead){
    return lead.getFirstNumber() + lead.getSecondNumber();
  }

  public double subtract(Lead lead){
    return lead.getFirstNumber() - lead.getSecondNumber();
  }

  public double multiply(Lead lead){
    return lead.getFirstNumber() * lead.getSecondNumber();
  }

  public double divide(Lead lead){
    return lead.getFirstNumber() / lead.getSecondNumber();
  }



}
