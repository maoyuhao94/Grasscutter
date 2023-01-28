// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarRenameInfoNotify.proto

public final class AvatarRenameInfoNotifyOuterClass {
  private AvatarRenameInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarRenameInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarRenameInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
     */
    java.util.List<AvatarRenameInfoOuterClass.AvatarRenameInfo> 
        getAvatarRenameListList();
    /**
     * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
     */
    AvatarRenameInfoOuterClass.AvatarRenameInfo getAvatarRenameList(int index);
    /**
     * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
     */
    int getAvatarRenameListCount();
    /**
     * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
     */
    java.util.List<? extends AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder> 
        getAvatarRenameListOrBuilderList();
    /**
     * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
     */
    AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder getAvatarRenameListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code AvatarRenameInfoNotify}
   */
  public static final class AvatarRenameInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarRenameInfoNotify)
      AvatarRenameInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarRenameInfoNotify.newBuilder() to construct.
    private AvatarRenameInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarRenameInfoNotify() {
      avatarRenameList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarRenameInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarRenameInfoNotify(
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
            case 98: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                avatarRenameList_ = new java.util.ArrayList<AvatarRenameInfoOuterClass.AvatarRenameInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              avatarRenameList_.add(
                  input.readMessage(AvatarRenameInfoOuterClass.AvatarRenameInfo.parser(), extensionRegistry));
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
          avatarRenameList_ = java.util.Collections.unmodifiableList(avatarRenameList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AvatarRenameInfoNotifyOuterClass.internal_static_AvatarRenameInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AvatarRenameInfoNotifyOuterClass.internal_static_AvatarRenameInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify.class, AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code AvatarRenameInfoNotify.HEGAMGBFDLO}
     */
    public enum HEGAMGBFDLO
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1665;</code>
       */
      PEPPOHPHJOJ(1, 1665),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final HEGAMGBFDLO DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1665;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1665;
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
      public static HEGAMGBFDLO valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static HEGAMGBFDLO forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1665: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<HEGAMGBFDLO>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          HEGAMGBFDLO> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<HEGAMGBFDLO>() {
              public HEGAMGBFDLO findValueByNumber(int number) {
                return HEGAMGBFDLO.forNumber(number);
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
        return AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final HEGAMGBFDLO[] VALUES = getStaticValuesArray();
      private static HEGAMGBFDLO[] getStaticValuesArray() {
        return new HEGAMGBFDLO[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static HEGAMGBFDLO valueOf(
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

      private HEGAMGBFDLO(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:AvatarRenameInfoNotify.HEGAMGBFDLO)
    }

    public static final int AVATARRENAMELIST_FIELD_NUMBER = 12;
    private java.util.List<AvatarRenameInfoOuterClass.AvatarRenameInfo> avatarRenameList_;
    /**
     * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
     */
    @java.lang.Override
    public java.util.List<AvatarRenameInfoOuterClass.AvatarRenameInfo> getAvatarRenameListList() {
      return avatarRenameList_;
    }
    /**
     * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder> 
        getAvatarRenameListOrBuilderList() {
      return avatarRenameList_;
    }
    /**
     * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
     */
    @java.lang.Override
    public int getAvatarRenameListCount() {
      return avatarRenameList_.size();
    }
    /**
     * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
     */
    @java.lang.Override
    public AvatarRenameInfoOuterClass.AvatarRenameInfo getAvatarRenameList(int index) {
      return avatarRenameList_.get(index);
    }
    /**
     * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
     */
    @java.lang.Override
    public AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder getAvatarRenameListOrBuilder(
        int index) {
      return avatarRenameList_.get(index);
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
      for (int i = 0; i < avatarRenameList_.size(); i++) {
        output.writeMessage(12, avatarRenameList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < avatarRenameList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, avatarRenameList_.get(i));
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
      if (!(obj instanceof AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify)) {
        return super.equals(obj);
      }
      AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify other = (AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify) obj;

      if (!getAvatarRenameListList()
          .equals(other.getAvatarRenameListList())) return false;
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
      if (getAvatarRenameListCount() > 0) {
        hash = (37 * hash) + AVATARRENAMELIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarRenameListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
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
    public static Builder newBuilder(AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify prototype) {
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
     * Protobuf type {@code AvatarRenameInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarRenameInfoNotify)
        AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AvatarRenameInfoNotifyOuterClass.internal_static_AvatarRenameInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AvatarRenameInfoNotifyOuterClass.internal_static_AvatarRenameInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify.class, AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify.Builder.class);
      }

      // Construct using AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify.newBuilder()
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
          getAvatarRenameListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (avatarRenameListBuilder_ == null) {
          avatarRenameList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          avatarRenameListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AvatarRenameInfoNotifyOuterClass.internal_static_AvatarRenameInfoNotify_descriptor;
      }

      @java.lang.Override
      public AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify getDefaultInstanceForType() {
        return AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify build() {
        AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify buildPartial() {
        AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify result = new AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify(this);
        int from_bitField0_ = bitField0_;
        if (avatarRenameListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            avatarRenameList_ = java.util.Collections.unmodifiableList(avatarRenameList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.avatarRenameList_ = avatarRenameList_;
        } else {
          result.avatarRenameList_ = avatarRenameListBuilder_.build();
        }
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
        if (other instanceof AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify) {
          return mergeFrom((AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify other) {
        if (other == AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify.getDefaultInstance()) return this;
        if (avatarRenameListBuilder_ == null) {
          if (!other.avatarRenameList_.isEmpty()) {
            if (avatarRenameList_.isEmpty()) {
              avatarRenameList_ = other.avatarRenameList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAvatarRenameListIsMutable();
              avatarRenameList_.addAll(other.avatarRenameList_);
            }
            onChanged();
          }
        } else {
          if (!other.avatarRenameList_.isEmpty()) {
            if (avatarRenameListBuilder_.isEmpty()) {
              avatarRenameListBuilder_.dispose();
              avatarRenameListBuilder_ = null;
              avatarRenameList_ = other.avatarRenameList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              avatarRenameListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAvatarRenameListFieldBuilder() : null;
            } else {
              avatarRenameListBuilder_.addAllMessages(other.avatarRenameList_);
            }
          }
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
        AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<AvatarRenameInfoOuterClass.AvatarRenameInfo> avatarRenameList_ =
        java.util.Collections.emptyList();
      private void ensureAvatarRenameListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          avatarRenameList_ = new java.util.ArrayList<AvatarRenameInfoOuterClass.AvatarRenameInfo>(avatarRenameList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          AvatarRenameInfoOuterClass.AvatarRenameInfo, AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder, AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder> avatarRenameListBuilder_;

      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public java.util.List<AvatarRenameInfoOuterClass.AvatarRenameInfo> getAvatarRenameListList() {
        if (avatarRenameListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(avatarRenameList_);
        } else {
          return avatarRenameListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public int getAvatarRenameListCount() {
        if (avatarRenameListBuilder_ == null) {
          return avatarRenameList_.size();
        } else {
          return avatarRenameListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public AvatarRenameInfoOuterClass.AvatarRenameInfo getAvatarRenameList(int index) {
        if (avatarRenameListBuilder_ == null) {
          return avatarRenameList_.get(index);
        } else {
          return avatarRenameListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public Builder setAvatarRenameList(
          int index, AvatarRenameInfoOuterClass.AvatarRenameInfo value) {
        if (avatarRenameListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarRenameListIsMutable();
          avatarRenameList_.set(index, value);
          onChanged();
        } else {
          avatarRenameListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public Builder setAvatarRenameList(
          int index, AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder builderForValue) {
        if (avatarRenameListBuilder_ == null) {
          ensureAvatarRenameListIsMutable();
          avatarRenameList_.set(index, builderForValue.build());
          onChanged();
        } else {
          avatarRenameListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public Builder addAvatarRenameList(AvatarRenameInfoOuterClass.AvatarRenameInfo value) {
        if (avatarRenameListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarRenameListIsMutable();
          avatarRenameList_.add(value);
          onChanged();
        } else {
          avatarRenameListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public Builder addAvatarRenameList(
          int index, AvatarRenameInfoOuterClass.AvatarRenameInfo value) {
        if (avatarRenameListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarRenameListIsMutable();
          avatarRenameList_.add(index, value);
          onChanged();
        } else {
          avatarRenameListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public Builder addAvatarRenameList(
          AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder builderForValue) {
        if (avatarRenameListBuilder_ == null) {
          ensureAvatarRenameListIsMutable();
          avatarRenameList_.add(builderForValue.build());
          onChanged();
        } else {
          avatarRenameListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public Builder addAvatarRenameList(
          int index, AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder builderForValue) {
        if (avatarRenameListBuilder_ == null) {
          ensureAvatarRenameListIsMutable();
          avatarRenameList_.add(index, builderForValue.build());
          onChanged();
        } else {
          avatarRenameListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public Builder addAllAvatarRenameList(
          java.lang.Iterable<? extends AvatarRenameInfoOuterClass.AvatarRenameInfo> values) {
        if (avatarRenameListBuilder_ == null) {
          ensureAvatarRenameListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, avatarRenameList_);
          onChanged();
        } else {
          avatarRenameListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public Builder clearAvatarRenameList() {
        if (avatarRenameListBuilder_ == null) {
          avatarRenameList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          avatarRenameListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public Builder removeAvatarRenameList(int index) {
        if (avatarRenameListBuilder_ == null) {
          ensureAvatarRenameListIsMutable();
          avatarRenameList_.remove(index);
          onChanged();
        } else {
          avatarRenameListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder getAvatarRenameListBuilder(
          int index) {
        return getAvatarRenameListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder getAvatarRenameListOrBuilder(
          int index) {
        if (avatarRenameListBuilder_ == null) {
          return avatarRenameList_.get(index);  } else {
          return avatarRenameListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public java.util.List<? extends AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder> 
           getAvatarRenameListOrBuilderList() {
        if (avatarRenameListBuilder_ != null) {
          return avatarRenameListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(avatarRenameList_);
        }
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder addAvatarRenameListBuilder() {
        return getAvatarRenameListFieldBuilder().addBuilder(
            AvatarRenameInfoOuterClass.AvatarRenameInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder addAvatarRenameListBuilder(
          int index) {
        return getAvatarRenameListFieldBuilder().addBuilder(
            index, AvatarRenameInfoOuterClass.AvatarRenameInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .AvatarRenameInfo avatarRenameList = 12;</code>
       */
      public java.util.List<AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder> 
           getAvatarRenameListBuilderList() {
        return getAvatarRenameListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          AvatarRenameInfoOuterClass.AvatarRenameInfo, AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder, AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder> 
          getAvatarRenameListFieldBuilder() {
        if (avatarRenameListBuilder_ == null) {
          avatarRenameListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              AvatarRenameInfoOuterClass.AvatarRenameInfo, AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder, AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder>(
                  avatarRenameList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          avatarRenameList_ = null;
        }
        return avatarRenameListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AvatarRenameInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarRenameInfoNotify)
    private static final AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify();
    }

    public static AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarRenameInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarRenameInfoNotify>() {
      @java.lang.Override
      public AvatarRenameInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarRenameInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarRenameInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarRenameInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarRenameInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarRenameInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034AvatarRenameInfoNotify.proto\032\026AvatarRe" +
      "nameInfo.proto\"\226\001\n\026AvatarRenameInfoNotif" +
      "y\022+\n\020avatarRenameList\030\014 \003(\0132\021.AvatarRena" +
      "meInfo\"O\n\013HEGAMGBFDLO\022\010\n\004NONE\020\000\022\020\n\013PEPPO" +
      "HPHJOJ\020\201\r\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOE" +
      "A\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          AvatarRenameInfoOuterClass.getDescriptor(),
        });
    internal_static_AvatarRenameInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarRenameInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarRenameInfoNotify_descriptor,
        new java.lang.String[] { "AvatarRenameList", });
    AvatarRenameInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
