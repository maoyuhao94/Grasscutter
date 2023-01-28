// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeGiveUpRsp.proto

public final class RoguelikeGiveUpRspOuterClass {
  private RoguelikeGiveUpRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeGiveUpRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeGiveUpRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stageId = 10;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.RoguelikeDungeonSettleInfo settle_info = 2;</code>
     * @return Whether the settleInfo field is set.
     */
    boolean hasSettleInfo();
    /**
     * <code>.RoguelikeDungeonSettleInfo settle_info = 2;</code>
     * @return The settleInfo.
     */
    RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo getSettleInfo();
    /**
     * <code>.RoguelikeDungeonSettleInfo settle_info = 2;</code>
     */
    RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder getSettleInfoOrBuilder();

    public RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.JIIHKHKINIKCase getJIIHKHKINIKCase();
  }
  /**
   * Protobuf type {@code RoguelikeGiveUpRsp}
   */
  public static final class RoguelikeGiveUpRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeGiveUpRsp)
      RoguelikeGiveUpRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeGiveUpRsp.newBuilder() to construct.
    private RoguelikeGiveUpRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeGiveUpRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeGiveUpRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoguelikeGiveUpRsp(
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
            case 18: {
              RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder subBuilder = null;
              if (jIIHKHKINIKCase_ == 2) {
                subBuilder = ((RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) jIIHKHKINIK_).toBuilder();
              }
              jIIHKHKINIK_ =
                  input.readMessage(RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) jIIHKHKINIK_);
                jIIHKHKINIK_ = subBuilder.buildPartial();
              }
              jIIHKHKINIKCase_ = 2;
              break;
            }
            case 80: {

              stageId_ = input.readUInt32();
              break;
            }
            case 112: {

              retcode_ = input.readInt32();
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
      return RoguelikeGiveUpRspOuterClass.internal_static_RoguelikeGiveUpRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RoguelikeGiveUpRspOuterClass.internal_static_RoguelikeGiveUpRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.class, RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code RoguelikeGiveUpRsp.MNDLHCDPFJE}
     */
    public enum MNDLHCDPFJE
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 8799;</code>
       */
      PEPPOHPHJOJ(1, 8799),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final MNDLHCDPFJE DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 8799;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 8799;
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
      public static MNDLHCDPFJE valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static MNDLHCDPFJE forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 8799: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MNDLHCDPFJE>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MNDLHCDPFJE> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MNDLHCDPFJE>() {
              public MNDLHCDPFJE findValueByNumber(int number) {
                return MNDLHCDPFJE.forNumber(number);
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
        return RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final MNDLHCDPFJE[] VALUES = getStaticValuesArray();
      private static MNDLHCDPFJE[] getStaticValuesArray() {
        return new MNDLHCDPFJE[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static MNDLHCDPFJE valueOf(
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

      private MNDLHCDPFJE(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:RoguelikeGiveUpRsp.MNDLHCDPFJE)
    }

    private int jIIHKHKINIKCase_ = 0;
    private java.lang.Object jIIHKHKINIK_;
    public enum JIIHKHKINIKCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      SETTLE_INFO(2),
      JIIHKHKINIK_NOT_SET(0);
      private final int value;
      private JIIHKHKINIKCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static JIIHKHKINIKCase valueOf(int value) {
        return forNumber(value);
      }

      public static JIIHKHKINIKCase forNumber(int value) {
        switch (value) {
          case 2: return SETTLE_INFO;
          case 0: return JIIHKHKINIK_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public JIIHKHKINIKCase
    getJIIHKHKINIKCase() {
      return JIIHKHKINIKCase.forNumber(
          jIIHKHKINIKCase_);
    }

    public static final int STAGEID_FIELD_NUMBER = 10;
    private int stageId_;
    /**
     * <code>uint32 stageId = 10;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SETTLE_INFO_FIELD_NUMBER = 2;
    /**
     * <code>.RoguelikeDungeonSettleInfo settle_info = 2;</code>
     * @return Whether the settleInfo field is set.
     */
    @java.lang.Override
    public boolean hasSettleInfo() {
      return jIIHKHKINIKCase_ == 2;
    }
    /**
     * <code>.RoguelikeDungeonSettleInfo settle_info = 2;</code>
     * @return The settleInfo.
     */
    @java.lang.Override
    public RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo getSettleInfo() {
      if (jIIHKHKINIKCase_ == 2) {
         return (RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) jIIHKHKINIK_;
      }
      return RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
    }
    /**
     * <code>.RoguelikeDungeonSettleInfo settle_info = 2;</code>
     */
    @java.lang.Override
    public RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder getSettleInfoOrBuilder() {
      if (jIIHKHKINIKCase_ == 2) {
         return (RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) jIIHKHKINIK_;
      }
      return RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
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
      if (jIIHKHKINIKCase_ == 2) {
        output.writeMessage(2, (RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) jIIHKHKINIK_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(10, stageId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (jIIHKHKINIKCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, (RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) jIIHKHKINIK_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, stageId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp)) {
        return super.equals(obj);
      }
      RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp other = (RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getJIIHKHKINIKCase().equals(other.getJIIHKHKINIKCase())) return false;
      switch (jIIHKHKINIKCase_) {
        case 2:
          if (!getSettleInfo()
              .equals(other.getSettleInfo())) return false;
          break;
        case 0:
        default:
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
      hash = (37 * hash) + STAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      switch (jIIHKHKINIKCase_) {
        case 2:
          hash = (37 * hash) + SETTLE_INFO_FIELD_NUMBER;
          hash = (53 * hash) + getSettleInfo().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
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
    public static Builder newBuilder(RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp prototype) {
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
     * Protobuf type {@code RoguelikeGiveUpRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeGiveUpRsp)
        RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RoguelikeGiveUpRspOuterClass.internal_static_RoguelikeGiveUpRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RoguelikeGiveUpRspOuterClass.internal_static_RoguelikeGiveUpRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.class, RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.Builder.class);
      }

      // Construct using RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.newBuilder()
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
        stageId_ = 0;

        retcode_ = 0;

        jIIHKHKINIKCase_ = 0;
        jIIHKHKINIK_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RoguelikeGiveUpRspOuterClass.internal_static_RoguelikeGiveUpRsp_descriptor;
      }

      @java.lang.Override
      public RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp getDefaultInstanceForType() {
        return RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.getDefaultInstance();
      }

      @java.lang.Override
      public RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp build() {
        RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp buildPartial() {
        RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp result = new RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp(this);
        result.stageId_ = stageId_;
        result.retcode_ = retcode_;
        if (jIIHKHKINIKCase_ == 2) {
          if (settleInfoBuilder_ == null) {
            result.jIIHKHKINIK_ = jIIHKHKINIK_;
          } else {
            result.jIIHKHKINIK_ = settleInfoBuilder_.build();
          }
        }
        result.jIIHKHKINIKCase_ = jIIHKHKINIKCase_;
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
        if (other instanceof RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp) {
          return mergeFrom((RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp other) {
        if (other == RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        switch (other.getJIIHKHKINIKCase()) {
          case SETTLE_INFO: {
            mergeSettleInfo(other.getSettleInfo());
            break;
          }
          case JIIHKHKINIK_NOT_SET: {
            break;
          }
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
        RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int jIIHKHKINIKCase_ = 0;
      private java.lang.Object jIIHKHKINIK_;
      public JIIHKHKINIKCase
          getJIIHKHKINIKCase() {
        return JIIHKHKINIKCase.forNumber(
            jIIHKHKINIKCase_);
      }

      public Builder clearJIIHKHKINIK() {
        jIIHKHKINIKCase_ = 0;
        jIIHKHKINIK_ = null;
        onChanged();
        return this;
      }


      private int stageId_ ;
      /**
       * <code>uint32 stageId = 10;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stageId = 10;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stageId = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo, RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder, RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder> settleInfoBuilder_;
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 2;</code>
       * @return Whether the settleInfo field is set.
       */
      @java.lang.Override
      public boolean hasSettleInfo() {
        return jIIHKHKINIKCase_ == 2;
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 2;</code>
       * @return The settleInfo.
       */
      @java.lang.Override
      public RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo getSettleInfo() {
        if (settleInfoBuilder_ == null) {
          if (jIIHKHKINIKCase_ == 2) {
            return (RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) jIIHKHKINIK_;
          }
          return RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
        } else {
          if (jIIHKHKINIKCase_ == 2) {
            return settleInfoBuilder_.getMessage();
          }
          return RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
        }
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 2;</code>
       */
      public Builder setSettleInfo(RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          jIIHKHKINIK_ = value;
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(value);
        }
        jIIHKHKINIKCase_ = 2;
        return this;
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 2;</code>
       */
      public Builder setSettleInfo(
          RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder builderForValue) {
        if (settleInfoBuilder_ == null) {
          jIIHKHKINIK_ = builderForValue.build();
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(builderForValue.build());
        }
        jIIHKHKINIKCase_ = 2;
        return this;
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 2;</code>
       */
      public Builder mergeSettleInfo(RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (jIIHKHKINIKCase_ == 2 &&
              jIIHKHKINIK_ != RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance()) {
            jIIHKHKINIK_ = RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.newBuilder((RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) jIIHKHKINIK_)
                .mergeFrom(value).buildPartial();
          } else {
            jIIHKHKINIK_ = value;
          }
          onChanged();
        } else {
          if (jIIHKHKINIKCase_ == 2) {
            settleInfoBuilder_.mergeFrom(value);
          }
          settleInfoBuilder_.setMessage(value);
        }
        jIIHKHKINIKCase_ = 2;
        return this;
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 2;</code>
       */
      public Builder clearSettleInfo() {
        if (settleInfoBuilder_ == null) {
          if (jIIHKHKINIKCase_ == 2) {
            jIIHKHKINIKCase_ = 0;
            jIIHKHKINIK_ = null;
            onChanged();
          }
        } else {
          if (jIIHKHKINIKCase_ == 2) {
            jIIHKHKINIKCase_ = 0;
            jIIHKHKINIK_ = null;
          }
          settleInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 2;</code>
       */
      public RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder getSettleInfoBuilder() {
        return getSettleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 2;</code>
       */
      @java.lang.Override
      public RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder getSettleInfoOrBuilder() {
        if ((jIIHKHKINIKCase_ == 2) && (settleInfoBuilder_ != null)) {
          return settleInfoBuilder_.getMessageOrBuilder();
        } else {
          if (jIIHKHKINIKCase_ == 2) {
            return (RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) jIIHKHKINIK_;
          }
          return RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
        }
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo, RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder, RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder> 
          getSettleInfoFieldBuilder() {
        if (settleInfoBuilder_ == null) {
          if (!(jIIHKHKINIKCase_ == 2)) {
            jIIHKHKINIK_ = RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
          }
          settleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo, RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder, RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder>(
                  (RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) jIIHKHKINIK_,
                  getParentForChildren(),
                  isClean());
          jIIHKHKINIK_ = null;
        }
        jIIHKHKINIKCase_ = 2;
        onChanged();;
        return settleInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:RoguelikeGiveUpRsp)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeGiveUpRsp)
    private static final RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp();
    }

    public static RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeGiveUpRsp>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeGiveUpRsp>() {
      @java.lang.Override
      public RoguelikeGiveUpRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoguelikeGiveUpRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoguelikeGiveUpRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeGiveUpRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeGiveUpRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeGiveUpRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030RoguelikeGiveUpRsp.proto\032 RoguelikeDun" +
      "geonSettleInfo.proto\"\312\001\n\022RoguelikeGiveUp" +
      "Rsp\022\017\n\007stageId\030\n \001(\r\022\017\n\007retcode\030\016 \001(\005\0222\n" +
      "\013settle_info\030\002 \001(\0132\033.RoguelikeDungeonSet" +
      "tleInfoH\000\"O\n\013MNDLHCDPFJE\022\010\n\004NONE\020\000\022\020\n\013PE" +
      "PPOHPHJOJ\020\337D\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLM" +
      "POEA\020\001\032\002\020\001B\r\n\013JIIHKHKINIKb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          RoguelikeDungeonSettleInfoOuterClass.getDescriptor(),
        });
    internal_static_RoguelikeGiveUpRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeGiveUpRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeGiveUpRsp_descriptor,
        new java.lang.String[] { "StageId", "Retcode", "SettleInfo", "JIIHKHKINIK", });
    RoguelikeDungeonSettleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
