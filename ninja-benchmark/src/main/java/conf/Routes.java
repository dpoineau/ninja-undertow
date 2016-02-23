/*
 * Copyright 2015 joelauer.
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
package conf;

import ninja.Router;
import ninja.application.ApplicationRoutes;
import ninja.benchmark.controllers.BenchmarkController;

public class Routes implements ApplicationRoutes {
    
    @Override
    public void init(Router router) {
        //router.GET().route("/").with(BenchmarkController.class, "index");
        router.GET().route("/benchmark_params").with(BenchmarkController.class, "benchmark_params");
        router.POST().route("/benchmark_object").with(BenchmarkController.class, "benchmark_object");
    }
    
}
