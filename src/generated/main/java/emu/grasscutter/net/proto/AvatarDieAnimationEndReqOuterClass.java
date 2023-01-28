// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarDieAnimationEndReq.proto

public final class AvatarDieAnimationEndReqOuterClass {
  private AvatarDieAnimationEndReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarDieAnimationEndReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarDieAnimationEndReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 dieGuid = 7;</code>
     * @return The dieGuid.
     */
    long getDieGuid();

    /**
     * <code>uint32 skillId = 4;</code>
     * @return The skillId.
     */
    int getSkillId();

    /**
     * <code>.Rotation rebornPos = 10;</code>
     * @return Whether the rebornPos field is set.
     */
    boolean hasRebornPos();
    /**
     * <code>.Rotation rebornPos = 10;</code>
     * @return The rebornPos.
     */
    RotationOuterClass.Rotation getRebornPos();
    /**
     * <code>.Rotation rebornPos = 10;</code>
     */
    RotationOuterClass.RotationOrBuilder getRebornPosOrBuilder();
  }
  /**
   * Protobuf type {@code AvatarDieAnimationEndReq}
   */
  public static final class AvatarDieAnimationEndReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarDieAnimationEndReq)
      AvatarDieAnimationEndReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarDieAnimationEndReq.newBuilder() to construct.
    private AvatarDieAnimationEndReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarDieAnimationEndReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarDieAnimationEndReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarDieAnimationEndReq(
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
            case 32: {

              skillId_ = input.readUInt32();
              break;
            }
            case 56: {

              dieGuid_ = input.readUInt64();
              break;
            }
            case 82: {
              RotationOuterClass.Rotation.Builder subBuilder = null;
              if (rebornPos_ != null) {
                subBuilder = rebornPos_.toBuilder();
              }
              rebornPos_ = input.readMessage(RotationOuterClass.Rotation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(rebornPos_);
                rebornPos_ = subBuilder.buildPartial();
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
      return AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.class, AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.Builder.class);
    }

    /**
     * Protobuf enum {@code AvatarDieAnimationEndReq.BBHLLEDPODB}
     */
    public enum BBHLLEDPODB
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1652;</code>
       */
      PEPPOHPHJOJ(1, 1652),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final BBHLLEDPODB DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final BBHLLEDPODB EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1652;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1652;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


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
      public static BBHLLEDPODB valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static BBHLLEDPODB forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1652: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<BBHLLEDPODB>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          BBHLLEDPODB> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<BBHLLEDPODB>() {
              public BBHLLEDPODB findValueByNumber(int number) {
                return BBHLLEDPODB.forNumber(number);
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
        return AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final BBHLLEDPODB[] VALUES = getStaticValuesArray();
      private static BBHLLEDPODB[] getStaticValuesArray() {
        return new BBHLLEDPODB[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static BBHLLEDPODB valueOf(
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

      private BBHLLEDPODB(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:AvatarDieAnimationEndReq.BBHLLEDPODB)
    }

    public static final int DIEGUID_FIELD_NUMBER = 7;
    private long dieGuid_;
    /**
     * <code>uint64 dieGuid = 7;</code>
     * @return The dieGuid.
     */
    @java.lang.Override
    public long getDieGuid() {
      return dieGuid_;
    }

    public static final int SKILLID_FIELD_NUMBER = 4;
    private int skillId_;
    /**
     * <code>uint32 skillId = 4;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
    }

    public static final int REBORNPOS_FIELD_NUMBER = 10;
    private RotationOuterClass.Rotation rebornPos_;
    /**
     * <code>.Rotation rebornPos = 10;</code>
     * @return Whether the rebornPos field is set.
     */
    @java.lang.Override
    public boolean hasRebornPos() {
      return rebornPos_ != null;
    }
    /**
     * <code>.Rotation rebornPos = 10;</code>
     * @return The rebornPos.
     */
    @java.lang.Override
    public RotationOuterClass.Rotation getRebornPos() {
      return rebornPos_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : rebornPos_;
    }
    /**
     * <code>.Rotation rebornPos = 10;</code>
     */
    @java.lang.Override
    public RotationOuterClass.RotationOrBuilder getRebornPosOrBuilder() {
      return getRebornPos();
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
      if (skillId_ != 0) {
        output.writeUInt32(4, skillId_);
      }
      if (dieGuid_ != 0L) {
        output.writeUInt64(7, dieGuid_);
      }
      if (rebornPos_ != null) {
        output.writeMessage(10, getRebornPos());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, skillId_);
      }
      if (dieGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, dieGuid_);
      }
      if (rebornPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getRebornPos());
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
      if (!(obj instanceof AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq)) {
        return super.equals(obj);
      }
      AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq other = (AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq) obj;

      if (getDieGuid()
          != other.getDieGuid()) return false;
      if (getSkillId()
          != other.getSkillId()) return false;
      if (hasRebornPos() != other.hasRebornPos()) return false;
      if (hasRebornPos()) {
        if (!getRebornPos()
            .equals(other.getRebornPos())) return false;
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
      hash = (37 * hash) + DIEGUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDieGuid());
      hash = (37 * hash) + SKILLID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      if (hasRebornPos()) {
        hash = (37 * hash) + REBORNPOS_FIELD_NUMBER;
        hash = (53 * hash) + getRebornPos().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
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
    public static Builder newBuilder(AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq prototype) {
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
     * Protobuf type {@code AvatarDieAnimationEndReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarDieAnimationEndReq)
        AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.class, AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.Builder.class);
      }

      // Construct using AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.newBuilder()
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
        dieGuid_ = 0L;

        skillId_ = 0;

        if (rebornPosBuilder_ == null) {
          rebornPos_ = null;
        } else {
          rebornPos_ = null;
          rebornPosBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor;
      }

      @java.lang.Override
      public AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq getDefaultInstanceForType() {
        return AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.getDefaultInstance();
      }

      @java.lang.Override
      public AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq build() {
        AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq buildPartial() {
        AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq result = new AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq(this);
        result.dieGuid_ = dieGuid_;
        result.skillId_ = skillId_;
        if (rebornPosBuilder_ == null) {
          result.rebornPos_ = rebornPos_;
        } else {
          result.rebornPos_ = rebornPosBuilder_.build();
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
        if (other instanceof AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq) {
          return mergeFrom((AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq other) {
        if (other == AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.getDefaultInstance()) return this;
        if (other.getDieGuid() != 0L) {
          setDieGuid(other.getDieGuid());
        }
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
        }
        if (other.hasRebornPos()) {
          mergeRebornPos(other.getRebornPos());
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
        AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long dieGuid_ ;
      /**
       * <code>uint64 dieGuid = 7;</code>
       * @return The dieGuid.
       */
      @java.lang.Override
      public long getDieGuid() {
        return dieGuid_;
      }
      /**
       * <code>uint64 dieGuid = 7;</code>
       * @param value The dieGuid to set.
       * @return This builder for chaining.
       */
      public Builder setDieGuid(long value) {
        
        dieGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 dieGuid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDieGuid() {
        
        dieGuid_ = 0L;
        onChanged();
        return this;
      }

      private int skillId_ ;
      /**
       * <code>uint32 skillId = 4;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skillId = 4;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skillId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        
        skillId_ = 0;
        onChanged();
        return this;
      }

      private RotationOuterClass.Rotation rebornPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> rebornPosBuilder_;
      /**
       * <code>.Rotation rebornPos = 10;</code>
       * @return Whether the rebornPos field is set.
       */
      public boolean hasRebornPos() {
        return rebornPosBuilder_ != null || rebornPos_ != null;
      }
      /**
       * <code>.Rotation rebornPos = 10;</code>
       * @return The rebornPos.
       */
      public RotationOuterClass.Rotation getRebornPos() {
        if (rebornPosBuilder_ == null) {
          return rebornPos_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : rebornPos_;
        } else {
          return rebornPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Rotation rebornPos = 10;</code>
       */
      public Builder setRebornPos(RotationOuterClass.Rotation value) {
        if (rebornPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rebornPos_ = value;
          onChanged();
        } else {
          rebornPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Rotation rebornPos = 10;</code>
       */
      public Builder setRebornPos(
          RotationOuterClass.Rotation.Builder builderForValue) {
        if (rebornPosBuilder_ == null) {
          rebornPos_ = builderForValue.build();
          onChanged();
        } else {
          rebornPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Rotation rebornPos = 10;</code>
       */
      public Builder mergeRebornPos(RotationOuterClass.Rotation value) {
        if (rebornPosBuilder_ == null) {
          if (rebornPos_ != null) {
            rebornPos_ =
              RotationOuterClass.Rotation.newBuilder(rebornPos_).mergeFrom(value).buildPartial();
          } else {
            rebornPos_ = value;
          }
          onChanged();
        } else {
          rebornPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Rotation rebornPos = 10;</code>
       */
      public Builder clearRebornPos() {
        if (rebornPosBuilder_ == null) {
          rebornPos_ = null;
          onChanged();
        } else {
          rebornPos_ = null;
          rebornPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Rotation rebornPos = 10;</code>
       */
      public RotationOuterClass.Rotation.Builder getRebornPosBuilder() {
        
        onChanged();
        return getRebornPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Rotation rebornPos = 10;</code>
       */
      public RotationOuterClass.RotationOrBuilder getRebornPosOrBuilder() {
        if (rebornPosBuilder_ != null) {
          return rebornPosBuilder_.getMessageOrBuilder();
        } else {
          return rebornPos_ == null ?
              RotationOuterClass.Rotation.getDefaultInstance() : rebornPos_;
        }
      }
      /**
       * <code>.Rotation rebornPos = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> 
          getRebornPosFieldBuilder() {
        if (rebornPosBuilder_ == null) {
          rebornPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder>(
                  getRebornPos(),
                  getParentForChildren(),
                  isClean());
          rebornPos_ = null;
        }
        return rebornPosBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AvatarDieAnimationEndReq)
    }

    // @@protoc_insertion_point(class_scope:AvatarDieAnimationEndReq)
    private static final AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq();
    }

    public static AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarDieAnimationEndReq>
        PARSER = new com.google.protobuf.AbstractParser<AvatarDieAnimationEndReq>() {
      @java.lang.Override
      public AvatarDieAnimationEndReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarDieAnimationEndReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarDieAnimationEndReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarDieAnimationEndReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarDieAnimationEndReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarDieAnimationEndReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036AvatarDieAnimationEndReq.proto\032\016Rotati" +
      "on.proto\"\274\001\n\030AvatarDieAnimationEndReq\022\017\n" +
      "\007dieGuid\030\007 \001(\004\022\017\n\007skillId\030\004 \001(\r\022\034\n\trebor" +
      "nPos\030\n \001(\0132\t.Rotation\"`\n\013BBHLLEDPODB\022\010\n\004" +
      "NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\364\014\022\017\n\013DCDNILFDFLB\020" +
      "\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          RotationOuterClass.getDescriptor(),
        });
    internal_static_AvatarDieAnimationEndReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarDieAnimationEndReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarDieAnimationEndReq_descriptor,
        new java.lang.String[] { "DieGuid", "SkillId", "RebornPos", });
    RotationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
