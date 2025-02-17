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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.JvmClasses

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.JvmClasses">API
 *      specification</a>
 */
@JsonpDeserializable
public class JvmClasses implements JsonpSerializable {
	@Nullable
	private final Long currentLoadedCount;

	@Nullable
	private final Long totalLoadedCount;

	@Nullable
	private final Long totalUnloadedCount;

	// ---------------------------------------------------------------------------------------------

	private JvmClasses(Builder builder) {

		this.currentLoadedCount = builder.currentLoadedCount;
		this.totalLoadedCount = builder.totalLoadedCount;
		this.totalUnloadedCount = builder.totalUnloadedCount;

	}

	public static JvmClasses of(Function<Builder, ObjectBuilder<JvmClasses>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code current_loaded_count}
	 */
	@Nullable
	public final Long currentLoadedCount() {
		return this.currentLoadedCount;
	}

	/**
	 * API name: {@code total_loaded_count}
	 */
	@Nullable
	public final Long totalLoadedCount() {
		return this.totalLoadedCount;
	}

	/**
	 * API name: {@code total_unloaded_count}
	 */
	@Nullable
	public final Long totalUnloadedCount() {
		return this.totalUnloadedCount;
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

		if (this.currentLoadedCount != null) {
			generator.writeKey("current_loaded_count");
			generator.write(this.currentLoadedCount);

		}
		if (this.totalLoadedCount != null) {
			generator.writeKey("total_loaded_count");
			generator.write(this.totalLoadedCount);

		}
		if (this.totalUnloadedCount != null) {
			generator.writeKey("total_unloaded_count");
			generator.write(this.totalUnloadedCount);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JvmClasses}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<JvmClasses> {
		@Nullable
		private Long currentLoadedCount;

		@Nullable
		private Long totalLoadedCount;

		@Nullable
		private Long totalUnloadedCount;

		/**
		 * API name: {@code current_loaded_count}
		 */
		public final Builder currentLoadedCount(@Nullable Long value) {
			this.currentLoadedCount = value;
			return this;
		}

		/**
		 * API name: {@code total_loaded_count}
		 */
		public final Builder totalLoadedCount(@Nullable Long value) {
			this.totalLoadedCount = value;
			return this;
		}

		/**
		 * API name: {@code total_unloaded_count}
		 */
		public final Builder totalUnloadedCount(@Nullable Long value) {
			this.totalUnloadedCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link JvmClasses}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JvmClasses build() {
			_checkSingleUse();

			return new JvmClasses(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JvmClasses}
	 */
	public static final JsonpDeserializer<JvmClasses> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JvmClasses::setupJvmClassesDeserializer);

	protected static void setupJvmClassesDeserializer(ObjectDeserializer<JvmClasses.Builder> op) {

		op.add(Builder::currentLoadedCount, JsonpDeserializer.longDeserializer(), "current_loaded_count");
		op.add(Builder::totalLoadedCount, JsonpDeserializer.longDeserializer(), "total_loaded_count");
		op.add(Builder::totalUnloadedCount, JsonpDeserializer.longDeserializer(), "total_unloaded_count");

	}

}
