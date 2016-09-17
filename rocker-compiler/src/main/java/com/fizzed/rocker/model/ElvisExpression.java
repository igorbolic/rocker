/*
 * Copyright 2015 Fizzed Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fizzed.rocker.model;

/**
 * Model for @?(var : fallback)
 */
public class ElvisExpression extends TemplateUnit implements NullSafety {
    
    private final String leftExpression;
    private final String rightExpression;
    private final boolean nullSafe;
    
    public ElvisExpression(SourceRef sourceRef, String leftExpression, String rightExpression, boolean nullSafe) {
        super(sourceRef);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.nullSafe = nullSafe;
    }

    public String getLeftExpression() {
        return leftExpression;
    }

    public String getRightExpression() {
        return rightExpression;
    }
    
    @Override
    public boolean isNullSafe() {
        return this.nullSafe;
    }
    
}
