/**
 * 
 */
package org.bottomhalf.ec.user.repository;

import org.bottomhalf.ec.user.modelDAO.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author rahman
 *
 */
@Transactional
public interface UsersRepository extends CrudRepository<Users, Integer>{

	@Query("SELECT us from Users us where us.userName =:userName")
	Users findByUserName(@Param("userName") String userName);

}
