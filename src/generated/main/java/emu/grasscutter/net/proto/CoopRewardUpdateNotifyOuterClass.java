// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoopRewardUpdateNotify.proto

public final class CoopRewardUpdateNotifyOuterClass {
  private CoopRewardUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoopRewardUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CoopRewardUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .CoopReward rewardList = 11;</code>
     */
    java.util.List<CoopRewardOuterClass.CoopReward> 
        getRewardListList();
    /**
     * <code>repeated .CoopReward rewardList = 11;</code>
     */
    CoopRewardOuterClass.CoopReward getRewardList(int index);
    /**
     * <code>repeated .CoopReward rewardList = 11;</code>
     */
    int getRewardListCount();
    /**
     * <code>repeated .CoopReward rewardList = 11;</code>
     */
    java.util.List<? extends CoopRewardOuterClass.CoopRewardOrBuilder> 
        getRewardListOrBuilderList();
    /**
     * <code>repeated .CoopReward rewardList = 11;</code>
     */
    CoopRewardOuterClass.CoopRewardOrBuilder getRewardListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code CoopRewardUpdateNotify}
   */
  public static final class CoopRewardUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoopRewardUpdateNotify)
      CoopRewardUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoopRewardUpdateNotify.newBuilder() to construct.
    private CoopRewardUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoopRewardUpdateNotify() {
      rewardList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CoopRewardUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CoopRewardUpdateNotify(
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
            case 90: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                rewardList_ = new java.util.ArrayList<CoopRewardOuterClass.CoopReward>();
                mutable_bitField0_ |= 0x00000001;
              }
              rewardList_.add(
                  input.readMessage(CoopRewardOuterClass.CoopReward.parser(), extensionRegistry));
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
          rewardList_ = java.util.Collections.unmodifiableList(rewardList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CoopRewardUpdateNotifyOuterClass.internal_static_CoopRewardUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CoopRewardUpdateNotifyOuterClass.internal_static_CoopRewardUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify.class, CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code CoopRewardUpdateNotify.FGALHHPNKKF}
     */
    public enum FGALHHPNKKF
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1975;</code>
       */
      PEPPOHPHJOJ(1, 1975),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final FGALHHPNKKF DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1975;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1975;
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
      public static FGALHHPNKKF valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static FGALHHPNKKF forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1975: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<FGALHHPNKKF>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          FGALHHPNKKF> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<FGALHHPNKKF>() {
              public FGALHHPNKKF findValueByNumber(int number) {
                return FGALHHPNKKF.forNumber(number);
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
        return CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final FGALHHPNKKF[] VALUES = getStaticValuesArray();
      private static FGALHHPNKKF[] getStaticValuesArray() {
        return new FGALHHPNKKF[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static FGALHHPNKKF valueOf(
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

      private FGALHHPNKKF(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:CoopRewardUpdateNotify.FGALHHPNKKF)
    }

    public static final int REWARDLIST_FIELD_NUMBER = 11;
    private java.util.List<CoopRewardOuterClass.CoopReward> rewardList_;
    /**
     * <code>repeated .CoopReward rewardList = 11;</code>
     */
    @java.lang.Override
    public java.util.List<CoopRewardOuterClass.CoopReward> getRewardListList() {
      return rewardList_;
    }
    /**
     * <code>repeated .CoopReward rewardList = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends CoopRewardOuterClass.CoopRewardOrBuilder> 
        getRewardListOrBuilderList() {
      return rewardList_;
    }
    /**
     * <code>repeated .CoopReward rewardList = 11;</code>
     */
    @java.lang.Override
    public int getRewardListCount() {
      return rewardList_.size();
    }
    /**
     * <code>repeated .CoopReward rewardList = 11;</code>
     */
    @java.lang.Override
    public CoopRewardOuterClass.CoopReward getRewardList(int index) {
      return rewardList_.get(index);
    }
    /**
     * <code>repeated .CoopReward rewardList = 11;</code>
     */
    @java.lang.Override
    public CoopRewardOuterClass.CoopRewardOrBuilder getRewardListOrBuilder(
        int index) {
      return rewardList_.get(index);
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
      for (int i = 0; i < rewardList_.size(); i++) {
        output.writeMessage(11, rewardList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < rewardList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, rewardList_.get(i));
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
      if (!(obj instanceof CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify)) {
        return super.equals(obj);
      }
      CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify other = (CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify) obj;

      if (!getRewardListList()
          .equals(other.getRewardListList())) return false;
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
      if (getRewardListCount() > 0) {
        hash = (37 * hash) + REWARDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getRewardListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
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
    public static Builder newBuilder(CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify prototype) {
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
     * Protobuf type {@code CoopRewardUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CoopRewardUpdateNotify)
        CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CoopRewardUpdateNotifyOuterClass.internal_static_CoopRewardUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CoopRewardUpdateNotifyOuterClass.internal_static_CoopRewardUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify.class, CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify.Builder.class);
      }

      // Construct using CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify.newBuilder()
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
          getRewardListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (rewardListBuilder_ == null) {
          rewardList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          rewardListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CoopRewardUpdateNotifyOuterClass.internal_static_CoopRewardUpdateNotify_descriptor;
      }

      @java.lang.Override
      public CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify getDefaultInstanceForType() {
        return CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify build() {
        CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify buildPartial() {
        CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify result = new CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify(this);
        int from_bitField0_ = bitField0_;
        if (rewardListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            rewardList_ = java.util.Collections.unmodifiableList(rewardList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.rewardList_ = rewardList_;
        } else {
          result.rewardList_ = rewardListBuilder_.build();
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
        if (other instanceof CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify) {
          return mergeFrom((CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify other) {
        if (other == CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify.getDefaultInstance()) return this;
        if (rewardListBuilder_ == null) {
          if (!other.rewardList_.isEmpty()) {
            if (rewardList_.isEmpty()) {
              rewardList_ = other.rewardList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRewardListIsMutable();
              rewardList_.addAll(other.rewardList_);
            }
            onChanged();
          }
        } else {
          if (!other.rewardList_.isEmpty()) {
            if (rewardListBuilder_.isEmpty()) {
              rewardListBuilder_.dispose();
              rewardListBuilder_ = null;
              rewardList_ = other.rewardList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              rewardListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRewardListFieldBuilder() : null;
            } else {
              rewardListBuilder_.addAllMessages(other.rewardList_);
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
        CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<CoopRewardOuterClass.CoopReward> rewardList_ =
        java.util.Collections.emptyList();
      private void ensureRewardListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          rewardList_ = new java.util.ArrayList<CoopRewardOuterClass.CoopReward>(rewardList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          CoopRewardOuterClass.CoopReward, CoopRewardOuterClass.CoopReward.Builder, CoopRewardOuterClass.CoopRewardOrBuilder> rewardListBuilder_;

      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public java.util.List<CoopRewardOuterClass.CoopReward> getRewardListList() {
        if (rewardListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(rewardList_);
        } else {
          return rewardListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public int getRewardListCount() {
        if (rewardListBuilder_ == null) {
          return rewardList_.size();
        } else {
          return rewardListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public CoopRewardOuterClass.CoopReward getRewardList(int index) {
        if (rewardListBuilder_ == null) {
          return rewardList_.get(index);
        } else {
          return rewardListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public Builder setRewardList(
          int index, CoopRewardOuterClass.CoopReward value) {
        if (rewardListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRewardListIsMutable();
          rewardList_.set(index, value);
          onChanged();
        } else {
          rewardListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public Builder setRewardList(
          int index, CoopRewardOuterClass.CoopReward.Builder builderForValue) {
        if (rewardListBuilder_ == null) {
          ensureRewardListIsMutable();
          rewardList_.set(index, builderForValue.build());
          onChanged();
        } else {
          rewardListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public Builder addRewardList(CoopRewardOuterClass.CoopReward value) {
        if (rewardListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRewardListIsMutable();
          rewardList_.add(value);
          onChanged();
        } else {
          rewardListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public Builder addRewardList(
          int index, CoopRewardOuterClass.CoopReward value) {
        if (rewardListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRewardListIsMutable();
          rewardList_.add(index, value);
          onChanged();
        } else {
          rewardListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public Builder addRewardList(
          CoopRewardOuterClass.CoopReward.Builder builderForValue) {
        if (rewardListBuilder_ == null) {
          ensureRewardListIsMutable();
          rewardList_.add(builderForValue.build());
          onChanged();
        } else {
          rewardListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public Builder addRewardList(
          int index, CoopRewardOuterClass.CoopReward.Builder builderForValue) {
        if (rewardListBuilder_ == null) {
          ensureRewardListIsMutable();
          rewardList_.add(index, builderForValue.build());
          onChanged();
        } else {
          rewardListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public Builder addAllRewardList(
          java.lang.Iterable<? extends CoopRewardOuterClass.CoopReward> values) {
        if (rewardListBuilder_ == null) {
          ensureRewardListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, rewardList_);
          onChanged();
        } else {
          rewardListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public Builder clearRewardList() {
        if (rewardListBuilder_ == null) {
          rewardList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          rewardListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public Builder removeRewardList(int index) {
        if (rewardListBuilder_ == null) {
          ensureRewardListIsMutable();
          rewardList_.remove(index);
          onChanged();
        } else {
          rewardListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public CoopRewardOuterClass.CoopReward.Builder getRewardListBuilder(
          int index) {
        return getRewardListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public CoopRewardOuterClass.CoopRewardOrBuilder getRewardListOrBuilder(
          int index) {
        if (rewardListBuilder_ == null) {
          return rewardList_.get(index);  } else {
          return rewardListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public java.util.List<? extends CoopRewardOuterClass.CoopRewardOrBuilder> 
           getRewardListOrBuilderList() {
        if (rewardListBuilder_ != null) {
          return rewardListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(rewardList_);
        }
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public CoopRewardOuterClass.CoopReward.Builder addRewardListBuilder() {
        return getRewardListFieldBuilder().addBuilder(
            CoopRewardOuterClass.CoopReward.getDefaultInstance());
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public CoopRewardOuterClass.CoopReward.Builder addRewardListBuilder(
          int index) {
        return getRewardListFieldBuilder().addBuilder(
            index, CoopRewardOuterClass.CoopReward.getDefaultInstance());
      }
      /**
       * <code>repeated .CoopReward rewardList = 11;</code>
       */
      public java.util.List<CoopRewardOuterClass.CoopReward.Builder> 
           getRewardListBuilderList() {
        return getRewardListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          CoopRewardOuterClass.CoopReward, CoopRewardOuterClass.CoopReward.Builder, CoopRewardOuterClass.CoopRewardOrBuilder> 
          getRewardListFieldBuilder() {
        if (rewardListBuilder_ == null) {
          rewardListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              CoopRewardOuterClass.CoopReward, CoopRewardOuterClass.CoopReward.Builder, CoopRewardOuterClass.CoopRewardOrBuilder>(
                  rewardList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          rewardList_ = null;
        }
        return rewardListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CoopRewardUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:CoopRewardUpdateNotify)
    private static final CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify();
    }

    public static CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CoopRewardUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<CoopRewardUpdateNotify>() {
      @java.lang.Override
      public CoopRewardUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CoopRewardUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CoopRewardUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoopRewardUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CoopRewardUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CoopRewardUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034CoopRewardUpdateNotify.proto\032\020CoopRewa" +
      "rd.proto\"\212\001\n\026CoopRewardUpdateNotify\022\037\n\nr" +
      "ewardList\030\013 \003(\0132\013.CoopReward\"O\n\013FGALHHPN" +
      "KKF\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\267\017\022\017\n\013DCDNI" +
      "LFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          CoopRewardOuterClass.getDescriptor(),
        });
    internal_static_CoopRewardUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CoopRewardUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CoopRewardUpdateNotify_descriptor,
        new java.lang.String[] { "RewardList", });
    CoopRewardOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
