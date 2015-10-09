package org.nrg.xnat.utils;

import org.nrg.automation.runners.PathBasedScriptRunnerOutputAdapter;
import org.nrg.framework.exceptions.NrgServiceException;
import org.nrg.xnat.turbine.utils.ArcSpecManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuildDirScriptRunnerOutputAdapter extends PathBasedScriptRunnerOutputAdapter {
    public BuildDirScriptRunnerOutputAdapter() throws NrgServiceException {
        super(ArcSpecManager.GetInstance() != null ? ArcSpecManager.GetInstance().getGlobalBuildPath() : null);
        if (ArcSpecManager.GetInstance() == null) {
            _log.warn("The arc-spec manager was null, meaning that the build dir script runner output adapter has not been initialized with a path.");
        } else if (_log.isDebugEnabled()) {
            _log.debug("The build dir script runner output adapter was initialized with the path: " + ArcSpecManager.GetInstance().getGlobalBuildPath());
        }
    }
    private static final Logger _log = LoggerFactory.getLogger(BuildDirScriptRunnerOutputAdapter.class);
}
