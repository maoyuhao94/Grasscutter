// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TeamChainTakeCostumeRewardReq.proto

public final class TeamChainTakeCostumeRewardReqOuterClass {
  private TeamChainTakeCostumeRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TeamChainTakeCostumeRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TeamChainTakeCostumeRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 ehbfihcdoli = 12;</code>
     * @return A list containing the ehbfihcdoli.
     */
    java.util.List<java.lang.Integer> getEhbfihcdoliList();
    /**
     * <code>repeated uint32 ehbfihcdoli = 12;</code>
     * @return The count of ehbfihcdoli.
     */
    int getEhbfihcdoliCount();
    /**
     * <code>repeated uint32 ehbfihcdoli = 12;</code>
     * @param index The index of the element to return.
     * @return The ehbfihcdoli at the given index.
     */
    int getEhbfihcdoli(int index);

    /**
     * <code>uint32 stageId = 11;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * Protobuf type {@code TeamChainTakeCostumeRewardReq}
   */
  public static final class TeamChainTakeCostumeRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TeamChainTakeCostumeRewardReq)
      TeamChainTakeCostumeRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TeamChainTakeCostumeRewardReq.newBuilder() to construct.
    private TeamChainTakeCostumeRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TeamChainTakeCostumeRewardReq() {
      ehbfihcdoli_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TeamChainTakeCostumeRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TeamChainTakeCostumeRewardReq(
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
            case 88: {

              stageId_ = input.readUInt32();
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                ehbfihcdoli_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              ehbfihcdoli_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                ehbfihcdoli_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                ehbfihcdoli_.addInt(input.readUInt32());
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
          ehbfihcdoli_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TeamChainTakeCostumeRewardReqOuterClass.internal_static_TeamChainTakeCostumeRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TeamChainTakeCostumeRewardReqOuterClass.internal_static_TeamChainTakeCostumeRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq.class, TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq.Builder.class);
    }

    /**
     * Protobuf enum {@code TeamChainTakeCostumeRewardReq.NIJONKEJPPP}
     */
    public enum NIJONKEJPPP
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 20331;</code>
       */
      PEPPOHPHJOJ(1, 20331),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final NIJONKEJPPP DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 20331;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 20331;
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
      public static NIJONKEJPPP valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static NIJONKEJPPP forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 20331: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<NIJONKEJPPP>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          NIJONKEJPPP> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<NIJONKEJPPP>() {
              public NIJONKEJPPP findValueByNumber(int number) {
                return NIJONKEJPPP.forNumber(number);
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
        return TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final NIJONKEJPPP[] VALUES = getStaticValuesArray();
      private static NIJONKEJPPP[] getStaticValuesArray() {
        return new NIJONKEJPPP[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static NIJONKEJPPP valueOf(
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

      private NIJONKEJPPP(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:TeamChainTakeCostumeRewardReq.NIJONKEJPPP)
    }

    public static final int EHBFIHCDOLI_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList ehbfihcdoli_;
    /**
     * <code>repeated uint32 ehbfihcdoli = 12;</code>
     * @return A list containing the ehbfihcdoli.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEhbfihcdoliList() {
      return ehbfihcdoli_;
    }
    /**
     * <code>repeated uint32 ehbfihcdoli = 12;</code>
     * @return The count of ehbfihcdoli.
     */
    public int getEhbfihcdoliCount() {
      return ehbfihcdoli_.size();
    }
    /**
     * <code>repeated uint32 ehbfihcdoli = 12;</code>
     * @param index The index of the element to return.
     * @return The ehbfihcdoli at the given index.
     */
    public int getEhbfihcdoli(int index) {
      return ehbfihcdoli_.getInt(index);
    }
    private int ehbfihcdoliMemoizedSerializedSize = -1;

    public static final int STAGEID_FIELD_NUMBER = 11;
    private int stageId_;
    /**
     * <code>uint32 stageId = 11;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (stageId_ != 0) {
        output.writeUInt32(11, stageId_);
      }
      if (getEhbfihcdoliList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(ehbfihcdoliMemoizedSerializedSize);
      }
      for (int i = 0; i < ehbfihcdoli_.size(); i++) {
        output.writeUInt32NoTag(ehbfihcdoli_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, stageId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < ehbfihcdoli_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(ehbfihcdoli_.getInt(i));
        }
        size += dataSize;
        if (!getEhbfihcdoliList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        ehbfihcdoliMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq)) {
        return super.equals(obj);
      }
      TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq other = (TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq) obj;

      if (!getEhbfihcdoliList()
          .equals(other.getEhbfihcdoliList())) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      if (getEhbfihcdoliCount() > 0) {
        hash = (37 * hash) + EHBFIHCDOLI_FIELD_NUMBER;
        hash = (53 * hash) + getEhbfihcdoliList().hashCode();
      }
      hash = (37 * hash) + STAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq parseFrom(
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
    public static Builder newBuilder(TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq prototype) {
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
     * Protobuf type {@code TeamChainTakeCostumeRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TeamChainTakeCostumeRewardReq)
        TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return TeamChainTakeCostumeRewardReqOuterClass.internal_static_TeamChainTakeCostumeRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return TeamChainTakeCostumeRewardReqOuterClass.internal_static_TeamChainTakeCostumeRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq.class, TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq.Builder.class);
      }

      // Construct using TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq.newBuilder()
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
        ehbfihcdoli_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        stageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TeamChainTakeCostumeRewardReqOuterClass.internal_static_TeamChainTakeCostumeRewardReq_descriptor;
      }

      @java.lang.Override
      public TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq getDefaultInstanceForType() {
        return TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq build() {
        TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq buildPartial() {
        TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq result = new TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          ehbfihcdoli_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ehbfihcdoli_ = ehbfihcdoli_;
        result.stageId_ = stageId_;
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
        if (other instanceof TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq) {
          return mergeFrom((TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq other) {
        if (other == TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq.getDefaultInstance()) return this;
        if (!other.ehbfihcdoli_.isEmpty()) {
          if (ehbfihcdoli_.isEmpty()) {
            ehbfihcdoli_ = other.ehbfihcdoli_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEhbfihcdoliIsMutable();
            ehbfihcdoli_.addAll(other.ehbfihcdoli_);
          }
          onChanged();
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
        TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList ehbfihcdoli_ = emptyIntList();
      private void ensureEhbfihcdoliIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          ehbfihcdoli_ = mutableCopy(ehbfihcdoli_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 ehbfihcdoli = 12;</code>
       * @return A list containing the ehbfihcdoli.
       */
      public java.util.List<java.lang.Integer>
          getEhbfihcdoliList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(ehbfihcdoli_) : ehbfihcdoli_;
      }
      /**
       * <code>repeated uint32 ehbfihcdoli = 12;</code>
       * @return The count of ehbfihcdoli.
       */
      public int getEhbfihcdoliCount() {
        return ehbfihcdoli_.size();
      }
      /**
       * <code>repeated uint32 ehbfihcdoli = 12;</code>
       * @param index The index of the element to return.
       * @return The ehbfihcdoli at the given index.
       */
      public int getEhbfihcdoli(int index) {
        return ehbfihcdoli_.getInt(index);
      }
      /**
       * <code>repeated uint32 ehbfihcdoli = 12;</code>
       * @param index The index to set the value at.
       * @param value The ehbfihcdoli to set.
       * @return This builder for chaining.
       */
      public Builder setEhbfihcdoli(
          int index, int value) {
        ensureEhbfihcdoliIsMutable();
        ehbfihcdoli_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 ehbfihcdoli = 12;</code>
       * @param value The ehbfihcdoli to add.
       * @return This builder for chaining.
       */
      public Builder addEhbfihcdoli(int value) {
        ensureEhbfihcdoliIsMutable();
        ehbfihcdoli_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 ehbfihcdoli = 12;</code>
       * @param values The ehbfihcdoli to add.
       * @return This builder for chaining.
       */
      public Builder addAllEhbfihcdoli(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEhbfihcdoliIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ehbfihcdoli_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 ehbfihcdoli = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearEhbfihcdoli() {
        ehbfihcdoli_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stageId = 11;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stageId = 11;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stageId = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TeamChainTakeCostumeRewardReq)
    }

    // @@protoc_insertion_point(class_scope:TeamChainTakeCostumeRewardReq)
    private static final TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq();
    }

    public static TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TeamChainTakeCostumeRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<TeamChainTakeCostumeRewardReq>() {
      @java.lang.Override
      public TeamChainTakeCostumeRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TeamChainTakeCostumeRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TeamChainTakeCostumeRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TeamChainTakeCostumeRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public TeamChainTakeCostumeRewardReqOuterClass.TeamChainTakeCostumeRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TeamChainTakeCostumeRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TeamChainTakeCostumeRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#TeamChainTakeCostumeRewardReq.proto\"\227\001" +
      "\n\035TeamChainTakeCostumeRewardReq\022\023\n\013ehbfi" +
      "hcdoli\030\014 \003(\r\022\017\n\007stageId\030\013 \001(\r\"P\n\013NIJONKE" +
      "JPPP\022\010\n\004NONE\020\000\022\021\n\013PEPPOHPHJOJ\020\353\236\001\022\017\n\013DCD" +
      "NILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TeamChainTakeCostumeRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TeamChainTakeCostumeRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TeamChainTakeCostumeRewardReq_descriptor,
        new java.lang.String[] { "Ehbfihcdoli", "StageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
