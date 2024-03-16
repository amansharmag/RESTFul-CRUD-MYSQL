package in.Sharmait.binding;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PERSON_DATA")
public class Person {
	@Column(name = "person_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "person_name")
	private String name;
	@Column(name = "person_address")
	private String address;
	@Column(name = "person_company")
	private String companyName;
}
