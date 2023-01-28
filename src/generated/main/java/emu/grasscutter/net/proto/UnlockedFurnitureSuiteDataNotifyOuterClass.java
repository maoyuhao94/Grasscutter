// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnlockedFurnitureSuiteDataNotify.proto

public final class UnlockedFurnitureSuiteDataNotifyOuterClass {
  private UnlockedFurnitureSuiteDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnlockedFurnitureSuiteDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UnlockedFurnitureSuiteDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 furnitureSuiteIdList = 12;</code>
     * @return A list containing the furnitureSuiteIdList.
     */
    java.util.List<java.lang.Integer> getFurnitureSuiteIdListList();
    /**
     * <code>repeated uint32 furnitureSuiteIdList = 12;</code>
     * @return The count of furnitureSuiteIdList.
     */
    int getFurnitureSuiteIdListCount();
    /**
     * <code>repeated uint32 furnitureSuiteIdList = 12;</code>
     * @param index The index of the element to return.
     * @return The furnitureSuiteIdList at the given index.
     */
    int getFurnitureSuiteIdList(int index);

    /**
     * <code>bool isAll = 9;</code>
     * @return The isAll.
     */
    boolean getIsAll();
  }
  /**
   * Protobuf type {@code UnlockedFurnitureSuiteDataNotify}
   */
  public static final class UnlockedFurnitureSuiteDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UnlockedFurnitureSuiteDataNotify)
      UnlockedFurnitureSuiteDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnlockedFurnitureSuiteDataNotify.newBuilder() to construct.
    private UnlockedFurnitureSuiteDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnlockedFurnitureSuiteDataNotify() {
      furnitureSuiteIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UnlockedFurnitureSuiteDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UnlockedFurnitureSuiteDataNotify(
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
            case 72: {

              isAll_ = input.readBool();
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                furnitureSuiteIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              furnitureSuiteIdList_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                furnitureSuiteIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                furnitureSuiteIdList_.addInt(input.readUInt32());
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
          furnitureSuiteIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return UnlockedFurnitureSuiteDataNotifyOuterClass.internal_static_UnlockedFurnitureSuiteDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return UnlockedFurnitureSuiteDataNotifyOuterClass.internal_static_UnlockedFurnitureSuiteDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.class, UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code UnlockedFurnitureSuiteDataNotify.MOMBAIFGLCB}
     */
    public enum MOMBAIFGLCB
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4475;</code>
       */
      PEPPOHPHJOJ(1, 4475),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final MOMBAIFGLCB DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4475;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4475;
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
      public static MOMBAIFGLCB valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static MOMBAIFGLCB forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4475: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MOMBAIFGLCB>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MOMBAIFGLCB> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MOMBAIFGLCB>() {
              public MOMBAIFGLCB findValueByNumber(int number) {
                return MOMBAIFGLCB.forNumber(number);
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
        return UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final MOMBAIFGLCB[] VALUES = getStaticValuesArray();
      private static MOMBAIFGLCB[] getStaticValuesArray() {
        return new MOMBAIFGLCB[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static MOMBAIFGLCB valueOf(
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

      private MOMBAIFGLCB(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:UnlockedFurnitureSuiteDataNotify.MOMBAIFGLCB)
    }

    public static final int FURNITURESUITEIDLIST_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList furnitureSuiteIdList_;
    /**
     * <code>repeated uint32 furnitureSuiteIdList = 12;</code>
     * @return A list containing the furnitureSuiteIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFurnitureSuiteIdListList() {
      return furnitureSuiteIdList_;
    }
    /**
     * <code>repeated uint32 furnitureSuiteIdList = 12;</code>
     * @return The count of furnitureSuiteIdList.
     */
    public int getFurnitureSuiteIdListCount() {
      return furnitureSuiteIdList_.size();
    }
    /**
     * <code>repeated uint32 furnitureSuiteIdList = 12;</code>
     * @param index The index of the element to return.
     * @return The furnitureSuiteIdList at the given index.
     */
    public int getFurnitureSuiteIdList(int index) {
      return furnitureSuiteIdList_.getInt(index);
    }
    private int furnitureSuiteIdListMemoizedSerializedSize = -1;

    public static final int ISALL_FIELD_NUMBER = 9;
    private boolean isAll_;
    /**
     * <code>bool isAll = 9;</code>
     * @return The isAll.
     */
    @java.lang.Override
    public boolean getIsAll() {
      return isAll_;
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
      if (isAll_ != false) {
        output.writeBool(9, isAll_);
      }
      if (getFurnitureSuiteIdListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(furnitureSuiteIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < furnitureSuiteIdList_.size(); i++) {
        output.writeUInt32NoTag(furnitureSuiteIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAll_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isAll_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < furnitureSuiteIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(furnitureSuiteIdList_.getInt(i));
        }
        size += dataSize;
        if (!getFurnitureSuiteIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        furnitureSuiteIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify)) {
        return super.equals(obj);
      }
      UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify other = (UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify) obj;

      if (!getFurnitureSuiteIdListList()
          .equals(other.getFurnitureSuiteIdListList())) return false;
      if (getIsAll()
          != other.getIsAll()) return false;
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
      if (getFurnitureSuiteIdListCount() > 0) {
        hash = (37 * hash) + FURNITURESUITEIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getFurnitureSuiteIdListList().hashCode();
      }
      hash = (37 * hash) + ISALL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAll());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
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
    public static Builder newBuilder(UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify prototype) {
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
     * Protobuf type {@code UnlockedFurnitureSuiteDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UnlockedFurnitureSuiteDataNotify)
        UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return UnlockedFurnitureSuiteDataNotifyOuterClass.internal_static_UnlockedFurnitureSuiteDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return UnlockedFurnitureSuiteDataNotifyOuterClass.internal_static_UnlockedFurnitureSuiteDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.class, UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.Builder.class);
      }

      // Construct using UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.newBuilder()
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
        furnitureSuiteIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        isAll_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return UnlockedFurnitureSuiteDataNotifyOuterClass.internal_static_UnlockedFurnitureSuiteDataNotify_descriptor;
      }

      @java.lang.Override
      public UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify getDefaultInstanceForType() {
        return UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify build() {
        UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify buildPartial() {
        UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify result = new UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          furnitureSuiteIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.furnitureSuiteIdList_ = furnitureSuiteIdList_;
        result.isAll_ = isAll_;
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
        if (other instanceof UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify) {
          return mergeFrom((UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify other) {
        if (other == UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.getDefaultInstance()) return this;
        if (!other.furnitureSuiteIdList_.isEmpty()) {
          if (furnitureSuiteIdList_.isEmpty()) {
            furnitureSuiteIdList_ = other.furnitureSuiteIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFurnitureSuiteIdListIsMutable();
            furnitureSuiteIdList_.addAll(other.furnitureSuiteIdList_);
          }
          onChanged();
        }
        if (other.getIsAll() != false) {
          setIsAll(other.getIsAll());
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
        UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList furnitureSuiteIdList_ = emptyIntList();
      private void ensureFurnitureSuiteIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          furnitureSuiteIdList_ = mutableCopy(furnitureSuiteIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 furnitureSuiteIdList = 12;</code>
       * @return A list containing the furnitureSuiteIdList.
       */
      public java.util.List<java.lang.Integer>
          getFurnitureSuiteIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(furnitureSuiteIdList_) : furnitureSuiteIdList_;
      }
      /**
       * <code>repeated uint32 furnitureSuiteIdList = 12;</code>
       * @return The count of furnitureSuiteIdList.
       */
      public int getFurnitureSuiteIdListCount() {
        return furnitureSuiteIdList_.size();
      }
      /**
       * <code>repeated uint32 furnitureSuiteIdList = 12;</code>
       * @param index The index of the element to return.
       * @return The furnitureSuiteIdList at the given index.
       */
      public int getFurnitureSuiteIdList(int index) {
        return furnitureSuiteIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 furnitureSuiteIdList = 12;</code>
       * @param index The index to set the value at.
       * @param value The furnitureSuiteIdList to set.
       * @return This builder for chaining.
       */
      public Builder setFurnitureSuiteIdList(
          int index, int value) {
        ensureFurnitureSuiteIdListIsMutable();
        furnitureSuiteIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 furnitureSuiteIdList = 12;</code>
       * @param value The furnitureSuiteIdList to add.
       * @return This builder for chaining.
       */
      public Builder addFurnitureSuiteIdList(int value) {
        ensureFurnitureSuiteIdListIsMutable();
        furnitureSuiteIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 furnitureSuiteIdList = 12;</code>
       * @param values The furnitureSuiteIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFurnitureSuiteIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFurnitureSuiteIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, furnitureSuiteIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 furnitureSuiteIdList = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearFurnitureSuiteIdList() {
        furnitureSuiteIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean isAll_ ;
      /**
       * <code>bool isAll = 9;</code>
       * @return The isAll.
       */
      @java.lang.Override
      public boolean getIsAll() {
        return isAll_;
      }
      /**
       * <code>bool isAll = 9;</code>
       * @param value The isAll to set.
       * @return This builder for chaining.
       */
      public Builder setIsAll(boolean value) {
        
        isAll_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isAll = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAll() {
        
        isAll_ = false;
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


      // @@protoc_insertion_point(builder_scope:UnlockedFurnitureSuiteDataNotify)
    }

    // @@protoc_insertion_point(class_scope:UnlockedFurnitureSuiteDataNotify)
    private static final UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify();
    }

    public static UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnlockedFurnitureSuiteDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<UnlockedFurnitureSuiteDataNotify>() {
      @java.lang.Override
      public UnlockedFurnitureSuiteDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UnlockedFurnitureSuiteDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UnlockedFurnitureSuiteDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnlockedFurnitureSuiteDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnlockedFurnitureSuiteDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnlockedFurnitureSuiteDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&UnlockedFurnitureSuiteDataNotify.proto" +
      "\"\240\001\n UnlockedFurnitureSuiteDataNotify\022\034\n" +
      "\024furnitureSuiteIdList\030\014 \003(\r\022\r\n\005isAll\030\t \001" +
      "(\010\"O\n\013MOMBAIFGLCB\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJ" +
      "OJ\020\373\"\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032" +
      "\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UnlockedFurnitureSuiteDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UnlockedFurnitureSuiteDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnlockedFurnitureSuiteDataNotify_descriptor,
        new java.lang.String[] { "FurnitureSuiteIdList", "IsAll", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
