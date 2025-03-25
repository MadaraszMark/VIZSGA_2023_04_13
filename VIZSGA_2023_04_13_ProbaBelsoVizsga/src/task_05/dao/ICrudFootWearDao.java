package task_05.dao;

import java.sql.ResultSet;
import java.util.List;

import task_05.model.FootWear;

public interface ICrudFootWearDao {
	List<FootWear> getAll();
	FootWear getById(int id);
	FootWear getObjectFromRs(ResultSet rs);
	void save(FootWear obj);
}
