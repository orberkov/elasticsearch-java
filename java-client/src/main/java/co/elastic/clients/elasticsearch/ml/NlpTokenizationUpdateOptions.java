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

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml._types.NlpTokenizationUpdateOptions

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.NlpTokenizationUpdateOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class NlpTokenizationUpdateOptions implements JsonpSerializable {
	@Nullable
	private final TokenizationTruncate truncate;

	@Nullable
	private final Integer span;

	// ---------------------------------------------------------------------------------------------

	private NlpTokenizationUpdateOptions(Builder builder) {

		this.truncate = builder.truncate;
		this.span = builder.span;

	}

	public static NlpTokenizationUpdateOptions of(Function<Builder, ObjectBuilder<NlpTokenizationUpdateOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Truncate options to apply
	 * <p>
	 * API name: {@code truncate}
	 */
	@Nullable
	public final TokenizationTruncate truncate() {
		return this.truncate;
	}

	/**
	 * Span options to apply
	 * <p>
	 * API name: {@code span}
	 */
	@Nullable
	public final Integer span() {
		return this.span;
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

		if (this.truncate != null) {
			generator.writeKey("truncate");
			this.truncate.serialize(generator, mapper);
		}
		if (this.span != null) {
			generator.writeKey("span");
			generator.write(this.span);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NlpTokenizationUpdateOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NlpTokenizationUpdateOptions> {
		@Nullable
		private TokenizationTruncate truncate;

		@Nullable
		private Integer span;

		/**
		 * Truncate options to apply
		 * <p>
		 * API name: {@code truncate}
		 */
		public final Builder truncate(@Nullable TokenizationTruncate value) {
			this.truncate = value;
			return this;
		}

		/**
		 * Span options to apply
		 * <p>
		 * API name: {@code span}
		 */
		public final Builder span(@Nullable Integer value) {
			this.span = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NlpTokenizationUpdateOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NlpTokenizationUpdateOptions build() {
			_checkSingleUse();

			return new NlpTokenizationUpdateOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NlpTokenizationUpdateOptions}
	 */
	public static final JsonpDeserializer<NlpTokenizationUpdateOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NlpTokenizationUpdateOptions::setupNlpTokenizationUpdateOptionsDeserializer);

	protected static void setupNlpTokenizationUpdateOptionsDeserializer(
			ObjectDeserializer<NlpTokenizationUpdateOptions.Builder> op) {

		op.add(Builder::truncate, TokenizationTruncate._DESERIALIZER, "truncate");
		op.add(Builder::span, JsonpDeserializer.integerDeserializer(), "span");

	}

}
