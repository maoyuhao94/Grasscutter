// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PropPair.proto

public final class PropPairOuterClass {
  private PropPairOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PropPairOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PropPair)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 type = 1;</code>
     * @return The type.
     */
    int getType();

    /**
     * <code>.PropValue propValue = 2;</code>
     * @return Whether the propValue field is set.
     */
    boolean hasPropValue();
    /**
     * <code>.PropValue propValue = 2;</code>
     * @return The propValue.
     */
    PropValueOuterClass.PropValue getPropValue();
    /**
     * <code>.PropValue propValue = 2;</code>
     */
    PropValueOuterClass.PropValueOrBuilder getPropValueOrBuilder();
  }
  /**
   * Protobuf type {@code PropPair}
   */
  public static final class PropPair extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PropPair)
      PropPairOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PropPair.newBuilder() to construct.
    private PropPair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PropPair() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PropPair();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PropPair(
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
            case 8: {

              type_ = input.readUInt32();
              break;
            }
            case 18: {
              PropValueOuterClass.PropValue.Builder subBuilder = null;
              if (propValue_ != null) {
                subBuilder = propValue_.toBuilder();
              }
              propValue_ = input.readMessage(PropValueOuterClass.PropValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(propValue_);
                propValue_ = subBuilder.buildPartial();
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
      return PropPairOuterClass.internal_static_PropPair_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PropPairOuterClass.internal_static_PropPair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PropPairOuterClass.PropPair.class, PropPairOuterClass.PropPair.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>uint32 type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }

    public static final int PROPVALUE_FIELD_NUMBER = 2;
    private PropValueOuterClass.PropValue propValue_;
    /**
     * <code>.PropValue propValue = 2;</code>
     * @return Whether the propValue field is set.
     */
    @java.lang.Override
    public boolean hasPropValue() {
      return propValue_ != null;
    }
    /**
     * <code>.PropValue propValue = 2;</code>
     * @return The propValue.
     */
    @java.lang.Override
    public PropValueOuterClass.PropValue getPropValue() {
      return propValue_ == null ? PropValueOuterClass.PropValue.getDefaultInstance() : propValue_;
    }
    /**
     * <code>.PropValue propValue = 2;</code>
     */
    @java.lang.Override
    public PropValueOuterClass.PropValueOrBuilder getPropValueOrBuilder() {
      return getPropValue();
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
      if (type_ != 0) {
        output.writeUInt32(1, type_);
      }
      if (propValue_ != null) {
        output.writeMessage(2, getPropValue());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, type_);
      }
      if (propValue_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getPropValue());
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
      if (!(obj instanceof PropPairOuterClass.PropPair)) {
        return super.equals(obj);
      }
      PropPairOuterClass.PropPair other = (PropPairOuterClass.PropPair) obj;

      if (getType()
          != other.getType()) return false;
      if (hasPropValue() != other.hasPropValue()) return false;
      if (hasPropValue()) {
        if (!getPropValue()
            .equals(other.getPropValue())) return false;
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      if (hasPropValue()) {
        hash = (37 * hash) + PROPVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getPropValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static PropPairOuterClass.PropPair parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PropPairOuterClass.PropPair parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PropPairOuterClass.PropPair parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PropPairOuterClass.PropPair parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PropPairOuterClass.PropPair parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PropPairOuterClass.PropPair parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PropPairOuterClass.PropPair parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PropPairOuterClass.PropPair parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static PropPairOuterClass.PropPair parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static PropPairOuterClass.PropPair parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static PropPairOuterClass.PropPair parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PropPairOuterClass.PropPair parseFrom(
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
    public static Builder newBuilder(PropPairOuterClass.PropPair prototype) {
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
     * Protobuf type {@code PropPair}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PropPair)
        PropPairOuterClass.PropPairOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PropPairOuterClass.internal_static_PropPair_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PropPairOuterClass.internal_static_PropPair_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PropPairOuterClass.PropPair.class, PropPairOuterClass.PropPair.Builder.class);
      }

      // Construct using PropPairOuterClass.PropPair.newBuilder()
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
        type_ = 0;

        if (propValueBuilder_ == null) {
          propValue_ = null;
        } else {
          propValue_ = null;
          propValueBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PropPairOuterClass.internal_static_PropPair_descriptor;
      }

      @java.lang.Override
      public PropPairOuterClass.PropPair getDefaultInstanceForType() {
        return PropPairOuterClass.PropPair.getDefaultInstance();
      }

      @java.lang.Override
      public PropPairOuterClass.PropPair build() {
        PropPairOuterClass.PropPair result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public PropPairOuterClass.PropPair buildPartial() {
        PropPairOuterClass.PropPair result = new PropPairOuterClass.PropPair(this);
        result.type_ = type_;
        if (propValueBuilder_ == null) {
          result.propValue_ = propValue_;
        } else {
          result.propValue_ = propValueBuilder_.build();
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
        if (other instanceof PropPairOuterClass.PropPair) {
          return mergeFrom((PropPairOuterClass.PropPair)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PropPairOuterClass.PropPair other) {
        if (other == PropPairOuterClass.PropPair.getDefaultInstance()) return this;
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (other.hasPropValue()) {
          mergePropValue(other.getPropValue());
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
        PropPairOuterClass.PropPair parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (PropPairOuterClass.PropPair) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ ;
      /**
       * <code>uint32 type = 1;</code>
       * @return The type.
       */
      @java.lang.Override
      public int getType() {
        return type_;
      }
      /**
       * <code>uint32 type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private PropValueOuterClass.PropValue propValue_;
      private com.google.protobuf.SingleFieldBuilderV3<
          PropValueOuterClass.PropValue, PropValueOuterClass.PropValue.Builder, PropValueOuterClass.PropValueOrBuilder> propValueBuilder_;
      /**
       * <code>.PropValue propValue = 2;</code>
       * @return Whether the propValue field is set.
       */
      public boolean hasPropValue() {
        return propValueBuilder_ != null || propValue_ != null;
      }
      /**
       * <code>.PropValue propValue = 2;</code>
       * @return The propValue.
       */
      public PropValueOuterClass.PropValue getPropValue() {
        if (propValueBuilder_ == null) {
          return propValue_ == null ? PropValueOuterClass.PropValue.getDefaultInstance() : propValue_;
        } else {
          return propValueBuilder_.getMessage();
        }
      }
      /**
       * <code>.PropValue propValue = 2;</code>
       */
      public Builder setPropValue(PropValueOuterClass.PropValue value) {
        if (propValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          propValue_ = value;
          onChanged();
        } else {
          propValueBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.PropValue propValue = 2;</code>
       */
      public Builder setPropValue(
          PropValueOuterClass.PropValue.Builder builderForValue) {
        if (propValueBuilder_ == null) {
          propValue_ = builderForValue.build();
          onChanged();
        } else {
          propValueBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.PropValue propValue = 2;</code>
       */
      public Builder mergePropValue(PropValueOuterClass.PropValue value) {
        if (propValueBuilder_ == null) {
          if (propValue_ != null) {
            propValue_ =
              PropValueOuterClass.PropValue.newBuilder(propValue_).mergeFrom(value).buildPartial();
          } else {
            propValue_ = value;
          }
          onChanged();
        } else {
          propValueBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.PropValue propValue = 2;</code>
       */
      public Builder clearPropValue() {
        if (propValueBuilder_ == null) {
          propValue_ = null;
          onChanged();
        } else {
          propValue_ = null;
          propValueBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.PropValue propValue = 2;</code>
       */
      public PropValueOuterClass.PropValue.Builder getPropValueBuilder() {
        
        onChanged();
        return getPropValueFieldBuilder().getBuilder();
      }
      /**
       * <code>.PropValue propValue = 2;</code>
       */
      public PropValueOuterClass.PropValueOrBuilder getPropValueOrBuilder() {
        if (propValueBuilder_ != null) {
          return propValueBuilder_.getMessageOrBuilder();
        } else {
          return propValue_ == null ?
              PropValueOuterClass.PropValue.getDefaultInstance() : propValue_;
        }
      }
      /**
       * <code>.PropValue propValue = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          PropValueOuterClass.PropValue, PropValueOuterClass.PropValue.Builder, PropValueOuterClass.PropValueOrBuilder> 
          getPropValueFieldBuilder() {
        if (propValueBuilder_ == null) {
          propValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              PropValueOuterClass.PropValue, PropValueOuterClass.PropValue.Builder, PropValueOuterClass.PropValueOrBuilder>(
                  getPropValue(),
                  getParentForChildren(),
                  isClean());
          propValue_ = null;
        }
        return propValueBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PropPair)
    }

    // @@protoc_insertion_point(class_scope:PropPair)
    private static final PropPairOuterClass.PropPair DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PropPairOuterClass.PropPair();
    }

    public static PropPairOuterClass.PropPair getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PropPair>
        PARSER = new com.google.protobuf.AbstractParser<PropPair>() {
      @java.lang.Override
      public PropPair parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PropPair(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PropPair> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PropPair> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public PropPairOuterClass.PropPair getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PropPair_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PropPair_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016PropPair.proto\032\017PropValue.proto\"7\n\010Pro" +
      "pPair\022\014\n\004type\030\001 \001(\r\022\035\n\tpropValue\030\002 \001(\0132\n" +
      ".PropValueb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          PropValueOuterClass.getDescriptor(),
        });
    internal_static_PropPair_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PropPair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PropPair_descriptor,
        new java.lang.String[] { "Type", "PropValue", });
    PropValueOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
