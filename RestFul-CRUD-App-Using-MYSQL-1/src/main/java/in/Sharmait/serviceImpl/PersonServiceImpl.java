package in.Sharmait.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import in.Sharmait.binding.Person;
import in.Sharmait.repo.PersonRepository;
import in.Sharmait.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	private PersonRepository repository;

	public PersonServiceImpl(PersonRepository repository) {
		this.repository = repository;
	}

	@Override
	public String addAndUpdate(Person person) {
		Integer personId = person.getId();
		Person save = repository.save(person);
		if (personId == null) {
			return "record inserted successfully...!!!";
		} else {
			return "record updated successfully...!!!";
		}
	}

	@Override
	public List<Person> getPerson() {
		List<Person> personList = repository.findAll();
		return personList;
	}

	@Override
	public String deletePerson(Integer personId) {
		repository.deleteById(personId);
		return "Person data is deleted from database";
	}

}
