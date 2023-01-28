// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoopCgShowNotify.proto

public final class CoopCgShowNotifyOuterClass {
  private CoopCgShowNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoopCgShowNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CoopCgShowNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 cgList = 8;</code>
     * @return A list containing the cgList.
     */
    java.util.List<java.lang.Integer> getCgListList();
    /**
     * <code>repeated uint32 cgList = 8;</code>
     * @return The count of cgList.
     */
    int getCgListCount();
    /**
     * <code>repeated uint32 cgList = 8;</code>
     * @param index The index of the element to return.
     * @return The cgList at the given index.
     */
    int getCgList(int index);
  }
  /**
   * Protobuf type {@code CoopCgShowNotify}
   */
  public static final class CoopCgShowNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoopCgShowNotify)
      CoopCgShowNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoopCgShowNotify.newBuilder() to construct.
    private CoopCgShowNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoopCgShowNotify() {
      cgList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CoopCgShowNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CoopCgShowNotify(
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
            case 64: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                cgList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              cgList_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                cgList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                cgList_.addInt(input.readUInt32());
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
          cgList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CoopCgShowNotifyOuterClass.internal_static_CoopCgShowNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CoopCgShowNotifyOuterClass.internal_static_CoopCgShowNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CoopCgShowNotifyOuterClass.CoopCgShowNotify.class, CoopCgShowNotifyOuterClass.CoopCgShowNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code CoopCgShowNotify.JNECNHGJNLE}
     */
    public enum JNECNHGJNLE
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1972;</code>
       */
      PEPPOHPHJOJ(1, 1972),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final JNECNHGJNLE DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1972;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1972;
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
      public static JNECNHGJNLE valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static JNECNHGJNLE forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1972: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<JNECNHGJNLE>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          JNECNHGJNLE> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<JNECNHGJNLE>() {
              public JNECNHGJNLE findValueByNumber(int number) {
                return JNECNHGJNLE.forNumber(number);
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
        return CoopCgShowNotifyOuterClass.CoopCgShowNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final JNECNHGJNLE[] VALUES = getStaticValuesArray();
      private static JNECNHGJNLE[] getStaticValuesArray() {
        return new JNECNHGJNLE[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static JNECNHGJNLE valueOf(
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

      private JNECNHGJNLE(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:CoopCgShowNotify.JNECNHGJNLE)
    }

    public static final int CGLIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList cgList_;
    /**
     * <code>repeated uint32 cgList = 8;</code>
     * @return A list containing the cgList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCgListList() {
      return cgList_;
    }
    /**
     * <code>repeated uint32 cgList = 8;</code>
     * @return The count of cgList.
     */
    public int getCgListCount() {
      return cgList_.size();
    }
    /**
     * <code>repeated uint32 cgList = 8;</code>
     * @param index The index of the element to return.
     * @return The cgList at the given index.
     */
    public int getCgList(int index) {
      return cgList_.getInt(index);
    }
    private int cgListMemoizedSerializedSize = -1;

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
      if (getCgListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(cgListMemoizedSerializedSize);
      }
      for (int i = 0; i < cgList_.size(); i++) {
        output.writeUInt32NoTag(cgList_.getInt(i));
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
        for (int i = 0; i < cgList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cgList_.getInt(i));
        }
        size += dataSize;
        if (!getCgListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cgListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof CoopCgShowNotifyOuterClass.CoopCgShowNotify)) {
        return super.equals(obj);
      }
      CoopCgShowNotifyOuterClass.CoopCgShowNotify other = (CoopCgShowNotifyOuterClass.CoopCgShowNotify) obj;

      if (!getCgListList()
          .equals(other.getCgListList())) return false;
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
      if (getCgListCount() > 0) {
        hash = (37 * hash) + CGLIST_FIELD_NUMBER;
        hash = (53 * hash) + getCgListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static CoopCgShowNotifyOuterClass.CoopCgShowNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static CoopCgShowNotifyOuterClass.CoopCgShowNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
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
    public static Builder newBuilder(CoopCgShowNotifyOuterClass.CoopCgShowNotify prototype) {
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
     * Protobuf type {@code CoopCgShowNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CoopCgShowNotify)
        CoopCgShowNotifyOuterClass.CoopCgShowNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CoopCgShowNotifyOuterClass.internal_static_CoopCgShowNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CoopCgShowNotifyOuterClass.internal_static_CoopCgShowNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CoopCgShowNotifyOuterClass.CoopCgShowNotify.class, CoopCgShowNotifyOuterClass.CoopCgShowNotify.Builder.class);
      }

      // Construct using CoopCgShowNotifyOuterClass.CoopCgShowNotify.newBuilder()
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
        cgList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CoopCgShowNotifyOuterClass.internal_static_CoopCgShowNotify_descriptor;
      }

      @java.lang.Override
      public CoopCgShowNotifyOuterClass.CoopCgShowNotify getDefaultInstanceForType() {
        return CoopCgShowNotifyOuterClass.CoopCgShowNotify.getDefaultInstance();
      }

      @java.lang.Override
      public CoopCgShowNotifyOuterClass.CoopCgShowNotify build() {
        CoopCgShowNotifyOuterClass.CoopCgShowNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public CoopCgShowNotifyOuterClass.CoopCgShowNotify buildPartial() {
        CoopCgShowNotifyOuterClass.CoopCgShowNotify result = new CoopCgShowNotifyOuterClass.CoopCgShowNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cgList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cgList_ = cgList_;
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
        if (other instanceof CoopCgShowNotifyOuterClass.CoopCgShowNotify) {
          return mergeFrom((CoopCgShowNotifyOuterClass.CoopCgShowNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CoopCgShowNotifyOuterClass.CoopCgShowNotify other) {
        if (other == CoopCgShowNotifyOuterClass.CoopCgShowNotify.getDefaultInstance()) return this;
        if (!other.cgList_.isEmpty()) {
          if (cgList_.isEmpty()) {
            cgList_ = other.cgList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCgListIsMutable();
            cgList_.addAll(other.cgList_);
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
        CoopCgShowNotifyOuterClass.CoopCgShowNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CoopCgShowNotifyOuterClass.CoopCgShowNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList cgList_ = emptyIntList();
      private void ensureCgListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cgList_ = mutableCopy(cgList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 cgList = 8;</code>
       * @return A list containing the cgList.
       */
      public java.util.List<java.lang.Integer>
          getCgListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cgList_) : cgList_;
      }
      /**
       * <code>repeated uint32 cgList = 8;</code>
       * @return The count of cgList.
       */
      public int getCgListCount() {
        return cgList_.size();
      }
      /**
       * <code>repeated uint32 cgList = 8;</code>
       * @param index The index of the element to return.
       * @return The cgList at the given index.
       */
      public int getCgList(int index) {
        return cgList_.getInt(index);
      }
      /**
       * <code>repeated uint32 cgList = 8;</code>
       * @param index The index to set the value at.
       * @param value The cgList to set.
       * @return This builder for chaining.
       */
      public Builder setCgList(
          int index, int value) {
        ensureCgListIsMutable();
        cgList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cgList = 8;</code>
       * @param value The cgList to add.
       * @return This builder for chaining.
       */
      public Builder addCgList(int value) {
        ensureCgListIsMutable();
        cgList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cgList = 8;</code>
       * @param values The cgList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCgList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCgListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cgList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cgList = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCgList() {
        cgList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:CoopCgShowNotify)
    }

    // @@protoc_insertion_point(class_scope:CoopCgShowNotify)
    private static final CoopCgShowNotifyOuterClass.CoopCgShowNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new CoopCgShowNotifyOuterClass.CoopCgShowNotify();
    }

    public static CoopCgShowNotifyOuterClass.CoopCgShowNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CoopCgShowNotify>
        PARSER = new com.google.protobuf.AbstractParser<CoopCgShowNotify>() {
      @java.lang.Override
      public CoopCgShowNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CoopCgShowNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CoopCgShowNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoopCgShowNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public CoopCgShowNotifyOuterClass.CoopCgShowNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CoopCgShowNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CoopCgShowNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026CoopCgShowNotify.proto\"s\n\020CoopCgShowNo" +
      "tify\022\016\n\006cgList\030\010 \003(\r\"O\n\013JNECNHGJNLE\022\010\n\004N" +
      "ONE\020\000\022\020\n\013PEPPOHPHJOJ\020\264\017\022\017\n\013DCDNILFDFLB\020\000" +
      "\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CoopCgShowNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CoopCgShowNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CoopCgShowNotify_descriptor,
        new java.lang.String[] { "CgList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
