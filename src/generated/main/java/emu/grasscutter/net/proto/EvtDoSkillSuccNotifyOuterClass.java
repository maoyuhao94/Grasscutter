// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtDoSkillSuccNotify.proto

public final class EvtDoSkillSuccNotifyOuterClass {
  private EvtDoSkillSuccNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtDoSkillSuccNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtDoSkillSuccNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 skillId = 13;</code>
     * @return The skillId.
     */
    int getSkillId();

    /**
     * <code>.ForwardType forwardType = 5;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forwardType = 5;</code>
     * @return The forwardType.
     */
    ForwardTypeOuterClass.ForwardType getForwardType();

    /**
     * <code>uint32 casterId = 2;</code>
     * @return The casterId.
     */
    int getCasterId();

    /**
     * <code>.Rotation forward = 14;</code>
     * @return Whether the forward field is set.
     */
    boolean hasForward();
    /**
     * <code>.Rotation forward = 14;</code>
     * @return The forward.
     */
    RotationOuterClass.Rotation getForward();
    /**
     * <code>.Rotation forward = 14;</code>
     */
    RotationOuterClass.RotationOrBuilder getForwardOrBuilder();
  }
  /**
   * Protobuf type {@code EvtDoSkillSuccNotify}
   */
  public static final class EvtDoSkillSuccNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtDoSkillSuccNotify)
      EvtDoSkillSuccNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtDoSkillSuccNotify.newBuilder() to construct.
    private EvtDoSkillSuccNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtDoSkillSuccNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtDoSkillSuccNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtDoSkillSuccNotify(
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
            case 16: {

              casterId_ = input.readUInt32();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();

              forwardType_ = rawValue;
              break;
            }
            case 104: {

              skillId_ = input.readUInt32();
              break;
            }
            case 114: {
              RotationOuterClass.Rotation.Builder subBuilder = null;
              if (forward_ != null) {
                subBuilder = forward_.toBuilder();
              }
              forward_ = input.readMessage(RotationOuterClass.Rotation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(forward_);
                forward_ = subBuilder.buildPartial();
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
      return EvtDoSkillSuccNotifyOuterClass.internal_static_EvtDoSkillSuccNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EvtDoSkillSuccNotifyOuterClass.internal_static_EvtDoSkillSuccNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.class, EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code EvtDoSkillSuccNotify.AFPNPDBLIDO}
     */
    public enum AFPNPDBLIDO
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 398;</code>
       */
      PEPPOHPHJOJ(1, 398),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final AFPNPDBLIDO DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final AFPNPDBLIDO EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 398;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 398;
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
      public static AFPNPDBLIDO valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static AFPNPDBLIDO forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 398: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<AFPNPDBLIDO>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          AFPNPDBLIDO> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AFPNPDBLIDO>() {
              public AFPNPDBLIDO findValueByNumber(int number) {
                return AFPNPDBLIDO.forNumber(number);
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
        return EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final AFPNPDBLIDO[] VALUES = getStaticValuesArray();
      private static AFPNPDBLIDO[] getStaticValuesArray() {
        return new AFPNPDBLIDO[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static AFPNPDBLIDO valueOf(
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

      private AFPNPDBLIDO(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:EvtDoSkillSuccNotify.AFPNPDBLIDO)
    }

    public static final int SKILLID_FIELD_NUMBER = 13;
    private int skillId_;
    /**
     * <code>uint32 skillId = 13;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
    }

    public static final int FORWARDTYPE_FIELD_NUMBER = 5;
    private int forwardType_;
    /**
     * <code>.ForwardType forwardType = 5;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forwardType = 5;</code>
     * @return The forwardType.
     */
    @java.lang.Override public ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      ForwardTypeOuterClass.ForwardType result = ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
    }

    public static final int CASTERID_FIELD_NUMBER = 2;
    private int casterId_;
    /**
     * <code>uint32 casterId = 2;</code>
     * @return The casterId.
     */
    @java.lang.Override
    public int getCasterId() {
      return casterId_;
    }

    public static final int FORWARD_FIELD_NUMBER = 14;
    private RotationOuterClass.Rotation forward_;
    /**
     * <code>.Rotation forward = 14;</code>
     * @return Whether the forward field is set.
     */
    @java.lang.Override
    public boolean hasForward() {
      return forward_ != null;
    }
    /**
     * <code>.Rotation forward = 14;</code>
     * @return The forward.
     */
    @java.lang.Override
    public RotationOuterClass.Rotation getForward() {
      return forward_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : forward_;
    }
    /**
     * <code>.Rotation forward = 14;</code>
     */
    @java.lang.Override
    public RotationOuterClass.RotationOrBuilder getForwardOrBuilder() {
      return getForward();
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
      if (casterId_ != 0) {
        output.writeUInt32(2, casterId_);
      }
      if (forwardType_ != ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(5, forwardType_);
      }
      if (skillId_ != 0) {
        output.writeUInt32(13, skillId_);
      }
      if (forward_ != null) {
        output.writeMessage(14, getForward());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (casterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, casterId_);
      }
      if (forwardType_ != ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, forwardType_);
      }
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, skillId_);
      }
      if (forward_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getForward());
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
      if (!(obj instanceof EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify)) {
        return super.equals(obj);
      }
      EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify other = (EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify) obj;

      if (getSkillId()
          != other.getSkillId()) return false;
      if (forwardType_ != other.forwardType_) return false;
      if (getCasterId()
          != other.getCasterId()) return false;
      if (hasForward() != other.hasForward()) return false;
      if (hasForward()) {
        if (!getForward()
            .equals(other.getForward())) return false;
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
      hash = (37 * hash) + SKILLID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (37 * hash) + FORWARDTYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (37 * hash) + CASTERID_FIELD_NUMBER;
      hash = (53 * hash) + getCasterId();
      if (hasForward()) {
        hash = (37 * hash) + FORWARD_FIELD_NUMBER;
        hash = (53 * hash) + getForward().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
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
    public static Builder newBuilder(EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify prototype) {
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
     * Protobuf type {@code EvtDoSkillSuccNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtDoSkillSuccNotify)
        EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EvtDoSkillSuccNotifyOuterClass.internal_static_EvtDoSkillSuccNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return EvtDoSkillSuccNotifyOuterClass.internal_static_EvtDoSkillSuccNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.class, EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.Builder.class);
      }

      // Construct using EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.newBuilder()
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
        skillId_ = 0;

        forwardType_ = 0;

        casterId_ = 0;

        if (forwardBuilder_ == null) {
          forward_ = null;
        } else {
          forward_ = null;
          forwardBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return EvtDoSkillSuccNotifyOuterClass.internal_static_EvtDoSkillSuccNotify_descriptor;
      }

      @java.lang.Override
      public EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify getDefaultInstanceForType() {
        return EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.getDefaultInstance();
      }

      @java.lang.Override
      public EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify build() {
        EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify buildPartial() {
        EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify result = new EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify(this);
        result.skillId_ = skillId_;
        result.forwardType_ = forwardType_;
        result.casterId_ = casterId_;
        if (forwardBuilder_ == null) {
          result.forward_ = forward_;
        } else {
          result.forward_ = forwardBuilder_.build();
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
        if (other instanceof EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify) {
          return mergeFrom((EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify other) {
        if (other == EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.getDefaultInstance()) return this;
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
        }
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
        }
        if (other.getCasterId() != 0) {
          setCasterId(other.getCasterId());
        }
        if (other.hasForward()) {
          mergeForward(other.getForward());
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
        EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int skillId_ ;
      /**
       * <code>uint32 skillId = 13;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skillId = 13;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skillId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        
        skillId_ = 0;
        onChanged();
        return this;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forwardType = 5;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forwardType = 5;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forwardType = 5;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        ForwardTypeOuterClass.ForwardType result = ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forwardType = 5;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forwardType = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
        onChanged();
        return this;
      }

      private int casterId_ ;
      /**
       * <code>uint32 casterId = 2;</code>
       * @return The casterId.
       */
      @java.lang.Override
      public int getCasterId() {
        return casterId_;
      }
      /**
       * <code>uint32 casterId = 2;</code>
       * @param value The casterId to set.
       * @return This builder for chaining.
       */
      public Builder setCasterId(int value) {
        
        casterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 casterId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCasterId() {
        
        casterId_ = 0;
        onChanged();
        return this;
      }

      private RotationOuterClass.Rotation forward_;
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> forwardBuilder_;
      /**
       * <code>.Rotation forward = 14;</code>
       * @return Whether the forward field is set.
       */
      public boolean hasForward() {
        return forwardBuilder_ != null || forward_ != null;
      }
      /**
       * <code>.Rotation forward = 14;</code>
       * @return The forward.
       */
      public RotationOuterClass.Rotation getForward() {
        if (forwardBuilder_ == null) {
          return forward_ == null ? RotationOuterClass.Rotation.getDefaultInstance() : forward_;
        } else {
          return forwardBuilder_.getMessage();
        }
      }
      /**
       * <code>.Rotation forward = 14;</code>
       */
      public Builder setForward(RotationOuterClass.Rotation value) {
        if (forwardBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          forward_ = value;
          onChanged();
        } else {
          forwardBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Rotation forward = 14;</code>
       */
      public Builder setForward(
          RotationOuterClass.Rotation.Builder builderForValue) {
        if (forwardBuilder_ == null) {
          forward_ = builderForValue.build();
          onChanged();
        } else {
          forwardBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Rotation forward = 14;</code>
       */
      public Builder mergeForward(RotationOuterClass.Rotation value) {
        if (forwardBuilder_ == null) {
          if (forward_ != null) {
            forward_ =
              RotationOuterClass.Rotation.newBuilder(forward_).mergeFrom(value).buildPartial();
          } else {
            forward_ = value;
          }
          onChanged();
        } else {
          forwardBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Rotation forward = 14;</code>
       */
      public Builder clearForward() {
        if (forwardBuilder_ == null) {
          forward_ = null;
          onChanged();
        } else {
          forward_ = null;
          forwardBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Rotation forward = 14;</code>
       */
      public RotationOuterClass.Rotation.Builder getForwardBuilder() {
        
        onChanged();
        return getForwardFieldBuilder().getBuilder();
      }
      /**
       * <code>.Rotation forward = 14;</code>
       */
      public RotationOuterClass.RotationOrBuilder getForwardOrBuilder() {
        if (forwardBuilder_ != null) {
          return forwardBuilder_.getMessageOrBuilder();
        } else {
          return forward_ == null ?
              RotationOuterClass.Rotation.getDefaultInstance() : forward_;
        }
      }
      /**
       * <code>.Rotation forward = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder> 
          getForwardFieldBuilder() {
        if (forwardBuilder_ == null) {
          forwardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RotationOuterClass.Rotation, RotationOuterClass.Rotation.Builder, RotationOuterClass.RotationOrBuilder>(
                  getForward(),
                  getParentForChildren(),
                  isClean());
          forward_ = null;
        }
        return forwardBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EvtDoSkillSuccNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtDoSkillSuccNotify)
    private static final EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify();
    }

    public static EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtDoSkillSuccNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtDoSkillSuccNotify>() {
      @java.lang.Override
      public EvtDoSkillSuccNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtDoSkillSuccNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtDoSkillSuccNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtDoSkillSuccNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtDoSkillSuccNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtDoSkillSuccNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032EvtDoSkillSuccNotify.proto\032\021ForwardTyp" +
      "e.proto\032\016Rotation.proto\"\332\001\n\024EvtDoSkillSu" +
      "ccNotify\022\017\n\007skillId\030\r \001(\r\022!\n\013forwardType" +
      "\030\005 \001(\0162\014.ForwardType\022\020\n\010casterId\030\002 \001(\r\022\032" +
      "\n\007forward\030\016 \001(\0132\t.Rotation\"`\n\013AFPNPDBLID" +
      "O\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\216\003\022\017\n\013DCDNILF" +
      "DFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001" +
      "\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ForwardTypeOuterClass.getDescriptor(),
          RotationOuterClass.getDescriptor(),
        });
    internal_static_EvtDoSkillSuccNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtDoSkillSuccNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtDoSkillSuccNotify_descriptor,
        new java.lang.String[] { "SkillId", "ForwardType", "CasterId", "Forward", });
    ForwardTypeOuterClass.getDescriptor();
    RotationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
