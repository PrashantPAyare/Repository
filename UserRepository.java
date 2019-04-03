package Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import model.SaveData;


public interface UserRepository extends CrudRepository<SaveData, Integer>{

	void deleteByUsername(String username);
	
	List<SaveData> findAllByTeamName(String teamname);
}
