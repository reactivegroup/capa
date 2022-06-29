/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package group.rxcloud.capa.infrastructure.exceptions;


import group.rxcloud.vrml.error.code.ErrorCodeContext;
import group.rxcloud.vrml.error.exception.ErrorCodeException;

/**
 * A Capa's specific exception.
 */
public class CapaException extends ErrorCodeException {

    /**
     * Instantiates a new Capa exception.
     *
     * @param errorCodeContext the error code context
     */
    public CapaException(ErrorCodeContext errorCodeContext) {
        super(errorCodeContext);
    }

    /**
     * Instantiates a new Capa exception.
     *
     * @param errorCodeContext the error code context
     * @param cause            the cause
     */
    public CapaException(ErrorCodeContext errorCodeContext, Throwable cause) {
        super(errorCodeContext, cause);
    }

    /**
     * Instantiates a new Capa exception.
     *
     * @param errorCodeContext the error code context
     * @param errorMessage     the error message
     */
    public CapaException(ErrorCodeContext errorCodeContext, String errorMessage) {
        super(errorCodeContext, errorMessage);
    }

    /**
     * Instantiates a new Capa exception.
     *
     * @param errorCodeContext the error code context
     * @param errorMessage     the error message
     * @param cause            the cause
     */
    public CapaException(ErrorCodeContext errorCodeContext, String errorMessage, Throwable cause) {
        super(errorCodeContext, errorMessage, cause);
    }

    /**
     * Instantiates a new Capa exception.
     *
     * @param exception the exception
     */
    public CapaException(Throwable exception) {
        super(CapaErrorContext.SYSTEM_ERROR, exception);
    }
}
