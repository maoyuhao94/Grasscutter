// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MultistagePlayStageEndNotify.proto

public final class MultistagePlayStageEndNotifyOuterClass {
  private MultistagePlayStageEndNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MultistagePlayStageEndNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MultistagePlayStageEndNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 groupId = 9;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 playIndex = 14;</code>
     * @return The playIndex.
     */
    int getPlayIndex();
  }
  /**
   * Protobuf type {@code MultistagePlayStageEndNotify}
   */
  public static final class MultistagePlayStageEndNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MultistagePlayStageEndNotify)
      MultistagePlayStageEndNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MultistagePlayStageEndNotify.newBuilder() to construct.
    private MultistagePlayStageEndNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MultistagePlayStageEndNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MultistagePlayStageEndNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MultistagePlayStageEndNotify(
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
            case 72: {

              groupId_ = input.readUInt32();
              break;
            }
            case 112: {

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
      return MultistagePlayStageEndNotifyOuterClass.internal_static_MultistagePlayStageEndNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MultistagePlayStageEndNotifyOuterClass.internal_static_MultistagePlayStageEndNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify.class, MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code MultistagePlayStageEndNotify.FDGPHDCEFMM}
     */
    public enum FDGPHDCEFMM
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 5341;</code>
       */
      PEPPOHPHJOJ(1, 5341),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final FDGPHDCEFMM DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 5341;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 5341;
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
      public static FDGPHDCEFMM valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static FDGPHDCEFMM forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 5341: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<FDGPHDCEFMM>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          FDGPHDCEFMM> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<FDGPHDCEFMM>() {
              public FDGPHDCEFMM findValueByNumber(int number) {
                return FDGPHDCEFMM.forNumber(number);
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
        return MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final FDGPHDCEFMM[] VALUES = getStaticValuesArray();
      private static FDGPHDCEFMM[] getStaticValuesArray() {
        return new FDGPHDCEFMM[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static FDGPHDCEFMM valueOf(
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

      private FDGPHDCEFMM(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:MultistagePlayStageEndNotify.FDGPHDCEFMM)
    }

    public static final int GROUPID_FIELD_NUMBER = 9;
    private int groupId_;
    /**
     * <code>uint32 groupId = 9;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int PLAYINDEX_FIELD_NUMBER = 14;
    private int playIndex_;
    /**
     * <code>uint32 playIndex = 14;</code>
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
        output.writeUInt32(9, groupId_);
      }
      if (playIndex_ != 0) {
        output.writeUInt32(14, playIndex_);
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
          .computeUInt32Size(9, groupId_);
      }
      if (playIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, playIndex_);
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
      if (!(obj instanceof MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify)) {
        return super.equals(obj);
      }
      MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify other = (MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify) obj;

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

    public static MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
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
    public static Builder newBuilder(MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify prototype) {
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
     * Protobuf type {@code MultistagePlayStageEndNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MultistagePlayStageEndNotify)
        MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MultistagePlayStageEndNotifyOuterClass.internal_static_MultistagePlayStageEndNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MultistagePlayStageEndNotifyOuterClass.internal_static_MultistagePlayStageEndNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify.class, MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify.Builder.class);
      }

      // Construct using MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify.newBuilder()
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
        return MultistagePlayStageEndNotifyOuterClass.internal_static_MultistagePlayStageEndNotify_descriptor;
      }

      @java.lang.Override
      public MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify getDefaultInstanceForType() {
        return MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify.getDefaultInstance();
      }

      @java.lang.Override
      public MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify build() {
        MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify buildPartial() {
        MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify result = new MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify(this);
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
        if (other instanceof MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify) {
          return mergeFrom((MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify other) {
        if (other == MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify.getDefaultInstance()) return this;
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
        MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify) e.getUnfinishedMessage();
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
       * <code>uint32 groupId = 9;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 groupId = 9;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 groupId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int playIndex_ ;
      /**
       * <code>uint32 playIndex = 14;</code>
       * @return The playIndex.
       */
      @java.lang.Override
      public int getPlayIndex() {
        return playIndex_;
      }
      /**
       * <code>uint32 playIndex = 14;</code>
       * @param value The playIndex to set.
       * @return This builder for chaining.
       */
      public Builder setPlayIndex(int value) {
        
        playIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 playIndex = 14;</code>
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


      // @@protoc_insertion_point(builder_scope:MultistagePlayStageEndNotify)
    }

    // @@protoc_insertion_point(class_scope:MultistagePlayStageEndNotify)
    private static final MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify();
    }

    public static MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MultistagePlayStageEndNotify>
        PARSER = new com.google.protobuf.AbstractParser<MultistagePlayStageEndNotify>() {
      @java.lang.Override
      public MultistagePlayStageEndNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MultistagePlayStageEndNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MultistagePlayStageEndNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MultistagePlayStageEndNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MultistagePlayStageEndNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MultistagePlayStageEndNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"MultistagePlayStageEndNotify.proto\"\223\001\n" +
      "\034MultistagePlayStageEndNotify\022\017\n\007groupId" +
      "\030\t \001(\r\022\021\n\tplayIndex\030\016 \001(\r\"O\n\013FDGPHDCEFMM" +
      "\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\335)\022\017\n\013DCDNILFD" +
      "FLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MultistagePlayStageEndNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MultistagePlayStageEndNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MultistagePlayStageEndNotify_descriptor,
        new java.lang.String[] { "GroupId", "PlayIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
