package in.Sharmait.service;

import java.util.List;

import in.Sharmait.binding.Person;

public interface PersonService {
	public String addAndUpdate(Person person);
	public List<Person> getPerson();
	public String deletePerson(Integer personId);
}
