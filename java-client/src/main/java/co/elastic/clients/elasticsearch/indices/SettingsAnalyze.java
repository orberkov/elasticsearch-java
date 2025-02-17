/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.SettingsAnalyze

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.SettingsAnalyze">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsAnalyze implements JsonpSerializable {
	@Nullable
	private final Integer maxTokenCount;

	// ---------------------------------------------------------------------------------------------

	private SettingsAnalyze(Builder builder) {

		this.maxTokenCount = builder.maxTokenCount;

	}

	public static SettingsAnalyze of(Function<Builder, ObjectBuilder<SettingsAnalyze>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code max_token_count}
	 */
	@Nullable
	public final Integer maxTokenCount() {
		return this.maxTokenCount;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.maxTokenCount != null) {
			generator.writeKey("max_token_count");
			generator.write(this.maxTokenCount);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SettingsAnalyze}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SettingsAnalyze> {
		@Nullable
		private Integer maxTokenCount;

		/**
		 * API name: {@code max_token_count}
		 */
		public final Builder maxTokenCount(@Nullable Integer value) {
			this.maxTokenCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SettingsAnalyze}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SettingsAnalyze build() {
			_checkSingleUse();

			return new SettingsAnalyze(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SettingsAnalyze}
	 */
	public static final JsonpDeserializer<SettingsAnalyze> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SettingsAnalyze::setupSettingsAnalyzeDeserializer);

	protected static void setupSettingsAnalyzeDeserializer(ObjectDeserializer<SettingsAnalyze.Builder> op) {

		op.add(Builder::maxTokenCount, JsonpDeserializer.integerDeserializer(), "max_token_count");

	}

}
