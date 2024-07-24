/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
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
package org.keycloak.representations.idm.authorization;

/**
 * @author <a href="mailto:yoshiyuki.tabata.jy@hitachi.com">Yoshiyuki Tabata</a>
 */
public class RegexPolicyRepresentation extends AbstractPolicyRepresentation {

    private String targetClaim;
    private String pattern;
    private boolean targetContextAttributes;

    @Override
    public String getType() {
        return "regex";
    }

    public String getTargetClaim() {
        return targetClaim;
    }

    public void setTargetClaim(String targetClaim) {
        this.targetClaim = targetClaim;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public boolean isTargetContextAttributes() {
        return targetContextAttributes;
    }

    public void setTargetContextAttributes(boolean targetContextAttributes) {
        this.targetContextAttributes = targetContextAttributes;
    }

}
