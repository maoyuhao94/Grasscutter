// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MichiaeMatsuriChallengePositionInfo.proto

public final class MichiaeMatsuriChallengePositionInfoOuterClass {
  private MichiaeMatsuriChallengePositionInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MichiaeMatsuriChallengePositionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MichiaeMatsuriChallengePositionInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 groupId = 5;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 gadgetId = 14;</code>
     * @return The gadgetId.
     */
    int getGadgetId();

    /**
     * <code>.Rotation pos = 13;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Rotation pos = 13;</code>
     * @return The pos.
     */
    RotationOuterClass.Rotation getPos();
    /**
     * <code>.Rotation pos = 13;</code>
     */
    RotationOuterClass.RotationOrBuilder getPosOrBuilder();
  }
  /**
   * Protobuf type {@code MichiaeMatsuriChallengePositionInfo}
   */
  public static final class MichiaeMatsuriChallengePositionInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MichiaeMatsuriChallengePositionInfo)
      MichiaeMatsuriChallengePositionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MichiaeMatsuriChallengePositionInfo.newBuilder() to construct.
    private MichiaeMatsuriChallengePositionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MichiaeMatsuriChallengePositionInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MichiaeMatsuriChallengePositionInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MichiaeMatsuriChallengePositionInfo(
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
            case 40: {

              groupId_ = input.readUInt32();
              break;
            }
            case 106: {
              RotationOuterClass.Rotation.Builder subBuilder = null;
              if (pos_ != null) {
                subBuilder = pos_.toBuilder();
              }
              pos_ = input.readMessage(RotationOuterClass.Rotation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pos_);
                pos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 112: {

              gadgetId_ = input.readUInt32();
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
      return MichiaeMatsuriChallengePositionInfoOuterClass.internal_static_MichiaeMatsuriChallengePositionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MichiaeMatsuriChallengePositionInfoOuterClass.internal_static_MichiaeMatsuriChallengePositionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo.class, MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo.Builder.class);
    }

    public static final int GROUPID_FIELD_NUMBER = 5;
    private int groupId_;
    /**
     * <code>uint32 groupId = 5;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int GADGETID_FIELD_NUMBER = 14;
    private int gadgetId_;
    /**
     * <code>uint32 gadgetId = 14;</code>
     * @return The gadgetId.
     */
    @java.lang.Override
    public int getGadgetId() {
      return gadgetId_;
    }

    public static final int POS_FIELD_NUMBER = 13;
    private RotationOuterClass.Rotation pos_;
    /**
     * <code>.Rotation pos = 13;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Rotation pos = 13;</code>
     * @return The pos.
     */
    @java.lang.Override
    public RotationOuterClass.Rotation getPos() {
      return pos_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Rotation pos = 13;</code>
     */
    @java.lang.Override
    public RotationOuterClass.RotationOrBuilder getPosOrBuilder() {
      return getPos();
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
        output.writeUInt32(5, groupId_);
      }
      if (pos_ != null) {
        output.writeMessage(13, getPos());
      }
      if (gadgetId_ != 0) {
        output.writeUInt32(14, gadgetId_);
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
          .computeUInt32Size(5, groupId_);
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getPos());
      }
      if (gadgetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, gadgetId_);
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
      if (!(obj instanceof MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo)) {
        return super.equals(obj);
      }
      MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo other = (MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo) obj;

      if (getGroupId()
          != other.getGroupId()) return false;
      if (getGadgetId()
          != other.getGadgetId()) return false;
      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
      }
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
      hash = (37 * hash) + GADGETID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetId();
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo parseFrom(
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
    public static Builder newBuilder(MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo prototype) {
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
     * Protobuf type {@code MichiaeMatsuriChallengePositionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MichiaeMatsuriChallengePositionInfo)
        MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MichiaeMatsuriChallengePositionInfoOuterClass.internal_static_MichiaeMatsuriChallengePositionInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MichiaeMatsuriChallengePositionInfoOuterClass.internal_static_MichiaeMatsuriChallengePositionInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo.class, MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo.Builder.class);
      }

      // Construct using MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo.newBuilder()
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

        gadgetId_ = 0;

        if (posBuilder_ == null) {
          pos_ = null;
        } else {
          pos_ = null;
          posBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MichiaeMatsuriChallengePositionInfoOuterClass.internal_static_MichiaeMatsuriChallengePositionInfo_descriptor;
      }

      @java.lang.Override
      public MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo getDefaultInstanceForType() {
        return MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo.getDefaultInstance();
      }

      @java.lang.Override
      public MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo build() {
        MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo buildPartial() {
        MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo result = new MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo(this);
        result.groupId_ = groupId_;
        result.gadgetId_ = gadgetId_;
        if (posBuilder_ == null) {
          result.pos_ = pos_;
        } else {
          result.pos_ = posBuilder_.build();
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
        if (other instanceof MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo) {
          return mergeFrom((MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo other) {
        if (other == MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo.getDefaultInstance()) return this;
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getGadgetId() != 0) {
          setGadgetId(other.getGadgetId());
        }
        if (other.hasPos()) {
          mergePos(other.getPos());
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
        MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo) e.getUnfinishedMessage();
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
       * <code>uint32 groupId = 5;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 groupId = 5;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 groupId = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int gadgetId_ ;
      /**
       * <code>uint32 gadgetId = 14;</code>
       * @return The gadgetId.
       */
      @java.lang.Override
      public int getGadgetId() {
        return gadgetId_;
      }
      /**
       * <code>uint32 gadgetId = 14;</code>
       * @param value The gadgetId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetId(int value) {
        
        gadgetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadgetId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetId() {
        
        gadgetId_ = 0;
        onChanged();
        return this;
      }

      private RotationOuterClass.Rotation pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> posBuilder_;
      /**
       * <code>.Rotation pos = 13;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Rotation pos = 13;</code>
       * @return The pos.
       */
      public RotationOuterClass.Rotation getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Rotation pos = 13;</code>
       */
      public Builder setPos(RotationOuterClass.Rotation value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
          onChanged();
        } else {
          posBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Rotation pos = 13;</code>
       */
      public Builder setPos(
          RotationOuterClass.Rotation.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
          onChanged();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Rotation pos = 13;</code>
       */
      public Builder mergePos(RotationOuterClass.Rotation value) {
        if (posBuilder_ == null) {
          if (pos_ != null) {
            pos_ =
              RotationOuterClass.Rotation.newBuilder(pos_).mergeFrom(value).buildPartial();
          } else {
            pos_ = value;
          }
          onChanged();
        } else {
          posBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Rotation pos = 13;</code>
       */
      public Builder clearPos() {
        if (posBuilder_ == null) {
          pos_ = null;
          onChanged();
        } else {
          pos_ = null;
          posBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Rotation pos = 13;</code>
       */
      public RotationOuterClass.Rotation.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Rotation pos = 13;</code>
       */
      public RotationOuterClass.RotationOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              RotationOuterClass.Rotation.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Rotation pos = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MichiaeMatsuriChallengePositionInfo)
    }

    // @@protoc_insertion_point(class_scope:MichiaeMatsuriChallengePositionInfo)
    private static final MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo();
    }

    public static MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MichiaeMatsuriChallengePositionInfo>
        PARSER = new com.google.protobuf.AbstractParser<MichiaeMatsuriChallengePositionInfo>() {
      @java.lang.Override
      public MichiaeMatsuriChallengePositionInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MichiaeMatsuriChallengePositionInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MichiaeMatsuriChallengePositionInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MichiaeMatsuriChallengePositionInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public MichiaeMatsuriChallengePositionInfoOuterClass.MichiaeMatsuriChallengePositionInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MichiaeMatsuriChallengePositionInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MichiaeMatsuriChallengePositionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)MichiaeMatsuriChallengePositionInfo.pr" +
      "oto\032\016Rotation.proto\"`\n#MichiaeMatsuriCha" +
      "llengePositionInfo\022\017\n\007groupId\030\005 \001(\r\022\020\n\010g" +
      "adgetId\030\016 \001(\r\022\026\n\003pos\030\r \001(\0132\t.Rotationb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          RotationOuterClass.getDescriptor(),
        });
    internal_static_MichiaeMatsuriChallengePositionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MichiaeMatsuriChallengePositionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MichiaeMatsuriChallengePositionInfo_descriptor,
        new java.lang.String[] { "GroupId", "GadgetId", "Pos", });
    RotationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
