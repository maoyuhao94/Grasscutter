// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LanternRiteStartFireworksReformReq.proto

public final class LanternRiteStartFireworksReformReqOuterClass {
  private LanternRiteStartFireworksReformReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LanternRiteStartFireworksReformReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LanternRiteStartFireworksReformReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challengeId = 12;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>uint32 stageId = 11;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * Protobuf type {@code LanternRiteStartFireworksReformReq}
   */
  public static final class LanternRiteStartFireworksReformReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LanternRiteStartFireworksReformReq)
      LanternRiteStartFireworksReformReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LanternRiteStartFireworksReformReq.newBuilder() to construct.
    private LanternRiteStartFireworksReformReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LanternRiteStartFireworksReformReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LanternRiteStartFireworksReformReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LanternRiteStartFireworksReformReq(
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
            case 88: {

              stageId_ = input.readUInt32();
              break;
            }
            case 96: {

              challengeId_ = input.readUInt32();
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
      return LanternRiteStartFireworksReformReqOuterClass.internal_static_LanternRiteStartFireworksReformReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LanternRiteStartFireworksReformReqOuterClass.internal_static_LanternRiteStartFireworksReformReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq.class, LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq.Builder.class);
    }

    /**
     * Protobuf enum {@code LanternRiteStartFireworksReformReq.MCPBOJNPPAE}
     */
    public enum MCPBOJNPPAE
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 8874;</code>
       */
      PEPPOHPHJOJ(1, 8874),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final MCPBOJNPPAE DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final MCPBOJNPPAE EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 8874;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 8874;
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
      public static MCPBOJNPPAE valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static MCPBOJNPPAE forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 8874: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MCPBOJNPPAE>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MCPBOJNPPAE> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MCPBOJNPPAE>() {
              public MCPBOJNPPAE findValueByNumber(int number) {
                return MCPBOJNPPAE.forNumber(number);
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
        return LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final MCPBOJNPPAE[] VALUES = getStaticValuesArray();
      private static MCPBOJNPPAE[] getStaticValuesArray() {
        return new MCPBOJNPPAE[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static MCPBOJNPPAE valueOf(
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

      private MCPBOJNPPAE(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:LanternRiteStartFireworksReformReq.MCPBOJNPPAE)
    }

    public static final int CHALLENGEID_FIELD_NUMBER = 12;
    private int challengeId_;
    /**
     * <code>uint32 challengeId = 12;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int STAGEID_FIELD_NUMBER = 11;
    private int stageId_;
    /**
     * <code>uint32 stageId = 11;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (stageId_ != 0) {
        output.writeUInt32(11, stageId_);
      }
      if (challengeId_ != 0) {
        output.writeUInt32(12, challengeId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, stageId_);
      }
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, challengeId_);
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
      if (!(obj instanceof LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq)) {
        return super.equals(obj);
      }
      LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq other = (LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq) obj;

      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + CHALLENGEID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + STAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
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
    public static Builder newBuilder(LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq prototype) {
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
     * Protobuf type {@code LanternRiteStartFireworksReformReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LanternRiteStartFireworksReformReq)
        LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LanternRiteStartFireworksReformReqOuterClass.internal_static_LanternRiteStartFireworksReformReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LanternRiteStartFireworksReformReqOuterClass.internal_static_LanternRiteStartFireworksReformReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq.class, LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq.Builder.class);
      }

      // Construct using LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq.newBuilder()
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
        challengeId_ = 0;

        stageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return LanternRiteStartFireworksReformReqOuterClass.internal_static_LanternRiteStartFireworksReformReq_descriptor;
      }

      @java.lang.Override
      public LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq getDefaultInstanceForType() {
        return LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq.getDefaultInstance();
      }

      @java.lang.Override
      public LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq build() {
        LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq buildPartial() {
        LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq result = new LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq(this);
        result.challengeId_ = challengeId_;
        result.stageId_ = stageId_;
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
        if (other instanceof LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq) {
          return mergeFrom((LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq other) {
        if (other == LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq.getDefaultInstance()) return this;
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
        LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challengeId = 12;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challengeId = 12;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challengeId = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stageId = 11;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stageId = 11;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stageId = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LanternRiteStartFireworksReformReq)
    }

    // @@protoc_insertion_point(class_scope:LanternRiteStartFireworksReformReq)
    private static final LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq();
    }

    public static LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LanternRiteStartFireworksReformReq>
        PARSER = new com.google.protobuf.AbstractParser<LanternRiteStartFireworksReformReq>() {
      @java.lang.Override
      public LanternRiteStartFireworksReformReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LanternRiteStartFireworksReformReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LanternRiteStartFireworksReformReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LanternRiteStartFireworksReformReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LanternRiteStartFireworksReformReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LanternRiteStartFireworksReformReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(LanternRiteStartFireworksReformReq.pro" +
      "to\"\254\001\n\"LanternRiteStartFireworksReformRe" +
      "q\022\023\n\013challengeId\030\014 \001(\r\022\017\n\007stageId\030\013 \001(\r\"" +
      "`\n\013MCPBOJNPPAE\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020" +
      "\252E\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013" +
      "EAJIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LanternRiteStartFireworksReformReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LanternRiteStartFireworksReformReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LanternRiteStartFireworksReformReq_descriptor,
        new java.lang.String[] { "ChallengeId", "StageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
