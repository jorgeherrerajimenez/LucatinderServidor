package lucatic.grupo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lucatic.grupo1.model.Contacto;

public interface DAOContacto extends JpaRepository <Contacto, Long> {

}
