// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityTakeWatcherRewardBatchReq.proto

public final class ActivityTakeWatcherRewardBatchReqOuterClass {
  private ActivityTakeWatcherRewardBatchReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityTakeWatcherRewardBatchReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityTakeWatcherRewardBatchReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 watcherIdList = 13;</code>
     * @return A list containing the watcherIdList.
     */
    java.util.List<java.lang.Integer> getWatcherIdListList();
    /**
     * <code>repeated uint32 watcherIdList = 13;</code>
     * @return The count of watcherIdList.
     */
    int getWatcherIdListCount();
    /**
     * <code>repeated uint32 watcherIdList = 13;</code>
     * @param index The index of the element to return.
     * @return The watcherIdList at the given index.
     */
    int getWatcherIdList(int index);

    /**
     * <code>uint32 activityId = 2;</code>
     * @return The activityId.
     */
    int getActivityId();
  }
  /**
   * Protobuf type {@code ActivityTakeWatcherRewardBatchReq}
   */
  public static final class ActivityTakeWatcherRewardBatchReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityTakeWatcherRewardBatchReq)
      ActivityTakeWatcherRewardBatchReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityTakeWatcherRewardBatchReq.newBuilder() to construct.
    private ActivityTakeWatcherRewardBatchReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityTakeWatcherRewardBatchReq() {
      watcherIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityTakeWatcherRewardBatchReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityTakeWatcherRewardBatchReq(
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
            case 16: {

              activityId_ = input.readUInt32();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                watcherIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              watcherIdList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                watcherIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                watcherIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
          watcherIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ActivityTakeWatcherRewardBatchReqOuterClass.internal_static_ActivityTakeWatcherRewardBatchReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ActivityTakeWatcherRewardBatchReqOuterClass.internal_static_ActivityTakeWatcherRewardBatchReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq.class, ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq.Builder.class);
    }

    /**
     * Protobuf enum {@code ActivityTakeWatcherRewardBatchReq.MGCDKDCPFFL}
     */
    public enum MGCDKDCPFFL
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 2083;</code>
       */
      PEPPOHPHJOJ(1, 2083),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final MGCDKDCPFFL DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final MGCDKDCPFFL EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 2083;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 2083;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static MGCDKDCPFFL valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static MGCDKDCPFFL forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 2083: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MGCDKDCPFFL>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MGCDKDCPFFL> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MGCDKDCPFFL>() {
              public MGCDKDCPFFL findValueByNumber(int number) {
                return MGCDKDCPFFL.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final MGCDKDCPFFL[] VALUES = getStaticValuesArray();
      private static MGCDKDCPFFL[] getStaticValuesArray() {
        return new MGCDKDCPFFL[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static MGCDKDCPFFL valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private MGCDKDCPFFL(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ActivityTakeWatcherRewardBatchReq.MGCDKDCPFFL)
    }

    public static final int WATCHERIDLIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList watcherIdList_;
    /**
     * <code>repeated uint32 watcherIdList = 13;</code>
     * @return A list containing the watcherIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getWatcherIdListList() {
      return watcherIdList_;
    }
    /**
     * <code>repeated uint32 watcherIdList = 13;</code>
     * @return The count of watcherIdList.
     */
    public int getWatcherIdListCount() {
      return watcherIdList_.size();
    }
    /**
     * <code>repeated uint32 watcherIdList = 13;</code>
     * @param index The index of the element to return.
     * @return The watcherIdList at the given index.
     */
    public int getWatcherIdList(int index) {
      return watcherIdList_.getInt(index);
    }
    private int watcherIdListMemoizedSerializedSize = -1;

    public static final int ACTIVITYID_FIELD_NUMBER = 2;
    private int activityId_;
    /**
     * <code>uint32 activityId = 2;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
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
      getSerializedSize();
      if (activityId_ != 0) {
        output.writeUInt32(2, activityId_);
      }
      if (getWatcherIdListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(watcherIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < watcherIdList_.size(); i++) {
        output.writeUInt32NoTag(watcherIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, activityId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < watcherIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(watcherIdList_.getInt(i));
        }
        size += dataSize;
        if (!getWatcherIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        watcherIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq)) {
        return super.equals(obj);
      }
      ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq other = (ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq) obj;

      if (!getWatcherIdListList()
          .equals(other.getWatcherIdListList())) return false;
      if (getActivityId()
          != other.getActivityId()) return false;
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
      if (getWatcherIdListCount() > 0) {
        hash = (37 * hash) + WATCHERIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getWatcherIdListList().hashCode();
      }
      hash = (37 * hash) + ACTIVITYID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq parseFrom(
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
    public static Builder newBuilder(ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq prototype) {
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
     * Protobuf type {@code ActivityTakeWatcherRewardBatchReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityTakeWatcherRewardBatchReq)
        ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ActivityTakeWatcherRewardBatchReqOuterClass.internal_static_ActivityTakeWatcherRewardBatchReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ActivityTakeWatcherRewardBatchReqOuterClass.internal_static_ActivityTakeWatcherRewardBatchReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq.class, ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq.Builder.class);
      }

      // Construct using ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq.newBuilder()
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
        watcherIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        activityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ActivityTakeWatcherRewardBatchReqOuterClass.internal_static_ActivityTakeWatcherRewardBatchReq_descriptor;
      }

      @java.lang.Override
      public ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq getDefaultInstanceForType() {
        return ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq.getDefaultInstance();
      }

      @java.lang.Override
      public ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq build() {
        ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq buildPartial() {
        ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq result = new ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          watcherIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.watcherIdList_ = watcherIdList_;
        result.activityId_ = activityId_;
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
        if (other instanceof ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq) {
          return mergeFrom((ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq other) {
        if (other == ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq.getDefaultInstance()) return this;
        if (!other.watcherIdList_.isEmpty()) {
          if (watcherIdList_.isEmpty()) {
            watcherIdList_ = other.watcherIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWatcherIdListIsMutable();
            watcherIdList_.addAll(other.watcherIdList_);
          }
          onChanged();
        }
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
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
        ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList watcherIdList_ = emptyIntList();
      private void ensureWatcherIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          watcherIdList_ = mutableCopy(watcherIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 watcherIdList = 13;</code>
       * @return A list containing the watcherIdList.
       */
      public java.util.List<java.lang.Integer>
          getWatcherIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(watcherIdList_) : watcherIdList_;
      }
      /**
       * <code>repeated uint32 watcherIdList = 13;</code>
       * @return The count of watcherIdList.
       */
      public int getWatcherIdListCount() {
        return watcherIdList_.size();
      }
      /**
       * <code>repeated uint32 watcherIdList = 13;</code>
       * @param index The index of the element to return.
       * @return The watcherIdList at the given index.
       */
      public int getWatcherIdList(int index) {
        return watcherIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 watcherIdList = 13;</code>
       * @param index The index to set the value at.
       * @param value The watcherIdList to set.
       * @return This builder for chaining.
       */
      public Builder setWatcherIdList(
          int index, int value) {
        ensureWatcherIdListIsMutable();
        watcherIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 watcherIdList = 13;</code>
       * @param value The watcherIdList to add.
       * @return This builder for chaining.
       */
      public Builder addWatcherIdList(int value) {
        ensureWatcherIdListIsMutable();
        watcherIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 watcherIdList = 13;</code>
       * @param values The watcherIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllWatcherIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureWatcherIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, watcherIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 watcherIdList = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearWatcherIdList() {
        watcherIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int activityId_ ;
      /**
       * <code>uint32 activityId = 2;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activityId = 2;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activityId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:ActivityTakeWatcherRewardBatchReq)
    }

    // @@protoc_insertion_point(class_scope:ActivityTakeWatcherRewardBatchReq)
    private static final ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq();
    }

    public static ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityTakeWatcherRewardBatchReq>
        PARSER = new com.google.protobuf.AbstractParser<ActivityTakeWatcherRewardBatchReq>() {
      @java.lang.Override
      public ActivityTakeWatcherRewardBatchReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityTakeWatcherRewardBatchReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivityTakeWatcherRewardBatchReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityTakeWatcherRewardBatchReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ActivityTakeWatcherRewardBatchReqOuterClass.ActivityTakeWatcherRewardBatchReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityTakeWatcherRewardBatchReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityTakeWatcherRewardBatchReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'ActivityTakeWatcherRewardBatchReq.prot" +
      "o\"\260\001\n!ActivityTakeWatcherRewardBatchReq\022" +
      "\025\n\rwatcherIdList\030\r \003(\r\022\022\n\nactivityId\030\002 \001" +
      "(\r\"`\n\013MGCDKDCPFFL\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJ" +
      "OJ\020\243\020\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022" +
      "\017\n\013EAJIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityTakeWatcherRewardBatchReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityTakeWatcherRewardBatchReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityTakeWatcherRewardBatchReq_descriptor,
        new java.lang.String[] { "WatcherIdList", "ActivityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
