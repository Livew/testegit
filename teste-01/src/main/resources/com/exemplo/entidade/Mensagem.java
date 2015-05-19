package com.exemplo.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="msgteste", schema="public")
public class Mensagem implements java.io.Serializable {

	@Column(name="\"msg\"")
	private String msg;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="\"id\"")
	private Integer id;

	

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}


//Leia mais em: Criando um Projeto Web com Hibernate e Eclipse Kepler http://www.devmedia.com.br/criando-um-projeto-web-com-hibernate-e-eclipse-kepler/29168#ixzz3aXX2KZwL
