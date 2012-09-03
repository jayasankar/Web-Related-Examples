
package com.jverstry.Service;

import com.jverstry.DAO.MyPersistenceDAO;
import com.jverstry.Item.MilliTimeItem;
import org.springframework.beans.factory.annotation.Autowired;

public class MyServiceImpl implements MyService {

	@Autowired
    private MyPersistenceDAO myDAO;	

	@Override
	public MilliTimeItem createAndRetrieve() {
		
		long id = myDAO.createMilliTimeItem();
		System.out.println("Milli time id = " + id);
		
		return myDAO.getMilliTimeItem(id);
		
	}
	
}
