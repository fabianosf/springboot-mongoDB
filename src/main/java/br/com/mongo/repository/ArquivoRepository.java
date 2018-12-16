/*
 * Criando uma interface extendendo MongoRepository e seus metodos
 */

package br.com.mongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.mongo.entity.Arquivo;
/*
 * O spring-data nos da uma interface MongoRepository que tem os metodos
 * findAll, save, insert e etc
 */
public interface ArquivoRepository extends MongoRepository<Arquivo, String>{

	 
}
