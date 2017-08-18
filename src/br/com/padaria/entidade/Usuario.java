package br.com.padaria.entidade;



import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Usuario {
	        
	        @Id
	        @GeneratedValue(strategy=GenerationType.IDENTITY)
	        private int id;
	        
	       
	        private String user;
	        
	        
	        private String pass;

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getUser() {
				return user;
			}

			public void setUser(String user) {
				this.user = user;
			}

			public String getPass() {
				return pass;
			}

			public void setPass(String pass) {
				this.pass = pass;
			}

			public Serializable getCodigoUsuario() {
				// TODO Auto-generated method stub
				return null;
			}
	   
	        

		
	        

}
