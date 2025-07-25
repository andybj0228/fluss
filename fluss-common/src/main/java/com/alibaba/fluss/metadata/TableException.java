/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.fluss.metadata;

import com.alibaba.fluss.annotation.PublicStable;

/**
 * General Exception for all errors during table handling.
 *
 * <p>This exception indicates that an internal error occurred or that a feature is not supported
 * yet. Usually, this exception does not indicate a fault of the user.
 *
 * @since 0.1
 */
@PublicStable
public class TableException extends RuntimeException {

    public TableException(String message, Throwable cause) {
        super(message, cause);
    }

    public TableException(String message) {
        super(message);
    }
}
