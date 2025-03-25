package task_05.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import task_05.model.FootWear;
import task_05.utils.Database;

public class FootWearDao implements ICrudFootWearDao{
	private Connection con = new Database().createConnection();
	private ResultSet rs = null;
	private PreparedStatement pstmt = null; 
	
	@Override
	public List<FootWear> getAll() {
		List<FootWear> footwears = new ArrayList<FootWear>();
		String sql = "SELECT fw.id, fw.name, fw.manufacturer, fw.model, fw.size, fw.category_id,"
				+ " fw.net_price, fw.status, fwc.name FROM foot_wear as fw"
				+ " INNER JOIN foot_wear_category as fwc ON"
				+ " fw.category_id = fwc.id ORDER BY fw.id;"; 
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				footwears.add(getObjectFromRs(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return footwears;
	}

	@Override
	public FootWear getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FootWear getObjectFromRs(ResultSet rs) {
		FootWear obj = null;
		try {
			obj = new FootWear(
					rs.getInt("id"),
					rs.getString("name"),
					rs.getString("manufacturer"),
					rs.getString("model"),
					rs.getFloat("size"),
					rs.getInt("category_id"),
					rs.getInt("net_price"),
					rs.getBoolean("status")
			);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public void save(FootWear obj) {
		// TODO Auto-generated method stub
	}
}
