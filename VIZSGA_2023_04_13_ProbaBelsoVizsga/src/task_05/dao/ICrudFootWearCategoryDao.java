package task_05.dao;

import java.sql.ResultSet;
import java.util.List;

import task_05.model.FootWearCategory;

public interface ICrudFootWearCategoryDao {
	List<FootWearCategory> getAll();
	List<String> getAllNames();
	FootWearCategory getObjectFromRs(ResultSet rs);
}
