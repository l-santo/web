package ec.edu.itsqmet.web.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "bird-category")
public class WebDTO {
	@Id
	private Integer id;
	private String name;

}
