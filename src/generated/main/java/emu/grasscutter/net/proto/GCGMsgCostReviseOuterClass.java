// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgCostRevise.proto

public final class GCGMsgCostReviseOuterClass {
  private GCGMsgCostReviseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgCostReviseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgCostRevise)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 controllerId = 15;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>.GCGCostReviseInfo costRevise = 10;</code>
     * @return Whether the costRevise field is set.
     */
    boolean hasCostRevise();
    /**
     * <code>.GCGCostReviseInfo costRevise = 10;</code>
     * @return The costRevise.
     */
    GCGCostReviseInfoOuterClass.GCGCostReviseInfo getCostRevise();
    /**
     * <code>.GCGCostReviseInfo costRevise = 10;</code>
     */
    GCGCostReviseInfoOuterClass.GCGCostReviseInfoOrBuilder getCostReviseOrBuilder();
  }
  /**
   * Protobuf type {@code GCGMsgCostRevise}
   */
  public static final class GCGMsgCostRevise extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgCostRevise)
      GCGMsgCostReviseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgCostRevise.newBuilder() to construct.
    private GCGMsgCostRevise(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgCostRevise() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgCostRevise();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMsgCostRevise(
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
            case 82: {
              GCGCostReviseInfoOuterClass.GCGCostReviseInfo.Builder subBuilder = null;
              if (costRevise_ != null) {
                subBuilder = costRevise_.toBuilder();
              }
              costRevise_ = input.readMessage(GCGCostReviseInfoOuterClass.GCGCostReviseInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(costRevise_);
                costRevise_ = subBuilder.buildPartial();
              }

              break;
            }
            case 120: {

              controllerId_ = input.readUInt32();
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
      return GCGMsgCostReviseOuterClass.internal_static_GCGMsgCostRevise_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GCGMsgCostReviseOuterClass.internal_static_GCGMsgCostRevise_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GCGMsgCostReviseOuterClass.GCGMsgCostRevise.class, GCGMsgCostReviseOuterClass.GCGMsgCostRevise.Builder.class);
    }

    public static final int CONTROLLERID_FIELD_NUMBER = 15;
    private int controllerId_;
    /**
     * <code>uint32 controllerId = 15;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int COSTREVISE_FIELD_NUMBER = 10;
    private GCGCostReviseInfoOuterClass.GCGCostReviseInfo costRevise_;
    /**
     * <code>.GCGCostReviseInfo costRevise = 10;</code>
     * @return Whether the costRevise field is set.
     */
    @java.lang.Override
    public boolean hasCostRevise() {
      return costRevise_ != null;
    }
    /**
     * <code>.GCGCostReviseInfo costRevise = 10;</code>
     * @return The costRevise.
     */
    @java.lang.Override
    public GCGCostReviseInfoOuterClass.GCGCostReviseInfo getCostRevise() {
      return costRevise_ == null ? GCGCostReviseInfoOuterClass.GCGCostReviseInfo.getDefaultInstance() : costRevise_;
    }
    /**
     * <code>.GCGCostReviseInfo costRevise = 10;</code>
     */
    @java.lang.Override
    public GCGCostReviseInfoOuterClass.GCGCostReviseInfoOrBuilder getCostReviseOrBuilder() {
      return getCostRevise();
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
      if (costRevise_ != null) {
        output.writeMessage(10, getCostRevise());
      }
      if (controllerId_ != 0) {
        output.writeUInt32(15, controllerId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (costRevise_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getCostRevise());
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, controllerId_);
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
      if (!(obj instanceof GCGMsgCostReviseOuterClass.GCGMsgCostRevise)) {
        return super.equals(obj);
      }
      GCGMsgCostReviseOuterClass.GCGMsgCostRevise other = (GCGMsgCostReviseOuterClass.GCGMsgCostRevise) obj;

      if (getControllerId()
          != other.getControllerId()) return false;
      if (hasCostRevise() != other.hasCostRevise()) return false;
      if (hasCostRevise()) {
        if (!getCostRevise()
            .equals(other.getCostRevise())) return false;
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
      hash = (37 * hash) + CONTROLLERID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      if (hasCostRevise()) {
        hash = (37 * hash) + COSTREVISE_FIELD_NUMBER;
        hash = (53 * hash) + getCostRevise().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
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
    public static Builder newBuilder(GCGMsgCostReviseOuterClass.GCGMsgCostRevise prototype) {
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
     * Protobuf type {@code GCGMsgCostRevise}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgCostRevise)
        GCGMsgCostReviseOuterClass.GCGMsgCostReviseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GCGMsgCostReviseOuterClass.internal_static_GCGMsgCostRevise_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GCGMsgCostReviseOuterClass.internal_static_GCGMsgCostRevise_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GCGMsgCostReviseOuterClass.GCGMsgCostRevise.class, GCGMsgCostReviseOuterClass.GCGMsgCostRevise.Builder.class);
      }

      // Construct using GCGMsgCostReviseOuterClass.GCGMsgCostRevise.newBuilder()
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
        controllerId_ = 0;

        if (costReviseBuilder_ == null) {
          costRevise_ = null;
        } else {
          costRevise_ = null;
          costReviseBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GCGMsgCostReviseOuterClass.internal_static_GCGMsgCostRevise_descriptor;
      }

      @java.lang.Override
      public GCGMsgCostReviseOuterClass.GCGMsgCostRevise getDefaultInstanceForType() {
        return GCGMsgCostReviseOuterClass.GCGMsgCostRevise.getDefaultInstance();
      }

      @java.lang.Override
      public GCGMsgCostReviseOuterClass.GCGMsgCostRevise build() {
        GCGMsgCostReviseOuterClass.GCGMsgCostRevise result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public GCGMsgCostReviseOuterClass.GCGMsgCostRevise buildPartial() {
        GCGMsgCostReviseOuterClass.GCGMsgCostRevise result = new GCGMsgCostReviseOuterClass.GCGMsgCostRevise(this);
        result.controllerId_ = controllerId_;
        if (costReviseBuilder_ == null) {
          result.costRevise_ = costRevise_;
        } else {
          result.costRevise_ = costReviseBuilder_.build();
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
        if (other instanceof GCGMsgCostReviseOuterClass.GCGMsgCostRevise) {
          return mergeFrom((GCGMsgCostReviseOuterClass.GCGMsgCostRevise)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GCGMsgCostReviseOuterClass.GCGMsgCostRevise other) {
        if (other == GCGMsgCostReviseOuterClass.GCGMsgCostRevise.getDefaultInstance()) return this;
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (other.hasCostRevise()) {
          mergeCostRevise(other.getCostRevise());
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
        GCGMsgCostReviseOuterClass.GCGMsgCostRevise parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GCGMsgCostReviseOuterClass.GCGMsgCostRevise) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controllerId = 15;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controllerId = 15;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controllerId = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private GCGCostReviseInfoOuterClass.GCGCostReviseInfo costRevise_;
      private com.google.protobuf.SingleFieldBuilderV3<
          GCGCostReviseInfoOuterClass.GCGCostReviseInfo, GCGCostReviseInfoOuterClass.GCGCostReviseInfo.Builder, GCGCostReviseInfoOuterClass.GCGCostReviseInfoOrBuilder> costReviseBuilder_;
      /**
       * <code>.GCGCostReviseInfo costRevise = 10;</code>
       * @return Whether the costRevise field is set.
       */
      public boolean hasCostRevise() {
        return costReviseBuilder_ != null || costRevise_ != null;
      }
      /**
       * <code>.GCGCostReviseInfo costRevise = 10;</code>
       * @return The costRevise.
       */
      public GCGCostReviseInfoOuterClass.GCGCostReviseInfo getCostRevise() {
        if (costReviseBuilder_ == null) {
          return costRevise_ == null ? GCGCostReviseInfoOuterClass.GCGCostReviseInfo.getDefaultInstance() : costRevise_;
        } else {
          return costReviseBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGCostReviseInfo costRevise = 10;</code>
       */
      public Builder setCostRevise(GCGCostReviseInfoOuterClass.GCGCostReviseInfo value) {
        if (costReviseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          costRevise_ = value;
          onChanged();
        } else {
          costReviseBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GCGCostReviseInfo costRevise = 10;</code>
       */
      public Builder setCostRevise(
          GCGCostReviseInfoOuterClass.GCGCostReviseInfo.Builder builderForValue) {
        if (costReviseBuilder_ == null) {
          costRevise_ = builderForValue.build();
          onChanged();
        } else {
          costReviseBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GCGCostReviseInfo costRevise = 10;</code>
       */
      public Builder mergeCostRevise(GCGCostReviseInfoOuterClass.GCGCostReviseInfo value) {
        if (costReviseBuilder_ == null) {
          if (costRevise_ != null) {
            costRevise_ =
              GCGCostReviseInfoOuterClass.GCGCostReviseInfo.newBuilder(costRevise_).mergeFrom(value).buildPartial();
          } else {
            costRevise_ = value;
          }
          onChanged();
        } else {
          costReviseBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GCGCostReviseInfo costRevise = 10;</code>
       */
      public Builder clearCostRevise() {
        if (costReviseBuilder_ == null) {
          costRevise_ = null;
          onChanged();
        } else {
          costRevise_ = null;
          costReviseBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GCGCostReviseInfo costRevise = 10;</code>
       */
      public GCGCostReviseInfoOuterClass.GCGCostReviseInfo.Builder getCostReviseBuilder() {
        
        onChanged();
        return getCostReviseFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGCostReviseInfo costRevise = 10;</code>
       */
      public GCGCostReviseInfoOuterClass.GCGCostReviseInfoOrBuilder getCostReviseOrBuilder() {
        if (costReviseBuilder_ != null) {
          return costReviseBuilder_.getMessageOrBuilder();
        } else {
          return costRevise_ == null ?
              GCGCostReviseInfoOuterClass.GCGCostReviseInfo.getDefaultInstance() : costRevise_;
        }
      }
      /**
       * <code>.GCGCostReviseInfo costRevise = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          GCGCostReviseInfoOuterClass.GCGCostReviseInfo, GCGCostReviseInfoOuterClass.GCGCostReviseInfo.Builder, GCGCostReviseInfoOuterClass.GCGCostReviseInfoOrBuilder> 
          getCostReviseFieldBuilder() {
        if (costReviseBuilder_ == null) {
          costReviseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              GCGCostReviseInfoOuterClass.GCGCostReviseInfo, GCGCostReviseInfoOuterClass.GCGCostReviseInfo.Builder, GCGCostReviseInfoOuterClass.GCGCostReviseInfoOrBuilder>(
                  getCostRevise(),
                  getParentForChildren(),
                  isClean());
          costRevise_ = null;
        }
        return costReviseBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGMsgCostRevise)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgCostRevise)
    private static final GCGMsgCostReviseOuterClass.GCGMsgCostRevise DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GCGMsgCostReviseOuterClass.GCGMsgCostRevise();
    }

    public static GCGMsgCostReviseOuterClass.GCGMsgCostRevise getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgCostRevise>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgCostRevise>() {
      @java.lang.Override
      public GCGMsgCostRevise parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMsgCostRevise(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMsgCostRevise> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgCostRevise> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public GCGMsgCostReviseOuterClass.GCGMsgCostRevise getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgCostRevise_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgCostRevise_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GCGMsgCostRevise.proto\032\027GCGCostReviseI" +
      "nfo.proto\"P\n\020GCGMsgCostRevise\022\024\n\014control" +
      "lerId\030\017 \001(\r\022&\n\ncostRevise\030\n \001(\0132\022.GCGCos" +
      "tReviseInfob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          GCGCostReviseInfoOuterClass.getDescriptor(),
        });
    internal_static_GCGMsgCostRevise_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgCostRevise_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgCostRevise_descriptor,
        new java.lang.String[] { "ControllerId", "CostRevise", });
    GCGCostReviseInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
