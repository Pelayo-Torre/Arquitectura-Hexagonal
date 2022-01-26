package springboot.servicio.hexagonal.application.domain;

public class User {
	
	private Long Id;
	private String name;
	private String surname;
	private String mail;
	private String nif;
	
	public User(String name, String surname, String mail, String nif) {
		super();
		this.name = name;
		this.surname = surname;
		this.mail = mail;
		this.nif = nif;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public Long getId() {
		return Id;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", surname=" + surname + ", mail=" + mail + ", nif=" + nif + "]";
	}

	

}
