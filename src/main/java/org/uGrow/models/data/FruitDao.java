package org.uGrow.models.data;

import org.uGrow.models.Fruit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by LaunchCode
 */
@Repository
@Transactional
public interface FruitDao extends CrudRepository<Fruit, Integer> {
}