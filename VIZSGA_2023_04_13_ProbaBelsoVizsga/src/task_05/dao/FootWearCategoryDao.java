package task_05.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import task_05.model.FootWearCategory;
import task_05.utils.Database;

public class FootWearCategoryDao implements ICrudFootWearCategoryDao {
	private Connection con = new Database().createConnection();
	private ResultSet rs = null;
	private PreparedStatement pstmt = null;
	
	@Override
	public List<FootWearCategory> getAll() {
		List<FootWearCategory> footWearCategories = new ArrayList<FootWearCategory>();
		String sql = "SELECT * FROM foot_wear_category;";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				footWearCategories.add(getObjectFromRs(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return footWearCategories;
	}

	@Override
	public List<String> getAllNames() {
		List<String> pcNames = new ArrayList<String>();
		String sql = "SELECT name FROM foot_wear_category;";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				pcNames.add(rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pcNames;
	}

	@Override
	public FootWearCategory getObjectFromRs(ResultSet rs) {
		FootWearCategory obj = null;
		try {
			obj = new FootWearCategory(
					rs.getInt("id"),
					rs.getString("name")
					);
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return obj;
	}
}
