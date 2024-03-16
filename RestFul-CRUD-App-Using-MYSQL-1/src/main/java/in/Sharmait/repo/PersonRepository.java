package in.Sharmait.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Sharmait.binding.Person;

public interface PersonRepository extends JpaRepository<Person, Serializable>{

}
