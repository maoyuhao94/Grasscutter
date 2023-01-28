// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WindFieldDungeonSettleInfo.proto

public final class WindFieldDungeonSettleInfoOuterClass {
  private WindFieldDungeonSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WindFieldDungeonSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WindFieldDungeonSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3300_EMCOILGACOC = 6;</code>
     * @return A list containing the unk3300EMCOILGACOC.
     */
    java.util.List<java.lang.Integer> getUnk3300EMCOILGACOCList();
    /**
     * <code>repeated uint32 Unk3300_EMCOILGACOC = 6;</code>
     * @return The count of unk3300EMCOILGACOC.
     */
    int getUnk3300EMCOILGACOCCount();
    /**
     * <code>repeated uint32 Unk3300_EMCOILGACOC = 6;</code>
     * @param index The index of the element to return.
     * @return The unk3300EMCOILGACOC at the given index.
     */
    int getUnk3300EMCOILGACOC(int index);

    /**
     * <code>.WindFieldDungeonFailReason failReason = 12;</code>
     * @return The enum numeric value on the wire for failReason.
     */
    int getFailReasonValue();
    /**
     * <code>.WindFieldDungeonFailReason failReason = 12;</code>
     * @return The failReason.
     */
    WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason getFailReason();

    /**
     * <code>repeated uint32 Unk3300_FJGFOJBGBKM = 3;</code>
     * @return A list containing the unk3300FJGFOJBGBKM.
     */
    java.util.List<java.lang.Integer> getUnk3300FJGFOJBGBKMList();
    /**
     * <code>repeated uint32 Unk3300_FJGFOJBGBKM = 3;</code>
     * @return The count of unk3300FJGFOJBGBKM.
     */
    int getUnk3300FJGFOJBGBKMCount();
    /**
     * <code>repeated uint32 Unk3300_FJGFOJBGBKM = 3;</code>
     * @param index The index of the element to return.
     * @return The unk3300FJGFOJBGBKM at the given index.
     */
    int getUnk3300FJGFOJBGBKM(int index);
  }
  /**
   * Protobuf type {@code WindFieldDungeonSettleInfo}
   */
  public static final class WindFieldDungeonSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WindFieldDungeonSettleInfo)
      WindFieldDungeonSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WindFieldDungeonSettleInfo.newBuilder() to construct.
    private WindFieldDungeonSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WindFieldDungeonSettleInfo() {
      unk3300EMCOILGACOC_ = emptyIntList();
      failReason_ = 0;
      unk3300FJGFOJBGBKM_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WindFieldDungeonSettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WindFieldDungeonSettleInfo(
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
            case 24: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                unk3300FJGFOJBGBKM_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              unk3300FJGFOJBGBKM_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                unk3300FJGFOJBGBKM_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk3300FJGFOJBGBKM_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 48: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk3300EMCOILGACOC_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unk3300EMCOILGACOC_.addInt(input.readUInt32());
              break;
            }
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unk3300EMCOILGACOC_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk3300EMCOILGACOC_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 96: {
              int rawValue = input.readEnum();

              failReason_ = rawValue;
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          unk3300FJGFOJBGBKM_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          unk3300EMCOILGACOC_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.class, WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.Builder.class);
    }

    public static final int UNK3300_EMCOILGACOC_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList unk3300EMCOILGACOC_;
    /**
     * <code>repeated uint32 Unk3300_EMCOILGACOC = 6;</code>
     * @return A list containing the unk3300EMCOILGACOC.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3300EMCOILGACOCList() {
      return unk3300EMCOILGACOC_;
    }
    /**
     * <code>repeated uint32 Unk3300_EMCOILGACOC = 6;</code>
     * @return The count of unk3300EMCOILGACOC.
     */
    public int getUnk3300EMCOILGACOCCount() {
      return unk3300EMCOILGACOC_.size();
    }
    /**
     * <code>repeated uint32 Unk3300_EMCOILGACOC = 6;</code>
     * @param index The index of the element to return.
     * @return The unk3300EMCOILGACOC at the given index.
     */
    public int getUnk3300EMCOILGACOC(int index) {
      return unk3300EMCOILGACOC_.getInt(index);
    }
    private int unk3300EMCOILGACOCMemoizedSerializedSize = -1;

    public static final int FAILREASON_FIELD_NUMBER = 12;
    private int failReason_;
    /**
     * <code>.WindFieldDungeonFailReason failReason = 12;</code>
     * @return The enum numeric value on the wire for failReason.
     */
    @java.lang.Override public int getFailReasonValue() {
      return failReason_;
    }
    /**
     * <code>.WindFieldDungeonFailReason failReason = 12;</code>
     * @return The failReason.
     */
    @java.lang.Override public WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason getFailReason() {
      @SuppressWarnings("deprecation")
      WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason result = WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.valueOf(failReason_);
      return result == null ? WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.UNRECOGNIZED : result;
    }

    public static final int UNK3300_FJGFOJBGBKM_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList unk3300FJGFOJBGBKM_;
    /**
     * <code>repeated uint32 Unk3300_FJGFOJBGBKM = 3;</code>
     * @return A list containing the unk3300FJGFOJBGBKM.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3300FJGFOJBGBKMList() {
      return unk3300FJGFOJBGBKM_;
    }
    /**
     * <code>repeated uint32 Unk3300_FJGFOJBGBKM = 3;</code>
     * @return The count of unk3300FJGFOJBGBKM.
     */
    public int getUnk3300FJGFOJBGBKMCount() {
      return unk3300FJGFOJBGBKM_.size();
    }
    /**
     * <code>repeated uint32 Unk3300_FJGFOJBGBKM = 3;</code>
     * @param index The index of the element to return.
     * @return The unk3300FJGFOJBGBKM at the given index.
     */
    public int getUnk3300FJGFOJBGBKM(int index) {
      return unk3300FJGFOJBGBKM_.getInt(index);
    }
    private int unk3300FJGFOJBGBKMMemoizedSerializedSize = -1;

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
      if (getUnk3300FJGFOJBGBKMList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(unk3300FJGFOJBGBKMMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3300FJGFOJBGBKM_.size(); i++) {
        output.writeUInt32NoTag(unk3300FJGFOJBGBKM_.getInt(i));
      }
      if (getUnk3300EMCOILGACOCList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(unk3300EMCOILGACOCMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3300EMCOILGACOC_.size(); i++) {
        output.writeUInt32NoTag(unk3300EMCOILGACOC_.getInt(i));
      }
      if (failReason_ != WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.WIND_FIELD_DUNGEON_FAIL_REASON_NONE.getNumber()) {
        output.writeEnum(12, failReason_);
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
        for (int i = 0; i < unk3300FJGFOJBGBKM_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3300FJGFOJBGBKM_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3300FJGFOJBGBKMList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3300FJGFOJBGBKMMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk3300EMCOILGACOC_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3300EMCOILGACOC_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3300EMCOILGACOCList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3300EMCOILGACOCMemoizedSerializedSize = dataSize;
      }
      if (failReason_ != WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.WIND_FIELD_DUNGEON_FAIL_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, failReason_);
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
      if (!(obj instanceof WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo)) {
        return super.equals(obj);
      }
      WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo other = (WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo) obj;

      if (!getUnk3300EMCOILGACOCList()
          .equals(other.getUnk3300EMCOILGACOCList())) return false;
      if (failReason_ != other.failReason_) return false;
      if (!getUnk3300FJGFOJBGBKMList()
          .equals(other.getUnk3300FJGFOJBGBKMList())) return false;
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
      if (getUnk3300EMCOILGACOCCount() > 0) {
        hash = (37 * hash) + UNK3300_EMCOILGACOC_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3300EMCOILGACOCList().hashCode();
      }
      hash = (37 * hash) + FAILREASON_FIELD_NUMBER;
      hash = (53 * hash) + failReason_;
      if (getUnk3300FJGFOJBGBKMCount() > 0) {
        hash = (37 * hash) + UNK3300_FJGFOJBGBKM_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3300FJGFOJBGBKMList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
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
    public static Builder newBuilder(WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo prototype) {
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
     * Protobuf type {@code WindFieldDungeonSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WindFieldDungeonSettleInfo)
        WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.class, WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.Builder.class);
      }

      // Construct using WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.newBuilder()
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
        unk3300EMCOILGACOC_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        failReason_ = 0;

        unk3300FJGFOJBGBKM_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      public WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo getDefaultInstanceForType() {
        return WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo build() {
        WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo buildPartial() {
        WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo result = new WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3300EMCOILGACOC_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3300EMCOILGACOC_ = unk3300EMCOILGACOC_;
        result.failReason_ = failReason_;
        if (((bitField0_ & 0x00000002) != 0)) {
          unk3300FJGFOJBGBKM_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.unk3300FJGFOJBGBKM_ = unk3300FJGFOJBGBKM_;
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
        if (other instanceof WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo) {
          return mergeFrom((WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo other) {
        if (other == WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.getDefaultInstance()) return this;
        if (!other.unk3300EMCOILGACOC_.isEmpty()) {
          if (unk3300EMCOILGACOC_.isEmpty()) {
            unk3300EMCOILGACOC_ = other.unk3300EMCOILGACOC_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3300EMCOILGACOCIsMutable();
            unk3300EMCOILGACOC_.addAll(other.unk3300EMCOILGACOC_);
          }
          onChanged();
        }
        if (other.failReason_ != 0) {
          setFailReasonValue(other.getFailReasonValue());
        }
        if (!other.unk3300FJGFOJBGBKM_.isEmpty()) {
          if (unk3300FJGFOJBGBKM_.isEmpty()) {
            unk3300FJGFOJBGBKM_ = other.unk3300FJGFOJBGBKM_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureUnk3300FJGFOJBGBKMIsMutable();
            unk3300FJGFOJBGBKM_.addAll(other.unk3300FJGFOJBGBKM_);
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
        WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList unk3300EMCOILGACOC_ = emptyIntList();
      private void ensureUnk3300EMCOILGACOCIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3300EMCOILGACOC_ = mutableCopy(unk3300EMCOILGACOC_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3300_EMCOILGACOC = 6;</code>
       * @return A list containing the unk3300EMCOILGACOC.
       */
      public java.util.List<java.lang.Integer>
          getUnk3300EMCOILGACOCList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3300EMCOILGACOC_) : unk3300EMCOILGACOC_;
      }
      /**
       * <code>repeated uint32 Unk3300_EMCOILGACOC = 6;</code>
       * @return The count of unk3300EMCOILGACOC.
       */
      public int getUnk3300EMCOILGACOCCount() {
        return unk3300EMCOILGACOC_.size();
      }
      /**
       * <code>repeated uint32 Unk3300_EMCOILGACOC = 6;</code>
       * @param index The index of the element to return.
       * @return The unk3300EMCOILGACOC at the given index.
       */
      public int getUnk3300EMCOILGACOC(int index) {
        return unk3300EMCOILGACOC_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3300_EMCOILGACOC = 6;</code>
       * @param index The index to set the value at.
       * @param value The unk3300EMCOILGACOC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300EMCOILGACOC(
          int index, int value) {
        ensureUnk3300EMCOILGACOCIsMutable();
        unk3300EMCOILGACOC_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_EMCOILGACOC = 6;</code>
       * @param value The unk3300EMCOILGACOC to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3300EMCOILGACOC(int value) {
        ensureUnk3300EMCOILGACOCIsMutable();
        unk3300EMCOILGACOC_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_EMCOILGACOC = 6;</code>
       * @param values The unk3300EMCOILGACOC to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3300EMCOILGACOC(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3300EMCOILGACOCIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3300EMCOILGACOC_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_EMCOILGACOC = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300EMCOILGACOC() {
        unk3300EMCOILGACOC_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int failReason_ = 0;
      /**
       * <code>.WindFieldDungeonFailReason failReason = 12;</code>
       * @return The enum numeric value on the wire for failReason.
       */
      @java.lang.Override public int getFailReasonValue() {
        return failReason_;
      }
      /**
       * <code>.WindFieldDungeonFailReason failReason = 12;</code>
       * @param value The enum numeric value on the wire for failReason to set.
       * @return This builder for chaining.
       */
      public Builder setFailReasonValue(int value) {
        
        failReason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.WindFieldDungeonFailReason failReason = 12;</code>
       * @return The failReason.
       */
      @java.lang.Override
      public WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason getFailReason() {
        @SuppressWarnings("deprecation")
        WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason result = WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.valueOf(failReason_);
        return result == null ? WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.WindFieldDungeonFailReason failReason = 12;</code>
       * @param value The failReason to set.
       * @return This builder for chaining.
       */
      public Builder setFailReason(WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        failReason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.WindFieldDungeonFailReason failReason = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearFailReason() {
        
        failReason_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk3300FJGFOJBGBKM_ = emptyIntList();
      private void ensureUnk3300FJGFOJBGBKMIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          unk3300FJGFOJBGBKM_ = mutableCopy(unk3300FJGFOJBGBKM_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 Unk3300_FJGFOJBGBKM = 3;</code>
       * @return A list containing the unk3300FJGFOJBGBKM.
       */
      public java.util.List<java.lang.Integer>
          getUnk3300FJGFOJBGBKMList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(unk3300FJGFOJBGBKM_) : unk3300FJGFOJBGBKM_;
      }
      /**
       * <code>repeated uint32 Unk3300_FJGFOJBGBKM = 3;</code>
       * @return The count of unk3300FJGFOJBGBKM.
       */
      public int getUnk3300FJGFOJBGBKMCount() {
        return unk3300FJGFOJBGBKM_.size();
      }
      /**
       * <code>repeated uint32 Unk3300_FJGFOJBGBKM = 3;</code>
       * @param index The index of the element to return.
       * @return The unk3300FJGFOJBGBKM at the given index.
       */
      public int getUnk3300FJGFOJBGBKM(int index) {
        return unk3300FJGFOJBGBKM_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3300_FJGFOJBGBKM = 3;</code>
       * @param index The index to set the value at.
       * @param value The unk3300FJGFOJBGBKM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300FJGFOJBGBKM(
          int index, int value) {
        ensureUnk3300FJGFOJBGBKMIsMutable();
        unk3300FJGFOJBGBKM_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_FJGFOJBGBKM = 3;</code>
       * @param value The unk3300FJGFOJBGBKM to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3300FJGFOJBGBKM(int value) {
        ensureUnk3300FJGFOJBGBKMIsMutable();
        unk3300FJGFOJBGBKM_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_FJGFOJBGBKM = 3;</code>
       * @param values The unk3300FJGFOJBGBKM to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3300FJGFOJBGBKM(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3300FJGFOJBGBKMIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3300FJGFOJBGBKM_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_FJGFOJBGBKM = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300FJGFOJBGBKM() {
        unk3300FJGFOJBGBKM_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:WindFieldDungeonSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:WindFieldDungeonSettleInfo)
    private static final WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo();
    }

    public static WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WindFieldDungeonSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<WindFieldDungeonSettleInfo>() {
      @java.lang.Override
      public WindFieldDungeonSettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WindFieldDungeonSettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WindFieldDungeonSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WindFieldDungeonSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WindFieldDungeonSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n WindFieldDungeonSettleInfo.proto\032 Wind" +
      "FieldDungeonFailReason.proto\"\207\001\n\032WindFie" +
      "ldDungeonSettleInfo\022\033\n\023Unk3300_EMCOILGAC" +
      "OC\030\006 \003(\r\022/\n\nfailReason\030\014 \001(\0162\033.WindField" +
      "DungeonFailReason\022\033\n\023Unk3300_FJGFOJBGBKM" +
      "\030\003 \003(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          WindFieldDungeonFailReasonOuterClass.getDescriptor(),
        });
    internal_static_WindFieldDungeonSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WindFieldDungeonSettleInfo_descriptor,
        new java.lang.String[] { "Unk3300EMCOILGACOC", "FailReason", "Unk3300FJGFOJBGBKM", });
    WindFieldDungeonFailReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
