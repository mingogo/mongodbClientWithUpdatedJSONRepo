package com.mteng.vo.updatedJSON.builder;

import com.mteng.beans.ObjectToJSON;
import com.mteng.vo.updatedJSON.MasterJSON;

public class JSONMasterBuilder {
	/**
	 * Build the master JSON. 
	 * @return Completed JSON, a regular POJO. 
	 */
	public Object resultingJSON(){

		MasterJSON masterJSON = new MasterJSON();
		EntityBuilder entityBuilder = new EntityBuilder();
		FinalRatingsBuilder finalRatingsBuilder  = new FinalRatingsBuilder();
		PeersBuilder peersBuilder = new PeersBuilder();
		ObjectToJSON objectToJSON = new ObjectToJSON();

		masterJSON.setEntity(entityBuilder.result());
		masterJSON.setFinalRatings(finalRatingsBuilder.result());
		masterJSON.setPeers(peersBuilder.result());

		/**
		 * Convert the MasterJsonObject to JSON
		 */
		String output = (String) objectToJSON.convertedJSON(masterJSON);
		return output;
	}
}
