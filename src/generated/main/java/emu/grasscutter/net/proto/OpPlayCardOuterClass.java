// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpPlayCard.proto

public final class OpPlayCardOuterClass {
  private OpPlayCardOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OpPlayCardOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpPlayCard)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 replaceCardGuid = 6;</code>
     * @return The replaceCardGuid.
     */
    int getReplaceCardGuid();

    /**
     * <code>repeated uint32 targetCardGuidList = 11;</code>
     * @return A list containing the targetCardGuidList.
     */
    java.util.List<java.lang.Integer> getTargetCardGuidListList();
    /**
     * <code>repeated uint32 targetCardGuidList = 11;</code>
     * @return The count of targetCardGuidList.
     */
    int getTargetCardGuidListCount();
    /**
     * <code>repeated uint32 targetCardGuidList = 11;</code>
     * @param index The index of the element to return.
     * @return The targetCardGuidList at the given index.
     */
    int getTargetCardGuidList(int index);

    /**
     * <code>uint32 cardGuid = 14;</code>
     * @return The cardGuid.
     */
    int getCardGuid();

    /**
     * <code>repeated uint32 costDiceIndexList = 13;</code>
     * @return A list containing the costDiceIndexList.
     */
    java.util.List<java.lang.Integer> getCostDiceIndexListList();
    /**
     * <code>repeated uint32 costDiceIndexList = 13;</code>
     * @return The count of costDiceIndexList.
     */
    int getCostDiceIndexListCount();
    /**
     * <code>repeated uint32 costDiceIndexList = 13;</code>
     * @param index The index of the element to return.
     * @return The costDiceIndexList at the given index.
     */
    int getCostDiceIndexList(int index);
  }
  /**
   * Protobuf type {@code OpPlayCard}
   */
  public static final class OpPlayCard extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OpPlayCard)
      OpPlayCardOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpPlayCard.newBuilder() to construct.
    private OpPlayCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpPlayCard() {
      targetCardGuidList_ = emptyIntList();
      costDiceIndexList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpPlayCard();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OpPlayCard(
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
            case 48: {

              replaceCardGuid_ = input.readUInt32();
              break;
            }
            case 88: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                targetCardGuidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              targetCardGuidList_.addInt(input.readUInt32());
              break;
            }
            case 90: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                targetCardGuidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                targetCardGuidList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                costDiceIndexList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              costDiceIndexList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                costDiceIndexList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                costDiceIndexList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 112: {

              cardGuid_ = input.readUInt32();
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
          targetCardGuidList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          costDiceIndexList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return OpPlayCardOuterClass.internal_static_OpPlayCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return OpPlayCardOuterClass.internal_static_OpPlayCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              OpPlayCardOuterClass.OpPlayCard.class, OpPlayCardOuterClass.OpPlayCard.Builder.class);
    }

    public static final int REPLACECARDGUID_FIELD_NUMBER = 6;
    private int replaceCardGuid_;
    /**
     * <code>uint32 replaceCardGuid = 6;</code>
     * @return The replaceCardGuid.
     */
    @java.lang.Override
    public int getReplaceCardGuid() {
      return replaceCardGuid_;
    }

    public static final int TARGETCARDGUIDLIST_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList targetCardGuidList_;
    /**
     * <code>repeated uint32 targetCardGuidList = 11;</code>
     * @return A list containing the targetCardGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getTargetCardGuidListList() {
      return targetCardGuidList_;
    }
    /**
     * <code>repeated uint32 targetCardGuidList = 11;</code>
     * @return The count of targetCardGuidList.
     */
    public int getTargetCardGuidListCount() {
      return targetCardGuidList_.size();
    }
    /**
     * <code>repeated uint32 targetCardGuidList = 11;</code>
     * @param index The index of the element to return.
     * @return The targetCardGuidList at the given index.
     */
    public int getTargetCardGuidList(int index) {
      return targetCardGuidList_.getInt(index);
    }
    private int targetCardGuidListMemoizedSerializedSize = -1;

    public static final int CARDGUID_FIELD_NUMBER = 14;
    private int cardGuid_;
    /**
     * <code>uint32 cardGuid = 14;</code>
     * @return The cardGuid.
     */
    @java.lang.Override
    public int getCardGuid() {
      return cardGuid_;
    }

    public static final int COSTDICEINDEXLIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList costDiceIndexList_;
    /**
     * <code>repeated uint32 costDiceIndexList = 13;</code>
     * @return A list containing the costDiceIndexList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCostDiceIndexListList() {
      return costDiceIndexList_;
    }
    /**
     * <code>repeated uint32 costDiceIndexList = 13;</code>
     * @return The count of costDiceIndexList.
     */
    public int getCostDiceIndexListCount() {
      return costDiceIndexList_.size();
    }
    /**
     * <code>repeated uint32 costDiceIndexList = 13;</code>
     * @param index The index of the element to return.
     * @return The costDiceIndexList at the given index.
     */
    public int getCostDiceIndexList(int index) {
      return costDiceIndexList_.getInt(index);
    }
    private int costDiceIndexListMemoizedSerializedSize = -1;

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
      if (replaceCardGuid_ != 0) {
        output.writeUInt32(6, replaceCardGuid_);
      }
      if (getTargetCardGuidListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(targetCardGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < targetCardGuidList_.size(); i++) {
        output.writeUInt32NoTag(targetCardGuidList_.getInt(i));
      }
      if (getCostDiceIndexListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(costDiceIndexListMemoizedSerializedSize);
      }
      for (int i = 0; i < costDiceIndexList_.size(); i++) {
        output.writeUInt32NoTag(costDiceIndexList_.getInt(i));
      }
      if (cardGuid_ != 0) {
        output.writeUInt32(14, cardGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (replaceCardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, replaceCardGuid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < targetCardGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(targetCardGuidList_.getInt(i));
        }
        size += dataSize;
        if (!getTargetCardGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        targetCardGuidListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < costDiceIndexList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(costDiceIndexList_.getInt(i));
        }
        size += dataSize;
        if (!getCostDiceIndexListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        costDiceIndexListMemoizedSerializedSize = dataSize;
      }
      if (cardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, cardGuid_);
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
      if (!(obj instanceof OpPlayCardOuterClass.OpPlayCard)) {
        return super.equals(obj);
      }
      OpPlayCardOuterClass.OpPlayCard other = (OpPlayCardOuterClass.OpPlayCard) obj;

      if (getReplaceCardGuid()
          != other.getReplaceCardGuid()) return false;
      if (!getTargetCardGuidListList()
          .equals(other.getTargetCardGuidListList())) return false;
      if (getCardGuid()
          != other.getCardGuid()) return false;
      if (!getCostDiceIndexListList()
          .equals(other.getCostDiceIndexListList())) return false;
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
      hash = (37 * hash) + REPLACECARDGUID_FIELD_NUMBER;
      hash = (53 * hash) + getReplaceCardGuid();
      if (getTargetCardGuidListCount() > 0) {
        hash = (37 * hash) + TARGETCARDGUIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getTargetCardGuidListList().hashCode();
      }
      hash = (37 * hash) + CARDGUID_FIELD_NUMBER;
      hash = (53 * hash) + getCardGuid();
      if (getCostDiceIndexListCount() > 0) {
        hash = (37 * hash) + COSTDICEINDEXLIST_FIELD_NUMBER;
        hash = (53 * hash) + getCostDiceIndexListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static OpPlayCardOuterClass.OpPlayCard parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static OpPlayCardOuterClass.OpPlayCard parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static OpPlayCardOuterClass.OpPlayCard parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static OpPlayCardOuterClass.OpPlayCard parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static OpPlayCardOuterClass.OpPlayCard parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static OpPlayCardOuterClass.OpPlayCard parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static OpPlayCardOuterClass.OpPlayCard parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static OpPlayCardOuterClass.OpPlayCard parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static OpPlayCardOuterClass.OpPlayCard parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static OpPlayCardOuterClass.OpPlayCard parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static OpPlayCardOuterClass.OpPlayCard parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static OpPlayCardOuterClass.OpPlayCard parseFrom(
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
    public static Builder newBuilder(OpPlayCardOuterClass.OpPlayCard prototype) {
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
     * Protobuf type {@code OpPlayCard}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpPlayCard)
        OpPlayCardOuterClass.OpPlayCardOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return OpPlayCardOuterClass.internal_static_OpPlayCard_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return OpPlayCardOuterClass.internal_static_OpPlayCard_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                OpPlayCardOuterClass.OpPlayCard.class, OpPlayCardOuterClass.OpPlayCard.Builder.class);
      }

      // Construct using OpPlayCardOuterClass.OpPlayCard.newBuilder()
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
        replaceCardGuid_ = 0;

        targetCardGuidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        cardGuid_ = 0;

        costDiceIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return OpPlayCardOuterClass.internal_static_OpPlayCard_descriptor;
      }

      @java.lang.Override
      public OpPlayCardOuterClass.OpPlayCard getDefaultInstanceForType() {
        return OpPlayCardOuterClass.OpPlayCard.getDefaultInstance();
      }

      @java.lang.Override
      public OpPlayCardOuterClass.OpPlayCard build() {
        OpPlayCardOuterClass.OpPlayCard result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public OpPlayCardOuterClass.OpPlayCard buildPartial() {
        OpPlayCardOuterClass.OpPlayCard result = new OpPlayCardOuterClass.OpPlayCard(this);
        int from_bitField0_ = bitField0_;
        result.replaceCardGuid_ = replaceCardGuid_;
        if (((bitField0_ & 0x00000001) != 0)) {
          targetCardGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.targetCardGuidList_ = targetCardGuidList_;
        result.cardGuid_ = cardGuid_;
        if (((bitField0_ & 0x00000002) != 0)) {
          costDiceIndexList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.costDiceIndexList_ = costDiceIndexList_;
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
        if (other instanceof OpPlayCardOuterClass.OpPlayCard) {
          return mergeFrom((OpPlayCardOuterClass.OpPlayCard)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(OpPlayCardOuterClass.OpPlayCard other) {
        if (other == OpPlayCardOuterClass.OpPlayCard.getDefaultInstance()) return this;
        if (other.getReplaceCardGuid() != 0) {
          setReplaceCardGuid(other.getReplaceCardGuid());
        }
        if (!other.targetCardGuidList_.isEmpty()) {
          if (targetCardGuidList_.isEmpty()) {
            targetCardGuidList_ = other.targetCardGuidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTargetCardGuidListIsMutable();
            targetCardGuidList_.addAll(other.targetCardGuidList_);
          }
          onChanged();
        }
        if (other.getCardGuid() != 0) {
          setCardGuid(other.getCardGuid());
        }
        if (!other.costDiceIndexList_.isEmpty()) {
          if (costDiceIndexList_.isEmpty()) {
            costDiceIndexList_ = other.costDiceIndexList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureCostDiceIndexListIsMutable();
            costDiceIndexList_.addAll(other.costDiceIndexList_);
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
        OpPlayCardOuterClass.OpPlayCard parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (OpPlayCardOuterClass.OpPlayCard) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int replaceCardGuid_ ;
      /**
       * <code>uint32 replaceCardGuid = 6;</code>
       * @return The replaceCardGuid.
       */
      @java.lang.Override
      public int getReplaceCardGuid() {
        return replaceCardGuid_;
      }
      /**
       * <code>uint32 replaceCardGuid = 6;</code>
       * @param value The replaceCardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setReplaceCardGuid(int value) {
        
        replaceCardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 replaceCardGuid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearReplaceCardGuid() {
        
        replaceCardGuid_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList targetCardGuidList_ = emptyIntList();
      private void ensureTargetCardGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          targetCardGuidList_ = mutableCopy(targetCardGuidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 targetCardGuidList = 11;</code>
       * @return A list containing the targetCardGuidList.
       */
      public java.util.List<java.lang.Integer>
          getTargetCardGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(targetCardGuidList_) : targetCardGuidList_;
      }
      /**
       * <code>repeated uint32 targetCardGuidList = 11;</code>
       * @return The count of targetCardGuidList.
       */
      public int getTargetCardGuidListCount() {
        return targetCardGuidList_.size();
      }
      /**
       * <code>repeated uint32 targetCardGuidList = 11;</code>
       * @param index The index of the element to return.
       * @return The targetCardGuidList at the given index.
       */
      public int getTargetCardGuidList(int index) {
        return targetCardGuidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 targetCardGuidList = 11;</code>
       * @param index The index to set the value at.
       * @param value The targetCardGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setTargetCardGuidList(
          int index, int value) {
        ensureTargetCardGuidListIsMutable();
        targetCardGuidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 targetCardGuidList = 11;</code>
       * @param value The targetCardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addTargetCardGuidList(int value) {
        ensureTargetCardGuidListIsMutable();
        targetCardGuidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 targetCardGuidList = 11;</code>
       * @param values The targetCardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTargetCardGuidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTargetCardGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, targetCardGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 targetCardGuidList = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetCardGuidList() {
        targetCardGuidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int cardGuid_ ;
      /**
       * <code>uint32 cardGuid = 14;</code>
       * @return The cardGuid.
       */
      @java.lang.Override
      public int getCardGuid() {
        return cardGuid_;
      }
      /**
       * <code>uint32 cardGuid = 14;</code>
       * @param value The cardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuid(int value) {
        
        cardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cardGuid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuid() {
        
        cardGuid_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList costDiceIndexList_ = emptyIntList();
      private void ensureCostDiceIndexListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          costDiceIndexList_ = mutableCopy(costDiceIndexList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 costDiceIndexList = 13;</code>
       * @return A list containing the costDiceIndexList.
       */
      public java.util.List<java.lang.Integer>
          getCostDiceIndexListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(costDiceIndexList_) : costDiceIndexList_;
      }
      /**
       * <code>repeated uint32 costDiceIndexList = 13;</code>
       * @return The count of costDiceIndexList.
       */
      public int getCostDiceIndexListCount() {
        return costDiceIndexList_.size();
      }
      /**
       * <code>repeated uint32 costDiceIndexList = 13;</code>
       * @param index The index of the element to return.
       * @return The costDiceIndexList at the given index.
       */
      public int getCostDiceIndexList(int index) {
        return costDiceIndexList_.getInt(index);
      }
      /**
       * <code>repeated uint32 costDiceIndexList = 13;</code>
       * @param index The index to set the value at.
       * @param value The costDiceIndexList to set.
       * @return This builder for chaining.
       */
      public Builder setCostDiceIndexList(
          int index, int value) {
        ensureCostDiceIndexListIsMutable();
        costDiceIndexList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 costDiceIndexList = 13;</code>
       * @param value The costDiceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addCostDiceIndexList(int value) {
        ensureCostDiceIndexListIsMutable();
        costDiceIndexList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 costDiceIndexList = 13;</code>
       * @param values The costDiceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCostDiceIndexList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCostDiceIndexListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, costDiceIndexList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 costDiceIndexList = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostDiceIndexList() {
        costDiceIndexList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:OpPlayCard)
    }

    // @@protoc_insertion_point(class_scope:OpPlayCard)
    private static final OpPlayCardOuterClass.OpPlayCard DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new OpPlayCardOuterClass.OpPlayCard();
    }

    public static OpPlayCardOuterClass.OpPlayCard getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpPlayCard>
        PARSER = new com.google.protobuf.AbstractParser<OpPlayCard>() {
      @java.lang.Override
      public OpPlayCard parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpPlayCard(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OpPlayCard> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpPlayCard> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public OpPlayCardOuterClass.OpPlayCard getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpPlayCard_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpPlayCard_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020OpPlayCard.proto\"n\n\nOpPlayCard\022\027\n\017repl" +
      "aceCardGuid\030\006 \001(\r\022\032\n\022targetCardGuidList\030" +
      "\013 \003(\r\022\020\n\010cardGuid\030\016 \001(\r\022\031\n\021costDiceIndex" +
      "List\030\r \003(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OpPlayCard_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OpPlayCard_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpPlayCard_descriptor,
        new java.lang.String[] { "ReplaceCardGuid", "TargetCardGuidList", "CardGuid", "CostDiceIndexList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
