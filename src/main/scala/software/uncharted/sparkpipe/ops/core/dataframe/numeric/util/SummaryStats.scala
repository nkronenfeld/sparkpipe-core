/*
 * Copyright 2015 Uncharted Software Inc.
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

package software.uncharted.sparkpipe.ops.core.dataframe.numeric.util

/**
 * A simple struct to represent summary statistics for a DataFrame column as returned
 * by `ops.core.dataframe.numeric.summaryStats()`
 */
case class SummaryStats(
  name: String,
  count: Long,
  min: Double,
  mean: Double,
  max: Double,
  normL1: Double,
  normL2: Double,
  variance: Double,
  numNonzeros: Double
)