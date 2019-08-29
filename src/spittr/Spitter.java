package spittr;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Email;


public class Spitter {

	private long id;
	@NotNull
    @Size(min=5,max=16)
	private String userName;
	@NotNull
    @Size(min=5,max=25)
	private String password;
	@NotNull
    @Size(min=2,max=30)
	private String firstName;
	@NotNull
    @Size(min=2,max=30)
	private String lastName;
	@NotNull
    @Email
	private String email;
	
	  public Spitter() {}
	  
	  public Spitter(String username, String password, String firstName, String lastName, String email) {
	    this(null, username, password, firstName, lastName, email);
	  }

	  public Spitter(Long id, String userName, String password, String firstName, String lastName, String email) {
	    this.id = id;
	    
	    this.userName = userName;
	    this.password = password;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.email = email;
	  }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	  
	 @Override
	  public boolean equals(Object that) {
	    return EqualsBuilder.reflectionEquals(this, that, "firstName", "lastName", "username", "password", "email");
	  }
	  
	  @Override
	  public int hashCode() {
	    return HashCodeBuilder.reflectionHashCode(this, "firstName", "lastName", "username", "password", "email");
	  }
	  
	  
}
