package guru.springframework.springrestclientexamples.services;

import java.util.List;

import guru.springframework.api.domain.User;

/**
 * @author Juan Carlos - 2018/01/31
 *
 */
public interface ApiService {
	List<User> getUsers(Integer limit);
}
