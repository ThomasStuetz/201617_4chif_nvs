package at.htl.landwirtschaft.entity;

import at.htl.landwirtschaft.entity.enumeration.EreignisArt;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Ereignis implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Version
	private int version;

	private String description;

	@Enumerated(EnumType.STRING)
	private EreignisArt ereignisArt;

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH})
	private	Feld feld;

	public Ereignis() {
	}

	public Ereignis(String description, EreignisArt ereignisArt, Feld feld) {
		this.description = description;
		this.ereignisArt = ereignisArt;
		this.feld = feld;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EreignisArt getEreignisArt() {
		return ereignisArt;
	}

	public void setEreignisArt(EreignisArt ereignisArt) {
		this.ereignisArt = ereignisArt;
	}

	public Feld getFeld() {
		return feld;
	}

	public void setFeld(Feld feld) {
		this.feld = feld;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Ereignis)) {
			return false;
		}
		Ereignis other = (Ereignis) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (description != null && !description.trim().isEmpty())
			result += "description: " + description;
		return result;
	}



}