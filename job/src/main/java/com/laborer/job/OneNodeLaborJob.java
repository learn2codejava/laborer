package com.laborer.job;

import com.laborer.job.node.LaborJobNodeSelectionCriteria;

public interface OneNodeLaborJob extends LaborJob {
	public LaborJobNodeSelectionCriteria getLaborJobNodeSelectionCriteria();
}
