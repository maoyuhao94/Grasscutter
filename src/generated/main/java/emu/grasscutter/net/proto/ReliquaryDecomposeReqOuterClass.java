// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReliquaryDecomposeReq.proto

public final class ReliquaryDecomposeReqOuterClass {
  private ReliquaryDecomposeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReliquaryDecomposeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReliquaryDecomposeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 targetCount = 5;</code>
     * @return The targetCount.
     */
    int getTargetCount();

    /**
     * <code>uint32 configId = 13;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>repeated uint64 guidList = 2;</code>
     * @return A list containing the guidList.
     */
    java.util.List<java.lang.Long> getGuidListList();
    /**
     * <code>repeated uint64 guidList = 2;</code>
     * @return The count of guidList.
     */
    int getGuidListCount();
    /**
     * <code>repeated uint64 guidList = 2;</code>
     * @param index The index of the element to return.
     * @return The guidList at the given index.
     */
    long getGuidList(int index);
  }
  /**
   * Protobuf type {@code ReliquaryDecomposeReq}
   */
  public static final class ReliquaryDecomposeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReliquaryDecomposeReq)
      ReliquaryDecomposeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReliquaryDecomposeReq.newBuilder() to construct.
    private ReliquaryDecomposeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReliquaryDecomposeReq() {
      guidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReliquaryDecomposeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReliquaryDecomposeReq(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                guidList_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              guidList_.addLong(input.readUInt64());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                guidList_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                guidList_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
              break;
            }
            case 40: {

              targetCount_ = input.readUInt32();
              break;
            }
            case 104: {

              configId_ = input.readUInt32();
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
          guidList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq.class, ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq.Builder.class);
    }

    /**
     * Protobuf enum {@code ReliquaryDecomposeReq.EPEIECCGNGJ}
     */
    public enum EPEIECCGNGJ
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 640;</code>
       */
      PEPPOHPHJOJ(1, 640),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final EPEIECCGNGJ DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final EPEIECCGNGJ EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 640;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 640;
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
      public static EPEIECCGNGJ valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static EPEIECCGNGJ forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 640: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<EPEIECCGNGJ>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          EPEIECCGNGJ> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<EPEIECCGNGJ>() {
              public EPEIECCGNGJ findValueByNumber(int number) {
                return EPEIECCGNGJ.forNumber(number);
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
        return ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final EPEIECCGNGJ[] VALUES = getStaticValuesArray();
      private static EPEIECCGNGJ[] getStaticValuesArray() {
        return new EPEIECCGNGJ[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static EPEIECCGNGJ valueOf(
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

      private EPEIECCGNGJ(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ReliquaryDecomposeReq.EPEIECCGNGJ)
    }

    public static final int TARGETCOUNT_FIELD_NUMBER = 5;
    private int targetCount_;
    /**
     * <code>uint32 targetCount = 5;</code>
     * @return The targetCount.
     */
    @java.lang.Override
    public int getTargetCount() {
      return targetCount_;
    }

    public static final int CONFIGID_FIELD_NUMBER = 13;
    private int configId_;
    /**
     * <code>uint32 configId = 13;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int GUIDLIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.LongList guidList_;
    /**
     * <code>repeated uint64 guidList = 2;</code>
     * @return A list containing the guidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getGuidListList() {
      return guidList_;
    }
    /**
     * <code>repeated uint64 guidList = 2;</code>
     * @return The count of guidList.
     */
    public int getGuidListCount() {
      return guidList_.size();
    }
    /**
     * <code>repeated uint64 guidList = 2;</code>
     * @param index The index of the element to return.
     * @return The guidList at the given index.
     */
    public long getGuidList(int index) {
      return guidList_.getLong(index);
    }
    private int guidListMemoizedSerializedSize = -1;

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
      if (getGuidListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(guidListMemoizedSerializedSize);
      }
      for (int i = 0; i < guidList_.size(); i++) {
        output.writeUInt64NoTag(guidList_.getLong(i));
      }
      if (targetCount_ != 0) {
        output.writeUInt32(5, targetCount_);
      }
      if (configId_ != 0) {
        output.writeUInt32(13, configId_);
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
        for (int i = 0; i < guidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(guidList_.getLong(i));
        }
        size += dataSize;
        if (!getGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        guidListMemoizedSerializedSize = dataSize;
      }
      if (targetCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, targetCount_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, configId_);
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
      if (!(obj instanceof ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq)) {
        return super.equals(obj);
      }
      ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq other = (ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq) obj;

      if (getTargetCount()
          != other.getTargetCount()) return false;
      if (getConfigId()
          != other.getConfigId()) return false;
      if (!getGuidListList()
          .equals(other.getGuidListList())) return false;
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
      hash = (37 * hash) + TARGETCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getTargetCount();
      hash = (37 * hash) + CONFIGID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      if (getGuidListCount() > 0) {
        hash = (37 * hash) + GUIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getGuidListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parseFrom(
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
    public static Builder newBuilder(ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq prototype) {
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
     * Protobuf type {@code ReliquaryDecomposeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReliquaryDecomposeReq)
        ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq.class, ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq.Builder.class);
      }

      // Construct using ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq.newBuilder()
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
        targetCount_ = 0;

        configId_ = 0;

        guidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ReliquaryDecomposeReqOuterClass.internal_static_ReliquaryDecomposeReq_descriptor;
      }

      @java.lang.Override
      public ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq getDefaultInstanceForType() {
        return ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq.getDefaultInstance();
      }

      @java.lang.Override
      public ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq build() {
        ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq buildPartial() {
        ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq result = new ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq(this);
        int from_bitField0_ = bitField0_;
        result.targetCount_ = targetCount_;
        result.configId_ = configId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          guidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.guidList_ = guidList_;
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
        if (other instanceof ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq) {
          return mergeFrom((ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq other) {
        if (other == ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq.getDefaultInstance()) return this;
        if (other.getTargetCount() != 0) {
          setTargetCount(other.getTargetCount());
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (!other.guidList_.isEmpty()) {
          if (guidList_.isEmpty()) {
            guidList_ = other.guidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGuidListIsMutable();
            guidList_.addAll(other.guidList_);
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
        ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int targetCount_ ;
      /**
       * <code>uint32 targetCount = 5;</code>
       * @return The targetCount.
       */
      @java.lang.Override
      public int getTargetCount() {
        return targetCount_;
      }
      /**
       * <code>uint32 targetCount = 5;</code>
       * @param value The targetCount to set.
       * @return This builder for chaining.
       */
      public Builder setTargetCount(int value) {
        
        targetCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 targetCount = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetCount() {
        
        targetCount_ = 0;
        onChanged();
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 configId = 13;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 configId = 13;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 configId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList guidList_ = emptyLongList();
      private void ensureGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          guidList_ = mutableCopy(guidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 guidList = 2;</code>
       * @return A list containing the guidList.
       */
      public java.util.List<java.lang.Long>
          getGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(guidList_) : guidList_;
      }
      /**
       * <code>repeated uint64 guidList = 2;</code>
       * @return The count of guidList.
       */
      public int getGuidListCount() {
        return guidList_.size();
      }
      /**
       * <code>repeated uint64 guidList = 2;</code>
       * @param index The index of the element to return.
       * @return The guidList at the given index.
       */
      public long getGuidList(int index) {
        return guidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 guidList = 2;</code>
       * @param index The index to set the value at.
       * @param value The guidList to set.
       * @return This builder for chaining.
       */
      public Builder setGuidList(
          int index, long value) {
        ensureGuidListIsMutable();
        guidList_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 guidList = 2;</code>
       * @param value The guidList to add.
       * @return This builder for chaining.
       */
      public Builder addGuidList(long value) {
        ensureGuidListIsMutable();
        guidList_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 guidList = 2;</code>
       * @param values The guidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, guidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 guidList = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuidList() {
        guidList_ = emptyLongList();
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


      // @@protoc_insertion_point(builder_scope:ReliquaryDecomposeReq)
    }

    // @@protoc_insertion_point(class_scope:ReliquaryDecomposeReq)
    private static final ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq();
    }

    public static ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReliquaryDecomposeReq>
        PARSER = new com.google.protobuf.AbstractParser<ReliquaryDecomposeReq>() {
      @java.lang.Override
      public ReliquaryDecomposeReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReliquaryDecomposeReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReliquaryDecomposeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReliquaryDecomposeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReliquaryDecomposeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReliquaryDecomposeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ReliquaryDecomposeReq.proto\"\262\001\n\025Reliqu" +
      "aryDecomposeReq\022\023\n\013targetCount\030\005 \001(\r\022\020\n\010" +
      "configId\030\r \001(\r\022\020\n\010guidList\030\002 \003(\004\"`\n\013EPEI" +
      "ECCGNGJ\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\200\005\022\017\n\013D" +
      "CDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABG" +
      "AOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ReliquaryDecomposeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReliquaryDecomposeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReliquaryDecomposeReq_descriptor,
        new java.lang.String[] { "TargetCount", "ConfigId", "GuidList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
