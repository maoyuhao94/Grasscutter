// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HEHODLHCPEL.proto

public final class HEHODLHCPELOuterClass {
  private HEHODLHCPELOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HEHODLHCPELOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HEHODLHCPEL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entityId = 10;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.Rotation glbmapjdhpc = 5;</code>
     * @return Whether the glbmapjdhpc field is set.
     */
    boolean hasGlbmapjdhpc();
    /**
     * <code>.Rotation glbmapjdhpc = 5;</code>
     * @return The glbmapjdhpc.
     */
    RotationOuterClass.Rotation getGlbmapjdhpc();
    /**
     * <code>.Rotation glbmapjdhpc = 5;</code>
     */
    RotationOuterClass.RotationOrBuilder getGlbmapjdhpcOrBuilder();

    /**
     * <code>.Rotation gnanpemiogh = 9;</code>
     * @return Whether the gnanpemiogh field is set.
     */
    boolean hasGnanpemiogh();
    /**
     * <code>.Rotation gnanpemiogh = 9;</code>
     * @return The gnanpemiogh.
     */
    RotationOuterClass.Rotation getGnanpemiogh();
    /**
     * <code>.Rotation gnanpemiogh = 9;</code>
     */
    RotationOuterClass.RotationOrBuilder getGnanpemioghOrBuilder();
  }
  /**
   * Protobuf type {@code HEHODLHCPEL}
   */
  public static final class HEHODLHCPEL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HEHODLHCPEL)
      HEHODLHCPELOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HEHODLHCPEL.newBuilder() to construct.
    private HEHODLHCPEL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HEHODLHCPEL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HEHODLHCPEL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HEHODLHCPEL(
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
              if (glbmapjdhpc_ != null) {
                subBuilder = glbmapjdhpc_.toBuilder();
              }
              glbmapjdhpc_ = input.readMessage(RotationOuterClass.Rotation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(glbmapjdhpc_);
                glbmapjdhpc_ = subBuilder.buildPartial();
              }

              break;
            }
            case 74: {
              RotationOuterClass.Rotation.Builder subBuilder = null;
              if (gnanpemiogh_ != null) {
                subBuilder = gnanpemiogh_.toBuilder();
              }
              gnanpemiogh_ = input.readMessage(RotationOuterClass.Rotation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(gnanpemiogh_);
                gnanpemiogh_ = subBuilder.buildPartial();
              }

              break;
            }
            case 80: {

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
      return HEHODLHCPELOuterClass.internal_static_HEHODLHCPEL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HEHODLHCPELOuterClass.internal_static_HEHODLHCPEL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HEHODLHCPELOuterClass.HEHODLHCPEL.class, HEHODLHCPELOuterClass.HEHODLHCPEL.Builder.class);
    }

    public static final int ENTITYID_FIELD_NUMBER = 10;
    private int entityId_;
    /**
     * <code>uint32 entityId = 10;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int GLBMAPJDHPC_FIELD_NUMBER = 5;
    private RotationOuterClass.Rotation glbmapjdhpc_;
    /**
     * <code>.Rotation glbmapjdhpc = 5;</code>
     * @return Whether the glbmapjdhpc field is set.
     */
    @java.lang.Override
    public boolean hasGlbmapjdhpc() {
      return glbmapjdhpc_ != null;
    }
    /**
     * <code>.Rotation glbmapjdhpc = 5;</code>
     * @return The glbmapjdhpc.
     */
    @java.lang.Override
    public RotationOuterClass.Rotation getGlbmapjdhpc() {
      return glbmapjdhpc_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : glbmapjdhpc_;
    }
    /**
     * <code>.Rotation glbmapjdhpc = 5;</code>
     */
    @java.lang.Override
    public RotationOuterClass.RotationOrBuilder getGlbmapjdhpcOrBuilder() {
      return getGlbmapjdhpc();
    }

    public static final int GNANPEMIOGH_FIELD_NUMBER = 9;
    private RotationOuterClass.Rotation gnanpemiogh_;
    /**
     * <code>.Rotation gnanpemiogh = 9;</code>
     * @return Whether the gnanpemiogh field is set.
     */
    @java.lang.Override
    public boolean hasGnanpemiogh() {
      return gnanpemiogh_ != null;
    }
    /**
     * <code>.Rotation gnanpemiogh = 9;</code>
     * @return The gnanpemiogh.
     */
    @java.lang.Override
    public RotationOuterClass.Rotation getGnanpemiogh() {
      return gnanpemiogh_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : gnanpemiogh_;
    }
    /**
     * <code>.Rotation gnanpemiogh = 9;</code>
     */
    @java.lang.Override
    public RotationOuterClass.RotationOrBuilder getGnanpemioghOrBuilder() {
      return getGnanpemiogh();
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
      if (glbmapjdhpc_ != null) {
        output.writeMessage(5, getGlbmapjdhpc());
      }
      if (gnanpemiogh_ != null) {
        output.writeMessage(9, getGnanpemiogh());
      }
      if (entityId_ != 0) {
        output.writeUInt32(10, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (glbmapjdhpc_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getGlbmapjdhpc());
      }
      if (gnanpemiogh_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getGnanpemiogh());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, entityId_);
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
      if (!(obj instanceof HEHODLHCPELOuterClass.HEHODLHCPEL)) {
        return super.equals(obj);
      }
      HEHODLHCPELOuterClass.HEHODLHCPEL other = (HEHODLHCPELOuterClass.HEHODLHCPEL) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasGlbmapjdhpc() != other.hasGlbmapjdhpc()) return false;
      if (hasGlbmapjdhpc()) {
        if (!getGlbmapjdhpc()
            .equals(other.getGlbmapjdhpc())) return false;
      }
      if (hasGnanpemiogh() != other.hasGnanpemiogh()) return false;
      if (hasGnanpemiogh()) {
        if (!getGnanpemiogh()
            .equals(other.getGnanpemiogh())) return false;
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
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasGlbmapjdhpc()) {
        hash = (37 * hash) + GLBMAPJDHPC_FIELD_NUMBER;
        hash = (53 * hash) + getGlbmapjdhpc().hashCode();
      }
      if (hasGnanpemiogh()) {
        hash = (37 * hash) + GNANPEMIOGH_FIELD_NUMBER;
        hash = (53 * hash) + getGnanpemiogh().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HEHODLHCPELOuterClass.HEHODLHCPEL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HEHODLHCPELOuterClass.HEHODLHCPEL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HEHODLHCPELOuterClass.HEHODLHCPEL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HEHODLHCPELOuterClass.HEHODLHCPEL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HEHODLHCPELOuterClass.HEHODLHCPEL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HEHODLHCPELOuterClass.HEHODLHCPEL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HEHODLHCPELOuterClass.HEHODLHCPEL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HEHODLHCPELOuterClass.HEHODLHCPEL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static HEHODLHCPELOuterClass.HEHODLHCPEL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static HEHODLHCPELOuterClass.HEHODLHCPEL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static HEHODLHCPELOuterClass.HEHODLHCPEL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HEHODLHCPELOuterClass.HEHODLHCPEL parseFrom(
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
    public static Builder newBuilder(HEHODLHCPELOuterClass.HEHODLHCPEL prototype) {
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
     * Protobuf type {@code HEHODLHCPEL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HEHODLHCPEL)
        HEHODLHCPELOuterClass.HEHODLHCPELOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HEHODLHCPELOuterClass.internal_static_HEHODLHCPEL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HEHODLHCPELOuterClass.internal_static_HEHODLHCPEL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HEHODLHCPELOuterClass.HEHODLHCPEL.class, HEHODLHCPELOuterClass.HEHODLHCPEL.Builder.class);
      }

      // Construct using HEHODLHCPELOuterClass.HEHODLHCPEL.newBuilder()
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
        entityId_ = 0;

        if (glbmapjdhpcBuilder_ == null) {
          glbmapjdhpc_ = null;
        } else {
          glbmapjdhpc_ = null;
          glbmapjdhpcBuilder_ = null;
        }
        if (gnanpemioghBuilder_ == null) {
          gnanpemiogh_ = null;
        } else {
          gnanpemiogh_ = null;
          gnanpemioghBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HEHODLHCPELOuterClass.internal_static_HEHODLHCPEL_descriptor;
      }

      @java.lang.Override
      public HEHODLHCPELOuterClass.HEHODLHCPEL getDefaultInstanceForType() {
        return HEHODLHCPELOuterClass.HEHODLHCPEL.getDefaultInstance();
      }

      @java.lang.Override
      public HEHODLHCPELOuterClass.HEHODLHCPEL build() {
        HEHODLHCPELOuterClass.HEHODLHCPEL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public HEHODLHCPELOuterClass.HEHODLHCPEL buildPartial() {
        HEHODLHCPELOuterClass.HEHODLHCPEL result = new HEHODLHCPELOuterClass.HEHODLHCPEL(this);
        result.entityId_ = entityId_;
        if (glbmapjdhpcBuilder_ == null) {
          result.glbmapjdhpc_ = glbmapjdhpc_;
        } else {
          result.glbmapjdhpc_ = glbmapjdhpcBuilder_.build();
        }
        if (gnanpemioghBuilder_ == null) {
          result.gnanpemiogh_ = gnanpemiogh_;
        } else {
          result.gnanpemiogh_ = gnanpemioghBuilder_.build();
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
        if (other instanceof HEHODLHCPELOuterClass.HEHODLHCPEL) {
          return mergeFrom((HEHODLHCPELOuterClass.HEHODLHCPEL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HEHODLHCPELOuterClass.HEHODLHCPEL other) {
        if (other == HEHODLHCPELOuterClass.HEHODLHCPEL.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasGlbmapjdhpc()) {
          mergeGlbmapjdhpc(other.getGlbmapjdhpc());
        }
        if (other.hasGnanpemiogh()) {
          mergeGnanpemiogh(other.getGnanpemiogh());
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
        HEHODLHCPELOuterClass.HEHODLHCPEL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HEHODLHCPELOuterClass.HEHODLHCPEL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 10;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 10;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private RotationOuterClass.Rotation glbmapjdhpc_;
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> glbmapjdhpcBuilder_;
      /**
       * <code>.Rotation glbmapjdhpc = 5;</code>
       * @return Whether the glbmapjdhpc field is set.
       */
      public boolean hasGlbmapjdhpc() {
        return glbmapjdhpcBuilder_ != null || glbmapjdhpc_ != null;
      }
      /**
       * <code>.Rotation glbmapjdhpc = 5;</code>
       * @return The glbmapjdhpc.
       */
      public RotationOuterClass.Rotation getGlbmapjdhpc() {
        if (glbmapjdhpcBuilder_ == null) {
          return glbmapjdhpc_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : glbmapjdhpc_;
        } else {
          return glbmapjdhpcBuilder_.getMessage();
        }
      }
      /**
       * <code>.Rotation glbmapjdhpc = 5;</code>
       */
      public Builder setGlbmapjdhpc(RotationOuterClass.Rotation value) {
        if (glbmapjdhpcBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          glbmapjdhpc_ = value;
          onChanged();
        } else {
          glbmapjdhpcBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Rotation glbmapjdhpc = 5;</code>
       */
      public Builder setGlbmapjdhpc(
          RotationOuterClass.Rotation.Builder builderForValue) {
        if (glbmapjdhpcBuilder_ == null) {
          glbmapjdhpc_ = builderForValue.build();
          onChanged();
        } else {
          glbmapjdhpcBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Rotation glbmapjdhpc = 5;</code>
       */
      public Builder mergeGlbmapjdhpc(RotationOuterClass.Rotation value) {
        if (glbmapjdhpcBuilder_ == null) {
          if (glbmapjdhpc_ != null) {
            glbmapjdhpc_ =
              RotationOuterClass.Rotation.newBuilder(glbmapjdhpc_).mergeFrom(value).buildPartial();
          } else {
            glbmapjdhpc_ = value;
          }
          onChanged();
        } else {
          glbmapjdhpcBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Rotation glbmapjdhpc = 5;</code>
       */
      public Builder clearGlbmapjdhpc() {
        if (glbmapjdhpcBuilder_ == null) {
          glbmapjdhpc_ = null;
          onChanged();
        } else {
          glbmapjdhpc_ = null;
          glbmapjdhpcBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Rotation glbmapjdhpc = 5;</code>
       */
      public RotationOuterClass.Rotation.Builder getGlbmapjdhpcBuilder() {
        
        onChanged();
        return getGlbmapjdhpcFieldBuilder().getBuilder();
      }
      /**
       * <code>.Rotation glbmapjdhpc = 5;</code>
       */
      public RotationOuterClass.RotationOrBuilder getGlbmapjdhpcOrBuilder() {
        if (glbmapjdhpcBuilder_ != null) {
          return glbmapjdhpcBuilder_.getMessageOrBuilder();
        } else {
          return glbmapjdhpc_ == null ?
              RotationOuterClass.Rotation.getDefaultInstance() : glbmapjdhpc_;
        }
      }
      /**
       * <code>.Rotation glbmapjdhpc = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> 
          getGlbmapjdhpcFieldBuilder() {
        if (glbmapjdhpcBuilder_ == null) {
          glbmapjdhpcBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder>(
                  getGlbmapjdhpc(),
                  getParentForChildren(),
                  isClean());
          glbmapjdhpc_ = null;
        }
        return glbmapjdhpcBuilder_;
      }

      private RotationOuterClass.Rotation gnanpemiogh_;
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> gnanpemioghBuilder_;
      /**
       * <code>.Rotation gnanpemiogh = 9;</code>
       * @return Whether the gnanpemiogh field is set.
       */
      public boolean hasGnanpemiogh() {
        return gnanpemioghBuilder_ != null || gnanpemiogh_ != null;
      }
      /**
       * <code>.Rotation gnanpemiogh = 9;</code>
       * @return The gnanpemiogh.
       */
      public RotationOuterClass.Rotation getGnanpemiogh() {
        if (gnanpemioghBuilder_ == null) {
          return gnanpemiogh_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : gnanpemiogh_;
        } else {
          return gnanpemioghBuilder_.getMessage();
        }
      }
      /**
       * <code>.Rotation gnanpemiogh = 9;</code>
       */
      public Builder setGnanpemiogh(RotationOuterClass.Rotation value) {
        if (gnanpemioghBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          gnanpemiogh_ = value;
          onChanged();
        } else {
          gnanpemioghBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Rotation gnanpemiogh = 9;</code>
       */
      public Builder setGnanpemiogh(
          RotationOuterClass.Rotation.Builder builderForValue) {
        if (gnanpemioghBuilder_ == null) {
          gnanpemiogh_ = builderForValue.build();
          onChanged();
        } else {
          gnanpemioghBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Rotation gnanpemiogh = 9;</code>
       */
      public Builder mergeGnanpemiogh(RotationOuterClass.Rotation value) {
        if (gnanpemioghBuilder_ == null) {
          if (gnanpemiogh_ != null) {
            gnanpemiogh_ =
              RotationOuterClass.Rotation.newBuilder(gnanpemiogh_).mergeFrom(value).buildPartial();
          } else {
            gnanpemiogh_ = value;
          }
          onChanged();
        } else {
          gnanpemioghBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Rotation gnanpemiogh = 9;</code>
       */
      public Builder clearGnanpemiogh() {
        if (gnanpemioghBuilder_ == null) {
          gnanpemiogh_ = null;
          onChanged();
        } else {
          gnanpemiogh_ = null;
          gnanpemioghBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Rotation gnanpemiogh = 9;</code>
       */
      public RotationOuterClass.Rotation.Builder getGnanpemioghBuilder() {
        
        onChanged();
        return getGnanpemioghFieldBuilder().getBuilder();
      }
      /**
       * <code>.Rotation gnanpemiogh = 9;</code>
       */
      public RotationOuterClass.RotationOrBuilder getGnanpemioghOrBuilder() {
        if (gnanpemioghBuilder_ != null) {
          return gnanpemioghBuilder_.getMessageOrBuilder();
        } else {
          return gnanpemiogh_ == null ?
              RotationOuterClass.Rotation.getDefaultInstance() : gnanpemiogh_;
        }
      }
      /**
       * <code>.Rotation gnanpemiogh = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> 
          getGnanpemioghFieldBuilder() {
        if (gnanpemioghBuilder_ == null) {
          gnanpemioghBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder>(
                  getGnanpemiogh(),
                  getParentForChildren(),
                  isClean());
          gnanpemiogh_ = null;
        }
        return gnanpemioghBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HEHODLHCPEL)
    }

    // @@protoc_insertion_point(class_scope:HEHODLHCPEL)
    private static final HEHODLHCPELOuterClass.HEHODLHCPEL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HEHODLHCPELOuterClass.HEHODLHCPEL();
    }

    public static HEHODLHCPELOuterClass.HEHODLHCPEL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HEHODLHCPEL>
        PARSER = new com.google.protobuf.AbstractParser<HEHODLHCPEL>() {
      @java.lang.Override
      public HEHODLHCPEL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HEHODLHCPEL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HEHODLHCPEL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HEHODLHCPEL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public HEHODLHCPELOuterClass.HEHODLHCPEL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HEHODLHCPEL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HEHODLHCPEL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021HEHODLHCPEL.proto\032\016Rotation.proto\"_\n\013H" +
      "EHODLHCPEL\022\020\n\010entityId\030\n \001(\r\022\036\n\013glbmapjd" +
      "hpc\030\005 \001(\0132\t.Rotation\022\036\n\013gnanpemiogh\030\t \001(" +
      "\0132\t.Rotationb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          RotationOuterClass.getDescriptor(),
        });
    internal_static_HEHODLHCPEL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HEHODLHCPEL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HEHODLHCPEL_descriptor,
        new java.lang.String[] { "EntityId", "Glbmapjdhpc", "Gnanpemiogh", });
    RotationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
