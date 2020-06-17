package lucatic.grupo1.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Provincia{
	
	private static final long serialVersionUID = 6292177161988922695L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private short id;
	
	private String nombre;
	
	public Provincia() {
		
		super();
	}
	
	public Provincia (String nombre) {
		
		super();
		this.nombre = nombre;
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Provincia [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	

}
