// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CBPPJAIEOKC.proto

public final class CBPPJAIEOKCOuterClass {
  private CBPPJAIEOKCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CBPPJAIEOKCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CBPPJAIEOKC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AnimatorParameterValueInfoPair value = 2;</code>
     * @return Whether the value field is set.
     */
    boolean hasValue();
    /**
     * <code>.AnimatorParameterValueInfoPair value = 2;</code>
     * @return The value.
     */
    AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair getValue();
    /**
     * <code>.AnimatorParameterValueInfoPair value = 2;</code>
     */
    AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder getValueOrBuilder();
  }
  /**
   * Protobuf type {@code CBPPJAIEOKC}
   */
  public static final class CBPPJAIEOKC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CBPPJAIEOKC)
      CBPPJAIEOKCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CBPPJAIEOKC.newBuilder() to construct.
    private CBPPJAIEOKC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CBPPJAIEOKC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CBPPJAIEOKC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CBPPJAIEOKC(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 18: {
              AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder subBuilder = null;
              if (value_ != null) {
                subBuilder = value_.toBuilder();
              }
              value_ = input.readMessage(AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(value_);
                value_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CBPPJAIEOKCOuterClass.internal_static_CBPPJAIEOKC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CBPPJAIEOKCOuterClass.internal_static_CBPPJAIEOKC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CBPPJAIEOKCOuterClass.CBPPJAIEOKC.class, CBPPJAIEOKCOuterClass.CBPPJAIEOKC.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair value_;
    /**
     * <code>.AnimatorParameterValueInfoPair value = 2;</code>
     * @return Whether the value field is set.
     */
    @java.lang.Override
    public boolean hasValue() {
      return value_ != null;
    }
    /**
     * <code>.AnimatorParameterValueInfoPair value = 2;</code>
     * @return The value.
     */
    @java.lang.Override
    public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair getValue() {
      return value_ == null ? AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.getDefaultInstance() : value_;
    }
    /**
     * <code>.AnimatorParameterValueInfoPair value = 2;</code>
     */
    @java.lang.Override
    public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder getValueOrBuilder() {
      return getValue();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (value_ != null) {
        output.writeMessage(2, getValue());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getValue());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof CBPPJAIEOKCOuterClass.CBPPJAIEOKC)) {
        return super.equals(obj);
      }
      CBPPJAIEOKCOuterClass.CBPPJAIEOKC other = (CBPPJAIEOKCOuterClass.CBPPJAIEOKC) obj;

      if (hasValue() != other.hasValue()) return false;
      if (hasValue()) {
        if (!getValue()
            .equals(other.getValue())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasValue()) {
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static CBPPJAIEOKCOuterClass.CBPPJAIEOKC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CBPPJAIEOKCOuterClass.CBPPJAIEOKC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CBPPJAIEOKCOuterClass.CBPPJAIEOKC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CBPPJAIEOKCOuterClass.CBPPJAIEOKC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CBPPJAIEOKCOuterClass.CBPPJAIEOKC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CBPPJAIEOKCOuterClass.CBPPJAIEOKC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CBPPJAIEOKCOuterClass.CBPPJAIEOKC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CBPPJAIEOKCOuterClass.CBPPJAIEOKC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static CBPPJAIEOKCOuterClass.CBPPJAIEOKC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static CBPPJAIEOKCOuterClass.CBPPJAIEOKC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static CBPPJAIEOKCOuterClass.CBPPJAIEOKC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CBPPJAIEOKCOuterClass.CBPPJAIEOKC parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(CBPPJAIEOKCOuterClass.CBPPJAIEOKC prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CBPPJAIEOKC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CBPPJAIEOKC)
        CBPPJAIEOKCOuterClass.CBPPJAIEOKCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CBPPJAIEOKCOuterClass.internal_static_CBPPJAIEOKC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CBPPJAIEOKCOuterClass.internal_static_CBPPJAIEOKC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CBPPJAIEOKCOuterClass.CBPPJAIEOKC.class, CBPPJAIEOKCOuterClass.CBPPJAIEOKC.Builder.class);
      }

      // Construct using CBPPJAIEOKCOuterClass.CBPPJAIEOKC.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (valueBuilder_ == null) {
          value_ = null;
        } else {
          value_ = null;
          valueBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CBPPJAIEOKCOuterClass.internal_static_CBPPJAIEOKC_descriptor;
      }

      @java.lang.Override
      public CBPPJAIEOKCOuterClass.CBPPJAIEOKC getDefaultInstanceForType() {
        return CBPPJAIEOKCOuterClass.CBPPJAIEOKC.getDefaultInstance();
      }

      @java.lang.Override
      public CBPPJAIEOKCOuterClass.CBPPJAIEOKC build() {
        CBPPJAIEOKCOuterClass.CBPPJAIEOKC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public CBPPJAIEOKCOuterClass.CBPPJAIEOKC buildPartial() {
        CBPPJAIEOKCOuterClass.CBPPJAIEOKC result = new CBPPJAIEOKCOuterClass.CBPPJAIEOKC(this);
        if (valueBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = valueBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof CBPPJAIEOKCOuterClass.CBPPJAIEOKC) {
          return mergeFrom((CBPPJAIEOKCOuterClass.CBPPJAIEOKC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CBPPJAIEOKCOuterClass.CBPPJAIEOKC other) {
        if (other == CBPPJAIEOKCOuterClass.CBPPJAIEOKC.getDefaultInstance()) return this;
        if (other.hasValue()) {
          mergeValue(other.getValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        CBPPJAIEOKCOuterClass.CBPPJAIEOKC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CBPPJAIEOKCOuterClass.CBPPJAIEOKC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair value_;
      private com.google.protobuf.SingleFieldBuilderV3<
          AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder> valueBuilder_;
      /**
       * <code>.AnimatorParameterValueInfoPair value = 2;</code>
       * @return Whether the value field is set.
       */
      public boolean hasValue() {
        return valueBuilder_ != null || value_ != null;
      }
      /**
       * <code>.AnimatorParameterValueInfoPair value = 2;</code>
       * @return The value.
       */
      public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair getValue() {
        if (valueBuilder_ == null) {
          return value_ == null ? AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.getDefaultInstance() : value_;
        } else {
          return valueBuilder_.getMessage();
        }
      }
      /**
       * <code>.AnimatorParameterValueInfoPair value = 2;</code>
       */
      public Builder setValue(AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair value) {
        if (valueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          value_ = value;
          onChanged();
        } else {
          valueBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AnimatorParameterValueInfoPair value = 2;</code>
       */
      public Builder setValue(
          AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder builderForValue) {
        if (valueBuilder_ == null) {
          value_ = builderForValue.build();
          onChanged();
        } else {
          valueBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AnimatorParameterValueInfoPair value = 2;</code>
       */
      public Builder mergeValue(AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair value) {
        if (valueBuilder_ == null) {
          if (value_ != null) {
            value_ =
              AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.newBuilder(value_).mergeFrom(value).buildPartial();
          } else {
            value_ = value;
          }
          onChanged();
        } else {
          valueBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AnimatorParameterValueInfoPair value = 2;</code>
       */
      public Builder clearValue() {
        if (valueBuilder_ == null) {
          value_ = null;
          onChanged();
        } else {
          value_ = null;
          valueBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AnimatorParameterValueInfoPair value = 2;</code>
       */
      public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder getValueBuilder() {
        
        onChanged();
        return getValueFieldBuilder().getBuilder();
      }
      /**
       * <code>.AnimatorParameterValueInfoPair value = 2;</code>
       */
      public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder getValueOrBuilder() {
        if (valueBuilder_ != null) {
          return valueBuilder_.getMessageOrBuilder();
        } else {
          return value_ == null ?
              AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.getDefaultInstance() : value_;
        }
      }
      /**
       * <code>.AnimatorParameterValueInfoPair value = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder> 
          getValueFieldBuilder() {
        if (valueBuilder_ == null) {
          valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder>(
                  getValue(),
                  getParentForChildren(),
                  isClean());
          value_ = null;
        }
        return valueBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CBPPJAIEOKC)
    }

    // @@protoc_insertion_point(class_scope:CBPPJAIEOKC)
    private static final CBPPJAIEOKCOuterClass.CBPPJAIEOKC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new CBPPJAIEOKCOuterClass.CBPPJAIEOKC();
    }

    public static CBPPJAIEOKCOuterClass.CBPPJAIEOKC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CBPPJAIEOKC>
        PARSER = new com.google.protobuf.AbstractParser<CBPPJAIEOKC>() {
      @java.lang.Override
      public CBPPJAIEOKC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CBPPJAIEOKC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CBPPJAIEOKC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CBPPJAIEOKC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public CBPPJAIEOKCOuterClass.CBPPJAIEOKC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CBPPJAIEOKC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CBPPJAIEOKC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CBPPJAIEOKC.proto\032$AnimatorParameterVa" +
      "lueInfoPair.proto\"=\n\013CBPPJAIEOKC\022.\n\005valu" +
      "e\030\002 \001(\0132\037.AnimatorParameterValueInfoPair" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          AnimatorParameterValueInfoPairOuterClass.getDescriptor(),
        });
    internal_static_CBPPJAIEOKC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CBPPJAIEOKC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CBPPJAIEOKC_descriptor,
        new java.lang.String[] { "Value", });
    AnimatorParameterValueInfoPairOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
