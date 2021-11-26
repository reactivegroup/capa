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
package group.rxcloud.capa.component.telemetry.log.agent;

import org.apache.logging.log4j.core.LogEvent;

/**
 * The capa log4j appender used in tests only.
 */
public class TestCapaLog4jAppender implements CapaLog4jAppenderAgent.CapaLog4jAppender {

    @Override
    public void appendLog(LogEvent event) {
        System.out.println("test log log4j and content is " + event.getMessage().getFormattedMessage());
    }
}