package uk.ac.ox.cs.pagoda.rules;

import uk.ac.ox.cs.pagoda.rules.approximators.OverApproxExist;

public class DisjunctiveProgram extends UpperProgram {

	@Override
	protected void initApproximator() {
		m_approx = new OverApproxExist();
	}
	
//	@Override
//	public String getDirectory() {
//		File dir = new File(ontologyDirectory + Utility.FILE_SEPARATOR + "disjunctiveRules");
//		if (!dir.exists())
//			dir.mkdirs();
//		return dir.getPath(); 
//	}
	
}
