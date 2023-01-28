// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KLBGIPEHAID.proto

public final class KLBGIPEHAIDOuterClass {
  private KLBGIPEHAIDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KLBGIPEHAIDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KLBGIPEHAID)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Rotation velocity = 5;</code>
     * @return Whether the velocity field is set.
     */
    boolean hasVelocity();
    /**
     * <code>.Rotation velocity = 5;</code>
     * @return The velocity.
     */
    RotationOuterClass.Rotation getVelocity();
    /**
     * <code>.Rotation velocity = 5;</code>
     */
    RotationOuterClass.RotationOrBuilder getVelocityOrBuilder();

    /**
     * <code>.Rotation faceDir = 10;</code>
     * @return Whether the faceDir field is set.
     */
    boolean hasFaceDir();
    /**
     * <code>.Rotation faceDir = 10;</code>
     * @return The faceDir.
     */
    RotationOuterClass.Rotation getFaceDir();
    /**
     * <code>.Rotation faceDir = 10;</code>
     */
    RotationOuterClass.RotationOrBuilder getFaceDirOrBuilder();

    /**
     * <code>uint32 entityId = 14;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.Rotation pos = 9;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Rotation pos = 9;</code>
     * @return The pos.
     */
    RotationOuterClass.Rotation getPos();
    /**
     * <code>.Rotation pos = 9;</code>
     */
    RotationOuterClass.RotationOrBuilder getPosOrBuilder();
  }
  /**
   * Protobuf type {@code KLBGIPEHAID}
   */
  public static final class KLBGIPEHAID extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KLBGIPEHAID)
      KLBGIPEHAIDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KLBGIPEHAID.newBuilder() to construct.
    private KLBGIPEHAID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KLBGIPEHAID() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KLBGIPEHAID();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KLBGIPEHAID(
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
            case 42: {
              RotationOuterClass.Rotation.Builder subBuilder = null;
              if (velocity_ != null) {
                subBuilder = velocity_.toBuilder();
              }
              velocity_ = input.readMessage(RotationOuterClass.Rotation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(velocity_);
                velocity_ = subBuilder.buildPartial();
              }

              break;
            }
            case 74: {
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
            case 82: {
              RotationOuterClass.Rotation.Builder subBuilder = null;
              if (faceDir_ != null) {
                subBuilder = faceDir_.toBuilder();
              }
              faceDir_ = input.readMessage(RotationOuterClass.Rotation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(faceDir_);
                faceDir_ = subBuilder.buildPartial();
              }

              break;
            }
            case 112: {

              entityId_ = input.readUInt32();
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
      return KLBGIPEHAIDOuterClass.internal_static_KLBGIPEHAID_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return KLBGIPEHAIDOuterClass.internal_static_KLBGIPEHAID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              KLBGIPEHAIDOuterClass.KLBGIPEHAID.class, KLBGIPEHAIDOuterClass.KLBGIPEHAID.Builder.class);
    }

    public static final int VELOCITY_FIELD_NUMBER = 5;
    private RotationOuterClass.Rotation velocity_;
    /**
     * <code>.Rotation velocity = 5;</code>
     * @return Whether the velocity field is set.
     */
    @java.lang.Override
    public boolean hasVelocity() {
      return velocity_ != null;
    }
    /**
     * <code>.Rotation velocity = 5;</code>
     * @return The velocity.
     */
    @java.lang.Override
    public RotationOuterClass.Rotation getVelocity() {
      return velocity_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : velocity_;
    }
    /**
     * <code>.Rotation velocity = 5;</code>
     */
    @java.lang.Override
    public RotationOuterClass.RotationOrBuilder getVelocityOrBuilder() {
      return getVelocity();
    }

    public static final int FACEDIR_FIELD_NUMBER = 10;
    private RotationOuterClass.Rotation faceDir_;
    /**
     * <code>.Rotation faceDir = 10;</code>
     * @return Whether the faceDir field is set.
     */
    @java.lang.Override
    public boolean hasFaceDir() {
      return faceDir_ != null;
    }
    /**
     * <code>.Rotation faceDir = 10;</code>
     * @return The faceDir.
     */
    @java.lang.Override
    public RotationOuterClass.Rotation getFaceDir() {
      return faceDir_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : faceDir_;
    }
    /**
     * <code>.Rotation faceDir = 10;</code>
     */
    @java.lang.Override
    public RotationOuterClass.RotationOrBuilder getFaceDirOrBuilder() {
      return getFaceDir();
    }

    public static final int ENTITYID_FIELD_NUMBER = 14;
    private int entityId_;
    /**
     * <code>uint32 entityId = 14;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int POS_FIELD_NUMBER = 9;
    private RotationOuterClass.Rotation pos_;
    /**
     * <code>.Rotation pos = 9;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Rotation pos = 9;</code>
     * @return The pos.
     */
    @java.lang.Override
    public RotationOuterClass.Rotation getPos() {
      return pos_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Rotation pos = 9;</code>
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
      if (velocity_ != null) {
        output.writeMessage(5, getVelocity());
      }
      if (pos_ != null) {
        output.writeMessage(9, getPos());
      }
      if (faceDir_ != null) {
        output.writeMessage(10, getFaceDir());
      }
      if (entityId_ != 0) {
        output.writeUInt32(14, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (velocity_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getVelocity());
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getPos());
      }
      if (faceDir_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getFaceDir());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, entityId_);
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
      if (!(obj instanceof KLBGIPEHAIDOuterClass.KLBGIPEHAID)) {
        return super.equals(obj);
      }
      KLBGIPEHAIDOuterClass.KLBGIPEHAID other = (KLBGIPEHAIDOuterClass.KLBGIPEHAID) obj;

      if (hasVelocity() != other.hasVelocity()) return false;
      if (hasVelocity()) {
        if (!getVelocity()
            .equals(other.getVelocity())) return false;
      }
      if (hasFaceDir() != other.hasFaceDir()) return false;
      if (hasFaceDir()) {
        if (!getFaceDir()
            .equals(other.getFaceDir())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
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
      if (hasVelocity()) {
        hash = (37 * hash) + VELOCITY_FIELD_NUMBER;
        hash = (53 * hash) + getVelocity().hashCode();
      }
      if (hasFaceDir()) {
        hash = (37 * hash) + FACEDIR_FIELD_NUMBER;
        hash = (53 * hash) + getFaceDir().hashCode();
      }
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static KLBGIPEHAIDOuterClass.KLBGIPEHAID parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static KLBGIPEHAIDOuterClass.KLBGIPEHAID parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static KLBGIPEHAIDOuterClass.KLBGIPEHAID parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static KLBGIPEHAIDOuterClass.KLBGIPEHAID parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static KLBGIPEHAIDOuterClass.KLBGIPEHAID parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static KLBGIPEHAIDOuterClass.KLBGIPEHAID parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static KLBGIPEHAIDOuterClass.KLBGIPEHAID parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static KLBGIPEHAIDOuterClass.KLBGIPEHAID parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static KLBGIPEHAIDOuterClass.KLBGIPEHAID parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static KLBGIPEHAIDOuterClass.KLBGIPEHAID parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static KLBGIPEHAIDOuterClass.KLBGIPEHAID parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static KLBGIPEHAIDOuterClass.KLBGIPEHAID parseFrom(
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
    public static Builder newBuilder(KLBGIPEHAIDOuterClass.KLBGIPEHAID prototype) {
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
     * Protobuf type {@code KLBGIPEHAID}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KLBGIPEHAID)
        KLBGIPEHAIDOuterClass.KLBGIPEHAIDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return KLBGIPEHAIDOuterClass.internal_static_KLBGIPEHAID_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return KLBGIPEHAIDOuterClass.internal_static_KLBGIPEHAID_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                KLBGIPEHAIDOuterClass.KLBGIPEHAID.class, KLBGIPEHAIDOuterClass.KLBGIPEHAID.Builder.class);
      }

      // Construct using KLBGIPEHAIDOuterClass.KLBGIPEHAID.newBuilder()
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
        if (velocityBuilder_ == null) {
          velocity_ = null;
        } else {
          velocity_ = null;
          velocityBuilder_ = null;
        }
        if (faceDirBuilder_ == null) {
          faceDir_ = null;
        } else {
          faceDir_ = null;
          faceDirBuilder_ = null;
        }
        entityId_ = 0;

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
        return KLBGIPEHAIDOuterClass.internal_static_KLBGIPEHAID_descriptor;
      }

      @java.lang.Override
      public KLBGIPEHAIDOuterClass.KLBGIPEHAID getDefaultInstanceForType() {
        return KLBGIPEHAIDOuterClass.KLBGIPEHAID.getDefaultInstance();
      }

      @java.lang.Override
      public KLBGIPEHAIDOuterClass.KLBGIPEHAID build() {
        KLBGIPEHAIDOuterClass.KLBGIPEHAID result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public KLBGIPEHAIDOuterClass.KLBGIPEHAID buildPartial() {
        KLBGIPEHAIDOuterClass.KLBGIPEHAID result = new KLBGIPEHAIDOuterClass.KLBGIPEHAID(this);
        if (velocityBuilder_ == null) {
          result.velocity_ = velocity_;
        } else {
          result.velocity_ = velocityBuilder_.build();
        }
        if (faceDirBuilder_ == null) {
          result.faceDir_ = faceDir_;
        } else {
          result.faceDir_ = faceDirBuilder_.build();
        }
        result.entityId_ = entityId_;
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
        if (other instanceof KLBGIPEHAIDOuterClass.KLBGIPEHAID) {
          return mergeFrom((KLBGIPEHAIDOuterClass.KLBGIPEHAID)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(KLBGIPEHAIDOuterClass.KLBGIPEHAID other) {
        if (other == KLBGIPEHAIDOuterClass.KLBGIPEHAID.getDefaultInstance()) return this;
        if (other.hasVelocity()) {
          mergeVelocity(other.getVelocity());
        }
        if (other.hasFaceDir()) {
          mergeFaceDir(other.getFaceDir());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        KLBGIPEHAIDOuterClass.KLBGIPEHAID parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (KLBGIPEHAIDOuterClass.KLBGIPEHAID) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private RotationOuterClass.Rotation velocity_;
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> velocityBuilder_;
      /**
       * <code>.Rotation velocity = 5;</code>
       * @return Whether the velocity field is set.
       */
      public boolean hasVelocity() {
        return velocityBuilder_ != null || velocity_ != null;
      }
      /**
       * <code>.Rotation velocity = 5;</code>
       * @return The velocity.
       */
      public RotationOuterClass.Rotation getVelocity() {
        if (velocityBuilder_ == null) {
          return velocity_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : velocity_;
        } else {
          return velocityBuilder_.getMessage();
        }
      }
      /**
       * <code>.Rotation velocity = 5;</code>
       */
      public Builder setVelocity(RotationOuterClass.Rotation value) {
        if (velocityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          velocity_ = value;
          onChanged();
        } else {
          velocityBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Rotation velocity = 5;</code>
       */
      public Builder setVelocity(
          RotationOuterClass.Rotation.Builder builderForValue) {
        if (velocityBuilder_ == null) {
          velocity_ = builderForValue.build();
          onChanged();
        } else {
          velocityBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Rotation velocity = 5;</code>
       */
      public Builder mergeVelocity(RotationOuterClass.Rotation value) {
        if (velocityBuilder_ == null) {
          if (velocity_ != null) {
            velocity_ =
              RotationOuterClass.Rotation.newBuilder(velocity_).mergeFrom(value).buildPartial();
          } else {
            velocity_ = value;
          }
          onChanged();
        } else {
          velocityBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Rotation velocity = 5;</code>
       */
      public Builder clearVelocity() {
        if (velocityBuilder_ == null) {
          velocity_ = null;
          onChanged();
        } else {
          velocity_ = null;
          velocityBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Rotation velocity = 5;</code>
       */
      public RotationOuterClass.Rotation.Builder getVelocityBuilder() {
        
        onChanged();
        return getVelocityFieldBuilder().getBuilder();
      }
      /**
       * <code>.Rotation velocity = 5;</code>
       */
      public RotationOuterClass.RotationOrBuilder getVelocityOrBuilder() {
        if (velocityBuilder_ != null) {
          return velocityBuilder_.getMessageOrBuilder();
        } else {
          return velocity_ == null ?
              RotationOuterClass.Rotation.getDefaultInstance() : velocity_;
        }
      }
      /**
       * <code>.Rotation velocity = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> 
          getVelocityFieldBuilder() {
        if (velocityBuilder_ == null) {
          velocityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder>(
                  getVelocity(),
                  getParentForChildren(),
                  isClean());
          velocity_ = null;
        }
        return velocityBuilder_;
      }

      private RotationOuterClass.Rotation faceDir_;
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> faceDirBuilder_;
      /**
       * <code>.Rotation faceDir = 10;</code>
       * @return Whether the faceDir field is set.
       */
      public boolean hasFaceDir() {
        return faceDirBuilder_ != null || faceDir_ != null;
      }
      /**
       * <code>.Rotation faceDir = 10;</code>
       * @return The faceDir.
       */
      public RotationOuterClass.Rotation getFaceDir() {
        if (faceDirBuilder_ == null) {
          return faceDir_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : faceDir_;
        } else {
          return faceDirBuilder_.getMessage();
        }
      }
      /**
       * <code>.Rotation faceDir = 10;</code>
       */
      public Builder setFaceDir(RotationOuterClass.Rotation value) {
        if (faceDirBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          faceDir_ = value;
          onChanged();
        } else {
          faceDirBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Rotation faceDir = 10;</code>
       */
      public Builder setFaceDir(
          RotationOuterClass.Rotation.Builder builderForValue) {
        if (faceDirBuilder_ == null) {
          faceDir_ = builderForValue.build();
          onChanged();
        } else {
          faceDirBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Rotation faceDir = 10;</code>
       */
      public Builder mergeFaceDir(RotationOuterClass.Rotation value) {
        if (faceDirBuilder_ == null) {
          if (faceDir_ != null) {
            faceDir_ =
              RotationOuterClass.Rotation.newBuilder(faceDir_).mergeFrom(value).buildPartial();
          } else {
            faceDir_ = value;
          }
          onChanged();
        } else {
          faceDirBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Rotation faceDir = 10;</code>
       */
      public Builder clearFaceDir() {
        if (faceDirBuilder_ == null) {
          faceDir_ = null;
          onChanged();
        } else {
          faceDir_ = null;
          faceDirBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Rotation faceDir = 10;</code>
       */
      public RotationOuterClass.Rotation.Builder getFaceDirBuilder() {
        
        onChanged();
        return getFaceDirFieldBuilder().getBuilder();
      }
      /**
       * <code>.Rotation faceDir = 10;</code>
       */
      public RotationOuterClass.RotationOrBuilder getFaceDirOrBuilder() {
        if (faceDirBuilder_ != null) {
          return faceDirBuilder_.getMessageOrBuilder();
        } else {
          return faceDir_ == null ?
              RotationOuterClass.Rotation.getDefaultInstance() : faceDir_;
        }
      }
      /**
       * <code>.Rotation faceDir = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> 
          getFaceDirFieldBuilder() {
        if (faceDirBuilder_ == null) {
          faceDirBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder>(
                  getFaceDir(),
                  getParentForChildren(),
                  isClean());
          faceDir_ = null;
        }
        return faceDirBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 14;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 14;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private RotationOuterClass.Rotation pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> posBuilder_;
      /**
       * <code>.Rotation pos = 9;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Rotation pos = 9;</code>
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
       * <code>.Rotation pos = 9;</code>
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
       * <code>.Rotation pos = 9;</code>
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
       * <code>.Rotation pos = 9;</code>
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
       * <code>.Rotation pos = 9;</code>
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
       * <code>.Rotation pos = 9;</code>
       */
      public RotationOuterClass.Rotation.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Rotation pos = 9;</code>
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
       * <code>.Rotation pos = 9;</code>
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


      // @@protoc_insertion_point(builder_scope:KLBGIPEHAID)
    }

    // @@protoc_insertion_point(class_scope:KLBGIPEHAID)
    private static final KLBGIPEHAIDOuterClass.KLBGIPEHAID DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new KLBGIPEHAIDOuterClass.KLBGIPEHAID();
    }

    public static KLBGIPEHAIDOuterClass.KLBGIPEHAID getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KLBGIPEHAID>
        PARSER = new com.google.protobuf.AbstractParser<KLBGIPEHAID>() {
      @java.lang.Override
      public KLBGIPEHAID parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KLBGIPEHAID(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KLBGIPEHAID> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KLBGIPEHAID> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public KLBGIPEHAIDOuterClass.KLBGIPEHAID getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KLBGIPEHAID_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KLBGIPEHAID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KLBGIPEHAID.proto\032\016Rotation.proto\"p\n\013K" +
      "LBGIPEHAID\022\033\n\010velocity\030\005 \001(\0132\t.Rotation\022" +
      "\032\n\007faceDir\030\n \001(\0132\t.Rotation\022\020\n\010entityId\030" +
      "\016 \001(\r\022\026\n\003pos\030\t \001(\0132\t.Rotationb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          RotationOuterClass.getDescriptor(),
        });
    internal_static_KLBGIPEHAID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KLBGIPEHAID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KLBGIPEHAID_descriptor,
        new java.lang.String[] { "Velocity", "FaceDir", "EntityId", "Pos", });
    RotationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
