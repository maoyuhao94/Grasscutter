// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeAvatarAllFinishRewardNotify.proto

public final class HomeAvatarAllFinishRewardNotifyOuterClass {
  private HomeAvatarAllFinishRewardNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeAvatarAllFinishRewardNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeAvatarAllFinishRewardNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 eventIdList = 1;</code>
     * @return A list containing the eventIdList.
     */
    java.util.List<java.lang.Integer> getEventIdListList();
    /**
     * <code>repeated uint32 eventIdList = 1;</code>
     * @return The count of eventIdList.
     */
    int getEventIdListCount();
    /**
     * <code>repeated uint32 eventIdList = 1;</code>
     * @param index The index of the element to return.
     * @return The eventIdList at the given index.
     */
    int getEventIdList(int index);
  }
  /**
   * Protobuf type {@code HomeAvatarAllFinishRewardNotify}
   */
  public static final class HomeAvatarAllFinishRewardNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeAvatarAllFinishRewardNotify)
      HomeAvatarAllFinishRewardNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeAvatarAllFinishRewardNotify.newBuilder() to construct.
    private HomeAvatarAllFinishRewardNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeAvatarAllFinishRewardNotify() {
      eventIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeAvatarAllFinishRewardNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeAvatarAllFinishRewardNotify(
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
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                eventIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              eventIdList_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                eventIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                eventIdList_.addInt(input.readUInt32());
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
          eventIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HomeAvatarAllFinishRewardNotifyOuterClass.internal_static_HomeAvatarAllFinishRewardNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HomeAvatarAllFinishRewardNotifyOuterClass.internal_static_HomeAvatarAllFinishRewardNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify.class, HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code HomeAvatarAllFinishRewardNotify.HMGIPIOKMJK}
     */
    public enum HMGIPIOKMJK
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4503;</code>
       */
      PEPPOHPHJOJ(1, 4503),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final HMGIPIOKMJK DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4503;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4503;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


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
      public static HMGIPIOKMJK valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static HMGIPIOKMJK forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4503: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<HMGIPIOKMJK>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          HMGIPIOKMJK> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<HMGIPIOKMJK>() {
              public HMGIPIOKMJK findValueByNumber(int number) {
                return HMGIPIOKMJK.forNumber(number);
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
        return HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final HMGIPIOKMJK[] VALUES = getStaticValuesArray();
      private static HMGIPIOKMJK[] getStaticValuesArray() {
        return new HMGIPIOKMJK[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static HMGIPIOKMJK valueOf(
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

      private HMGIPIOKMJK(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:HomeAvatarAllFinishRewardNotify.HMGIPIOKMJK)
    }

    public static final int EVENTIDLIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList eventIdList_;
    /**
     * <code>repeated uint32 eventIdList = 1;</code>
     * @return A list containing the eventIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEventIdListList() {
      return eventIdList_;
    }
    /**
     * <code>repeated uint32 eventIdList = 1;</code>
     * @return The count of eventIdList.
     */
    public int getEventIdListCount() {
      return eventIdList_.size();
    }
    /**
     * <code>repeated uint32 eventIdList = 1;</code>
     * @param index The index of the element to return.
     * @return The eventIdList at the given index.
     */
    public int getEventIdList(int index) {
      return eventIdList_.getInt(index);
    }
    private int eventIdListMemoizedSerializedSize = -1;

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
      if (getEventIdListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(eventIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < eventIdList_.size(); i++) {
        output.writeUInt32NoTag(eventIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < eventIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(eventIdList_.getInt(i));
        }
        size += dataSize;
        if (!getEventIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        eventIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify)) {
        return super.equals(obj);
      }
      HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify other = (HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify) obj;

      if (!getEventIdListList()
          .equals(other.getEventIdListList())) return false;
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
      if (getEventIdListCount() > 0) {
        hash = (37 * hash) + EVENTIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getEventIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parseFrom(
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
    public static Builder newBuilder(HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify prototype) {
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
     * Protobuf type {@code HomeAvatarAllFinishRewardNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeAvatarAllFinishRewardNotify)
        HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HomeAvatarAllFinishRewardNotifyOuterClass.internal_static_HomeAvatarAllFinishRewardNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HomeAvatarAllFinishRewardNotifyOuterClass.internal_static_HomeAvatarAllFinishRewardNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify.class, HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify.Builder.class);
      }

      // Construct using HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify.newBuilder()
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
        eventIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HomeAvatarAllFinishRewardNotifyOuterClass.internal_static_HomeAvatarAllFinishRewardNotify_descriptor;
      }

      @java.lang.Override
      public HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify getDefaultInstanceForType() {
        return HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify.getDefaultInstance();
      }

      @java.lang.Override
      public HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify build() {
        HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify buildPartial() {
        HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify result = new HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          eventIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.eventIdList_ = eventIdList_;
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
        if (other instanceof HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify) {
          return mergeFrom((HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify other) {
        if (other == HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify.getDefaultInstance()) return this;
        if (!other.eventIdList_.isEmpty()) {
          if (eventIdList_.isEmpty()) {
            eventIdList_ = other.eventIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEventIdListIsMutable();
            eventIdList_.addAll(other.eventIdList_);
          }
          onChanged();
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
        HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList eventIdList_ = emptyIntList();
      private void ensureEventIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          eventIdList_ = mutableCopy(eventIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 eventIdList = 1;</code>
       * @return A list containing the eventIdList.
       */
      public java.util.List<java.lang.Integer>
          getEventIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(eventIdList_) : eventIdList_;
      }
      /**
       * <code>repeated uint32 eventIdList = 1;</code>
       * @return The count of eventIdList.
       */
      public int getEventIdListCount() {
        return eventIdList_.size();
      }
      /**
       * <code>repeated uint32 eventIdList = 1;</code>
       * @param index The index of the element to return.
       * @return The eventIdList at the given index.
       */
      public int getEventIdList(int index) {
        return eventIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 eventIdList = 1;</code>
       * @param index The index to set the value at.
       * @param value The eventIdList to set.
       * @return This builder for chaining.
       */
      public Builder setEventIdList(
          int index, int value) {
        ensureEventIdListIsMutable();
        eventIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 eventIdList = 1;</code>
       * @param value The eventIdList to add.
       * @return This builder for chaining.
       */
      public Builder addEventIdList(int value) {
        ensureEventIdListIsMutable();
        eventIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 eventIdList = 1;</code>
       * @param values The eventIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllEventIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEventIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, eventIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 eventIdList = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEventIdList() {
        eventIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:HomeAvatarAllFinishRewardNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeAvatarAllFinishRewardNotify)
    private static final HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify();
    }

    public static HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeAvatarAllFinishRewardNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeAvatarAllFinishRewardNotify>() {
      @java.lang.Override
      public HomeAvatarAllFinishRewardNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeAvatarAllFinishRewardNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeAvatarAllFinishRewardNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeAvatarAllFinishRewardNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public HomeAvatarAllFinishRewardNotifyOuterClass.HomeAvatarAllFinishRewardNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeAvatarAllFinishRewardNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeAvatarAllFinishRewardNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%HomeAvatarAllFinishRewardNotify.proto\"" +
      "\207\001\n\037HomeAvatarAllFinishRewardNotify\022\023\n\013e" +
      "ventIdList\030\001 \003(\r\"O\n\013HMGIPIOKMJK\022\010\n\004NONE\020" +
      "\000\022\020\n\013PEPPOHPHJOJ\020\227#\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013" +
      "NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeAvatarAllFinishRewardNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeAvatarAllFinishRewardNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeAvatarAllFinishRewardNotify_descriptor,
        new java.lang.String[] { "EventIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
