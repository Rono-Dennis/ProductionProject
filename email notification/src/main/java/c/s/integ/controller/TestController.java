package c.s.integ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import c.s.core.exception.ResourceNotFoundException;

import org.springframework.web.bind.annotation.CrossOrigin;

import c.s.integ.db.engine.model.AlertSettings;
import c.s.integ.db.engine.repository.AlertSettingsRepository;
import java.util.logging.Logger;
import java.security.Principal;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Controller
@RequestMapping(path="/test")
public class TestController {
    
  @Autowired
  AlertSettingsRepository alertsRepository;

  @GetMapping(path="/alerts/all")		
	public @ResponseBody Iterable<AlertSettings> getAllAlerts() {
		    return alertsRepository.findAll();
        }
            
  // @GetMapping("/whoami")
  // public String whoami(@AuthenticationPrincipal(expression="name") String name) {
  //   //in production i will be injecting a Domain User object @AuthenticatedUser SmartUser user
  //   //and makesure SmartUser implements Make your TutorialUser to implement org.springframework.security.core.userdetails.UserDetails
  //   return name;
  //   }


	//@CrossOrigin(origins = "http://localhost:8008")
  @GetMapping("/user/info")
  public Map<String, Object> getUserInfo(@AuthenticationPrincipal Jwt principal) {
      Map<String, String> map = new Hashtable<String, String>();
      map.put("user_name", principal.getClaimAsString("preferred_username"));
      //map.put("organization", principal.getClaimAsString("organization"));
      return Collections.unmodifiableMap(map);
      }

  

    @GetMapping(path = "/principal")
    public String customers(Principal principal, Model model){
        // addCustomers(); 
        // model.addAttribute("customers", customerDAO.findAll());
        //model.addAttribute("username", principal.getName());
        //return "customers";

        return principal.getName();
      }

  }