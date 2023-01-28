// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusFighterPlotInfoNotify.proto

public final class FungusFighterPlotInfoNotifyOuterClass {
  private FungusFighterPlotInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusFighterPlotInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusFighterPlotInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 fungusIdList = 1;</code>
     * @return A list containing the fungusIdList.
     */
    java.util.List<java.lang.Integer> getFungusIdListList();
    /**
     * <code>repeated uint32 fungusIdList = 1;</code>
     * @return The count of fungusIdList.
     */
    int getFungusIdListCount();
    /**
     * <code>repeated uint32 fungusIdList = 1;</code>
     * @param index The index of the element to return.
     * @return The fungusIdList at the given index.
     */
    int getFungusIdList(int index);

    /**
     * <code>uint32 dungeonId = 12;</code>
     * @return The dungeonId.
     */
    int getDungeonId();
  }
  /**
   * Protobuf type {@code FungusFighterPlotInfoNotify}
   */
  public static final class FungusFighterPlotInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusFighterPlotInfoNotify)
      FungusFighterPlotInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusFighterPlotInfoNotify.newBuilder() to construct.
    private FungusFighterPlotInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusFighterPlotInfoNotify() {
      fungusIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusFighterPlotInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FungusFighterPlotInfoNotify(
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
                fungusIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              fungusIdList_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                fungusIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                fungusIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 96: {

              dungeonId_ = input.readUInt32();
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
          fungusIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return FungusFighterPlotInfoNotifyOuterClass.internal_static_FungusFighterPlotInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return FungusFighterPlotInfoNotifyOuterClass.internal_static_FungusFighterPlotInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify.class, FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code FungusFighterPlotInfoNotify.MDJGOPHLFOJ}
     */
    public enum MDJGOPHLFOJ
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 24391;</code>
       */
      PEPPOHPHJOJ(1, 24391),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final MDJGOPHLFOJ DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 24391;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 24391;
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
      public static MDJGOPHLFOJ valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static MDJGOPHLFOJ forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 24391: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MDJGOPHLFOJ>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MDJGOPHLFOJ> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MDJGOPHLFOJ>() {
              public MDJGOPHLFOJ findValueByNumber(int number) {
                return MDJGOPHLFOJ.forNumber(number);
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
        return FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final MDJGOPHLFOJ[] VALUES = getStaticValuesArray();
      private static MDJGOPHLFOJ[] getStaticValuesArray() {
        return new MDJGOPHLFOJ[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static MDJGOPHLFOJ valueOf(
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

      private MDJGOPHLFOJ(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:FungusFighterPlotInfoNotify.MDJGOPHLFOJ)
    }

    public static final int FUNGUSIDLIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList fungusIdList_;
    /**
     * <code>repeated uint32 fungusIdList = 1;</code>
     * @return A list containing the fungusIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFungusIdListList() {
      return fungusIdList_;
    }
    /**
     * <code>repeated uint32 fungusIdList = 1;</code>
     * @return The count of fungusIdList.
     */
    public int getFungusIdListCount() {
      return fungusIdList_.size();
    }
    /**
     * <code>repeated uint32 fungusIdList = 1;</code>
     * @param index The index of the element to return.
     * @return The fungusIdList at the given index.
     */
    public int getFungusIdList(int index) {
      return fungusIdList_.getInt(index);
    }
    private int fungusIdListMemoizedSerializedSize = -1;

    public static final int DUNGEONID_FIELD_NUMBER = 12;
    private int dungeonId_;
    /**
     * <code>uint32 dungeonId = 12;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
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
      if (getFungusIdListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(fungusIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < fungusIdList_.size(); i++) {
        output.writeUInt32NoTag(fungusIdList_.getInt(i));
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(12, dungeonId_);
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
        for (int i = 0; i < fungusIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(fungusIdList_.getInt(i));
        }
        size += dataSize;
        if (!getFungusIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fungusIdListMemoizedSerializedSize = dataSize;
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, dungeonId_);
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
      if (!(obj instanceof FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify)) {
        return super.equals(obj);
      }
      FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify other = (FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify) obj;

      if (!getFungusIdListList()
          .equals(other.getFungusIdListList())) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
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
      if (getFungusIdListCount() > 0) {
        hash = (37 * hash) + FUNGUSIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getFungusIdListList().hashCode();
      }
      hash = (37 * hash) + DUNGEONID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
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
    public static Builder newBuilder(FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify prototype) {
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
     * Protobuf type {@code FungusFighterPlotInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusFighterPlotInfoNotify)
        FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return FungusFighterPlotInfoNotifyOuterClass.internal_static_FungusFighterPlotInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return FungusFighterPlotInfoNotifyOuterClass.internal_static_FungusFighterPlotInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify.class, FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify.Builder.class);
      }

      // Construct using FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify.newBuilder()
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
        fungusIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        dungeonId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return FungusFighterPlotInfoNotifyOuterClass.internal_static_FungusFighterPlotInfoNotify_descriptor;
      }

      @java.lang.Override
      public FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify getDefaultInstanceForType() {
        return FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify build() {
        FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify buildPartial() {
        FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify result = new FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          fungusIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fungusIdList_ = fungusIdList_;
        result.dungeonId_ = dungeonId_;
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
        if (other instanceof FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify) {
          return mergeFrom((FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify other) {
        if (other == FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify.getDefaultInstance()) return this;
        if (!other.fungusIdList_.isEmpty()) {
          if (fungusIdList_.isEmpty()) {
            fungusIdList_ = other.fungusIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFungusIdListIsMutable();
            fungusIdList_.addAll(other.fungusIdList_);
          }
          onChanged();
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
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
        FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList fungusIdList_ = emptyIntList();
      private void ensureFungusIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fungusIdList_ = mutableCopy(fungusIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 fungusIdList = 1;</code>
       * @return A list containing the fungusIdList.
       */
      public java.util.List<java.lang.Integer>
          getFungusIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(fungusIdList_) : fungusIdList_;
      }
      /**
       * <code>repeated uint32 fungusIdList = 1;</code>
       * @return The count of fungusIdList.
       */
      public int getFungusIdListCount() {
        return fungusIdList_.size();
      }
      /**
       * <code>repeated uint32 fungusIdList = 1;</code>
       * @param index The index of the element to return.
       * @return The fungusIdList at the given index.
       */
      public int getFungusIdList(int index) {
        return fungusIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 fungusIdList = 1;</code>
       * @param index The index to set the value at.
       * @param value The fungusIdList to set.
       * @return This builder for chaining.
       */
      public Builder setFungusIdList(
          int index, int value) {
        ensureFungusIdListIsMutable();
        fungusIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fungusIdList = 1;</code>
       * @param value The fungusIdList to add.
       * @return This builder for chaining.
       */
      public Builder addFungusIdList(int value) {
        ensureFungusIdListIsMutable();
        fungusIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fungusIdList = 1;</code>
       * @param values The fungusIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFungusIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFungusIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fungusIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fungusIdList = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFungusIdList() {
        fungusIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeonId = 12;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeonId = 12;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeonId = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FungusFighterPlotInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:FungusFighterPlotInfoNotify)
    private static final FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify();
    }

    public static FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusFighterPlotInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<FungusFighterPlotInfoNotify>() {
      @java.lang.Override
      public FungusFighterPlotInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FungusFighterPlotInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FungusFighterPlotInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusFighterPlotInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusFighterPlotInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusFighterPlotInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!FungusFighterPlotInfoNotify.proto\"\230\001\n\033" +
      "FungusFighterPlotInfoNotify\022\024\n\014fungusIdL" +
      "ist\030\001 \003(\r\022\021\n\tdungeonId\030\014 \001(\r\"P\n\013MDJGOPHL" +
      "FOJ\022\010\n\004NONE\020\000\022\021\n\013PEPPOHPHJOJ\020\307\276\001\022\017\n\013DCDN" +
      "ILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusFighterPlotInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusFighterPlotInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusFighterPlotInfoNotify_descriptor,
        new java.lang.String[] { "FungusIdList", "DungeonId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
