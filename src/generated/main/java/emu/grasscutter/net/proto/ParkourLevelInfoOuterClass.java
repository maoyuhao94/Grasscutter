// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ParkourLevelInfo.proto

public final class ParkourLevelInfoOuterClass {
  private ParkourLevelInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ParkourLevelInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ParkourLevelInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 openTime = 10;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>.Rotation pos = 5;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Rotation pos = 5;</code>
     * @return The pos.
     */
    RotationOuterClass.Rotation getPos();
    /**
     * <code>.Rotation pos = 5;</code>
     */
    RotationOuterClass.RotationOrBuilder getPosOrBuilder();

    /**
     * <code>uint32 bestRecord = 1;</code>
     * @return The bestRecord.
     */
    int getBestRecord();

    /**
     * <code>bool isOpen = 12;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * Protobuf type {@code ParkourLevelInfo}
   */
  public static final class ParkourLevelInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ParkourLevelInfo)
      ParkourLevelInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ParkourLevelInfo.newBuilder() to construct.
    private ParkourLevelInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ParkourLevelInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ParkourLevelInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ParkourLevelInfo(
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
            case 8: {

              bestRecord_ = input.readUInt32();
              break;
            }
            case 42: {
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
            case 80: {

              openTime_ = input.readUInt32();
              break;
            }
            case 96: {

              isOpen_ = input.readBool();
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
      return ParkourLevelInfoOuterClass.internal_static_ParkourLevelInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ParkourLevelInfoOuterClass.internal_static_ParkourLevelInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ParkourLevelInfoOuterClass.ParkourLevelInfo.class, ParkourLevelInfoOuterClass.ParkourLevelInfo.Builder.class);
    }

    public static final int OPENTIME_FIELD_NUMBER = 10;
    private int openTime_;
    /**
     * <code>uint32 openTime = 10;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int POS_FIELD_NUMBER = 5;
    private RotationOuterClass.Rotation pos_;
    /**
     * <code>.Rotation pos = 5;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Rotation pos = 5;</code>
     * @return The pos.
     */
    @java.lang.Override
    public RotationOuterClass.Rotation getPos() {
      return pos_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Rotation pos = 5;</code>
     */
    @java.lang.Override
    public RotationOuterClass.RotationOrBuilder getPosOrBuilder() {
      return getPos();
    }

    public static final int BESTRECORD_FIELD_NUMBER = 1;
    private int bestRecord_;
    /**
     * <code>uint32 bestRecord = 1;</code>
     * @return The bestRecord.
     */
    @java.lang.Override
    public int getBestRecord() {
      return bestRecord_;
    }

    public static final int ISOPEN_FIELD_NUMBER = 12;
    private boolean isOpen_;
    /**
     * <code>bool isOpen = 12;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (bestRecord_ != 0) {
        output.writeUInt32(1, bestRecord_);
      }
      if (pos_ != null) {
        output.writeMessage(5, getPos());
      }
      if (openTime_ != 0) {
        output.writeUInt32(10, openTime_);
      }
      if (isOpen_ != false) {
        output.writeBool(12, isOpen_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bestRecord_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, bestRecord_);
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getPos());
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, openTime_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isOpen_);
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
      if (!(obj instanceof ParkourLevelInfoOuterClass.ParkourLevelInfo)) {
        return super.equals(obj);
      }
      ParkourLevelInfoOuterClass.ParkourLevelInfo other = (ParkourLevelInfoOuterClass.ParkourLevelInfo) obj;

      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
      }
      if (getBestRecord()
          != other.getBestRecord()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + OPENTIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (37 * hash) + BESTRECORD_FIELD_NUMBER;
      hash = (53 * hash) + getBestRecord();
      hash = (37 * hash) + ISOPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ParkourLevelInfoOuterClass.ParkourLevelInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ParkourLevelInfoOuterClass.ParkourLevelInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
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
    public static Builder newBuilder(ParkourLevelInfoOuterClass.ParkourLevelInfo prototype) {
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
     * Protobuf type {@code ParkourLevelInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ParkourLevelInfo)
        ParkourLevelInfoOuterClass.ParkourLevelInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ParkourLevelInfoOuterClass.internal_static_ParkourLevelInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ParkourLevelInfoOuterClass.internal_static_ParkourLevelInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ParkourLevelInfoOuterClass.ParkourLevelInfo.class, ParkourLevelInfoOuterClass.ParkourLevelInfo.Builder.class);
      }

      // Construct using ParkourLevelInfoOuterClass.ParkourLevelInfo.newBuilder()
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
        openTime_ = 0;

        if (posBuilder_ == null) {
          pos_ = null;
        } else {
          pos_ = null;
          posBuilder_ = null;
        }
        bestRecord_ = 0;

        isOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ParkourLevelInfoOuterClass.internal_static_ParkourLevelInfo_descriptor;
      }

      @java.lang.Override
      public ParkourLevelInfoOuterClass.ParkourLevelInfo getDefaultInstanceForType() {
        return ParkourLevelInfoOuterClass.ParkourLevelInfo.getDefaultInstance();
      }

      @java.lang.Override
      public ParkourLevelInfoOuterClass.ParkourLevelInfo build() {
        ParkourLevelInfoOuterClass.ParkourLevelInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ParkourLevelInfoOuterClass.ParkourLevelInfo buildPartial() {
        ParkourLevelInfoOuterClass.ParkourLevelInfo result = new ParkourLevelInfoOuterClass.ParkourLevelInfo(this);
        result.openTime_ = openTime_;
        if (posBuilder_ == null) {
          result.pos_ = pos_;
        } else {
          result.pos_ = posBuilder_.build();
        }
        result.bestRecord_ = bestRecord_;
        result.isOpen_ = isOpen_;
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
        if (other instanceof ParkourLevelInfoOuterClass.ParkourLevelInfo) {
          return mergeFrom((ParkourLevelInfoOuterClass.ParkourLevelInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ParkourLevelInfoOuterClass.ParkourLevelInfo other) {
        if (other == ParkourLevelInfoOuterClass.ParkourLevelInfo.getDefaultInstance()) return this;
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.hasPos()) {
          mergePos(other.getPos());
        }
        if (other.getBestRecord() != 0) {
          setBestRecord(other.getBestRecord());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
        ParkourLevelInfoOuterClass.ParkourLevelInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ParkourLevelInfoOuterClass.ParkourLevelInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 openTime = 10;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 openTime = 10;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 openTime = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private RotationOuterClass.Rotation pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> posBuilder_;
      /**
       * <code>.Rotation pos = 5;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Rotation pos = 5;</code>
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
       * <code>.Rotation pos = 5;</code>
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
       * <code>.Rotation pos = 5;</code>
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
       * <code>.Rotation pos = 5;</code>
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
       * <code>.Rotation pos = 5;</code>
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
       * <code>.Rotation pos = 5;</code>
       */
      public RotationOuterClass.Rotation.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Rotation pos = 5;</code>
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
       * <code>.Rotation pos = 5;</code>
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

      private int bestRecord_ ;
      /**
       * <code>uint32 bestRecord = 1;</code>
       * @return The bestRecord.
       */
      @java.lang.Override
      public int getBestRecord() {
        return bestRecord_;
      }
      /**
       * <code>uint32 bestRecord = 1;</code>
       * @param value The bestRecord to set.
       * @return This builder for chaining.
       */
      public Builder setBestRecord(int value) {
        
        bestRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bestRecord = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestRecord() {
        
        bestRecord_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool isOpen = 12;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool isOpen = 12;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isOpen = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:ParkourLevelInfo)
    }

    // @@protoc_insertion_point(class_scope:ParkourLevelInfo)
    private static final ParkourLevelInfoOuterClass.ParkourLevelInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ParkourLevelInfoOuterClass.ParkourLevelInfo();
    }

    public static ParkourLevelInfoOuterClass.ParkourLevelInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ParkourLevelInfo>
        PARSER = new com.google.protobuf.AbstractParser<ParkourLevelInfo>() {
      @java.lang.Override
      public ParkourLevelInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ParkourLevelInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ParkourLevelInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ParkourLevelInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ParkourLevelInfoOuterClass.ParkourLevelInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ParkourLevelInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ParkourLevelInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ParkourLevelInfo.proto\032\016Rotation.proto" +
      "\"`\n\020ParkourLevelInfo\022\020\n\010openTime\030\n \001(\r\022\026" +
      "\n\003pos\030\005 \001(\0132\t.Rotation\022\022\n\nbestRecord\030\001 \001" +
      "(\r\022\016\n\006isOpen\030\014 \001(\010b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          RotationOuterClass.getDescriptor(),
        });
    internal_static_ParkourLevelInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ParkourLevelInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ParkourLevelInfo_descriptor,
        new java.lang.String[] { "OpenTime", "Pos", "BestRecord", "IsOpen", });
    RotationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
