// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGSkillLimitsInfo.proto

public final class GCGSkillLimitsInfoOuterClass {
  private GCGSkillLimitsInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGSkillLimitsInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGSkillLimitsInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
     */
    java.util.List<GCGLimitsInfoOuterClass.GCGLimitsInfo> 
        getLimitsListList();
    /**
     * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
     */
    GCGLimitsInfoOuterClass.GCGLimitsInfo getLimitsList(int index);
    /**
     * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
     */
    int getLimitsListCount();
    /**
     * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
     */
    java.util.List<? extends GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder> 
        getLimitsListOrBuilderList();
    /**
     * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
     */
    GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder getLimitsListOrBuilder(
        int index);

    /**
     * <code>uint32 skillId = 9;</code>
     * @return The skillId.
     */
    int getSkillId();
  }
  /**
   * Protobuf type {@code GCGSkillLimitsInfo}
   */
  public static final class GCGSkillLimitsInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGSkillLimitsInfo)
      GCGSkillLimitsInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGSkillLimitsInfo.newBuilder() to construct.
    private GCGSkillLimitsInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGSkillLimitsInfo() {
      limitsList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGSkillLimitsInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGSkillLimitsInfo(
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
            case 66: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                limitsList_ = new java.util.ArrayList<GCGLimitsInfoOuterClass.GCGLimitsInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              limitsList_.add(
                  input.readMessage(GCGLimitsInfoOuterClass.GCGLimitsInfo.parser(), extensionRegistry));
              break;
            }
            case 72: {

              skillId_ = input.readUInt32();
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
          limitsList_ = java.util.Collections.unmodifiableList(limitsList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GCGSkillLimitsInfoOuterClass.internal_static_GCGSkillLimitsInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GCGSkillLimitsInfoOuterClass.internal_static_GCGSkillLimitsInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.class, GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder.class);
    }

    public static final int LIMITSLIST_FIELD_NUMBER = 8;
    private java.util.List<GCGLimitsInfoOuterClass.GCGLimitsInfo> limitsList_;
    /**
     * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
     */
    @java.lang.Override
    public java.util.List<GCGLimitsInfoOuterClass.GCGLimitsInfo> getLimitsListList() {
      return limitsList_;
    }
    /**
     * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder> 
        getLimitsListOrBuilderList() {
      return limitsList_;
    }
    /**
     * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
     */
    @java.lang.Override
    public int getLimitsListCount() {
      return limitsList_.size();
    }
    /**
     * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
     */
    @java.lang.Override
    public GCGLimitsInfoOuterClass.GCGLimitsInfo getLimitsList(int index) {
      return limitsList_.get(index);
    }
    /**
     * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
     */
    @java.lang.Override
    public GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder getLimitsListOrBuilder(
        int index) {
      return limitsList_.get(index);
    }

    public static final int SKILLID_FIELD_NUMBER = 9;
    private int skillId_;
    /**
     * <code>uint32 skillId = 9;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
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
      for (int i = 0; i < limitsList_.size(); i++) {
        output.writeMessage(8, limitsList_.get(i));
      }
      if (skillId_ != 0) {
        output.writeUInt32(9, skillId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < limitsList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, limitsList_.get(i));
      }
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, skillId_);
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
      if (!(obj instanceof GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo)) {
        return super.equals(obj);
      }
      GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo other = (GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo) obj;

      if (!getLimitsListList()
          .equals(other.getLimitsListList())) return false;
      if (getSkillId()
          != other.getSkillId()) return false;
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
      if (getLimitsListCount() > 0) {
        hash = (37 * hash) + LIMITSLIST_FIELD_NUMBER;
        hash = (53 * hash) + getLimitsListList().hashCode();
      }
      hash = (37 * hash) + SKILLID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
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
    public static Builder newBuilder(GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo prototype) {
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
     * Protobuf type {@code GCGSkillLimitsInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGSkillLimitsInfo)
        GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GCGSkillLimitsInfoOuterClass.internal_static_GCGSkillLimitsInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GCGSkillLimitsInfoOuterClass.internal_static_GCGSkillLimitsInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.class, GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder.class);
      }

      // Construct using GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.newBuilder()
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
          getLimitsListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (limitsListBuilder_ == null) {
          limitsList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          limitsListBuilder_.clear();
        }
        skillId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GCGSkillLimitsInfoOuterClass.internal_static_GCGSkillLimitsInfo_descriptor;
      }

      @java.lang.Override
      public GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo getDefaultInstanceForType() {
        return GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.getDefaultInstance();
      }

      @java.lang.Override
      public GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo build() {
        GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo buildPartial() {
        GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo result = new GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo(this);
        int from_bitField0_ = bitField0_;
        if (limitsListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            limitsList_ = java.util.Collections.unmodifiableList(limitsList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.limitsList_ = limitsList_;
        } else {
          result.limitsList_ = limitsListBuilder_.build();
        }
        result.skillId_ = skillId_;
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
        if (other instanceof GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo) {
          return mergeFrom((GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo other) {
        if (other == GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.getDefaultInstance()) return this;
        if (limitsListBuilder_ == null) {
          if (!other.limitsList_.isEmpty()) {
            if (limitsList_.isEmpty()) {
              limitsList_ = other.limitsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLimitsListIsMutable();
              limitsList_.addAll(other.limitsList_);
            }
            onChanged();
          }
        } else {
          if (!other.limitsList_.isEmpty()) {
            if (limitsListBuilder_.isEmpty()) {
              limitsListBuilder_.dispose();
              limitsListBuilder_ = null;
              limitsList_ = other.limitsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              limitsListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLimitsListFieldBuilder() : null;
            } else {
              limitsListBuilder_.addAllMessages(other.limitsList_);
            }
          }
        }
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
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
        GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<GCGLimitsInfoOuterClass.GCGLimitsInfo> limitsList_ =
        java.util.Collections.emptyList();
      private void ensureLimitsListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          limitsList_ = new java.util.ArrayList<GCGLimitsInfoOuterClass.GCGLimitsInfo>(limitsList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          GCGLimitsInfoOuterClass.GCGLimitsInfo, GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder, GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder> limitsListBuilder_;

      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public java.util.List<GCGLimitsInfoOuterClass.GCGLimitsInfo> getLimitsListList() {
        if (limitsListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(limitsList_);
        } else {
          return limitsListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public int getLimitsListCount() {
        if (limitsListBuilder_ == null) {
          return limitsList_.size();
        } else {
          return limitsListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public GCGLimitsInfoOuterClass.GCGLimitsInfo getLimitsList(int index) {
        if (limitsListBuilder_ == null) {
          return limitsList_.get(index);
        } else {
          return limitsListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public Builder setLimitsList(
          int index, GCGLimitsInfoOuterClass.GCGLimitsInfo value) {
        if (limitsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLimitsListIsMutable();
          limitsList_.set(index, value);
          onChanged();
        } else {
          limitsListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public Builder setLimitsList(
          int index, GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder builderForValue) {
        if (limitsListBuilder_ == null) {
          ensureLimitsListIsMutable();
          limitsList_.set(index, builderForValue.build());
          onChanged();
        } else {
          limitsListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public Builder addLimitsList(GCGLimitsInfoOuterClass.GCGLimitsInfo value) {
        if (limitsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLimitsListIsMutable();
          limitsList_.add(value);
          onChanged();
        } else {
          limitsListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public Builder addLimitsList(
          int index, GCGLimitsInfoOuterClass.GCGLimitsInfo value) {
        if (limitsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLimitsListIsMutable();
          limitsList_.add(index, value);
          onChanged();
        } else {
          limitsListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public Builder addLimitsList(
          GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder builderForValue) {
        if (limitsListBuilder_ == null) {
          ensureLimitsListIsMutable();
          limitsList_.add(builderForValue.build());
          onChanged();
        } else {
          limitsListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public Builder addLimitsList(
          int index, GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder builderForValue) {
        if (limitsListBuilder_ == null) {
          ensureLimitsListIsMutable();
          limitsList_.add(index, builderForValue.build());
          onChanged();
        } else {
          limitsListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public Builder addAllLimitsList(
          java.lang.Iterable<? extends GCGLimitsInfoOuterClass.GCGLimitsInfo> values) {
        if (limitsListBuilder_ == null) {
          ensureLimitsListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, limitsList_);
          onChanged();
        } else {
          limitsListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public Builder clearLimitsList() {
        if (limitsListBuilder_ == null) {
          limitsList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          limitsListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public Builder removeLimitsList(int index) {
        if (limitsListBuilder_ == null) {
          ensureLimitsListIsMutable();
          limitsList_.remove(index);
          onChanged();
        } else {
          limitsListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder getLimitsListBuilder(
          int index) {
        return getLimitsListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder getLimitsListOrBuilder(
          int index) {
        if (limitsListBuilder_ == null) {
          return limitsList_.get(index);  } else {
          return limitsListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public java.util.List<? extends GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder> 
           getLimitsListOrBuilderList() {
        if (limitsListBuilder_ != null) {
          return limitsListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(limitsList_);
        }
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder addLimitsListBuilder() {
        return getLimitsListFieldBuilder().addBuilder(
            GCGLimitsInfoOuterClass.GCGLimitsInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder addLimitsListBuilder(
          int index) {
        return getLimitsListFieldBuilder().addBuilder(
            index, GCGLimitsInfoOuterClass.GCGLimitsInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .GCGLimitsInfo limitsList = 8;</code>
       */
      public java.util.List<GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder> 
           getLimitsListBuilderList() {
        return getLimitsListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          GCGLimitsInfoOuterClass.GCGLimitsInfo, GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder, GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder> 
          getLimitsListFieldBuilder() {
        if (limitsListBuilder_ == null) {
          limitsListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              GCGLimitsInfoOuterClass.GCGLimitsInfo, GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder, GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder>(
                  limitsList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          limitsList_ = null;
        }
        return limitsListBuilder_;
      }

      private int skillId_ ;
      /**
       * <code>uint32 skillId = 9;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skillId = 9;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skillId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        
        skillId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGSkillLimitsInfo)
    }

    // @@protoc_insertion_point(class_scope:GCGSkillLimitsInfo)
    private static final GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo();
    }

    public static GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGSkillLimitsInfo>
        PARSER = new com.google.protobuf.AbstractParser<GCGSkillLimitsInfo>() {
      @java.lang.Override
      public GCGSkillLimitsInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGSkillLimitsInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGSkillLimitsInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGSkillLimitsInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGSkillLimitsInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGSkillLimitsInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GCGSkillLimitsInfo.proto\032\023GCGLimitsInf" +
      "o.proto\"I\n\022GCGSkillLimitsInfo\022\"\n\nlimitsL" +
      "ist\030\010 \003(\0132\016.GCGLimitsInfo\022\017\n\007skillId\030\t \001" +
      "(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          GCGLimitsInfoOuterClass.getDescriptor(),
        });
    internal_static_GCGSkillLimitsInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGSkillLimitsInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGSkillLimitsInfo_descriptor,
        new java.lang.String[] { "LimitsList", "SkillId", });
    GCGLimitsInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
