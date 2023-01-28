// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CheckUgcUpdateRsp.proto

public final class CheckUgcUpdateRspOuterClass {
  private CheckUgcUpdateRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CheckUgcUpdateRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CheckUgcUpdateRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.UgcType ugcType = 6;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    int getUgcTypeValue();
    /**
     * <code>.UgcType ugcType = 6;</code>
     * @return The ugcType.
     */
    UgcTypeOuterClass.UgcType getUgcType();

    /**
     * <code>repeated uint64 updateUgcGuidList = 2;</code>
     * @return A list containing the updateUgcGuidList.
     */
    java.util.List<java.lang.Long> getUpdateUgcGuidListList();
    /**
     * <code>repeated uint64 updateUgcGuidList = 2;</code>
     * @return The count of updateUgcGuidList.
     */
    int getUpdateUgcGuidListCount();
    /**
     * <code>repeated uint64 updateUgcGuidList = 2;</code>
     * @param index The index of the element to return.
     * @return The updateUgcGuidList at the given index.
     */
    long getUpdateUgcGuidList(int index);
  }
  /**
   * Protobuf type {@code CheckUgcUpdateRsp}
   */
  public static final class CheckUgcUpdateRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CheckUgcUpdateRsp)
      CheckUgcUpdateRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CheckUgcUpdateRsp.newBuilder() to construct.
    private CheckUgcUpdateRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CheckUgcUpdateRsp() {
      ugcType_ = 0;
      updateUgcGuidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CheckUgcUpdateRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CheckUgcUpdateRsp(
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
                updateUgcGuidList_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              updateUgcGuidList_.addLong(input.readUInt64());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                updateUgcGuidList_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                updateUgcGuidList_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
              break;
            }
            case 48: {
              int rawValue = input.readEnum();

              ugcType_ = rawValue;
              break;
            }
            case 112: {

              retcode_ = input.readInt32();
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
          updateUgcGuidList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CheckUgcUpdateRspOuterClass.internal_static_CheckUgcUpdateRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CheckUgcUpdateRspOuterClass.internal_static_CheckUgcUpdateRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp.class, CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code CheckUgcUpdateRsp.KICAKIMJIPI}
     */
    public enum KICAKIMJIPI
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 6340;</code>
       */
      PEPPOHPHJOJ(1, 6340),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final KICAKIMJIPI DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 6340;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 6340;
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
      public static KICAKIMJIPI valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static KICAKIMJIPI forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 6340: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<KICAKIMJIPI>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          KICAKIMJIPI> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<KICAKIMJIPI>() {
              public KICAKIMJIPI findValueByNumber(int number) {
                return KICAKIMJIPI.forNumber(number);
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
        return CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final KICAKIMJIPI[] VALUES = getStaticValuesArray();
      private static KICAKIMJIPI[] getStaticValuesArray() {
        return new KICAKIMJIPI[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static KICAKIMJIPI valueOf(
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

      private KICAKIMJIPI(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:CheckUgcUpdateRsp.KICAKIMJIPI)
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UGCTYPE_FIELD_NUMBER = 6;
    private int ugcType_;
    /**
     * <code>.UgcType ugcType = 6;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    @java.lang.Override public int getUgcTypeValue() {
      return ugcType_;
    }
    /**
     * <code>.UgcType ugcType = 6;</code>
     * @return The ugcType.
     */
    @java.lang.Override public UgcTypeOuterClass.UgcType getUgcType() {
      @SuppressWarnings("deprecation")
      UgcTypeOuterClass.UgcType result = UgcTypeOuterClass.UgcType.valueOf(ugcType_);
      return result == null ? UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
    }

    public static final int UPDATEUGCGUIDLIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.LongList updateUgcGuidList_;
    /**
     * <code>repeated uint64 updateUgcGuidList = 2;</code>
     * @return A list containing the updateUgcGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getUpdateUgcGuidListList() {
      return updateUgcGuidList_;
    }
    /**
     * <code>repeated uint64 updateUgcGuidList = 2;</code>
     * @return The count of updateUgcGuidList.
     */
    public int getUpdateUgcGuidListCount() {
      return updateUgcGuidList_.size();
    }
    /**
     * <code>repeated uint64 updateUgcGuidList = 2;</code>
     * @param index The index of the element to return.
     * @return The updateUgcGuidList at the given index.
     */
    public long getUpdateUgcGuidList(int index) {
      return updateUgcGuidList_.getLong(index);
    }
    private int updateUgcGuidListMemoizedSerializedSize = -1;

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
      if (getUpdateUgcGuidListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(updateUgcGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < updateUgcGuidList_.size(); i++) {
        output.writeUInt64NoTag(updateUgcGuidList_.getLong(i));
      }
      if (ugcType_ != UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        output.writeEnum(6, ugcType_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
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
        for (int i = 0; i < updateUgcGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(updateUgcGuidList_.getLong(i));
        }
        size += dataSize;
        if (!getUpdateUgcGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        updateUgcGuidListMemoizedSerializedSize = dataSize;
      }
      if (ugcType_ != UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, ugcType_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp)) {
        return super.equals(obj);
      }
      CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp other = (CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (ugcType_ != other.ugcType_) return false;
      if (!getUpdateUgcGuidListList()
          .equals(other.getUpdateUgcGuidListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + UGCTYPE_FIELD_NUMBER;
      hash = (53 * hash) + ugcType_;
      if (getUpdateUgcGuidListCount() > 0) {
        hash = (37 * hash) + UPDATEUGCGUIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getUpdateUgcGuidListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
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
    public static Builder newBuilder(CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp prototype) {
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
     * Protobuf type {@code CheckUgcUpdateRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CheckUgcUpdateRsp)
        CheckUgcUpdateRspOuterClass.CheckUgcUpdateRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CheckUgcUpdateRspOuterClass.internal_static_CheckUgcUpdateRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CheckUgcUpdateRspOuterClass.internal_static_CheckUgcUpdateRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp.class, CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp.Builder.class);
      }

      // Construct using CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp.newBuilder()
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
        retcode_ = 0;

        ugcType_ = 0;

        updateUgcGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CheckUgcUpdateRspOuterClass.internal_static_CheckUgcUpdateRsp_descriptor;
      }

      @java.lang.Override
      public CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp getDefaultInstanceForType() {
        return CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp.getDefaultInstance();
      }

      @java.lang.Override
      public CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp build() {
        CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp buildPartial() {
        CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp result = new CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        result.ugcType_ = ugcType_;
        if (((bitField0_ & 0x00000001) != 0)) {
          updateUgcGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.updateUgcGuidList_ = updateUgcGuidList_;
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
        if (other instanceof CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp) {
          return mergeFrom((CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp other) {
        if (other == CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.ugcType_ != 0) {
          setUgcTypeValue(other.getUgcTypeValue());
        }
        if (!other.updateUgcGuidList_.isEmpty()) {
          if (updateUgcGuidList_.isEmpty()) {
            updateUgcGuidList_ = other.updateUgcGuidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUpdateUgcGuidListIsMutable();
            updateUgcGuidList_.addAll(other.updateUgcGuidList_);
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
        CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int ugcType_ = 0;
      /**
       * <code>.UgcType ugcType = 6;</code>
       * @return The enum numeric value on the wire for ugcType.
       */
      @java.lang.Override public int getUgcTypeValue() {
        return ugcType_;
      }
      /**
       * <code>.UgcType ugcType = 6;</code>
       * @param value The enum numeric value on the wire for ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcTypeValue(int value) {
        
        ugcType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugcType = 6;</code>
       * @return The ugcType.
       */
      @java.lang.Override
      public UgcTypeOuterClass.UgcType getUgcType() {
        @SuppressWarnings("deprecation")
        UgcTypeOuterClass.UgcType result = UgcTypeOuterClass.UgcType.valueOf(ugcType_);
        return result == null ? UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
      }
      /**
       * <code>.UgcType ugcType = 6;</code>
       * @param value The ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcType(UgcTypeOuterClass.UgcType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        ugcType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugcType = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcType() {
        
        ugcType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList updateUgcGuidList_ = emptyLongList();
      private void ensureUpdateUgcGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          updateUgcGuidList_ = mutableCopy(updateUgcGuidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 updateUgcGuidList = 2;</code>
       * @return A list containing the updateUgcGuidList.
       */
      public java.util.List<java.lang.Long>
          getUpdateUgcGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(updateUgcGuidList_) : updateUgcGuidList_;
      }
      /**
       * <code>repeated uint64 updateUgcGuidList = 2;</code>
       * @return The count of updateUgcGuidList.
       */
      public int getUpdateUgcGuidListCount() {
        return updateUgcGuidList_.size();
      }
      /**
       * <code>repeated uint64 updateUgcGuidList = 2;</code>
       * @param index The index of the element to return.
       * @return The updateUgcGuidList at the given index.
       */
      public long getUpdateUgcGuidList(int index) {
        return updateUgcGuidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 updateUgcGuidList = 2;</code>
       * @param index The index to set the value at.
       * @param value The updateUgcGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setUpdateUgcGuidList(
          int index, long value) {
        ensureUpdateUgcGuidListIsMutable();
        updateUgcGuidList_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 updateUgcGuidList = 2;</code>
       * @param value The updateUgcGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addUpdateUgcGuidList(long value) {
        ensureUpdateUgcGuidListIsMutable();
        updateUgcGuidList_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 updateUgcGuidList = 2;</code>
       * @param values The updateUgcGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllUpdateUgcGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureUpdateUgcGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, updateUgcGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 updateUgcGuidList = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUpdateUgcGuidList() {
        updateUgcGuidList_ = emptyLongList();
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


      // @@protoc_insertion_point(builder_scope:CheckUgcUpdateRsp)
    }

    // @@protoc_insertion_point(class_scope:CheckUgcUpdateRsp)
    private static final CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp();
    }

    public static CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CheckUgcUpdateRsp>
        PARSER = new com.google.protobuf.AbstractParser<CheckUgcUpdateRsp>() {
      @java.lang.Override
      public CheckUgcUpdateRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CheckUgcUpdateRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CheckUgcUpdateRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CheckUgcUpdateRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CheckUgcUpdateRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CheckUgcUpdateRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027CheckUgcUpdateRsp.proto\032\rUgcType.proto" +
      "\"\253\001\n\021CheckUgcUpdateRsp\022\017\n\007retcode\030\016 \001(\005\022" +
      "\031\n\007ugcType\030\006 \001(\0162\010.UgcType\022\031\n\021updateUgcG" +
      "uidList\030\002 \003(\004\"O\n\013KICAKIMJIPI\022\010\n\004NONE\020\000\022\020" +
      "\n\013PEPPOHPHJOJ\020\3041\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNB" +
      "KOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          UgcTypeOuterClass.getDescriptor(),
        });
    internal_static_CheckUgcUpdateRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CheckUgcUpdateRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CheckUgcUpdateRsp_descriptor,
        new java.lang.String[] { "Retcode", "UgcType", "UpdateUgcGuidList", });
    UgcTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
