// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgUpdateController.proto

public final class GCGMsgUpdateControllerOuterClass {
  private GCGMsgUpdateControllerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgUpdateControllerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgUpdateController)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
     */
    java.util.List<Uint32PairOuterClass.Uint32Pair> 
        getAllowControllerMapList();
    /**
     * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
     */
    Uint32PairOuterClass.Uint32Pair getAllowControllerMap(int index);
    /**
     * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
     */
    int getAllowControllerMapCount();
    /**
     * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
     */
    java.util.List<? extends Uint32PairOuterClass.Uint32PairOrBuilder> 
        getAllowControllerMapOrBuilderList();
    /**
     * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
     */
    Uint32PairOuterClass.Uint32PairOrBuilder getAllowControllerMapOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code GCGMsgUpdateController}
   */
  public static final class GCGMsgUpdateController extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgUpdateController)
      GCGMsgUpdateControllerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgUpdateController.newBuilder() to construct.
    private GCGMsgUpdateController(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgUpdateController() {
      allowControllerMap_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgUpdateController();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMsgUpdateController(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 26: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                allowControllerMap_ = new java.util.ArrayList<Uint32PairOuterClass.Uint32Pair>();
                mutable_bitField0_ |= 0x00000001;
              }
              allowControllerMap_.add(
                  input.readMessage(Uint32PairOuterClass.Uint32Pair.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          allowControllerMap_ = java.util.Collections.unmodifiableList(allowControllerMap_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GCGMsgUpdateControllerOuterClass.internal_static_GCGMsgUpdateController_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GCGMsgUpdateControllerOuterClass.internal_static_GCGMsgUpdateController_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController.class, GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController.Builder.class);
    }

    public static final int ALLOWCONTROLLERMAP_FIELD_NUMBER = 3;
    private java.util.List<Uint32PairOuterClass.Uint32Pair> allowControllerMap_;
    /**
     * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
     */
    @java.lang.Override
    public java.util.List<Uint32PairOuterClass.Uint32Pair> getAllowControllerMapList() {
      return allowControllerMap_;
    }
    /**
     * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends Uint32PairOuterClass.Uint32PairOrBuilder> 
        getAllowControllerMapOrBuilderList() {
      return allowControllerMap_;
    }
    /**
     * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
     */
    @java.lang.Override
    public int getAllowControllerMapCount() {
      return allowControllerMap_.size();
    }
    /**
     * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
     */
    @java.lang.Override
    public Uint32PairOuterClass.Uint32Pair getAllowControllerMap(int index) {
      return allowControllerMap_.get(index);
    }
    /**
     * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
     */
    @java.lang.Override
    public Uint32PairOuterClass.Uint32PairOrBuilder getAllowControllerMapOrBuilder(
        int index) {
      return allowControllerMap_.get(index);
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
      for (int i = 0; i < allowControllerMap_.size(); i++) {
        output.writeMessage(3, allowControllerMap_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < allowControllerMap_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, allowControllerMap_.get(i));
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
      if (!(obj instanceof GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController)) {
        return super.equals(obj);
      }
      GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController other = (GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController) obj;

      if (!getAllowControllerMapList()
          .equals(other.getAllowControllerMapList())) return false;
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
      if (getAllowControllerMapCount() > 0) {
        hash = (37 * hash) + ALLOWCONTROLLERMAP_FIELD_NUMBER;
        hash = (53 * hash) + getAllowControllerMapList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController parseFrom(
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
    public static Builder newBuilder(GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController prototype) {
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
     * Protobuf type {@code GCGMsgUpdateController}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgUpdateController)
        GCGMsgUpdateControllerOuterClass.GCGMsgUpdateControllerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GCGMsgUpdateControllerOuterClass.internal_static_GCGMsgUpdateController_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GCGMsgUpdateControllerOuterClass.internal_static_GCGMsgUpdateController_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController.class, GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController.Builder.class);
      }

      // Construct using GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController.newBuilder()
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
          getAllowControllerMapFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (allowControllerMapBuilder_ == null) {
          allowControllerMap_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          allowControllerMapBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GCGMsgUpdateControllerOuterClass.internal_static_GCGMsgUpdateController_descriptor;
      }

      @java.lang.Override
      public GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController getDefaultInstanceForType() {
        return GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController.getDefaultInstance();
      }

      @java.lang.Override
      public GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController build() {
        GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController buildPartial() {
        GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController result = new GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController(this);
        int from_bitField0_ = bitField0_;
        if (allowControllerMapBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            allowControllerMap_ = java.util.Collections.unmodifiableList(allowControllerMap_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.allowControllerMap_ = allowControllerMap_;
        } else {
          result.allowControllerMap_ = allowControllerMapBuilder_.build();
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
        if (other instanceof GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController) {
          return mergeFrom((GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController other) {
        if (other == GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController.getDefaultInstance()) return this;
        if (allowControllerMapBuilder_ == null) {
          if (!other.allowControllerMap_.isEmpty()) {
            if (allowControllerMap_.isEmpty()) {
              allowControllerMap_ = other.allowControllerMap_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAllowControllerMapIsMutable();
              allowControllerMap_.addAll(other.allowControllerMap_);
            }
            onChanged();
          }
        } else {
          if (!other.allowControllerMap_.isEmpty()) {
            if (allowControllerMapBuilder_.isEmpty()) {
              allowControllerMapBuilder_.dispose();
              allowControllerMapBuilder_ = null;
              allowControllerMap_ = other.allowControllerMap_;
              bitField0_ = (bitField0_ & ~0x00000001);
              allowControllerMapBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAllowControllerMapFieldBuilder() : null;
            } else {
              allowControllerMapBuilder_.addAllMessages(other.allowControllerMap_);
            }
          }
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
        GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<Uint32PairOuterClass.Uint32Pair> allowControllerMap_ =
        java.util.Collections.emptyList();
      private void ensureAllowControllerMapIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          allowControllerMap_ = new java.util.ArrayList<Uint32PairOuterClass.Uint32Pair>(allowControllerMap_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          Uint32PairOuterClass.Uint32Pair, Uint32PairOuterClass.Uint32Pair.Builder, Uint32PairOuterClass.Uint32PairOrBuilder> allowControllerMapBuilder_;

      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public java.util.List<Uint32PairOuterClass.Uint32Pair> getAllowControllerMapList() {
        if (allowControllerMapBuilder_ == null) {
          return java.util.Collections.unmodifiableList(allowControllerMap_);
        } else {
          return allowControllerMapBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public int getAllowControllerMapCount() {
        if (allowControllerMapBuilder_ == null) {
          return allowControllerMap_.size();
        } else {
          return allowControllerMapBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public Uint32PairOuterClass.Uint32Pair getAllowControllerMap(int index) {
        if (allowControllerMapBuilder_ == null) {
          return allowControllerMap_.get(index);
        } else {
          return allowControllerMapBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public Builder setAllowControllerMap(
          int index, Uint32PairOuterClass.Uint32Pair value) {
        if (allowControllerMapBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowControllerMapIsMutable();
          allowControllerMap_.set(index, value);
          onChanged();
        } else {
          allowControllerMapBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public Builder setAllowControllerMap(
          int index, Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (allowControllerMapBuilder_ == null) {
          ensureAllowControllerMapIsMutable();
          allowControllerMap_.set(index, builderForValue.build());
          onChanged();
        } else {
          allowControllerMapBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public Builder addAllowControllerMap(Uint32PairOuterClass.Uint32Pair value) {
        if (allowControllerMapBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowControllerMapIsMutable();
          allowControllerMap_.add(value);
          onChanged();
        } else {
          allowControllerMapBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public Builder addAllowControllerMap(
          int index, Uint32PairOuterClass.Uint32Pair value) {
        if (allowControllerMapBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowControllerMapIsMutable();
          allowControllerMap_.add(index, value);
          onChanged();
        } else {
          allowControllerMapBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public Builder addAllowControllerMap(
          Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (allowControllerMapBuilder_ == null) {
          ensureAllowControllerMapIsMutable();
          allowControllerMap_.add(builderForValue.build());
          onChanged();
        } else {
          allowControllerMapBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public Builder addAllowControllerMap(
          int index, Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (allowControllerMapBuilder_ == null) {
          ensureAllowControllerMapIsMutable();
          allowControllerMap_.add(index, builderForValue.build());
          onChanged();
        } else {
          allowControllerMapBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public Builder addAllAllowControllerMap(
          java.lang.Iterable<? extends Uint32PairOuterClass.Uint32Pair> values) {
        if (allowControllerMapBuilder_ == null) {
          ensureAllowControllerMapIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, allowControllerMap_);
          onChanged();
        } else {
          allowControllerMapBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public Builder clearAllowControllerMap() {
        if (allowControllerMapBuilder_ == null) {
          allowControllerMap_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          allowControllerMapBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public Builder removeAllowControllerMap(int index) {
        if (allowControllerMapBuilder_ == null) {
          ensureAllowControllerMapIsMutable();
          allowControllerMap_.remove(index);
          onChanged();
        } else {
          allowControllerMapBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public Uint32PairOuterClass.Uint32Pair.Builder getAllowControllerMapBuilder(
          int index) {
        return getAllowControllerMapFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public Uint32PairOuterClass.Uint32PairOrBuilder getAllowControllerMapOrBuilder(
          int index) {
        if (allowControllerMapBuilder_ == null) {
          return allowControllerMap_.get(index);  } else {
          return allowControllerMapBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public java.util.List<? extends Uint32PairOuterClass.Uint32PairOrBuilder> 
           getAllowControllerMapOrBuilderList() {
        if (allowControllerMapBuilder_ != null) {
          return allowControllerMapBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(allowControllerMap_);
        }
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public Uint32PairOuterClass.Uint32Pair.Builder addAllowControllerMapBuilder() {
        return getAllowControllerMapFieldBuilder().addBuilder(
            Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public Uint32PairOuterClass.Uint32Pair.Builder addAllowControllerMapBuilder(
          int index) {
        return getAllowControllerMapFieldBuilder().addBuilder(
            index, Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Uint32Pair allowControllerMap = 3;</code>
       */
      public java.util.List<Uint32PairOuterClass.Uint32Pair.Builder> 
           getAllowControllerMapBuilderList() {
        return getAllowControllerMapFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          Uint32PairOuterClass.Uint32Pair, Uint32PairOuterClass.Uint32Pair.Builder, Uint32PairOuterClass.Uint32PairOrBuilder> 
          getAllowControllerMapFieldBuilder() {
        if (allowControllerMapBuilder_ == null) {
          allowControllerMapBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              Uint32PairOuterClass.Uint32Pair, Uint32PairOuterClass.Uint32Pair.Builder, Uint32PairOuterClass.Uint32PairOrBuilder>(
                  allowControllerMap_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          allowControllerMap_ = null;
        }
        return allowControllerMapBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGMsgUpdateController)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgUpdateController)
    private static final GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController();
    }

    public static GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgUpdateController>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgUpdateController>() {
      @java.lang.Override
      public GCGMsgUpdateController parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMsgUpdateController(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMsgUpdateController> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgUpdateController> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgUpdateController_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgUpdateController_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GCGMsgUpdateController.proto\032\020Uint32Pa" +
      "ir.proto\"A\n\026GCGMsgUpdateController\022\'\n\022al" +
      "lowControllerMap\030\003 \003(\0132\013.Uint32Pairb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Uint32PairOuterClass.getDescriptor(),
        });
    internal_static_GCGMsgUpdateController_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgUpdateController_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgUpdateController_descriptor,
        new java.lang.String[] { "AllowControllerMap", });
    Uint32PairOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
