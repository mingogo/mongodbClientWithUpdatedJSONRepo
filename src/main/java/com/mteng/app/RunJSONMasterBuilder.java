package com.mteng.app;

import com.mteng.beans.PrettyPrints;
import com.mteng.vo.updatedJSON.builder.JSONMasterBuilder;

public class RunJSONMasterBuilder {
	public static void main(String[] args) {

		PrettyPrints prettyPrints = new PrettyPrints();

		JSONMasterBuilder JSONMaster = new JSONMasterBuilder();

		String Indentedoutput = prettyPrints.resultingJson(JSONMaster.resultingJSON());
		System.out.println(Indentedoutput);
	}
}
