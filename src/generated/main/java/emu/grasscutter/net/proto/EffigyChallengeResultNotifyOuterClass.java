// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyChallengeResultNotify.proto

public final class EffigyChallengeResultNotifyOuterClass {
  private EffigyChallengeResultNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EffigyChallengeResultNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EffigyChallengeResultNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challengeId = 14;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>uint32 challengeMaxScore = 1;</code>
     * @return The challengeMaxScore.
     */
    int getChallengeMaxScore();

    /**
     * <code>uint32 challengeScore = 5;</code>
     * @return The challengeScore.
     */
    int getChallengeScore();

    /**
     * <code>bool isSuccess = 4;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();
  }
  /**
   * Protobuf type {@code EffigyChallengeResultNotify}
   */
  public static final class EffigyChallengeResultNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EffigyChallengeResultNotify)
      EffigyChallengeResultNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EffigyChallengeResultNotify.newBuilder() to construct.
    private EffigyChallengeResultNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EffigyChallengeResultNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EffigyChallengeResultNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EffigyChallengeResultNotify(
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

              challengeMaxScore_ = input.readUInt32();
              break;
            }
            case 32: {

              isSuccess_ = input.readBool();
              break;
            }
            case 40: {

              challengeScore_ = input.readUInt32();
              break;
            }
            case 112: {

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
      return EffigyChallengeResultNotifyOuterClass.internal_static_EffigyChallengeResultNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EffigyChallengeResultNotifyOuterClass.internal_static_EffigyChallengeResultNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify.class, EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code EffigyChallengeResultNotify.PJAHGOOCLJB}
     */
    public enum PJAHGOOCLJB
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 2145;</code>
       */
      PEPPOHPHJOJ(1, 2145),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final PJAHGOOCLJB DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 2145;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 2145;
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
      public static PJAHGOOCLJB valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static PJAHGOOCLJB forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 2145: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<PJAHGOOCLJB>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          PJAHGOOCLJB> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PJAHGOOCLJB>() {
              public PJAHGOOCLJB findValueByNumber(int number) {
                return PJAHGOOCLJB.forNumber(number);
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
        return EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final PJAHGOOCLJB[] VALUES = getStaticValuesArray();
      private static PJAHGOOCLJB[] getStaticValuesArray() {
        return new PJAHGOOCLJB[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static PJAHGOOCLJB valueOf(
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

      private PJAHGOOCLJB(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:EffigyChallengeResultNotify.PJAHGOOCLJB)
    }

    public static final int CHALLENGEID_FIELD_NUMBER = 14;
    private int challengeId_;
    /**
     * <code>uint32 challengeId = 14;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int CHALLENGEMAXSCORE_FIELD_NUMBER = 1;
    private int challengeMaxScore_;
    /**
     * <code>uint32 challengeMaxScore = 1;</code>
     * @return The challengeMaxScore.
     */
    @java.lang.Override
    public int getChallengeMaxScore() {
      return challengeMaxScore_;
    }

    public static final int CHALLENGESCORE_FIELD_NUMBER = 5;
    private int challengeScore_;
    /**
     * <code>uint32 challengeScore = 5;</code>
     * @return The challengeScore.
     */
    @java.lang.Override
    public int getChallengeScore() {
      return challengeScore_;
    }

    public static final int ISSUCCESS_FIELD_NUMBER = 4;
    private boolean isSuccess_;
    /**
     * <code>bool isSuccess = 4;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
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
      if (challengeMaxScore_ != 0) {
        output.writeUInt32(1, challengeMaxScore_);
      }
      if (isSuccess_ != false) {
        output.writeBool(4, isSuccess_);
      }
      if (challengeScore_ != 0) {
        output.writeUInt32(5, challengeScore_);
      }
      if (challengeId_ != 0) {
        output.writeUInt32(14, challengeId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeMaxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, challengeMaxScore_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isSuccess_);
      }
      if (challengeScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, challengeScore_);
      }
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, challengeId_);
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
      if (!(obj instanceof EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify)) {
        return super.equals(obj);
      }
      EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify other = (EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify) obj;

      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getChallengeMaxScore()
          != other.getChallengeMaxScore()) return false;
      if (getChallengeScore()
          != other.getChallengeScore()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
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
      hash = (37 * hash) + CHALLENGEMAXSCORE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeMaxScore();
      hash = (37 * hash) + CHALLENGESCORE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeScore();
      hash = (37 * hash) + ISSUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify parseFrom(
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
    public static Builder newBuilder(EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify prototype) {
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
     * Protobuf type {@code EffigyChallengeResultNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EffigyChallengeResultNotify)
        EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EffigyChallengeResultNotifyOuterClass.internal_static_EffigyChallengeResultNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return EffigyChallengeResultNotifyOuterClass.internal_static_EffigyChallengeResultNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify.class, EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify.Builder.class);
      }

      // Construct using EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify.newBuilder()
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

        challengeMaxScore_ = 0;

        challengeScore_ = 0;

        isSuccess_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return EffigyChallengeResultNotifyOuterClass.internal_static_EffigyChallengeResultNotify_descriptor;
      }

      @java.lang.Override
      public EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify getDefaultInstanceForType() {
        return EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify.getDefaultInstance();
      }

      @java.lang.Override
      public EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify build() {
        EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify buildPartial() {
        EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify result = new EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify(this);
        result.challengeId_ = challengeId_;
        result.challengeMaxScore_ = challengeMaxScore_;
        result.challengeScore_ = challengeScore_;
        result.isSuccess_ = isSuccess_;
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
        if (other instanceof EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify) {
          return mergeFrom((EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify other) {
        if (other == EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify.getDefaultInstance()) return this;
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getChallengeMaxScore() != 0) {
          setChallengeMaxScore(other.getChallengeMaxScore());
        }
        if (other.getChallengeScore() != 0) {
          setChallengeScore(other.getChallengeScore());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
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
        EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify) e.getUnfinishedMessage();
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
       * <code>uint32 challengeId = 14;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challengeId = 14;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challengeId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private int challengeMaxScore_ ;
      /**
       * <code>uint32 challengeMaxScore = 1;</code>
       * @return The challengeMaxScore.
       */
      @java.lang.Override
      public int getChallengeMaxScore() {
        return challengeMaxScore_;
      }
      /**
       * <code>uint32 challengeMaxScore = 1;</code>
       * @param value The challengeMaxScore to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeMaxScore(int value) {
        
        challengeMaxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challengeMaxScore = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeMaxScore() {
        
        challengeMaxScore_ = 0;
        onChanged();
        return this;
      }

      private int challengeScore_ ;
      /**
       * <code>uint32 challengeScore = 5;</code>
       * @return The challengeScore.
       */
      @java.lang.Override
      public int getChallengeScore() {
        return challengeScore_;
      }
      /**
       * <code>uint32 challengeScore = 5;</code>
       * @param value The challengeScore to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeScore(int value) {
        
        challengeScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challengeScore = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeScore() {
        
        challengeScore_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool isSuccess = 4;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool isSuccess = 4;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isSuccess = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
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


      // @@protoc_insertion_point(builder_scope:EffigyChallengeResultNotify)
    }

    // @@protoc_insertion_point(class_scope:EffigyChallengeResultNotify)
    private static final EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify();
    }

    public static EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EffigyChallengeResultNotify>
        PARSER = new com.google.protobuf.AbstractParser<EffigyChallengeResultNotify>() {
      @java.lang.Override
      public EffigyChallengeResultNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EffigyChallengeResultNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EffigyChallengeResultNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EffigyChallengeResultNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public EffigyChallengeResultNotifyOuterClass.EffigyChallengeResultNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EffigyChallengeResultNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EffigyChallengeResultNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!EffigyChallengeResultNotify.proto\"\311\001\n\033" +
      "EffigyChallengeResultNotify\022\023\n\013challenge" +
      "Id\030\016 \001(\r\022\031\n\021challengeMaxScore\030\001 \001(\r\022\026\n\016c" +
      "hallengeScore\030\005 \001(\r\022\021\n\tisSuccess\030\004 \001(\010\"O" +
      "\n\013PJAHGOOCLJB\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\341" +
      "\020\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EffigyChallengeResultNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EffigyChallengeResultNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EffigyChallengeResultNotify_descriptor,
        new java.lang.String[] { "ChallengeId", "ChallengeMaxScore", "ChallengeScore", "IsSuccess", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
