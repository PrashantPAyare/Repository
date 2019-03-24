package Repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import model.SaveData;

@Transactional
public interface UserRepository extends CrudRepository<SaveData, Integer>{

}
