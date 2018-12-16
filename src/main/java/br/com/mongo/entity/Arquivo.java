/*
 * O método main usa o metodo SpringApplication.run() do SpringBoot para iniciar um aplicativo
 * O CommandLineRunner é uma interface que é usado para executar um codigo após o inicio do aplicativo.
 */
package br.com.mongo.entity;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
/**
 *   
 * @author: <a href="mailto:fabiano.freitas@gmail.com">Fabiano Freitas</a> 
 * github: fabianosf
 * 
 **/

//arquivo é onde armazeno as informacoes dos arquivos
//@Document é igual o @Table do JPA, porem utiliza-se @Document 
@Document(collection = "arquivo")
@Getter
public class Arquivo {
	
	@Id
	private String id;
	private String data;
	private String nome;
	private String conteudo;
	
	
	public Arquivo(String nome, String conteudo) {
		super();
		this.nome = nome;
		this.conteudo = conteudo;
		this.data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getConteudo() {
		return conteudo;
	}


	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
	

}
