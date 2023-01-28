// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MultistagePlayEndNotify.proto

public final class MultistagePlayEndNotifyOuterClass {
  private MultistagePlayEndNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MultistagePlayEndNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MultistagePlayEndNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 groupId = 2;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 playIndex = 3;</code>
     * @return The playIndex.
     */
    int getPlayIndex();
  }
  /**
   * Protobuf type {@code MultistagePlayEndNotify}
   */
  public static final class MultistagePlayEndNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MultistagePlayEndNotify)
      MultistagePlayEndNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MultistagePlayEndNotify.newBuilder() to construct.
    private MultistagePlayEndNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MultistagePlayEndNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MultistagePlayEndNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MultistagePlayEndNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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

              groupId_ = input.readUInt32();
              break;
            }
            case 24: {

              playIndex_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MultistagePlayEndNotifyOuterClass.internal_static_MultistagePlayEndNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MultistagePlayEndNotifyOuterClass.internal_static_MultistagePlayEndNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify.class, MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code MultistagePlayEndNotify.NFLPNFEDPGJ}
     */
    public enum NFLPNFEDPGJ
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 5393;</code>
       */
      PEPPOHPHJOJ(1, 5393),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final NFLPNFEDPGJ DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 5393;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 5393;
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
      public static NFLPNFEDPGJ valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static NFLPNFEDPGJ forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 5393: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<NFLPNFEDPGJ>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          NFLPNFEDPGJ> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<NFLPNFEDPGJ>() {
              public NFLPNFEDPGJ findValueByNumber(int number) {
                return NFLPNFEDPGJ.forNumber(number);
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
        return MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final NFLPNFEDPGJ[] VALUES = getStaticValuesArray();
      private static NFLPNFEDPGJ[] getStaticValuesArray() {
        return new NFLPNFEDPGJ[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static NFLPNFEDPGJ valueOf(
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

      private NFLPNFEDPGJ(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:MultistagePlayEndNotify.NFLPNFEDPGJ)
    }

    public static final int GROUPID_FIELD_NUMBER = 2;
    private int groupId_;
    /**
     * <code>uint32 groupId = 2;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int PLAYINDEX_FIELD_NUMBER = 3;
    private int playIndex_;
    /**
     * <code>uint32 playIndex = 3;</code>
     * @return The playIndex.
     */
    @java.lang.Override
    public int getPlayIndex() {
      return playIndex_;
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
      if (groupId_ != 0) {
        output.writeUInt32(2, groupId_);
      }
      if (playIndex_ != 0) {
        output.writeUInt32(3, playIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, groupId_);
      }
      if (playIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, playIndex_);
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
      if (!(obj instanceof MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify)) {
        return super.equals(obj);
      }
      MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify other = (MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify) obj;

      if (getGroupId()
          != other.getGroupId()) return false;
      if (getPlayIndex()
          != other.getPlayIndex()) return false;
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
      hash = (37 * hash) + GROUPID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + PLAYINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getPlayIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify parseFrom(
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
    public static Builder newBuilder(MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify prototype) {
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
     * Protobuf type {@code MultistagePlayEndNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MultistagePlayEndNotify)
        MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MultistagePlayEndNotifyOuterClass.internal_static_MultistagePlayEndNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MultistagePlayEndNotifyOuterClass.internal_static_MultistagePlayEndNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify.class, MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify.Builder.class);
      }

      // Construct using MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify.newBuilder()
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
        groupId_ = 0;

        playIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MultistagePlayEndNotifyOuterClass.internal_static_MultistagePlayEndNotify_descriptor;
      }

      @java.lang.Override
      public MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify getDefaultInstanceForType() {
        return MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify.getDefaultInstance();
      }

      @java.lang.Override
      public MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify build() {
        MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify buildPartial() {
        MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify result = new MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify(this);
        result.groupId_ = groupId_;
        result.playIndex_ = playIndex_;
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
        if (other instanceof MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify) {
          return mergeFrom((MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify other) {
        if (other == MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify.getDefaultInstance()) return this;
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getPlayIndex() != 0) {
          setPlayIndex(other.getPlayIndex());
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
        MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 groupId = 2;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 groupId = 2;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 groupId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int playIndex_ ;
      /**
       * <code>uint32 playIndex = 3;</code>
       * @return The playIndex.
       */
      @java.lang.Override
      public int getPlayIndex() {
        return playIndex_;
      }
      /**
       * <code>uint32 playIndex = 3;</code>
       * @param value The playIndex to set.
       * @return This builder for chaining.
       */
      public Builder setPlayIndex(int value) {
        
        playIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 playIndex = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayIndex() {
        
        playIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MultistagePlayEndNotify)
    }

    // @@protoc_insertion_point(class_scope:MultistagePlayEndNotify)
    private static final MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify();
    }

    public static MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MultistagePlayEndNotify>
        PARSER = new com.google.protobuf.AbstractParser<MultistagePlayEndNotify>() {
      @java.lang.Override
      public MultistagePlayEndNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MultistagePlayEndNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MultistagePlayEndNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MultistagePlayEndNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public MultistagePlayEndNotifyOuterClass.MultistagePlayEndNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MultistagePlayEndNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MultistagePlayEndNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035MultistagePlayEndNotify.proto\"\216\001\n\027Mult" +
      "istagePlayEndNotify\022\017\n\007groupId\030\002 \001(\r\022\021\n\t" +
      "playIndex\030\003 \001(\r\"O\n\013NFLPNFEDPGJ\022\010\n\004NONE\020\000" +
      "\022\020\n\013PEPPOHPHJOJ\020\221*\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013N" +
      "NBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MultistagePlayEndNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MultistagePlayEndNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MultistagePlayEndNotify_descriptor,
        new java.lang.String[] { "GroupId", "PlayIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
