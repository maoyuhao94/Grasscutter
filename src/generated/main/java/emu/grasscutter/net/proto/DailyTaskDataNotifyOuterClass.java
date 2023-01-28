// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DailyTaskDataNotify.proto

public final class DailyTaskDataNotifyOuterClass {
  private DailyTaskDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DailyTaskDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DailyTaskDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isTakenScoreReward = 13;</code>
     * @return The isTakenScoreReward.
     */
    boolean getIsTakenScoreReward();

    /**
     * <code>uint32 finishedNum = 11;</code>
     * @return The finishedNum.
     */
    int getFinishedNum();

    /**
     * <code>uint32 scoreRewardId = 2;</code>
     * @return The scoreRewardId.
     */
    int getScoreRewardId();
  }
  /**
   * Protobuf type {@code DailyTaskDataNotify}
   */
  public static final class DailyTaskDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DailyTaskDataNotify)
      DailyTaskDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DailyTaskDataNotify.newBuilder() to construct.
    private DailyTaskDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DailyTaskDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DailyTaskDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DailyTaskDataNotify(
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

              scoreRewardId_ = input.readUInt32();
              break;
            }
            case 88: {

              finishedNum_ = input.readUInt32();
              break;
            }
            case 104: {

              isTakenScoreReward_ = input.readBool();
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
      return DailyTaskDataNotifyOuterClass.internal_static_DailyTaskDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DailyTaskDataNotifyOuterClass.internal_static_DailyTaskDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DailyTaskDataNotifyOuterClass.DailyTaskDataNotify.class, DailyTaskDataNotifyOuterClass.DailyTaskDataNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code DailyTaskDataNotify.CJCCGCLIDDL}
     */
    public enum CJCCGCLIDDL
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 183;</code>
       */
      PEPPOHPHJOJ(1, 183),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final CJCCGCLIDDL DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 183;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 183;
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
      public static CJCCGCLIDDL valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static CJCCGCLIDDL forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 183: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CJCCGCLIDDL>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          CJCCGCLIDDL> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CJCCGCLIDDL>() {
              public CJCCGCLIDDL findValueByNumber(int number) {
                return CJCCGCLIDDL.forNumber(number);
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
        return DailyTaskDataNotifyOuterClass.DailyTaskDataNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final CJCCGCLIDDL[] VALUES = getStaticValuesArray();
      private static CJCCGCLIDDL[] getStaticValuesArray() {
        return new CJCCGCLIDDL[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static CJCCGCLIDDL valueOf(
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

      private CJCCGCLIDDL(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:DailyTaskDataNotify.CJCCGCLIDDL)
    }

    public static final int ISTAKENSCOREREWARD_FIELD_NUMBER = 13;
    private boolean isTakenScoreReward_;
    /**
     * <code>bool isTakenScoreReward = 13;</code>
     * @return The isTakenScoreReward.
     */
    @java.lang.Override
    public boolean getIsTakenScoreReward() {
      return isTakenScoreReward_;
    }

    public static final int FINISHEDNUM_FIELD_NUMBER = 11;
    private int finishedNum_;
    /**
     * <code>uint32 finishedNum = 11;</code>
     * @return The finishedNum.
     */
    @java.lang.Override
    public int getFinishedNum() {
      return finishedNum_;
    }

    public static final int SCOREREWARDID_FIELD_NUMBER = 2;
    private int scoreRewardId_;
    /**
     * <code>uint32 scoreRewardId = 2;</code>
     * @return The scoreRewardId.
     */
    @java.lang.Override
    public int getScoreRewardId() {
      return scoreRewardId_;
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
      if (scoreRewardId_ != 0) {
        output.writeUInt32(2, scoreRewardId_);
      }
      if (finishedNum_ != 0) {
        output.writeUInt32(11, finishedNum_);
      }
      if (isTakenScoreReward_ != false) {
        output.writeBool(13, isTakenScoreReward_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (scoreRewardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, scoreRewardId_);
      }
      if (finishedNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, finishedNum_);
      }
      if (isTakenScoreReward_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isTakenScoreReward_);
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
      if (!(obj instanceof DailyTaskDataNotifyOuterClass.DailyTaskDataNotify)) {
        return super.equals(obj);
      }
      DailyTaskDataNotifyOuterClass.DailyTaskDataNotify other = (DailyTaskDataNotifyOuterClass.DailyTaskDataNotify) obj;

      if (getIsTakenScoreReward()
          != other.getIsTakenScoreReward()) return false;
      if (getFinishedNum()
          != other.getFinishedNum()) return false;
      if (getScoreRewardId()
          != other.getScoreRewardId()) return false;
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
      hash = (37 * hash) + ISTAKENSCOREREWARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTakenScoreReward());
      hash = (37 * hash) + FINISHEDNUM_FIELD_NUMBER;
      hash = (53 * hash) + getFinishedNum();
      hash = (37 * hash) + SCOREREWARDID_FIELD_NUMBER;
      hash = (53 * hash) + getScoreRewardId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
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
    public static Builder newBuilder(DailyTaskDataNotifyOuterClass.DailyTaskDataNotify prototype) {
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
     * Protobuf type {@code DailyTaskDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DailyTaskDataNotify)
        DailyTaskDataNotifyOuterClass.DailyTaskDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return DailyTaskDataNotifyOuterClass.internal_static_DailyTaskDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return DailyTaskDataNotifyOuterClass.internal_static_DailyTaskDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                DailyTaskDataNotifyOuterClass.DailyTaskDataNotify.class, DailyTaskDataNotifyOuterClass.DailyTaskDataNotify.Builder.class);
      }

      // Construct using DailyTaskDataNotifyOuterClass.DailyTaskDataNotify.newBuilder()
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
        isTakenScoreReward_ = false;

        finishedNum_ = 0;

        scoreRewardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return DailyTaskDataNotifyOuterClass.internal_static_DailyTaskDataNotify_descriptor;
      }

      @java.lang.Override
      public DailyTaskDataNotifyOuterClass.DailyTaskDataNotify getDefaultInstanceForType() {
        return DailyTaskDataNotifyOuterClass.DailyTaskDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public DailyTaskDataNotifyOuterClass.DailyTaskDataNotify build() {
        DailyTaskDataNotifyOuterClass.DailyTaskDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public DailyTaskDataNotifyOuterClass.DailyTaskDataNotify buildPartial() {
        DailyTaskDataNotifyOuterClass.DailyTaskDataNotify result = new DailyTaskDataNotifyOuterClass.DailyTaskDataNotify(this);
        result.isTakenScoreReward_ = isTakenScoreReward_;
        result.finishedNum_ = finishedNum_;
        result.scoreRewardId_ = scoreRewardId_;
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
        if (other instanceof DailyTaskDataNotifyOuterClass.DailyTaskDataNotify) {
          return mergeFrom((DailyTaskDataNotifyOuterClass.DailyTaskDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(DailyTaskDataNotifyOuterClass.DailyTaskDataNotify other) {
        if (other == DailyTaskDataNotifyOuterClass.DailyTaskDataNotify.getDefaultInstance()) return this;
        if (other.getIsTakenScoreReward() != false) {
          setIsTakenScoreReward(other.getIsTakenScoreReward());
        }
        if (other.getFinishedNum() != 0) {
          setFinishedNum(other.getFinishedNum());
        }
        if (other.getScoreRewardId() != 0) {
          setScoreRewardId(other.getScoreRewardId());
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
        DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (DailyTaskDataNotifyOuterClass.DailyTaskDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isTakenScoreReward_ ;
      /**
       * <code>bool isTakenScoreReward = 13;</code>
       * @return The isTakenScoreReward.
       */
      @java.lang.Override
      public boolean getIsTakenScoreReward() {
        return isTakenScoreReward_;
      }
      /**
       * <code>bool isTakenScoreReward = 13;</code>
       * @param value The isTakenScoreReward to set.
       * @return This builder for chaining.
       */
      public Builder setIsTakenScoreReward(boolean value) {
        
        isTakenScoreReward_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isTakenScoreReward = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTakenScoreReward() {
        
        isTakenScoreReward_ = false;
        onChanged();
        return this;
      }

      private int finishedNum_ ;
      /**
       * <code>uint32 finishedNum = 11;</code>
       * @return The finishedNum.
       */
      @java.lang.Override
      public int getFinishedNum() {
        return finishedNum_;
      }
      /**
       * <code>uint32 finishedNum = 11;</code>
       * @param value The finishedNum to set.
       * @return This builder for chaining.
       */
      public Builder setFinishedNum(int value) {
        
        finishedNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finishedNum = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishedNum() {
        
        finishedNum_ = 0;
        onChanged();
        return this;
      }

      private int scoreRewardId_ ;
      /**
       * <code>uint32 scoreRewardId = 2;</code>
       * @return The scoreRewardId.
       */
      @java.lang.Override
      public int getScoreRewardId() {
        return scoreRewardId_;
      }
      /**
       * <code>uint32 scoreRewardId = 2;</code>
       * @param value The scoreRewardId to set.
       * @return This builder for chaining.
       */
      public Builder setScoreRewardId(int value) {
        
        scoreRewardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scoreRewardId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearScoreRewardId() {
        
        scoreRewardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DailyTaskDataNotify)
    }

    // @@protoc_insertion_point(class_scope:DailyTaskDataNotify)
    private static final DailyTaskDataNotifyOuterClass.DailyTaskDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new DailyTaskDataNotifyOuterClass.DailyTaskDataNotify();
    }

    public static DailyTaskDataNotifyOuterClass.DailyTaskDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DailyTaskDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<DailyTaskDataNotify>() {
      @java.lang.Override
      public DailyTaskDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DailyTaskDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DailyTaskDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DailyTaskDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public DailyTaskDataNotifyOuterClass.DailyTaskDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DailyTaskDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DailyTaskDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031DailyTaskDataNotify.proto\"\256\001\n\023DailyTas" +
      "kDataNotify\022\032\n\022isTakenScoreReward\030\r \001(\010\022" +
      "\023\n\013finishedNum\030\013 \001(\r\022\025\n\rscoreRewardId\030\002 " +
      "\001(\r\"O\n\013CJCCGCLIDDL\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPH" +
      "JOJ\020\267\001\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001" +
      "\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DailyTaskDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DailyTaskDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DailyTaskDataNotify_descriptor,
        new java.lang.String[] { "IsTakenScoreReward", "FinishedNum", "ScoreRewardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
