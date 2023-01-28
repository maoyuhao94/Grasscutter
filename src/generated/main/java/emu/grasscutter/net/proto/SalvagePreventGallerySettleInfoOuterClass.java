// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalvagePreventGallerySettleInfo.proto

public final class SalvagePreventGallerySettleInfoOuterClass {
  private SalvagePreventGallerySettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SalvagePreventGallerySettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SalvagePreventGallerySettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 timeRemain = 10;</code>
     * @return The timeRemain.
     */
    int getTimeRemain();

    /**
     * <code>uint32 finalScore = 6;</code>
     * @return The finalScore.
     */
    int getFinalScore();

    /**
     * <code>.SalvagePreventStopReason reason = 2;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.SalvagePreventStopReason reason = 2;</code>
     * @return The reason.
     */
    SalvagePreventStopReasonOuterClass.SalvagePreventStopReason getReason();

    /**
     * <code>uint32 monsterCount = 3;</code>
     * @return The monsterCount.
     */
    int getMonsterCount();
  }
  /**
   * Protobuf type {@code SalvagePreventGallerySettleInfo}
   */
  public static final class SalvagePreventGallerySettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SalvagePreventGallerySettleInfo)
      SalvagePreventGallerySettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SalvagePreventGallerySettleInfo.newBuilder() to construct.
    private SalvagePreventGallerySettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SalvagePreventGallerySettleInfo() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SalvagePreventGallerySettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SalvagePreventGallerySettleInfo(
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
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 24: {

              monsterCount_ = input.readUInt32();
              break;
            }
            case 48: {

              finalScore_ = input.readUInt32();
              break;
            }
            case 80: {

              timeRemain_ = input.readUInt32();
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
      return SalvagePreventGallerySettleInfoOuterClass.internal_static_SalvagePreventGallerySettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SalvagePreventGallerySettleInfoOuterClass.internal_static_SalvagePreventGallerySettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.class, SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.Builder.class);
    }

    public static final int TIMEREMAIN_FIELD_NUMBER = 10;
    private int timeRemain_;
    /**
     * <code>uint32 timeRemain = 10;</code>
     * @return The timeRemain.
     */
    @java.lang.Override
    public int getTimeRemain() {
      return timeRemain_;
    }

    public static final int FINALSCORE_FIELD_NUMBER = 6;
    private int finalScore_;
    /**
     * <code>uint32 finalScore = 6;</code>
     * @return The finalScore.
     */
    @java.lang.Override
    public int getFinalScore() {
      return finalScore_;
    }

    public static final int REASON_FIELD_NUMBER = 2;
    private int reason_;
    /**
     * <code>.SalvagePreventStopReason reason = 2;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.SalvagePreventStopReason reason = 2;</code>
     * @return The reason.
     */
    @java.lang.Override public SalvagePreventStopReasonOuterClass.SalvagePreventStopReason getReason() {
      @SuppressWarnings("deprecation")
      SalvagePreventStopReasonOuterClass.SalvagePreventStopReason result = SalvagePreventStopReasonOuterClass.SalvagePreventStopReason.valueOf(reason_);
      return result == null ? SalvagePreventStopReasonOuterClass.SalvagePreventStopReason.UNRECOGNIZED : result;
    }

    public static final int MONSTERCOUNT_FIELD_NUMBER = 3;
    private int monsterCount_;
    /**
     * <code>uint32 monsterCount = 3;</code>
     * @return The monsterCount.
     */
    @java.lang.Override
    public int getMonsterCount() {
      return monsterCount_;
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
      if (reason_ != SalvagePreventStopReasonOuterClass.SalvagePreventStopReason.SALVAGE_PREVENT_STOP_REASON_NONE.getNumber()) {
        output.writeEnum(2, reason_);
      }
      if (monsterCount_ != 0) {
        output.writeUInt32(3, monsterCount_);
      }
      if (finalScore_ != 0) {
        output.writeUInt32(6, finalScore_);
      }
      if (timeRemain_ != 0) {
        output.writeUInt32(10, timeRemain_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != SalvagePreventStopReasonOuterClass.SalvagePreventStopReason.SALVAGE_PREVENT_STOP_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, reason_);
      }
      if (monsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, monsterCount_);
      }
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, finalScore_);
      }
      if (timeRemain_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, timeRemain_);
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
      if (!(obj instanceof SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo)) {
        return super.equals(obj);
      }
      SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo other = (SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo) obj;

      if (getTimeRemain()
          != other.getTimeRemain()) return false;
      if (getFinalScore()
          != other.getFinalScore()) return false;
      if (reason_ != other.reason_) return false;
      if (getMonsterCount()
          != other.getMonsterCount()) return false;
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
      hash = (37 * hash) + TIMEREMAIN_FIELD_NUMBER;
      hash = (53 * hash) + getTimeRemain();
      hash = (37 * hash) + FINALSCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + MONSTERCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo parseFrom(
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
    public static Builder newBuilder(SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo prototype) {
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
     * Protobuf type {@code SalvagePreventGallerySettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SalvagePreventGallerySettleInfo)
        SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SalvagePreventGallerySettleInfoOuterClass.internal_static_SalvagePreventGallerySettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SalvagePreventGallerySettleInfoOuterClass.internal_static_SalvagePreventGallerySettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.class, SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.Builder.class);
      }

      // Construct using SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.newBuilder()
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
        timeRemain_ = 0;

        finalScore_ = 0;

        reason_ = 0;

        monsterCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SalvagePreventGallerySettleInfoOuterClass.internal_static_SalvagePreventGallerySettleInfo_descriptor;
      }

      @java.lang.Override
      public SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo getDefaultInstanceForType() {
        return SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo build() {
        SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo buildPartial() {
        SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo result = new SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo(this);
        result.timeRemain_ = timeRemain_;
        result.finalScore_ = finalScore_;
        result.reason_ = reason_;
        result.monsterCount_ = monsterCount_;
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
        if (other instanceof SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo) {
          return mergeFrom((SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo other) {
        if (other == SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo.getDefaultInstance()) return this;
        if (other.getTimeRemain() != 0) {
          setTimeRemain(other.getTimeRemain());
        }
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getMonsterCount() != 0) {
          setMonsterCount(other.getMonsterCount());
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
        SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int timeRemain_ ;
      /**
       * <code>uint32 timeRemain = 10;</code>
       * @return The timeRemain.
       */
      @java.lang.Override
      public int getTimeRemain() {
        return timeRemain_;
      }
      /**
       * <code>uint32 timeRemain = 10;</code>
       * @param value The timeRemain to set.
       * @return This builder for chaining.
       */
      public Builder setTimeRemain(int value) {
        
        timeRemain_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 timeRemain = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimeRemain() {
        
        timeRemain_ = 0;
        onChanged();
        return this;
      }

      private int finalScore_ ;
      /**
       * <code>uint32 finalScore = 6;</code>
       * @return The finalScore.
       */
      @java.lang.Override
      public int getFinalScore() {
        return finalScore_;
      }
      /**
       * <code>uint32 finalScore = 6;</code>
       * @param value The finalScore to set.
       * @return This builder for chaining.
       */
      public Builder setFinalScore(int value) {
        
        finalScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finalScore = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinalScore() {
        
        finalScore_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.SalvagePreventStopReason reason = 2;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.SalvagePreventStopReason reason = 2;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.SalvagePreventStopReason reason = 2;</code>
       * @return The reason.
       */
      @java.lang.Override
      public SalvagePreventStopReasonOuterClass.SalvagePreventStopReason getReason() {
        @SuppressWarnings("deprecation")
        SalvagePreventStopReasonOuterClass.SalvagePreventStopReason result = SalvagePreventStopReasonOuterClass.SalvagePreventStopReason.valueOf(reason_);
        return result == null ? SalvagePreventStopReasonOuterClass.SalvagePreventStopReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.SalvagePreventStopReason reason = 2;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(SalvagePreventStopReasonOuterClass.SalvagePreventStopReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.SalvagePreventStopReason reason = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int monsterCount_ ;
      /**
       * <code>uint32 monsterCount = 3;</code>
       * @return The monsterCount.
       */
      @java.lang.Override
      public int getMonsterCount() {
        return monsterCount_;
      }
      /**
       * <code>uint32 monsterCount = 3;</code>
       * @param value The monsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterCount(int value) {
        
        monsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 monsterCount = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterCount() {
        
        monsterCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SalvagePreventGallerySettleInfo)
    }

    // @@protoc_insertion_point(class_scope:SalvagePreventGallerySettleInfo)
    private static final SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo();
    }

    public static SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SalvagePreventGallerySettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<SalvagePreventGallerySettleInfo>() {
      @java.lang.Override
      public SalvagePreventGallerySettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SalvagePreventGallerySettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SalvagePreventGallerySettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SalvagePreventGallerySettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SalvagePreventGallerySettleInfoOuterClass.SalvagePreventGallerySettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SalvagePreventGallerySettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SalvagePreventGallerySettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%SalvagePreventGallerySettleInfo.proto\032" +
      "\036SalvagePreventStopReason.proto\"\212\001\n\037Salv" +
      "agePreventGallerySettleInfo\022\022\n\ntimeRemai" +
      "n\030\n \001(\r\022\022\n\nfinalScore\030\006 \001(\r\022)\n\006reason\030\002 " +
      "\001(\0162\031.SalvagePreventStopReason\022\024\n\014monste" +
      "rCount\030\003 \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          SalvagePreventStopReasonOuterClass.getDescriptor(),
        });
    internal_static_SalvagePreventGallerySettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SalvagePreventGallerySettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SalvagePreventGallerySettleInfo_descriptor,
        new java.lang.String[] { "TimeRemain", "FinalScore", "Reason", "MonsterCount", });
    SalvagePreventStopReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
