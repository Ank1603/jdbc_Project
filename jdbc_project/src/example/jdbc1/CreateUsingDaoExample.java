package example.jdbc1;

import example.jdbc.bean.Restaurant;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.RestaurantDao;

public class CreateUsingDaoExample {

	public static void main(String[] args) {
		DaoInterface<Restaurant, Integer> daoRef = new RestaurantDao();
		Restaurant rst = new Restaurant(106,"MainloadChina","chinese",5);
		Restaurant rst1 = new Restaurant(107,"Patilwada","Marathi",45);
		daoRef.create(rst);
		daoRef.create(rst1);
		
	}

}
