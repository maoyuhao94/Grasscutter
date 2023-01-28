// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SkyCrystalDetectorData.proto

public final class SkyCrystalDetectorDataOuterClass {
  private SkyCrystalDetectorDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SkyCrystalDetectorDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SkyCrystalDetectorData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Rotation hintCenterPos = 6;</code>
     * @return Whether the hintCenterPos field is set.
     */
    boolean hasHintCenterPos();
    /**
     * <code>.Rotation hintCenterPos = 6;</code>
     * @return The hintCenterPos.
     */
    RotationOuterClass.Rotation getHintCenterPos();
    /**
     * <code>.Rotation hintCenterPos = 6;</code>
     */
    RotationOuterClass.RotationOrBuilder getHintCenterPosOrBuilder();

    /**
     * <code>uint32 groupId = 14;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 configId = 8;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>bool isHintValid = 3;</code>
     * @return The isHintValid.
     */
    boolean getIsHintValid();
  }
  /**
   * Protobuf type {@code SkyCrystalDetectorData}
   */
  public static final class SkyCrystalDetectorData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SkyCrystalDetectorData)
      SkyCrystalDetectorDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SkyCrystalDetectorData.newBuilder() to construct.
    private SkyCrystalDetectorData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SkyCrystalDetectorData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SkyCrystalDetectorData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SkyCrystalDetectorData(
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
            case 24: {

              isHintValid_ = input.readBool();
              break;
            }
            case 50: {
              RotationOuterClass.Rotation.Builder subBuilder = null;
              if (hintCenterPos_ != null) {
                subBuilder = hintCenterPos_.toBuilder();
              }
              hintCenterPos_ = input.readMessage(RotationOuterClass.Rotation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(hintCenterPos_);
                hintCenterPos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 64: {

              configId_ = input.readUInt32();
              break;
            }
            case 112: {

              groupId_ = input.readUInt32();
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
      return SkyCrystalDetectorDataOuterClass.internal_static_SkyCrystalDetectorData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SkyCrystalDetectorDataOuterClass.internal_static_SkyCrystalDetectorData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.class, SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.Builder.class);
    }

    public static final int HINTCENTERPOS_FIELD_NUMBER = 6;
    private RotationOuterClass.Rotation hintCenterPos_;
    /**
     * <code>.Rotation hintCenterPos = 6;</code>
     * @return Whether the hintCenterPos field is set.
     */
    @java.lang.Override
    public boolean hasHintCenterPos() {
      return hintCenterPos_ != null;
    }
    /**
     * <code>.Rotation hintCenterPos = 6;</code>
     * @return The hintCenterPos.
     */
    @java.lang.Override
    public RotationOuterClass.Rotation getHintCenterPos() {
      return hintCenterPos_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : hintCenterPos_;
    }
    /**
     * <code>.Rotation hintCenterPos = 6;</code>
     */
    @java.lang.Override
    public RotationOuterClass.RotationOrBuilder getHintCenterPosOrBuilder() {
      return getHintCenterPos();
    }

    public static final int GROUPID_FIELD_NUMBER = 14;
    private int groupId_;
    /**
     * <code>uint32 groupId = 14;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int CONFIGID_FIELD_NUMBER = 8;
    private int configId_;
    /**
     * <code>uint32 configId = 8;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int ISHINTVALID_FIELD_NUMBER = 3;
    private boolean isHintValid_;
    /**
     * <code>bool isHintValid = 3;</code>
     * @return The isHintValid.
     */
    @java.lang.Override
    public boolean getIsHintValid() {
      return isHintValid_;
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
      if (isHintValid_ != false) {
        output.writeBool(3, isHintValid_);
      }
      if (hintCenterPos_ != null) {
        output.writeMessage(6, getHintCenterPos());
      }
      if (configId_ != 0) {
        output.writeUInt32(8, configId_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(14, groupId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isHintValid_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isHintValid_);
      }
      if (hintCenterPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getHintCenterPos());
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, configId_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, groupId_);
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
      if (!(obj instanceof SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData)) {
        return super.equals(obj);
      }
      SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData other = (SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData) obj;

      if (hasHintCenterPos() != other.hasHintCenterPos()) return false;
      if (hasHintCenterPos()) {
        if (!getHintCenterPos()
            .equals(other.getHintCenterPos())) return false;
      }
      if (getGroupId()
          != other.getGroupId()) return false;
      if (getConfigId()
          != other.getConfigId()) return false;
      if (getIsHintValid()
          != other.getIsHintValid()) return false;
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
      if (hasHintCenterPos()) {
        hash = (37 * hash) + HINTCENTERPOS_FIELD_NUMBER;
        hash = (53 * hash) + getHintCenterPos().hashCode();
      }
      hash = (37 * hash) + GROUPID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + CONFIGID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + ISHINTVALID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHintValid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
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
    public static Builder newBuilder(SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData prototype) {
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
     * Protobuf type {@code SkyCrystalDetectorData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SkyCrystalDetectorData)
        SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SkyCrystalDetectorDataOuterClass.internal_static_SkyCrystalDetectorData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SkyCrystalDetectorDataOuterClass.internal_static_SkyCrystalDetectorData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.class, SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.Builder.class);
      }

      // Construct using SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.newBuilder()
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
        if (hintCenterPosBuilder_ == null) {
          hintCenterPos_ = null;
        } else {
          hintCenterPos_ = null;
          hintCenterPosBuilder_ = null;
        }
        groupId_ = 0;

        configId_ = 0;

        isHintValid_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SkyCrystalDetectorDataOuterClass.internal_static_SkyCrystalDetectorData_descriptor;
      }

      @java.lang.Override
      public SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData getDefaultInstanceForType() {
        return SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.getDefaultInstance();
      }

      @java.lang.Override
      public SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData build() {
        SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData buildPartial() {
        SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData result = new SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData(this);
        if (hintCenterPosBuilder_ == null) {
          result.hintCenterPos_ = hintCenterPos_;
        } else {
          result.hintCenterPos_ = hintCenterPosBuilder_.build();
        }
        result.groupId_ = groupId_;
        result.configId_ = configId_;
        result.isHintValid_ = isHintValid_;
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
        if (other instanceof SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData) {
          return mergeFrom((SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData other) {
        if (other == SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.getDefaultInstance()) return this;
        if (other.hasHintCenterPos()) {
          mergeHintCenterPos(other.getHintCenterPos());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (other.getIsHintValid() != false) {
          setIsHintValid(other.getIsHintValid());
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
        SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private RotationOuterClass.Rotation hintCenterPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> hintCenterPosBuilder_;
      /**
       * <code>.Rotation hintCenterPos = 6;</code>
       * @return Whether the hintCenterPos field is set.
       */
      public boolean hasHintCenterPos() {
        return hintCenterPosBuilder_ != null || hintCenterPos_ != null;
      }
      /**
       * <code>.Rotation hintCenterPos = 6;</code>
       * @return The hintCenterPos.
       */
      public RotationOuterClass.Rotation getHintCenterPos() {
        if (hintCenterPosBuilder_ == null) {
          return hintCenterPos_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : hintCenterPos_;
        } else {
          return hintCenterPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Rotation hintCenterPos = 6;</code>
       */
      public Builder setHintCenterPos(RotationOuterClass.Rotation value) {
        if (hintCenterPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hintCenterPos_ = value;
          onChanged();
        } else {
          hintCenterPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Rotation hintCenterPos = 6;</code>
       */
      public Builder setHintCenterPos(
          RotationOuterClass.Rotation.Builder builderForValue) {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPos_ = builderForValue.build();
          onChanged();
        } else {
          hintCenterPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Rotation hintCenterPos = 6;</code>
       */
      public Builder mergeHintCenterPos(RotationOuterClass.Rotation value) {
        if (hintCenterPosBuilder_ == null) {
          if (hintCenterPos_ != null) {
            hintCenterPos_ =
              RotationOuterClass.Rotation.newBuilder(hintCenterPos_).mergeFrom(value).buildPartial();
          } else {
            hintCenterPos_ = value;
          }
          onChanged();
        } else {
          hintCenterPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Rotation hintCenterPos = 6;</code>
       */
      public Builder clearHintCenterPos() {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPos_ = null;
          onChanged();
        } else {
          hintCenterPos_ = null;
          hintCenterPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Rotation hintCenterPos = 6;</code>
       */
      public RotationOuterClass.Rotation.Builder getHintCenterPosBuilder() {
        
        onChanged();
        return getHintCenterPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Rotation hintCenterPos = 6;</code>
       */
      public RotationOuterClass.RotationOrBuilder getHintCenterPosOrBuilder() {
        if (hintCenterPosBuilder_ != null) {
          return hintCenterPosBuilder_.getMessageOrBuilder();
        } else {
          return hintCenterPos_ == null ?
              RotationOuterClass.Rotation.getDefaultInstance() : hintCenterPos_;
        }
      }
      /**
       * <code>.Rotation hintCenterPos = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> 
          getHintCenterPosFieldBuilder() {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder>(
                  getHintCenterPos(),
                  getParentForChildren(),
                  isClean());
          hintCenterPos_ = null;
        }
        return hintCenterPosBuilder_;
      }

      private int groupId_ ;
      /**
       * <code>uint32 groupId = 14;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 groupId = 14;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 groupId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 configId = 8;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 configId = 8;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 configId = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
        onChanged();
        return this;
      }

      private boolean isHintValid_ ;
      /**
       * <code>bool isHintValid = 3;</code>
       * @return The isHintValid.
       */
      @java.lang.Override
      public boolean getIsHintValid() {
        return isHintValid_;
      }
      /**
       * <code>bool isHintValid = 3;</code>
       * @param value The isHintValid to set.
       * @return This builder for chaining.
       */
      public Builder setIsHintValid(boolean value) {
        
        isHintValid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isHintValid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHintValid() {
        
        isHintValid_ = false;
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


      // @@protoc_insertion_point(builder_scope:SkyCrystalDetectorData)
    }

    // @@protoc_insertion_point(class_scope:SkyCrystalDetectorData)
    private static final SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData();
    }

    public static SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SkyCrystalDetectorData>
        PARSER = new com.google.protobuf.AbstractParser<SkyCrystalDetectorData>() {
      @java.lang.Override
      public SkyCrystalDetectorData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SkyCrystalDetectorData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SkyCrystalDetectorData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SkyCrystalDetectorData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SkyCrystalDetectorData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SkyCrystalDetectorData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SkyCrystalDetectorData.proto\032\016Rotation" +
      ".proto\"r\n\026SkyCrystalDetectorData\022 \n\rhint" +
      "CenterPos\030\006 \001(\0132\t.Rotation\022\017\n\007groupId\030\016 " +
      "\001(\r\022\020\n\010configId\030\010 \001(\r\022\023\n\013isHintValid\030\003 \001" +
      "(\010b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          RotationOuterClass.getDescriptor(),
        });
    internal_static_SkyCrystalDetectorData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SkyCrystalDetectorData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SkyCrystalDetectorData_descriptor,
        new java.lang.String[] { "HintCenterPos", "GroupId", "ConfigId", "IsHintValid", });
    RotationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
