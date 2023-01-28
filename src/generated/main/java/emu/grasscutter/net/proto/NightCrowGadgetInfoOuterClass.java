// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NightCrowGadgetInfo.proto

public final class NightCrowGadgetInfoOuterClass {
  private NightCrowGadgetInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NightCrowGadgetInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NightCrowGadgetInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 argumentList = 1;</code>
     * @return A list containing the argumentList.
     */
    java.util.List<java.lang.Integer> getArgumentListList();
    /**
     * <code>repeated uint32 argumentList = 1;</code>
     * @return The count of argumentList.
     */
    int getArgumentListCount();
    /**
     * <code>repeated uint32 argumentList = 1;</code>
     * @param index The index of the element to return.
     * @return The argumentList at the given index.
     */
    int getArgumentList(int index);
  }
  /**
   * Protobuf type {@code NightCrowGadgetInfo}
   */
  public static final class NightCrowGadgetInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NightCrowGadgetInfo)
      NightCrowGadgetInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NightCrowGadgetInfo.newBuilder() to construct.
    private NightCrowGadgetInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NightCrowGadgetInfo() {
      argumentList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NightCrowGadgetInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NightCrowGadgetInfo(
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
                argumentList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              argumentList_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                argumentList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                argumentList_.addInt(input.readUInt32());
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
          argumentList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NightCrowGadgetInfoOuterClass.internal_static_NightCrowGadgetInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NightCrowGadgetInfoOuterClass.internal_static_NightCrowGadgetInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.class, NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.Builder.class);
    }

    public static final int ARGUMENTLIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList argumentList_;
    /**
     * <code>repeated uint32 argumentList = 1;</code>
     * @return A list containing the argumentList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getArgumentListList() {
      return argumentList_;
    }
    /**
     * <code>repeated uint32 argumentList = 1;</code>
     * @return The count of argumentList.
     */
    public int getArgumentListCount() {
      return argumentList_.size();
    }
    /**
     * <code>repeated uint32 argumentList = 1;</code>
     * @param index The index of the element to return.
     * @return The argumentList at the given index.
     */
    public int getArgumentList(int index) {
      return argumentList_.getInt(index);
    }
    private int argumentListMemoizedSerializedSize = -1;

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
      if (getArgumentListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(argumentListMemoizedSerializedSize);
      }
      for (int i = 0; i < argumentList_.size(); i++) {
        output.writeUInt32NoTag(argumentList_.getInt(i));
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
        for (int i = 0; i < argumentList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(argumentList_.getInt(i));
        }
        size += dataSize;
        if (!getArgumentListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        argumentListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo)) {
        return super.equals(obj);
      }
      NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo other = (NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo) obj;

      if (!getArgumentListList()
          .equals(other.getArgumentListList())) return false;
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
      if (getArgumentListCount() > 0) {
        hash = (37 * hash) + ARGUMENTLIST_FIELD_NUMBER;
        hash = (53 * hash) + getArgumentListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo parseFrom(
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
    public static Builder newBuilder(NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo prototype) {
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
     * Protobuf type {@code NightCrowGadgetInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NightCrowGadgetInfo)
        NightCrowGadgetInfoOuterClass.NightCrowGadgetInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NightCrowGadgetInfoOuterClass.internal_static_NightCrowGadgetInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NightCrowGadgetInfoOuterClass.internal_static_NightCrowGadgetInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.class, NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.Builder.class);
      }

      // Construct using NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.newBuilder()
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
        argumentList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NightCrowGadgetInfoOuterClass.internal_static_NightCrowGadgetInfo_descriptor;
      }

      @java.lang.Override
      public NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo getDefaultInstanceForType() {
        return NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.getDefaultInstance();
      }

      @java.lang.Override
      public NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo build() {
        NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo buildPartial() {
        NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo result = new NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          argumentList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.argumentList_ = argumentList_;
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
        if (other instanceof NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo) {
          return mergeFrom((NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo other) {
        if (other == NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.getDefaultInstance()) return this;
        if (!other.argumentList_.isEmpty()) {
          if (argumentList_.isEmpty()) {
            argumentList_ = other.argumentList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureArgumentListIsMutable();
            argumentList_.addAll(other.argumentList_);
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
        NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList argumentList_ = emptyIntList();
      private void ensureArgumentListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          argumentList_ = mutableCopy(argumentList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 argumentList = 1;</code>
       * @return A list containing the argumentList.
       */
      public java.util.List<java.lang.Integer>
          getArgumentListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(argumentList_) : argumentList_;
      }
      /**
       * <code>repeated uint32 argumentList = 1;</code>
       * @return The count of argumentList.
       */
      public int getArgumentListCount() {
        return argumentList_.size();
      }
      /**
       * <code>repeated uint32 argumentList = 1;</code>
       * @param index The index of the element to return.
       * @return The argumentList at the given index.
       */
      public int getArgumentList(int index) {
        return argumentList_.getInt(index);
      }
      /**
       * <code>repeated uint32 argumentList = 1;</code>
       * @param index The index to set the value at.
       * @param value The argumentList to set.
       * @return This builder for chaining.
       */
      public Builder setArgumentList(
          int index, int value) {
        ensureArgumentListIsMutable();
        argumentList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 argumentList = 1;</code>
       * @param value The argumentList to add.
       * @return This builder for chaining.
       */
      public Builder addArgumentList(int value) {
        ensureArgumentListIsMutable();
        argumentList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 argumentList = 1;</code>
       * @param values The argumentList to add.
       * @return This builder for chaining.
       */
      public Builder addAllArgumentList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureArgumentListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, argumentList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 argumentList = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearArgumentList() {
        argumentList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:NightCrowGadgetInfo)
    }

    // @@protoc_insertion_point(class_scope:NightCrowGadgetInfo)
    private static final NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo();
    }

    public static NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NightCrowGadgetInfo>
        PARSER = new com.google.protobuf.AbstractParser<NightCrowGadgetInfo>() {
      @java.lang.Override
      public NightCrowGadgetInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NightCrowGadgetInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NightCrowGadgetInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NightCrowGadgetInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NightCrowGadgetInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NightCrowGadgetInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031NightCrowGadgetInfo.proto\"+\n\023NightCrow" +
      "GadgetInfo\022\024\n\014argumentList\030\001 \003(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NightCrowGadgetInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NightCrowGadgetInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NightCrowGadgetInfo_descriptor,
        new java.lang.String[] { "ArgumentList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
