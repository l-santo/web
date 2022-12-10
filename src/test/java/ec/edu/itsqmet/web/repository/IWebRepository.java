package ec.edu.itsqmet.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.web.dto.WebDTO;

public interface IWebRepository extends JpaRepository<WebDTO, Integer>{

}
