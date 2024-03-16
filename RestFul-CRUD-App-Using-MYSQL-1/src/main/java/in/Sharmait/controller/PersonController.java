package in.Sharmait.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Sharmait.binding.Person;
import in.Sharmait.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@PostMapping("/submit")
	public ResponseEntity<String> submit(@RequestBody Person person){
		String msg = personService.addAndUpdate(person);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	@GetMapping("/person")
	public ResponseEntity<List<Person>> getData(){
		List<Person> persons= personService.getPerson();
		return new ResponseEntity<List<Person>>(persons, HttpStatus.OK);
	}
	
	@PutMapping("/submit")
	public ResponseEntity<String> getPerson(@RequestBody Person person){
		String msg = personService.addAndUpdate(person);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deletePerson(@PathVariable Integer id){
		String msg = personService.deletePerson(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
}
