package com.laborer.job.startup;

import java.util.Collection;

import com.laborer.job.LaborJob;

public interface LaborJobLoader {
	
	Collection<? extends LaborJob> loadLaborJobs();
}
