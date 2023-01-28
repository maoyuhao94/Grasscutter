// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeBlockSubFieldData.proto

public final class HomeBlockSubFieldDataOuterClass {
  private HomeBlockSubFieldDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeBlockSubFieldDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeBlockSubFieldData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Rotation rot = 6;</code>
     * @return Whether the rot field is set.
     */
    boolean hasRot();
    /**
     * <code>.Rotation rot = 6;</code>
     * @return The rot.
     */
    RotationOuterClass.Rotation getRot();
    /**
     * <code>.Rotation rot = 6;</code>
     */
    RotationOuterClass.RotationOrBuilder getRotOrBuilder();

    /**
     * <code>.Rotation pos = 11;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Rotation pos = 11;</code>
     * @return The pos.
     */
    RotationOuterClass.Rotation getPos();
    /**
     * <code>.Rotation pos = 11;</code>
     */
    RotationOuterClass.RotationOrBuilder getPosOrBuilder();
  }
  /**
   * Protobuf type {@code HomeBlockSubFieldData}
   */
  public static final class HomeBlockSubFieldData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeBlockSubFieldData)
      HomeBlockSubFieldDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeBlockSubFieldData.newBuilder() to construct.
    private HomeBlockSubFieldData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeBlockSubFieldData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeBlockSubFieldData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeBlockSubFieldData(
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
            case 50: {
              RotationOuterClass.Rotation.Builder subBuilder = null;
              if (rot_ != null) {
                subBuilder = rot_.toBuilder();
              }
              rot_ = input.readMessage(RotationOuterClass.Rotation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(rot_);
                rot_ = subBuilder.buildPartial();
              }

              break;
            }
            case 90: {
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
      return HomeBlockSubFieldDataOuterClass.internal_static_HomeBlockSubFieldData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HomeBlockSubFieldDataOuterClass.internal_static_HomeBlockSubFieldData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.class, HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.Builder.class);
    }

    public static final int ROT_FIELD_NUMBER = 6;
    private RotationOuterClass.Rotation rot_;
    /**
     * <code>.Rotation rot = 6;</code>
     * @return Whether the rot field is set.
     */
    @java.lang.Override
    public boolean hasRot() {
      return rot_ != null;
    }
    /**
     * <code>.Rotation rot = 6;</code>
     * @return The rot.
     */
    @java.lang.Override
    public RotationOuterClass.Rotation getRot() {
      return rot_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : rot_;
    }
    /**
     * <code>.Rotation rot = 6;</code>
     */
    @java.lang.Override
    public RotationOuterClass.RotationOrBuilder getRotOrBuilder() {
      return getRot();
    }

    public static final int POS_FIELD_NUMBER = 11;
    private RotationOuterClass.Rotation pos_;
    /**
     * <code>.Rotation pos = 11;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Rotation pos = 11;</code>
     * @return The pos.
     */
    @java.lang.Override
    public RotationOuterClass.Rotation getPos() {
      return pos_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Rotation pos = 11;</code>
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
      if (rot_ != null) {
        output.writeMessage(6, getRot());
      }
      if (pos_ != null) {
        output.writeMessage(11, getPos());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getRot());
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getPos());
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
      if (!(obj instanceof HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData)) {
        return super.equals(obj);
      }
      HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData other = (HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData) obj;

      if (hasRot() != other.hasRot()) return false;
      if (hasRot()) {
        if (!getRot()
            .equals(other.getRot())) return false;
      }
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
      if (hasRot()) {
        hash = (37 * hash) + ROT_FIELD_NUMBER;
        hash = (53 * hash) + getRot().hashCode();
      }
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData parseFrom(
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
    public static Builder newBuilder(HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData prototype) {
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
     * Protobuf type {@code HomeBlockSubFieldData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeBlockSubFieldData)
        HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HomeBlockSubFieldDataOuterClass.internal_static_HomeBlockSubFieldData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HomeBlockSubFieldDataOuterClass.internal_static_HomeBlockSubFieldData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.class, HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.Builder.class);
      }

      // Construct using HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.newBuilder()
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
        if (rotBuilder_ == null) {
          rot_ = null;
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }
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
        return HomeBlockSubFieldDataOuterClass.internal_static_HomeBlockSubFieldData_descriptor;
      }

      @java.lang.Override
      public HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData getDefaultInstanceForType() {
        return HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.getDefaultInstance();
      }

      @java.lang.Override
      public HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData build() {
        HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData buildPartial() {
        HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData result = new HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData(this);
        if (rotBuilder_ == null) {
          result.rot_ = rot_;
        } else {
          result.rot_ = rotBuilder_.build();
        }
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
        if (other instanceof HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData) {
          return mergeFrom((HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData other) {
        if (other == HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData.getDefaultInstance()) return this;
        if (other.hasRot()) {
          mergeRot(other.getRot());
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
        HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private RotationOuterClass.Rotation rot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> rotBuilder_;
      /**
       * <code>.Rotation rot = 6;</code>
       * @return Whether the rot field is set.
       */
      public boolean hasRot() {
        return rotBuilder_ != null || rot_ != null;
      }
      /**
       * <code>.Rotation rot = 6;</code>
       * @return The rot.
       */
      public RotationOuterClass.Rotation getRot() {
        if (rotBuilder_ == null) {
          return rot_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : rot_;
        } else {
          return rotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Rotation rot = 6;</code>
       */
      public Builder setRot(RotationOuterClass.Rotation value) {
        if (rotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rot_ = value;
          onChanged();
        } else {
          rotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Rotation rot = 6;</code>
       */
      public Builder setRot(
          RotationOuterClass.Rotation.Builder builderForValue) {
        if (rotBuilder_ == null) {
          rot_ = builderForValue.build();
          onChanged();
        } else {
          rotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Rotation rot = 6;</code>
       */
      public Builder mergeRot(RotationOuterClass.Rotation value) {
        if (rotBuilder_ == null) {
          if (rot_ != null) {
            rot_ =
              RotationOuterClass.Rotation.newBuilder(rot_).mergeFrom(value).buildPartial();
          } else {
            rot_ = value;
          }
          onChanged();
        } else {
          rotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Rotation rot = 6;</code>
       */
      public Builder clearRot() {
        if (rotBuilder_ == null) {
          rot_ = null;
          onChanged();
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Rotation rot = 6;</code>
       */
      public RotationOuterClass.Rotation.Builder getRotBuilder() {
        
        onChanged();
        return getRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Rotation rot = 6;</code>
       */
      public RotationOuterClass.RotationOrBuilder getRotOrBuilder() {
        if (rotBuilder_ != null) {
          return rotBuilder_.getMessageOrBuilder();
        } else {
          return rot_ == null ?
              RotationOuterClass.Rotation.getDefaultInstance() : rot_;
        }
      }
      /**
       * <code>.Rotation rot = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> 
          getRotFieldBuilder() {
        if (rotBuilder_ == null) {
          rotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder>(
                  getRot(),
                  getParentForChildren(),
                  isClean());
          rot_ = null;
        }
        return rotBuilder_;
      }

      private RotationOuterClass.Rotation pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> posBuilder_;
      /**
       * <code>.Rotation pos = 11;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Rotation pos = 11;</code>
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
       * <code>.Rotation pos = 11;</code>
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
       * <code>.Rotation pos = 11;</code>
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
       * <code>.Rotation pos = 11;</code>
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
       * <code>.Rotation pos = 11;</code>
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
       * <code>.Rotation pos = 11;</code>
       */
      public RotationOuterClass.Rotation.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Rotation pos = 11;</code>
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
       * <code>.Rotation pos = 11;</code>
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


      // @@protoc_insertion_point(builder_scope:HomeBlockSubFieldData)
    }

    // @@protoc_insertion_point(class_scope:HomeBlockSubFieldData)
    private static final HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData();
    }

    public static HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeBlockSubFieldData>
        PARSER = new com.google.protobuf.AbstractParser<HomeBlockSubFieldData>() {
      @java.lang.Override
      public HomeBlockSubFieldData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeBlockSubFieldData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeBlockSubFieldData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeBlockSubFieldData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public HomeBlockSubFieldDataOuterClass.HomeBlockSubFieldData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeBlockSubFieldData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeBlockSubFieldData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033HomeBlockSubFieldData.proto\032\016Rotation." +
      "proto\"G\n\025HomeBlockSubFieldData\022\026\n\003rot\030\006 " +
      "\001(\0132\t.Rotation\022\026\n\003pos\030\013 \001(\0132\t.Rotationb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          RotationOuterClass.getDescriptor(),
        });
    internal_static_HomeBlockSubFieldData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeBlockSubFieldData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeBlockSubFieldData_descriptor,
        new java.lang.String[] { "Rot", "Pos", });
    RotationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
