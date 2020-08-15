/**
 * 
 */
package org.bottomhalf.ec.user.serviceIMPL;

import java.util.List;

import org.bottomhalf.ec.user.modelDAO.Users;
import org.bottomhalf.ec.user.repository.UsersRepository;
import org.bottomhalf.ec.user.service.UsersIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author rahman
 *
 */
@Service
public class UsersService implements UsersIF, UserDetailsService{
	
	@Autowired
	UsersRepository usersRepository;

	@Override
	public Users saveUserDetail(Users user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Users> fetchAllUsers(){
		return (List<Users>) usersRepository.findAll();
	}

	public Users getUserByUserName(String userName) {
		return usersRepository.findByUserName(userName.toLowerCase().trim());
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Users user= usersRepository.findByUserName(userName.toLowerCase().trim());
		return UserPrincipal.create(user);
	}*/

}
