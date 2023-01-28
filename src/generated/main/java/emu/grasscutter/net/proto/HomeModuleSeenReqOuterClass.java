// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeModuleSeenReq.proto

public final class HomeModuleSeenReqOuterClass {
  private HomeModuleSeenReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeModuleSeenReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeModuleSeenReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 seenModuleIdList = 4;</code>
     * @return A list containing the seenModuleIdList.
     */
    java.util.List<java.lang.Integer> getSeenModuleIdListList();
    /**
     * <code>repeated uint32 seenModuleIdList = 4;</code>
     * @return The count of seenModuleIdList.
     */
    int getSeenModuleIdListCount();
    /**
     * <code>repeated uint32 seenModuleIdList = 4;</code>
     * @param index The index of the element to return.
     * @return The seenModuleIdList at the given index.
     */
    int getSeenModuleIdList(int index);
  }
  /**
   * Protobuf type {@code HomeModuleSeenReq}
   */
  public static final class HomeModuleSeenReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeModuleSeenReq)
      HomeModuleSeenReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeModuleSeenReq.newBuilder() to construct.
    private HomeModuleSeenReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeModuleSeenReq() {
      seenModuleIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeModuleSeenReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeModuleSeenReq(
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
            case 32: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                seenModuleIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              seenModuleIdList_.addInt(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                seenModuleIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                seenModuleIdList_.addInt(input.readUInt32());
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
          seenModuleIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HomeModuleSeenReqOuterClass.internal_static_HomeModuleSeenReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HomeModuleSeenReqOuterClass.internal_static_HomeModuleSeenReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HomeModuleSeenReqOuterClass.HomeModuleSeenReq.class, HomeModuleSeenReqOuterClass.HomeModuleSeenReq.Builder.class);
    }

    /**
     * Protobuf enum {@code HomeModuleSeenReq.OKDEFJHLABG}
     */
    public enum OKDEFJHLABG
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4817;</code>
       */
      PEPPOHPHJOJ(1, 4817),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final OKDEFJHLABG DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final OKDEFJHLABG EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4817;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4817;
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
      public static OKDEFJHLABG valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static OKDEFJHLABG forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4817: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<OKDEFJHLABG>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          OKDEFJHLABG> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<OKDEFJHLABG>() {
              public OKDEFJHLABG findValueByNumber(int number) {
                return OKDEFJHLABG.forNumber(number);
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
        return HomeModuleSeenReqOuterClass.HomeModuleSeenReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final OKDEFJHLABG[] VALUES = getStaticValuesArray();
      private static OKDEFJHLABG[] getStaticValuesArray() {
        return new OKDEFJHLABG[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static OKDEFJHLABG valueOf(
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

      private OKDEFJHLABG(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:HomeModuleSeenReq.OKDEFJHLABG)
    }

    public static final int SEENMODULEIDLIST_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList seenModuleIdList_;
    /**
     * <code>repeated uint32 seenModuleIdList = 4;</code>
     * @return A list containing the seenModuleIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSeenModuleIdListList() {
      return seenModuleIdList_;
    }
    /**
     * <code>repeated uint32 seenModuleIdList = 4;</code>
     * @return The count of seenModuleIdList.
     */
    public int getSeenModuleIdListCount() {
      return seenModuleIdList_.size();
    }
    /**
     * <code>repeated uint32 seenModuleIdList = 4;</code>
     * @param index The index of the element to return.
     * @return The seenModuleIdList at the given index.
     */
    public int getSeenModuleIdList(int index) {
      return seenModuleIdList_.getInt(index);
    }
    private int seenModuleIdListMemoizedSerializedSize = -1;

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
      if (getSeenModuleIdListList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(seenModuleIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < seenModuleIdList_.size(); i++) {
        output.writeUInt32NoTag(seenModuleIdList_.getInt(i));
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
        for (int i = 0; i < seenModuleIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(seenModuleIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSeenModuleIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        seenModuleIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof HomeModuleSeenReqOuterClass.HomeModuleSeenReq)) {
        return super.equals(obj);
      }
      HomeModuleSeenReqOuterClass.HomeModuleSeenReq other = (HomeModuleSeenReqOuterClass.HomeModuleSeenReq) obj;

      if (!getSeenModuleIdListList()
          .equals(other.getSeenModuleIdListList())) return false;
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
      if (getSeenModuleIdListCount() > 0) {
        hash = (37 * hash) + SEENMODULEIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getSeenModuleIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
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
    public static Builder newBuilder(HomeModuleSeenReqOuterClass.HomeModuleSeenReq prototype) {
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
     * Protobuf type {@code HomeModuleSeenReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeModuleSeenReq)
        HomeModuleSeenReqOuterClass.HomeModuleSeenReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HomeModuleSeenReqOuterClass.internal_static_HomeModuleSeenReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HomeModuleSeenReqOuterClass.internal_static_HomeModuleSeenReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HomeModuleSeenReqOuterClass.HomeModuleSeenReq.class, HomeModuleSeenReqOuterClass.HomeModuleSeenReq.Builder.class);
      }

      // Construct using HomeModuleSeenReqOuterClass.HomeModuleSeenReq.newBuilder()
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
        seenModuleIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HomeModuleSeenReqOuterClass.internal_static_HomeModuleSeenReq_descriptor;
      }

      @java.lang.Override
      public HomeModuleSeenReqOuterClass.HomeModuleSeenReq getDefaultInstanceForType() {
        return HomeModuleSeenReqOuterClass.HomeModuleSeenReq.getDefaultInstance();
      }

      @java.lang.Override
      public HomeModuleSeenReqOuterClass.HomeModuleSeenReq build() {
        HomeModuleSeenReqOuterClass.HomeModuleSeenReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public HomeModuleSeenReqOuterClass.HomeModuleSeenReq buildPartial() {
        HomeModuleSeenReqOuterClass.HomeModuleSeenReq result = new HomeModuleSeenReqOuterClass.HomeModuleSeenReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          seenModuleIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.seenModuleIdList_ = seenModuleIdList_;
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
        if (other instanceof HomeModuleSeenReqOuterClass.HomeModuleSeenReq) {
          return mergeFrom((HomeModuleSeenReqOuterClass.HomeModuleSeenReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HomeModuleSeenReqOuterClass.HomeModuleSeenReq other) {
        if (other == HomeModuleSeenReqOuterClass.HomeModuleSeenReq.getDefaultInstance()) return this;
        if (!other.seenModuleIdList_.isEmpty()) {
          if (seenModuleIdList_.isEmpty()) {
            seenModuleIdList_ = other.seenModuleIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSeenModuleIdListIsMutable();
            seenModuleIdList_.addAll(other.seenModuleIdList_);
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
        HomeModuleSeenReqOuterClass.HomeModuleSeenReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HomeModuleSeenReqOuterClass.HomeModuleSeenReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList seenModuleIdList_ = emptyIntList();
      private void ensureSeenModuleIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          seenModuleIdList_ = mutableCopy(seenModuleIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 seenModuleIdList = 4;</code>
       * @return A list containing the seenModuleIdList.
       */
      public java.util.List<java.lang.Integer>
          getSeenModuleIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(seenModuleIdList_) : seenModuleIdList_;
      }
      /**
       * <code>repeated uint32 seenModuleIdList = 4;</code>
       * @return The count of seenModuleIdList.
       */
      public int getSeenModuleIdListCount() {
        return seenModuleIdList_.size();
      }
      /**
       * <code>repeated uint32 seenModuleIdList = 4;</code>
       * @param index The index of the element to return.
       * @return The seenModuleIdList at the given index.
       */
      public int getSeenModuleIdList(int index) {
        return seenModuleIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 seenModuleIdList = 4;</code>
       * @param index The index to set the value at.
       * @param value The seenModuleIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSeenModuleIdList(
          int index, int value) {
        ensureSeenModuleIdListIsMutable();
        seenModuleIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 seenModuleIdList = 4;</code>
       * @param value The seenModuleIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSeenModuleIdList(int value) {
        ensureSeenModuleIdListIsMutable();
        seenModuleIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 seenModuleIdList = 4;</code>
       * @param values The seenModuleIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSeenModuleIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSeenModuleIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, seenModuleIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 seenModuleIdList = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSeenModuleIdList() {
        seenModuleIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:HomeModuleSeenReq)
    }

    // @@protoc_insertion_point(class_scope:HomeModuleSeenReq)
    private static final HomeModuleSeenReqOuterClass.HomeModuleSeenReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HomeModuleSeenReqOuterClass.HomeModuleSeenReq();
    }

    public static HomeModuleSeenReqOuterClass.HomeModuleSeenReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeModuleSeenReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeModuleSeenReq>() {
      @java.lang.Override
      public HomeModuleSeenReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeModuleSeenReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeModuleSeenReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeModuleSeenReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public HomeModuleSeenReqOuterClass.HomeModuleSeenReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeModuleSeenReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeModuleSeenReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027HomeModuleSeenReq.proto\"\217\001\n\021HomeModule" +
      "SeenReq\022\030\n\020seenModuleIdList\030\004 \003(\r\"`\n\013OKD" +
      "EFJHLABG\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\321%\022\017\n\013" +
      "DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIAB" +
      "GAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeModuleSeenReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeModuleSeenReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeModuleSeenReq_descriptor,
        new java.lang.String[] { "SeenModuleIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
