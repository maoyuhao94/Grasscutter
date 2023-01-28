// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PersistentDungeonSwitchAvatarReq.proto

public final class PersistentDungeonSwitchAvatarReqOuterClass {
  private PersistentDungeonSwitchAvatarReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PersistentDungeonSwitchAvatarReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PersistentDungeonSwitchAvatarReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 curAvatarGuid = 14;</code>
     * @return The curAvatarGuid.
     */
    long getCurAvatarGuid();

    /**
     * <code>repeated uint64 avatarTeamGuidList = 2;</code>
     * @return A list containing the avatarTeamGuidList.
     */
    java.util.List<java.lang.Long> getAvatarTeamGuidListList();
    /**
     * <code>repeated uint64 avatarTeamGuidList = 2;</code>
     * @return The count of avatarTeamGuidList.
     */
    int getAvatarTeamGuidListCount();
    /**
     * <code>repeated uint64 avatarTeamGuidList = 2;</code>
     * @param index The index of the element to return.
     * @return The avatarTeamGuidList at the given index.
     */
    long getAvatarTeamGuidList(int index);
  }
  /**
   * Protobuf type {@code PersistentDungeonSwitchAvatarReq}
   */
  public static final class PersistentDungeonSwitchAvatarReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PersistentDungeonSwitchAvatarReq)
      PersistentDungeonSwitchAvatarReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PersistentDungeonSwitchAvatarReq.newBuilder() to construct.
    private PersistentDungeonSwitchAvatarReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PersistentDungeonSwitchAvatarReq() {
      avatarTeamGuidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PersistentDungeonSwitchAvatarReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PersistentDungeonSwitchAvatarReq(
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
                avatarTeamGuidList_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              avatarTeamGuidList_.addLong(input.readUInt64());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                avatarTeamGuidList_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                avatarTeamGuidList_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
              break;
            }
            case 112: {

              curAvatarGuid_ = input.readUInt64();
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
          avatarTeamGuidList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PersistentDungeonSwitchAvatarReqOuterClass.internal_static_PersistentDungeonSwitchAvatarReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PersistentDungeonSwitchAvatarReqOuterClass.internal_static_PersistentDungeonSwitchAvatarReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq.class, PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq.Builder.class);
    }

    /**
     * Protobuf enum {@code PersistentDungeonSwitchAvatarReq.GPLOFOJGMOA}
     */
    public enum GPLOFOJGMOA
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1709;</code>
       */
      PEPPOHPHJOJ(1, 1709),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final GPLOFOJGMOA DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final GPLOFOJGMOA EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1709;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1709;
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
      public static GPLOFOJGMOA valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static GPLOFOJGMOA forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1709: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<GPLOFOJGMOA>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          GPLOFOJGMOA> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<GPLOFOJGMOA>() {
              public GPLOFOJGMOA findValueByNumber(int number) {
                return GPLOFOJGMOA.forNumber(number);
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
        return PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final GPLOFOJGMOA[] VALUES = getStaticValuesArray();
      private static GPLOFOJGMOA[] getStaticValuesArray() {
        return new GPLOFOJGMOA[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static GPLOFOJGMOA valueOf(
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

      private GPLOFOJGMOA(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PersistentDungeonSwitchAvatarReq.GPLOFOJGMOA)
    }

    public static final int CURAVATARGUID_FIELD_NUMBER = 14;
    private long curAvatarGuid_;
    /**
     * <code>uint64 curAvatarGuid = 14;</code>
     * @return The curAvatarGuid.
     */
    @java.lang.Override
    public long getCurAvatarGuid() {
      return curAvatarGuid_;
    }

    public static final int AVATARTEAMGUIDLIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.LongList avatarTeamGuidList_;
    /**
     * <code>repeated uint64 avatarTeamGuidList = 2;</code>
     * @return A list containing the avatarTeamGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getAvatarTeamGuidListList() {
      return avatarTeamGuidList_;
    }
    /**
     * <code>repeated uint64 avatarTeamGuidList = 2;</code>
     * @return The count of avatarTeamGuidList.
     */
    public int getAvatarTeamGuidListCount() {
      return avatarTeamGuidList_.size();
    }
    /**
     * <code>repeated uint64 avatarTeamGuidList = 2;</code>
     * @param index The index of the element to return.
     * @return The avatarTeamGuidList at the given index.
     */
    public long getAvatarTeamGuidList(int index) {
      return avatarTeamGuidList_.getLong(index);
    }
    private int avatarTeamGuidListMemoizedSerializedSize = -1;

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
      if (getAvatarTeamGuidListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(avatarTeamGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < avatarTeamGuidList_.size(); i++) {
        output.writeUInt64NoTag(avatarTeamGuidList_.getLong(i));
      }
      if (curAvatarGuid_ != 0L) {
        output.writeUInt64(14, curAvatarGuid_);
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
        for (int i = 0; i < avatarTeamGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(avatarTeamGuidList_.getLong(i));
        }
        size += dataSize;
        if (!getAvatarTeamGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        avatarTeamGuidListMemoizedSerializedSize = dataSize;
      }
      if (curAvatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(14, curAvatarGuid_);
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
      if (!(obj instanceof PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq)) {
        return super.equals(obj);
      }
      PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq other = (PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq) obj;

      if (getCurAvatarGuid()
          != other.getCurAvatarGuid()) return false;
      if (!getAvatarTeamGuidListList()
          .equals(other.getAvatarTeamGuidListList())) return false;
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
      hash = (37 * hash) + CURAVATARGUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCurAvatarGuid());
      if (getAvatarTeamGuidListCount() > 0) {
        hash = (37 * hash) + AVATARTEAMGUIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarTeamGuidListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq parseFrom(
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
    public static Builder newBuilder(PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq prototype) {
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
     * Protobuf type {@code PersistentDungeonSwitchAvatarReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PersistentDungeonSwitchAvatarReq)
        PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PersistentDungeonSwitchAvatarReqOuterClass.internal_static_PersistentDungeonSwitchAvatarReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PersistentDungeonSwitchAvatarReqOuterClass.internal_static_PersistentDungeonSwitchAvatarReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq.class, PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq.Builder.class);
      }

      // Construct using PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq.newBuilder()
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
        curAvatarGuid_ = 0L;

        avatarTeamGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PersistentDungeonSwitchAvatarReqOuterClass.internal_static_PersistentDungeonSwitchAvatarReq_descriptor;
      }

      @java.lang.Override
      public PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq getDefaultInstanceForType() {
        return PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq.getDefaultInstance();
      }

      @java.lang.Override
      public PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq build() {
        PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq buildPartial() {
        PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq result = new PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq(this);
        int from_bitField0_ = bitField0_;
        result.curAvatarGuid_ = curAvatarGuid_;
        if (((bitField0_ & 0x00000001) != 0)) {
          avatarTeamGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.avatarTeamGuidList_ = avatarTeamGuidList_;
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
        if (other instanceof PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq) {
          return mergeFrom((PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq other) {
        if (other == PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq.getDefaultInstance()) return this;
        if (other.getCurAvatarGuid() != 0L) {
          setCurAvatarGuid(other.getCurAvatarGuid());
        }
        if (!other.avatarTeamGuidList_.isEmpty()) {
          if (avatarTeamGuidList_.isEmpty()) {
            avatarTeamGuidList_ = other.avatarTeamGuidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAvatarTeamGuidListIsMutable();
            avatarTeamGuidList_.addAll(other.avatarTeamGuidList_);
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
        PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long curAvatarGuid_ ;
      /**
       * <code>uint64 curAvatarGuid = 14;</code>
       * @return The curAvatarGuid.
       */
      @java.lang.Override
      public long getCurAvatarGuid() {
        return curAvatarGuid_;
      }
      /**
       * <code>uint64 curAvatarGuid = 14;</code>
       * @param value The curAvatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCurAvatarGuid(long value) {
        
        curAvatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 curAvatarGuid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurAvatarGuid() {
        
        curAvatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList avatarTeamGuidList_ = emptyLongList();
      private void ensureAvatarTeamGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          avatarTeamGuidList_ = mutableCopy(avatarTeamGuidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 avatarTeamGuidList = 2;</code>
       * @return A list containing the avatarTeamGuidList.
       */
      public java.util.List<java.lang.Long>
          getAvatarTeamGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(avatarTeamGuidList_) : avatarTeamGuidList_;
      }
      /**
       * <code>repeated uint64 avatarTeamGuidList = 2;</code>
       * @return The count of avatarTeamGuidList.
       */
      public int getAvatarTeamGuidListCount() {
        return avatarTeamGuidList_.size();
      }
      /**
       * <code>repeated uint64 avatarTeamGuidList = 2;</code>
       * @param index The index of the element to return.
       * @return The avatarTeamGuidList at the given index.
       */
      public long getAvatarTeamGuidList(int index) {
        return avatarTeamGuidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 avatarTeamGuidList = 2;</code>
       * @param index The index to set the value at.
       * @param value The avatarTeamGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarTeamGuidList(
          int index, long value) {
        ensureAvatarTeamGuidListIsMutable();
        avatarTeamGuidList_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatarTeamGuidList = 2;</code>
       * @param value The avatarTeamGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAvatarTeamGuidList(long value) {
        ensureAvatarTeamGuidListIsMutable();
        avatarTeamGuidList_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatarTeamGuidList = 2;</code>
       * @param values The avatarTeamGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAvatarTeamGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureAvatarTeamGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, avatarTeamGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatarTeamGuidList = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarTeamGuidList() {
        avatarTeamGuidList_ = emptyLongList();
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


      // @@protoc_insertion_point(builder_scope:PersistentDungeonSwitchAvatarReq)
    }

    // @@protoc_insertion_point(class_scope:PersistentDungeonSwitchAvatarReq)
    private static final PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq();
    }

    public static PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PersistentDungeonSwitchAvatarReq>
        PARSER = new com.google.protobuf.AbstractParser<PersistentDungeonSwitchAvatarReq>() {
      @java.lang.Override
      public PersistentDungeonSwitchAvatarReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PersistentDungeonSwitchAvatarReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PersistentDungeonSwitchAvatarReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PersistentDungeonSwitchAvatarReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public PersistentDungeonSwitchAvatarReqOuterClass.PersistentDungeonSwitchAvatarReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PersistentDungeonSwitchAvatarReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PersistentDungeonSwitchAvatarReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&PersistentDungeonSwitchAvatarReq.proto" +
      "\"\267\001\n PersistentDungeonSwitchAvatarReq\022\025\n" +
      "\rcurAvatarGuid\030\016 \001(\004\022\032\n\022avatarTeamGuidLi" +
      "st\030\002 \003(\004\"`\n\013GPLOFOJGMOA\022\010\n\004NONE\020\000\022\020\n\013PEP" +
      "POHPHJOJ\020\255\r\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMP" +
      "OEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PersistentDungeonSwitchAvatarReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PersistentDungeonSwitchAvatarReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PersistentDungeonSwitchAvatarReq_descriptor,
        new java.lang.String[] { "CurAvatarGuid", "AvatarTeamGuidList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
