/*
 * Copyright 2012 Bruno de Carvalho
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.biasedbit.http.event;

import com.biasedbit.http.HttpRequestContext;

/**
 * Event generated when a new execution request is issued.
 *
 * @author <a href="http://biasedbit.com/">Bruno de Carvalho</a>
 */
public class ExecuteRequestEvent
        implements HttpClientEvent {

    // internal vars --------------------------------------------------------------------------------------------------

    private final HttpRequestContext context;

    // constructors ---------------------------------------------------------------------------------------------------

    public ExecuteRequestEvent(HttpRequestContext context) {
        this.context = context;
    }

    // HttpClientEvent ------------------------------------------------------------------------------------------------

    @Override
    public EventType getEventType() {
        return EventType.EXECUTE_REQUEST;
    }

    // getters & setters ----------------------------------------------------------------------------------------------

    public HttpRequestContext getContext() {
        return this.context;
    }

    // object overrides -----------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return new StringBuilder().append("ExecuteRequestEvent{").append(this.context).append('}').toString();
    }
}
