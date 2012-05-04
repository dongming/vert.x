/*
 * Copyright 2012 the original author or authors.
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
package org.vertx.java.core;

import org.vertx.java.core.eventbus.EventBusMXBean;
import org.vertx.java.core.http.HttpServerMXBean;
import org.vertx.java.core.net.NetServerMXBean;
import org.vertx.java.core.shareddata.SharedData;

/**
 * @author pidster
 *
 */
public interface VertxMXBean {

	  /**
	   * Create a TCP/SSL server
	   */
	  public abstract NetServerMXBean createNetServer();

	  /**
	   * Create an HTTP/HTTPS server
	   */
	  public abstract HttpServerMXBean createHttpServer();

	  /**
	   * The event bus
	   */
	  public abstract EventBusMXBean eventBus();

	  /**
	   * The shared data object
	   */
	  public abstract SharedData sharedData();

}
