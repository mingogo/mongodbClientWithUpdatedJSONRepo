package com.mteng.app;

import com.mteng.json.vb.MasterJsonObjectBuilder;
import com.mteng.mongodb.dao.MongodbDAO;

public class AddDocuments {

	public static void main(String[] args){
		MongodbDAO mongodbDAO = new MongodbDAO();
		MasterJsonObjectBuilder masterJsonObjectBuilder = new MasterJsonObjectBuilder();

		/**
		 * Add the JSON composed by MasterJsonObjectBuilder according to Katherine's JSON.  
		 */
		mongodbDAO.addData(masterJsonObjectBuilder.resultingJSON());
		mongodbDAO.documentsCounter();
	};
}
