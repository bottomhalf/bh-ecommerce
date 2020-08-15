/**
 * 
 */
package org.bottomhalf.ec.user.repository;

import org.bottomhalf.ec.user.modelDAO.UserAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author rahman
 *
 */
@Transactional
public interface UserAccountRepository extends CrudRepository<UserAccount, Integer> {

}
