package com.mteng.vo.updatedJSON.builder;

import com.mteng.vo.updatedJSON.MasterJSON;

public class JSONMasterBuilder {
	/**
	 * Build the master JSON. 
	 * @return Completed JSON, a regular POJO. 
	 */
	public Object resultingJSON_(){

		MasterJSON masterJSON = new MasterJSON();
		EntityBuilder entityBuilder = new EntityBuilder();
		FinalRatingsBuilder finalRatingsBuilder  = new FinalRatingsBuilder();
		PeersBuilder peersBuilder = new PeersBuilder();

		masterJSON.setEntity(entityBuilder.result());
		masterJSON.setFinalRatings(finalRatingsBuilder.result());
		masterJSON.setPeers(peersBuilder.result());

		return masterJSON;
	}
}
