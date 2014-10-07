package com.mteng.app;

import com.mteng.beans.ObjectToJSON;
import com.mteng.beans.PrettyPrints;
import com.mteng.vo.updatedJSON.builder.JSONMasterBuilder_AllInOne;
import com.mteng.vo.updatedJSON.builder.JSONMasterBuilder;

public class RunJSONMasterBuilder {
	public static void main(String[] args) {

		PrettyPrints prettyPrints = new PrettyPrints();
		ObjectToJSON objectToJSON = new ObjectToJSON();

		JSONMasterBuilder JSONMaster = new JSONMasterBuilder();
		String output = (String) objectToJSON.convertedJSON(JSONMaster.resultingJSON_());

		String Indentedoutput = (String) prettyPrints.resultingJson(output);
		System.out.println(Indentedoutput);
	}
}
