/*
 * Copyright 2000-2021 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jetbrains.buildServer.deployer.agent.cargo;

import jetbrains.buildServer.agent.AgentBuildRunnerInfo;
import jetbrains.buildServer.agent.BuildAgentConfiguration;
import jetbrains.buildServer.deployer.common.DeployerRunnerConstants;
import org.jetbrains.annotations.NotNull;


class CargoDeployerRunnerInfo implements AgentBuildRunnerInfo {

  @NotNull
  @Override
  public String getType() {
    return DeployerRunnerConstants.CARGO_RUN_TYPE;
  }

  @Override
  public boolean canRun(@NotNull BuildAgentConfiguration agentConfiguration) {
    return true;
  }
}
