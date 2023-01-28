// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtAvatarLockChairRsp.proto

public final class EvtAvatarLockChairRspOuterClass {
  private EvtAvatarLockChairRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtAvatarLockChairRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtAvatarLockChairRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Rotation position = 3;</code>
     * @return Whether the position field is set.
     */
    boolean hasPosition();
    /**
     * <code>.Rotation position = 3;</code>
     * @return The position.
     */
    RotationOuterClass.Rotation getPosition();
    /**
     * <code>.Rotation position = 3;</code>
     */
    RotationOuterClass.RotationOrBuilder getPositionOrBuilder();

    /**
     * <code>uint64 chairId = 15;</code>
     * @return The chairId.
     */
    long getChairId();

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 entityId = 4;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * Protobuf type {@code EvtAvatarLockChairRsp}
   */
  public static final class EvtAvatarLockChairRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtAvatarLockChairRsp)
      EvtAvatarLockChairRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtAvatarLockChairRsp.newBuilder() to construct.
    private EvtAvatarLockChairRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtAvatarLockChairRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtAvatarLockChairRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtAvatarLockChairRsp(
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
            case 26: {
              RotationOuterClass.Rotation.Builder subBuilder = null;
              if (position_ != null) {
                subBuilder = position_.toBuilder();
              }
              position_ = input.readMessage(RotationOuterClass.Rotation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(position_);
                position_ = subBuilder.buildPartial();
              }

              break;
            }
            case 32: {

              entityId_ = input.readUInt32();
              break;
            }
            case 96: {

              retcode_ = input.readInt32();
              break;
            }
            case 120: {

              chairId_ = input.readUInt64();
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
      return EvtAvatarLockChairRspOuterClass.internal_static_EvtAvatarLockChairRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EvtAvatarLockChairRspOuterClass.internal_static_EvtAvatarLockChairRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.class, EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code EvtAvatarLockChairRsp.GAPNEKBLNKF}
     */
    public enum GAPNEKBLNKF
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 384;</code>
       */
      PEPPOHPHJOJ(1, 384),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final GAPNEKBLNKF DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 384;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 384;
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
      public static GAPNEKBLNKF valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static GAPNEKBLNKF forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 384: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<GAPNEKBLNKF>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          GAPNEKBLNKF> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<GAPNEKBLNKF>() {
              public GAPNEKBLNKF findValueByNumber(int number) {
                return GAPNEKBLNKF.forNumber(number);
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
        return EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final GAPNEKBLNKF[] VALUES = getStaticValuesArray();
      private static GAPNEKBLNKF[] getStaticValuesArray() {
        return new GAPNEKBLNKF[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static GAPNEKBLNKF valueOf(
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

      private GAPNEKBLNKF(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:EvtAvatarLockChairRsp.GAPNEKBLNKF)
    }

    public static final int POSITION_FIELD_NUMBER = 3;
    private RotationOuterClass.Rotation position_;
    /**
     * <code>.Rotation position = 3;</code>
     * @return Whether the position field is set.
     */
    @java.lang.Override
    public boolean hasPosition() {
      return position_ != null;
    }
    /**
     * <code>.Rotation position = 3;</code>
     * @return The position.
     */
    @java.lang.Override
    public RotationOuterClass.Rotation getPosition() {
      return position_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : position_;
    }
    /**
     * <code>.Rotation position = 3;</code>
     */
    @java.lang.Override
    public RotationOuterClass.RotationOrBuilder getPositionOrBuilder() {
      return getPosition();
    }

    public static final int CHAIRID_FIELD_NUMBER = 15;
    private long chairId_;
    /**
     * <code>uint64 chairId = 15;</code>
     * @return The chairId.
     */
    @java.lang.Override
    public long getChairId() {
      return chairId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ENTITYID_FIELD_NUMBER = 4;
    private int entityId_;
    /**
     * <code>uint32 entityId = 4;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (position_ != null) {
        output.writeMessage(3, getPosition());
      }
      if (entityId_ != 0) {
        output.writeUInt32(4, entityId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      if (chairId_ != 0L) {
        output.writeUInt64(15, chairId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (position_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getPosition());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, entityId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
      }
      if (chairId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(15, chairId_);
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
      if (!(obj instanceof EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp)) {
        return super.equals(obj);
      }
      EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp other = (EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp) obj;

      if (hasPosition() != other.hasPosition()) return false;
      if (hasPosition()) {
        if (!getPosition()
            .equals(other.getPosition())) return false;
      }
      if (getChairId()
          != other.getChairId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      if (hasPosition()) {
        hash = (37 * hash) + POSITION_FIELD_NUMBER;
        hash = (53 * hash) + getPosition().hashCode();
      }
      hash = (37 * hash) + CHAIRID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getChairId());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parseFrom(
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
    public static Builder newBuilder(EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp prototype) {
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
     * Protobuf type {@code EvtAvatarLockChairRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtAvatarLockChairRsp)
        EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EvtAvatarLockChairRspOuterClass.internal_static_EvtAvatarLockChairRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return EvtAvatarLockChairRspOuterClass.internal_static_EvtAvatarLockChairRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.class, EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.Builder.class);
      }

      // Construct using EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.newBuilder()
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
        if (positionBuilder_ == null) {
          position_ = null;
        } else {
          position_ = null;
          positionBuilder_ = null;
        }
        chairId_ = 0L;

        retcode_ = 0;

        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return EvtAvatarLockChairRspOuterClass.internal_static_EvtAvatarLockChairRsp_descriptor;
      }

      @java.lang.Override
      public EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp getDefaultInstanceForType() {
        return EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.getDefaultInstance();
      }

      @java.lang.Override
      public EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp build() {
        EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp buildPartial() {
        EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp result = new EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp(this);
        if (positionBuilder_ == null) {
          result.position_ = position_;
        } else {
          result.position_ = positionBuilder_.build();
        }
        result.chairId_ = chairId_;
        result.retcode_ = retcode_;
        result.entityId_ = entityId_;
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
        if (other instanceof EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp) {
          return mergeFrom((EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp other) {
        if (other == EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.getDefaultInstance()) return this;
        if (other.hasPosition()) {
          mergePosition(other.getPosition());
        }
        if (other.getChairId() != 0L) {
          setChairId(other.getChairId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private RotationOuterClass.Rotation position_;
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> positionBuilder_;
      /**
       * <code>.Rotation position = 3;</code>
       * @return Whether the position field is set.
       */
      public boolean hasPosition() {
        return positionBuilder_ != null || position_ != null;
      }
      /**
       * <code>.Rotation position = 3;</code>
       * @return The position.
       */
      public RotationOuterClass.Rotation getPosition() {
        if (positionBuilder_ == null) {
          return position_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : position_;
        } else {
          return positionBuilder_.getMessage();
        }
      }
      /**
       * <code>.Rotation position = 3;</code>
       */
      public Builder setPosition(RotationOuterClass.Rotation value) {
        if (positionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          position_ = value;
          onChanged();
        } else {
          positionBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Rotation position = 3;</code>
       */
      public Builder setPosition(
          RotationOuterClass.Rotation.Builder builderForValue) {
        if (positionBuilder_ == null) {
          position_ = builderForValue.build();
          onChanged();
        } else {
          positionBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Rotation position = 3;</code>
       */
      public Builder mergePosition(RotationOuterClass.Rotation value) {
        if (positionBuilder_ == null) {
          if (position_ != null) {
            position_ =
              RotationOuterClass.Rotation.newBuilder(position_).mergeFrom(value).buildPartial();
          } else {
            position_ = value;
          }
          onChanged();
        } else {
          positionBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Rotation position = 3;</code>
       */
      public Builder clearPosition() {
        if (positionBuilder_ == null) {
          position_ = null;
          onChanged();
        } else {
          position_ = null;
          positionBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Rotation position = 3;</code>
       */
      public RotationOuterClass.Rotation.Builder getPositionBuilder() {
        
        onChanged();
        return getPositionFieldBuilder().getBuilder();
      }
      /**
       * <code>.Rotation position = 3;</code>
       */
      public RotationOuterClass.RotationOrBuilder getPositionOrBuilder() {
        if (positionBuilder_ != null) {
          return positionBuilder_.getMessageOrBuilder();
        } else {
          return position_ == null ?
              RotationOuterClass.Rotation.getDefaultInstance() : position_;
        }
      }
      /**
       * <code>.Rotation position = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> 
          getPositionFieldBuilder() {
        if (positionBuilder_ == null) {
          positionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder>(
                  getPosition(),
                  getParentForChildren(),
                  isClean());
          position_ = null;
        }
        return positionBuilder_;
      }

      private long chairId_ ;
      /**
       * <code>uint64 chairId = 15;</code>
       * @return The chairId.
       */
      @java.lang.Override
      public long getChairId() {
        return chairId_;
      }
      /**
       * <code>uint64 chairId = 15;</code>
       * @param value The chairId to set.
       * @return This builder for chaining.
       */
      public Builder setChairId(long value) {
        
        chairId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 chairId = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearChairId() {
        
        chairId_ = 0L;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 4;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 4;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtAvatarLockChairRsp)
    }

    // @@protoc_insertion_point(class_scope:EvtAvatarLockChairRsp)
    private static final EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp();
    }

    public static EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtAvatarLockChairRsp>
        PARSER = new com.google.protobuf.AbstractParser<EvtAvatarLockChairRsp>() {
      @java.lang.Override
      public EvtAvatarLockChairRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtAvatarLockChairRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtAvatarLockChairRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtAvatarLockChairRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtAvatarLockChairRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtAvatarLockChairRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033EvtAvatarLockChairRsp.proto\032\016Rotation." +
      "proto\"\271\001\n\025EvtAvatarLockChairRsp\022\033\n\010posit" +
      "ion\030\003 \001(\0132\t.Rotation\022\017\n\007chairId\030\017 \001(\004\022\017\n" +
      "\007retcode\030\014 \001(\005\022\020\n\010entityId\030\004 \001(\r\"O\n\013GAPN" +
      "EKBLNKF\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\200\003\022\017\n\013D" +
      "CDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          RotationOuterClass.getDescriptor(),
        });
    internal_static_EvtAvatarLockChairRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtAvatarLockChairRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtAvatarLockChairRsp_descriptor,
        new java.lang.String[] { "Position", "ChairId", "Retcode", "EntityId", });
    RotationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
