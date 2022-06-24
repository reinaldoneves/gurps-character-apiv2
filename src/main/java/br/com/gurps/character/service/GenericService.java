package br.com.gurps.character.service;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * A generic service to be used in all services of our applications
 * todo: maybe we could use javax.persistence.Entity ?
 * @param <Entity> the entity to be returned
 * @param <Repository> the entityRepository to be used
 * @param <Parameter> the parameter to be used by the get methods
 * @author reinaldo_neves@hotmail.com
 * */
public interface GenericService<Entity, Repository extends JpaRepository, Parameter> {

    /**
     * Returns the entity based on the given id
     **/
    Entity getEntityById(Long id);

    /**
     * Returns the entity based on the given parameter
     **/
    Entity getEntityByParameter(Parameter parameter);

    /***
     * Retrieve the {@link List <Entity>} of all entities
     */
    List<Entity> getAllEntities();

    /***
     * Retrieve the {@link List <Entity>} of all entities bye the parameter
     */
    List<Entity> getAllEntitiesByParameter(Parameter parameter);

    /***
     * The creation of a new entity
     * @param newEntity
     * @return Entity newEntity itself
     */
    Entity createEntity(Entity newEntity);

    /***
     * Update the character
     * @param entityUpdated
     */
    Entity updateCharacter(Entity entityUpdated);


}
