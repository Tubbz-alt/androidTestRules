/*
 * Copyright 2015 Shazam Entertainment Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.shazam.android.test.conditions;

/**
 * A condition which will cause a test method or class to be ignored when satisfied.
 */
public interface Condition {

    /**
     * Checks whether a condition is satisfied.
     * @return true - the validity of a condition
     */
    boolean isSatisfied();
}
