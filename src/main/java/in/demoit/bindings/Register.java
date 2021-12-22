package in.demoit.bindings;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="register_table")
public class Register {
	
	@Id
	@GeneratedValue
	private Integer rno;
	private String fname;
	private String lname;
	private String email;
	private Long phno;
}
