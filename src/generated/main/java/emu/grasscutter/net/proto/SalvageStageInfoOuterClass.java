// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalvageStageInfo.proto

public final class SalvageStageInfoOuterClass {
  private SalvageStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SalvageStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SalvageStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isOpen = 10;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 stageId = 15;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
     */
    java.util.List<SalvageChallengeInfoOuterClass.SalvageChallengeInfo> 
        getExceededItemTypeListList();
    /**
     * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
     */
    SalvageChallengeInfoOuterClass.SalvageChallengeInfo getExceededItemTypeList(int index);
    /**
     * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
     */
    int getExceededItemTypeListCount();
    /**
     * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
     */
    java.util.List<? extends SalvageChallengeInfoOuterClass.SalvageChallengeInfoOrBuilder> 
        getExceededItemTypeListOrBuilderList();
    /**
     * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
     */
    SalvageChallengeInfoOuterClass.SalvageChallengeInfoOrBuilder getExceededItemTypeListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code SalvageStageInfo}
   */
  public static final class SalvageStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SalvageStageInfo)
      SalvageStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SalvageStageInfo.newBuilder() to construct.
    private SalvageStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SalvageStageInfo() {
      exceededItemTypeList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SalvageStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SalvageStageInfo(
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
            case 50: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                exceededItemTypeList_ = new java.util.ArrayList<SalvageChallengeInfoOuterClass.SalvageChallengeInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              exceededItemTypeList_.add(
                  input.readMessage(SalvageChallengeInfoOuterClass.SalvageChallengeInfo.parser(), extensionRegistry));
              break;
            }
            case 80: {

              isOpen_ = input.readBool();
              break;
            }
            case 120: {

              stageId_ = input.readUInt32();
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
          exceededItemTypeList_ = java.util.Collections.unmodifiableList(exceededItemTypeList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SalvageStageInfoOuterClass.internal_static_SalvageStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SalvageStageInfoOuterClass.internal_static_SalvageStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SalvageStageInfoOuterClass.SalvageStageInfo.class, SalvageStageInfoOuterClass.SalvageStageInfo.Builder.class);
    }

    public static final int ISOPEN_FIELD_NUMBER = 10;
    private boolean isOpen_;
    /**
     * <code>bool isOpen = 10;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int STAGEID_FIELD_NUMBER = 15;
    private int stageId_;
    /**
     * <code>uint32 stageId = 15;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int EXCEEDEDITEMTYPELIST_FIELD_NUMBER = 6;
    private java.util.List<SalvageChallengeInfoOuterClass.SalvageChallengeInfo> exceededItemTypeList_;
    /**
     * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
     */
    @java.lang.Override
    public java.util.List<SalvageChallengeInfoOuterClass.SalvageChallengeInfo> getExceededItemTypeListList() {
      return exceededItemTypeList_;
    }
    /**
     * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends SalvageChallengeInfoOuterClass.SalvageChallengeInfoOrBuilder> 
        getExceededItemTypeListOrBuilderList() {
      return exceededItemTypeList_;
    }
    /**
     * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
     */
    @java.lang.Override
    public int getExceededItemTypeListCount() {
      return exceededItemTypeList_.size();
    }
    /**
     * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
     */
    @java.lang.Override
    public SalvageChallengeInfoOuterClass.SalvageChallengeInfo getExceededItemTypeList(int index) {
      return exceededItemTypeList_.get(index);
    }
    /**
     * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
     */
    @java.lang.Override
    public SalvageChallengeInfoOuterClass.SalvageChallengeInfoOrBuilder getExceededItemTypeListOrBuilder(
        int index) {
      return exceededItemTypeList_.get(index);
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
      for (int i = 0; i < exceededItemTypeList_.size(); i++) {
        output.writeMessage(6, exceededItemTypeList_.get(i));
      }
      if (isOpen_ != false) {
        output.writeBool(10, isOpen_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(15, stageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < exceededItemTypeList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, exceededItemTypeList_.get(i));
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isOpen_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, stageId_);
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
      if (!(obj instanceof SalvageStageInfoOuterClass.SalvageStageInfo)) {
        return super.equals(obj);
      }
      SalvageStageInfoOuterClass.SalvageStageInfo other = (SalvageStageInfoOuterClass.SalvageStageInfo) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (!getExceededItemTypeListList()
          .equals(other.getExceededItemTypeListList())) return false;
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
      hash = (37 * hash) + ISOPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + STAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      if (getExceededItemTypeListCount() > 0) {
        hash = (37 * hash) + EXCEEDEDITEMTYPELIST_FIELD_NUMBER;
        hash = (53 * hash) + getExceededItemTypeListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SalvageStageInfoOuterClass.SalvageStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SalvageStageInfoOuterClass.SalvageStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SalvageStageInfoOuterClass.SalvageStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SalvageStageInfoOuterClass.SalvageStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SalvageStageInfoOuterClass.SalvageStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SalvageStageInfoOuterClass.SalvageStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SalvageStageInfoOuterClass.SalvageStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SalvageStageInfoOuterClass.SalvageStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SalvageStageInfoOuterClass.SalvageStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SalvageStageInfoOuterClass.SalvageStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SalvageStageInfoOuterClass.SalvageStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SalvageStageInfoOuterClass.SalvageStageInfo parseFrom(
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
    public static Builder newBuilder(SalvageStageInfoOuterClass.SalvageStageInfo prototype) {
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
     * Protobuf type {@code SalvageStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SalvageStageInfo)
        SalvageStageInfoOuterClass.SalvageStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SalvageStageInfoOuterClass.internal_static_SalvageStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SalvageStageInfoOuterClass.internal_static_SalvageStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SalvageStageInfoOuterClass.SalvageStageInfo.class, SalvageStageInfoOuterClass.SalvageStageInfo.Builder.class);
      }

      // Construct using SalvageStageInfoOuterClass.SalvageStageInfo.newBuilder()
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
          getExceededItemTypeListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isOpen_ = false;

        stageId_ = 0;

        if (exceededItemTypeListBuilder_ == null) {
          exceededItemTypeList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          exceededItemTypeListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SalvageStageInfoOuterClass.internal_static_SalvageStageInfo_descriptor;
      }

      @java.lang.Override
      public SalvageStageInfoOuterClass.SalvageStageInfo getDefaultInstanceForType() {
        return SalvageStageInfoOuterClass.SalvageStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public SalvageStageInfoOuterClass.SalvageStageInfo build() {
        SalvageStageInfoOuterClass.SalvageStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SalvageStageInfoOuterClass.SalvageStageInfo buildPartial() {
        SalvageStageInfoOuterClass.SalvageStageInfo result = new SalvageStageInfoOuterClass.SalvageStageInfo(this);
        int from_bitField0_ = bitField0_;
        result.isOpen_ = isOpen_;
        result.stageId_ = stageId_;
        if (exceededItemTypeListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            exceededItemTypeList_ = java.util.Collections.unmodifiableList(exceededItemTypeList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.exceededItemTypeList_ = exceededItemTypeList_;
        } else {
          result.exceededItemTypeList_ = exceededItemTypeListBuilder_.build();
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
        if (other instanceof SalvageStageInfoOuterClass.SalvageStageInfo) {
          return mergeFrom((SalvageStageInfoOuterClass.SalvageStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SalvageStageInfoOuterClass.SalvageStageInfo other) {
        if (other == SalvageStageInfoOuterClass.SalvageStageInfo.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (exceededItemTypeListBuilder_ == null) {
          if (!other.exceededItemTypeList_.isEmpty()) {
            if (exceededItemTypeList_.isEmpty()) {
              exceededItemTypeList_ = other.exceededItemTypeList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureExceededItemTypeListIsMutable();
              exceededItemTypeList_.addAll(other.exceededItemTypeList_);
            }
            onChanged();
          }
        } else {
          if (!other.exceededItemTypeList_.isEmpty()) {
            if (exceededItemTypeListBuilder_.isEmpty()) {
              exceededItemTypeListBuilder_.dispose();
              exceededItemTypeListBuilder_ = null;
              exceededItemTypeList_ = other.exceededItemTypeList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              exceededItemTypeListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getExceededItemTypeListFieldBuilder() : null;
            } else {
              exceededItemTypeListBuilder_.addAllMessages(other.exceededItemTypeList_);
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
        SalvageStageInfoOuterClass.SalvageStageInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SalvageStageInfoOuterClass.SalvageStageInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isOpen_ ;
      /**
       * <code>bool isOpen = 10;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool isOpen = 10;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isOpen = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stageId = 15;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stageId = 15;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stageId = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<SalvageChallengeInfoOuterClass.SalvageChallengeInfo> exceededItemTypeList_ =
        java.util.Collections.emptyList();
      private void ensureExceededItemTypeListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          exceededItemTypeList_ = new java.util.ArrayList<SalvageChallengeInfoOuterClass.SalvageChallengeInfo>(exceededItemTypeList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          SalvageChallengeInfoOuterClass.SalvageChallengeInfo, SalvageChallengeInfoOuterClass.SalvageChallengeInfo.Builder, SalvageChallengeInfoOuterClass.SalvageChallengeInfoOrBuilder> exceededItemTypeListBuilder_;

      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public java.util.List<SalvageChallengeInfoOuterClass.SalvageChallengeInfo> getExceededItemTypeListList() {
        if (exceededItemTypeListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(exceededItemTypeList_);
        } else {
          return exceededItemTypeListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public int getExceededItemTypeListCount() {
        if (exceededItemTypeListBuilder_ == null) {
          return exceededItemTypeList_.size();
        } else {
          return exceededItemTypeListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public SalvageChallengeInfoOuterClass.SalvageChallengeInfo getExceededItemTypeList(int index) {
        if (exceededItemTypeListBuilder_ == null) {
          return exceededItemTypeList_.get(index);
        } else {
          return exceededItemTypeListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public Builder setExceededItemTypeList(
          int index, SalvageChallengeInfoOuterClass.SalvageChallengeInfo value) {
        if (exceededItemTypeListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExceededItemTypeListIsMutable();
          exceededItemTypeList_.set(index, value);
          onChanged();
        } else {
          exceededItemTypeListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public Builder setExceededItemTypeList(
          int index, SalvageChallengeInfoOuterClass.SalvageChallengeInfo.Builder builderForValue) {
        if (exceededItemTypeListBuilder_ == null) {
          ensureExceededItemTypeListIsMutable();
          exceededItemTypeList_.set(index, builderForValue.build());
          onChanged();
        } else {
          exceededItemTypeListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public Builder addExceededItemTypeList(SalvageChallengeInfoOuterClass.SalvageChallengeInfo value) {
        if (exceededItemTypeListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExceededItemTypeListIsMutable();
          exceededItemTypeList_.add(value);
          onChanged();
        } else {
          exceededItemTypeListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public Builder addExceededItemTypeList(
          int index, SalvageChallengeInfoOuterClass.SalvageChallengeInfo value) {
        if (exceededItemTypeListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExceededItemTypeListIsMutable();
          exceededItemTypeList_.add(index, value);
          onChanged();
        } else {
          exceededItemTypeListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public Builder addExceededItemTypeList(
          SalvageChallengeInfoOuterClass.SalvageChallengeInfo.Builder builderForValue) {
        if (exceededItemTypeListBuilder_ == null) {
          ensureExceededItemTypeListIsMutable();
          exceededItemTypeList_.add(builderForValue.build());
          onChanged();
        } else {
          exceededItemTypeListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public Builder addExceededItemTypeList(
          int index, SalvageChallengeInfoOuterClass.SalvageChallengeInfo.Builder builderForValue) {
        if (exceededItemTypeListBuilder_ == null) {
          ensureExceededItemTypeListIsMutable();
          exceededItemTypeList_.add(index, builderForValue.build());
          onChanged();
        } else {
          exceededItemTypeListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public Builder addAllExceededItemTypeList(
          java.lang.Iterable<? extends SalvageChallengeInfoOuterClass.SalvageChallengeInfo> values) {
        if (exceededItemTypeListBuilder_ == null) {
          ensureExceededItemTypeListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, exceededItemTypeList_);
          onChanged();
        } else {
          exceededItemTypeListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public Builder clearExceededItemTypeList() {
        if (exceededItemTypeListBuilder_ == null) {
          exceededItemTypeList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          exceededItemTypeListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public Builder removeExceededItemTypeList(int index) {
        if (exceededItemTypeListBuilder_ == null) {
          ensureExceededItemTypeListIsMutable();
          exceededItemTypeList_.remove(index);
          onChanged();
        } else {
          exceededItemTypeListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public SalvageChallengeInfoOuterClass.SalvageChallengeInfo.Builder getExceededItemTypeListBuilder(
          int index) {
        return getExceededItemTypeListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public SalvageChallengeInfoOuterClass.SalvageChallengeInfoOrBuilder getExceededItemTypeListOrBuilder(
          int index) {
        if (exceededItemTypeListBuilder_ == null) {
          return exceededItemTypeList_.get(index);  } else {
          return exceededItemTypeListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public java.util.List<? extends SalvageChallengeInfoOuterClass.SalvageChallengeInfoOrBuilder> 
           getExceededItemTypeListOrBuilderList() {
        if (exceededItemTypeListBuilder_ != null) {
          return exceededItemTypeListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(exceededItemTypeList_);
        }
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public SalvageChallengeInfoOuterClass.SalvageChallengeInfo.Builder addExceededItemTypeListBuilder() {
        return getExceededItemTypeListFieldBuilder().addBuilder(
            SalvageChallengeInfoOuterClass.SalvageChallengeInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public SalvageChallengeInfoOuterClass.SalvageChallengeInfo.Builder addExceededItemTypeListBuilder(
          int index) {
        return getExceededItemTypeListFieldBuilder().addBuilder(
            index, SalvageChallengeInfoOuterClass.SalvageChallengeInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SalvageChallengeInfo exceededItemTypeList = 6;</code>
       */
      public java.util.List<SalvageChallengeInfoOuterClass.SalvageChallengeInfo.Builder> 
           getExceededItemTypeListBuilderList() {
        return getExceededItemTypeListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          SalvageChallengeInfoOuterClass.SalvageChallengeInfo, SalvageChallengeInfoOuterClass.SalvageChallengeInfo.Builder, SalvageChallengeInfoOuterClass.SalvageChallengeInfoOrBuilder> 
          getExceededItemTypeListFieldBuilder() {
        if (exceededItemTypeListBuilder_ == null) {
          exceededItemTypeListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              SalvageChallengeInfoOuterClass.SalvageChallengeInfo, SalvageChallengeInfoOuterClass.SalvageChallengeInfo.Builder, SalvageChallengeInfoOuterClass.SalvageChallengeInfoOrBuilder>(
                  exceededItemTypeList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          exceededItemTypeList_ = null;
        }
        return exceededItemTypeListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SalvageStageInfo)
    }

    // @@protoc_insertion_point(class_scope:SalvageStageInfo)
    private static final SalvageStageInfoOuterClass.SalvageStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SalvageStageInfoOuterClass.SalvageStageInfo();
    }

    public static SalvageStageInfoOuterClass.SalvageStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SalvageStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<SalvageStageInfo>() {
      @java.lang.Override
      public SalvageStageInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SalvageStageInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SalvageStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SalvageStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SalvageStageInfoOuterClass.SalvageStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SalvageStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SalvageStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026SalvageStageInfo.proto\032\032SalvageChallen" +
      "geInfo.proto\"h\n\020SalvageStageInfo\022\016\n\006isOp" +
      "en\030\n \001(\010\022\017\n\007stageId\030\017 \001(\r\0223\n\024exceededIte" +
      "mTypeList\030\006 \003(\0132\025.SalvageChallengeInfob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          SalvageChallengeInfoOuterClass.getDescriptor(),
        });
    internal_static_SalvageStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SalvageStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SalvageStageInfo_descriptor,
        new java.lang.String[] { "IsOpen", "StageId", "ExceededItemTypeList", });
    SalvageChallengeInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
