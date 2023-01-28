// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LuminanceStoneChallengeInfo.proto

public final class LuminanceStoneChallengeInfoOuterClass {
  private LuminanceStoneChallengeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LuminanceStoneChallengeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LuminanceStoneChallengeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 killSpecialMonsterCount = 7;</code>
     * @return The killSpecialMonsterCount.
     */
    int getKillSpecialMonsterCount();

    /**
     * <code>uint32 score = 15;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 killMonsterCount = 4;</code>
     * @return The killMonsterCount.
     */
    int getKillMonsterCount();

    /**
     * <code>uint32 cleanMudCount = 13;</code>
     * @return The cleanMudCount.
     */
    int getCleanMudCount();
  }
  /**
   * Protobuf type {@code LuminanceStoneChallengeInfo}
   */
  public static final class LuminanceStoneChallengeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LuminanceStoneChallengeInfo)
      LuminanceStoneChallengeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LuminanceStoneChallengeInfo.newBuilder() to construct.
    private LuminanceStoneChallengeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LuminanceStoneChallengeInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LuminanceStoneChallengeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LuminanceStoneChallengeInfo(
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

              killMonsterCount_ = input.readUInt32();
              break;
            }
            case 56: {

              killSpecialMonsterCount_ = input.readUInt32();
              break;
            }
            case 104: {

              cleanMudCount_ = input.readUInt32();
              break;
            }
            case 120: {

              score_ = input.readUInt32();
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
      return LuminanceStoneChallengeInfoOuterClass.internal_static_LuminanceStoneChallengeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LuminanceStoneChallengeInfoOuterClass.internal_static_LuminanceStoneChallengeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo.class, LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo.Builder.class);
    }

    public static final int KILLSPECIALMONSTERCOUNT_FIELD_NUMBER = 7;
    private int killSpecialMonsterCount_;
    /**
     * <code>uint32 killSpecialMonsterCount = 7;</code>
     * @return The killSpecialMonsterCount.
     */
    @java.lang.Override
    public int getKillSpecialMonsterCount() {
      return killSpecialMonsterCount_;
    }

    public static final int SCORE_FIELD_NUMBER = 15;
    private int score_;
    /**
     * <code>uint32 score = 15;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int KILLMONSTERCOUNT_FIELD_NUMBER = 4;
    private int killMonsterCount_;
    /**
     * <code>uint32 killMonsterCount = 4;</code>
     * @return The killMonsterCount.
     */
    @java.lang.Override
    public int getKillMonsterCount() {
      return killMonsterCount_;
    }

    public static final int CLEANMUDCOUNT_FIELD_NUMBER = 13;
    private int cleanMudCount_;
    /**
     * <code>uint32 cleanMudCount = 13;</code>
     * @return The cleanMudCount.
     */
    @java.lang.Override
    public int getCleanMudCount() {
      return cleanMudCount_;
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
      if (killMonsterCount_ != 0) {
        output.writeUInt32(4, killMonsterCount_);
      }
      if (killSpecialMonsterCount_ != 0) {
        output.writeUInt32(7, killSpecialMonsterCount_);
      }
      if (cleanMudCount_ != 0) {
        output.writeUInt32(13, cleanMudCount_);
      }
      if (score_ != 0) {
        output.writeUInt32(15, score_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (killMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, killMonsterCount_);
      }
      if (killSpecialMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, killSpecialMonsterCount_);
      }
      if (cleanMudCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, cleanMudCount_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, score_);
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
      if (!(obj instanceof LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo)) {
        return super.equals(obj);
      }
      LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo other = (LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo) obj;

      if (getKillSpecialMonsterCount()
          != other.getKillSpecialMonsterCount()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getKillMonsterCount()
          != other.getKillMonsterCount()) return false;
      if (getCleanMudCount()
          != other.getCleanMudCount()) return false;
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
      hash = (37 * hash) + KILLSPECIALMONSTERCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getKillSpecialMonsterCount();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + KILLMONSTERCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getKillMonsterCount();
      hash = (37 * hash) + CLEANMUDCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCleanMudCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo parseFrom(
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
    public static Builder newBuilder(LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo prototype) {
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
     * Protobuf type {@code LuminanceStoneChallengeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LuminanceStoneChallengeInfo)
        LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LuminanceStoneChallengeInfoOuterClass.internal_static_LuminanceStoneChallengeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LuminanceStoneChallengeInfoOuterClass.internal_static_LuminanceStoneChallengeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo.class, LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo.Builder.class);
      }

      // Construct using LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo.newBuilder()
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
        killSpecialMonsterCount_ = 0;

        score_ = 0;

        killMonsterCount_ = 0;

        cleanMudCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return LuminanceStoneChallengeInfoOuterClass.internal_static_LuminanceStoneChallengeInfo_descriptor;
      }

      @java.lang.Override
      public LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo getDefaultInstanceForType() {
        return LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo build() {
        LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo buildPartial() {
        LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo result = new LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo(this);
        result.killSpecialMonsterCount_ = killSpecialMonsterCount_;
        result.score_ = score_;
        result.killMonsterCount_ = killMonsterCount_;
        result.cleanMudCount_ = cleanMudCount_;
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
        if (other instanceof LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo) {
          return mergeFrom((LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo other) {
        if (other == LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo.getDefaultInstance()) return this;
        if (other.getKillSpecialMonsterCount() != 0) {
          setKillSpecialMonsterCount(other.getKillSpecialMonsterCount());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getKillMonsterCount() != 0) {
          setKillMonsterCount(other.getKillMonsterCount());
        }
        if (other.getCleanMudCount() != 0) {
          setCleanMudCount(other.getCleanMudCount());
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
        LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int killSpecialMonsterCount_ ;
      /**
       * <code>uint32 killSpecialMonsterCount = 7;</code>
       * @return The killSpecialMonsterCount.
       */
      @java.lang.Override
      public int getKillSpecialMonsterCount() {
        return killSpecialMonsterCount_;
      }
      /**
       * <code>uint32 killSpecialMonsterCount = 7;</code>
       * @param value The killSpecialMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setKillSpecialMonsterCount(int value) {
        
        killSpecialMonsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 killSpecialMonsterCount = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillSpecialMonsterCount() {
        
        killSpecialMonsterCount_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 15;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 15;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int killMonsterCount_ ;
      /**
       * <code>uint32 killMonsterCount = 4;</code>
       * @return The killMonsterCount.
       */
      @java.lang.Override
      public int getKillMonsterCount() {
        return killMonsterCount_;
      }
      /**
       * <code>uint32 killMonsterCount = 4;</code>
       * @param value The killMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setKillMonsterCount(int value) {
        
        killMonsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 killMonsterCount = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillMonsterCount() {
        
        killMonsterCount_ = 0;
        onChanged();
        return this;
      }

      private int cleanMudCount_ ;
      /**
       * <code>uint32 cleanMudCount = 13;</code>
       * @return The cleanMudCount.
       */
      @java.lang.Override
      public int getCleanMudCount() {
        return cleanMudCount_;
      }
      /**
       * <code>uint32 cleanMudCount = 13;</code>
       * @param value The cleanMudCount to set.
       * @return This builder for chaining.
       */
      public Builder setCleanMudCount(int value) {
        
        cleanMudCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cleanMudCount = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCleanMudCount() {
        
        cleanMudCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LuminanceStoneChallengeInfo)
    }

    // @@protoc_insertion_point(class_scope:LuminanceStoneChallengeInfo)
    private static final LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo();
    }

    public static LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LuminanceStoneChallengeInfo>
        PARSER = new com.google.protobuf.AbstractParser<LuminanceStoneChallengeInfo>() {
      @java.lang.Override
      public LuminanceStoneChallengeInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LuminanceStoneChallengeInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LuminanceStoneChallengeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LuminanceStoneChallengeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public LuminanceStoneChallengeInfoOuterClass.LuminanceStoneChallengeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LuminanceStoneChallengeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LuminanceStoneChallengeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!LuminanceStoneChallengeInfo.proto\"~\n\033L" +
      "uminanceStoneChallengeInfo\022\037\n\027killSpecia" +
      "lMonsterCount\030\007 \001(\r\022\r\n\005score\030\017 \001(\r\022\030\n\020ki" +
      "llMonsterCount\030\004 \001(\r\022\025\n\rcleanMudCount\030\r " +
      "\001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LuminanceStoneChallengeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LuminanceStoneChallengeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LuminanceStoneChallengeInfo_descriptor,
        new java.lang.String[] { "KillSpecialMonsterCount", "Score", "KillMonsterCount", "CleanMudCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
