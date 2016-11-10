package com.oracle.test;

import org.mybatis.generator.ant.GeneratorAntTask;

public class GenOracleMain {
	
	public static void main(String[] args) {
	    try {
	      GeneratorAntTask task = new GeneratorAntTask();
	      String genCfg = "F://cpp/Myeclipse2015cpp/MybatisGenerators/src/mbgConfigurationoracle.xml";
	      task.setConfigfile(genCfg);  //锛堥厤缃枃浠跺叿浣損ath锛�
	      task.execute();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }

}
