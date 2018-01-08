/*
 * Copyright 2017 Hammock and its contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.hammock.test.cxf;

import javax.ws.rs.sse.Sse;
import javax.ws.rs.sse.SseEventSink;

public class SseEvent {
    final SseEventSink sink;
    final Sse sse;
    final String id;

    public SseEvent(SseEventSink sink, Sse sse, String id) {
        this.sink = sink;
        this.sse = sse;
        this.id = id;
    }
}