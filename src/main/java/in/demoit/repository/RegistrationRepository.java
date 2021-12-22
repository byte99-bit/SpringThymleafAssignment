package in.demoit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.demoit.bindings.Register;

public interface RegistrationRepository extends JpaRepository<Register, Serializable> {

}
