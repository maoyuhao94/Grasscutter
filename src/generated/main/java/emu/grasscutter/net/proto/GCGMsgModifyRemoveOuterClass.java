// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgModifyRemove.proto

public final class GCGMsgModifyRemoveOuterClass {
  private GCGMsgModifyRemoveOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgModifyRemoveOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgModifyRemove)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 controllerId = 7;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>repeated uint32 cardGuidList = 3;</code>
     * @return A list containing the cardGuidList.
     */
    java.util.List<java.lang.Integer> getCardGuidListList();
    /**
     * <code>repeated uint32 cardGuidList = 3;</code>
     * @return The count of cardGuidList.
     */
    int getCardGuidListCount();
    /**
     * <code>repeated uint32 cardGuidList = 3;</code>
     * @param index The index of the element to return.
     * @return The cardGuidList at the given index.
     */
    int getCardGuidList(int index);

    /**
     * <code>.GCGReason reason = 1;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.GCGReason reason = 1;</code>
     * @return The reason.
     */
    GCGReasonOuterClass.GCGReason getReason();

    /**
     * <code>uint32 ownerCardGuid = 2;</code>
     * @return The ownerCardGuid.
     */
    int getOwnerCardGuid();
  }
  /**
   * Protobuf type {@code GCGMsgModifyRemove}
   */
  public static final class GCGMsgModifyRemove extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgModifyRemove)
      GCGMsgModifyRemoveOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgModifyRemove.newBuilder() to construct.
    private GCGMsgModifyRemove(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgModifyRemove() {
      cardGuidList_ = emptyIntList();
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgModifyRemove();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMsgModifyRemove(
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
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 16: {

              ownerCardGuid_ = input.readUInt32();
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                cardGuidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              cardGuidList_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                cardGuidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                cardGuidList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 56: {

              controllerId_ = input.readUInt32();
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
          cardGuidList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GCGMsgModifyRemoveOuterClass.internal_static_GCGMsgModifyRemove_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GCGMsgModifyRemoveOuterClass.internal_static_GCGMsgModifyRemove_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove.class, GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove.Builder.class);
    }

    public static final int CONTROLLERID_FIELD_NUMBER = 7;
    private int controllerId_;
    /**
     * <code>uint32 controllerId = 7;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int CARDGUIDLIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList cardGuidList_;
    /**
     * <code>repeated uint32 cardGuidList = 3;</code>
     * @return A list containing the cardGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCardGuidListList() {
      return cardGuidList_;
    }
    /**
     * <code>repeated uint32 cardGuidList = 3;</code>
     * @return The count of cardGuidList.
     */
    public int getCardGuidListCount() {
      return cardGuidList_.size();
    }
    /**
     * <code>repeated uint32 cardGuidList = 3;</code>
     * @param index The index of the element to return.
     * @return The cardGuidList at the given index.
     */
    public int getCardGuidList(int index) {
      return cardGuidList_.getInt(index);
    }
    private int cardGuidListMemoizedSerializedSize = -1;

    public static final int REASON_FIELD_NUMBER = 1;
    private int reason_;
    /**
     * <code>.GCGReason reason = 1;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.GCGReason reason = 1;</code>
     * @return The reason.
     */
    @java.lang.Override public GCGReasonOuterClass.GCGReason getReason() {
      @SuppressWarnings("deprecation")
      GCGReasonOuterClass.GCGReason result = GCGReasonOuterClass.GCGReason.valueOf(reason_);
      return result == null ? GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
    }

    public static final int OWNERCARDGUID_FIELD_NUMBER = 2;
    private int ownerCardGuid_;
    /**
     * <code>uint32 ownerCardGuid = 2;</code>
     * @return The ownerCardGuid.
     */
    @java.lang.Override
    public int getOwnerCardGuid() {
      return ownerCardGuid_;
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
      if (reason_ != GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        output.writeEnum(1, reason_);
      }
      if (ownerCardGuid_ != 0) {
        output.writeUInt32(2, ownerCardGuid_);
      }
      if (getCardGuidListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(cardGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < cardGuidList_.size(); i++) {
        output.writeUInt32NoTag(cardGuidList_.getInt(i));
      }
      if (controllerId_ != 0) {
        output.writeUInt32(7, controllerId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, reason_);
      }
      if (ownerCardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, ownerCardGuid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < cardGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cardGuidList_.getInt(i));
        }
        size += dataSize;
        if (!getCardGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cardGuidListMemoizedSerializedSize = dataSize;
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, controllerId_);
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
      if (!(obj instanceof GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove)) {
        return super.equals(obj);
      }
      GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove other = (GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove) obj;

      if (getControllerId()
          != other.getControllerId()) return false;
      if (!getCardGuidListList()
          .equals(other.getCardGuidListList())) return false;
      if (reason_ != other.reason_) return false;
      if (getOwnerCardGuid()
          != other.getOwnerCardGuid()) return false;
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
      hash = (37 * hash) + CONTROLLERID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      if (getCardGuidListCount() > 0) {
        hash = (37 * hash) + CARDGUIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getCardGuidListList().hashCode();
      }
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + OWNERCARDGUID_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerCardGuid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
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
    public static Builder newBuilder(GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove prototype) {
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
     * Protobuf type {@code GCGMsgModifyRemove}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgModifyRemove)
        GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemoveOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GCGMsgModifyRemoveOuterClass.internal_static_GCGMsgModifyRemove_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GCGMsgModifyRemoveOuterClass.internal_static_GCGMsgModifyRemove_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove.class, GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove.Builder.class);
      }

      // Construct using GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove.newBuilder()
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
        controllerId_ = 0;

        cardGuidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        reason_ = 0;

        ownerCardGuid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GCGMsgModifyRemoveOuterClass.internal_static_GCGMsgModifyRemove_descriptor;
      }

      @java.lang.Override
      public GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove getDefaultInstanceForType() {
        return GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove.getDefaultInstance();
      }

      @java.lang.Override
      public GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove build() {
        GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove buildPartial() {
        GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove result = new GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove(this);
        int from_bitField0_ = bitField0_;
        result.controllerId_ = controllerId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cardGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cardGuidList_ = cardGuidList_;
        result.reason_ = reason_;
        result.ownerCardGuid_ = ownerCardGuid_;
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
        if (other instanceof GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove) {
          return mergeFrom((GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove other) {
        if (other == GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove.getDefaultInstance()) return this;
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (!other.cardGuidList_.isEmpty()) {
          if (cardGuidList_.isEmpty()) {
            cardGuidList_ = other.cardGuidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCardGuidListIsMutable();
            cardGuidList_.addAll(other.cardGuidList_);
          }
          onChanged();
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getOwnerCardGuid() != 0) {
          setOwnerCardGuid(other.getOwnerCardGuid());
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
        GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int controllerId_ ;
      /**
       * <code>uint32 controllerId = 7;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controllerId = 7;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controllerId = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList cardGuidList_ = emptyIntList();
      private void ensureCardGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cardGuidList_ = mutableCopy(cardGuidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 cardGuidList = 3;</code>
       * @return A list containing the cardGuidList.
       */
      public java.util.List<java.lang.Integer>
          getCardGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cardGuidList_) : cardGuidList_;
      }
      /**
       * <code>repeated uint32 cardGuidList = 3;</code>
       * @return The count of cardGuidList.
       */
      public int getCardGuidListCount() {
        return cardGuidList_.size();
      }
      /**
       * <code>repeated uint32 cardGuidList = 3;</code>
       * @param index The index of the element to return.
       * @return The cardGuidList at the given index.
       */
      public int getCardGuidList(int index) {
        return cardGuidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 cardGuidList = 3;</code>
       * @param index The index to set the value at.
       * @param value The cardGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuidList(
          int index, int value) {
        ensureCardGuidListIsMutable();
        cardGuidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cardGuidList = 3;</code>
       * @param value The cardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addCardGuidList(int value) {
        ensureCardGuidListIsMutable();
        cardGuidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cardGuidList = 3;</code>
       * @param values The cardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCardGuidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCardGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cardGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cardGuidList = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuidList() {
        cardGuidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.GCGReason reason = 1;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.GCGReason reason = 1;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 1;</code>
       * @return The reason.
       */
      @java.lang.Override
      public GCGReasonOuterClass.GCGReason getReason() {
        @SuppressWarnings("deprecation")
        GCGReasonOuterClass.GCGReason result = GCGReasonOuterClass.GCGReason.valueOf(reason_);
        return result == null ? GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGReason reason = 1;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(GCGReasonOuterClass.GCGReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int ownerCardGuid_ ;
      /**
       * <code>uint32 ownerCardGuid = 2;</code>
       * @return The ownerCardGuid.
       */
      @java.lang.Override
      public int getOwnerCardGuid() {
        return ownerCardGuid_;
      }
      /**
       * <code>uint32 ownerCardGuid = 2;</code>
       * @param value The ownerCardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setOwnerCardGuid(int value) {
        
        ownerCardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ownerCardGuid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOwnerCardGuid() {
        
        ownerCardGuid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGMsgModifyRemove)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgModifyRemove)
    private static final GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove();
    }

    public static GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgModifyRemove>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgModifyRemove>() {
      @java.lang.Override
      public GCGMsgModifyRemove parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMsgModifyRemove(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMsgModifyRemove> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgModifyRemove> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgModifyRemove_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgModifyRemove_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GCGMsgModifyRemove.proto\032\017GCGReason.pr" +
      "oto\"s\n\022GCGMsgModifyRemove\022\024\n\014controllerI" +
      "d\030\007 \001(\r\022\024\n\014cardGuidList\030\003 \003(\r\022\032\n\006reason\030" +
      "\001 \001(\0162\n.GCGReason\022\025\n\rownerCardGuid\030\002 \001(\r" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          GCGReasonOuterClass.getDescriptor(),
        });
    internal_static_GCGMsgModifyRemove_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgModifyRemove_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgModifyRemove_descriptor,
        new java.lang.String[] { "ControllerId", "CardGuidList", "Reason", "OwnerCardGuid", });
    GCGReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
