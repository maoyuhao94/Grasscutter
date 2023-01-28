// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BounceConjuringInfo.proto

public final class BounceConjuringInfoOuterClass {
  private BounceConjuringInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BounceConjuringInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BounceConjuringInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 totalDestroyedMachineCount = 5;</code>
     * @return The totalDestroyedMachineCount.
     */
    int getTotalDestroyedMachineCount();

    /**
     * <code>uint32 totalScore = 4;</code>
     * @return The totalScore.
     */
    int getTotalScore();
  }
  /**
   * Protobuf type {@code BounceConjuringInfo}
   */
  public static final class BounceConjuringInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BounceConjuringInfo)
      BounceConjuringInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BounceConjuringInfo.newBuilder() to construct.
    private BounceConjuringInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BounceConjuringInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BounceConjuringInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BounceConjuringInfo(
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

              totalScore_ = input.readUInt32();
              break;
            }
            case 40: {

              totalDestroyedMachineCount_ = input.readUInt32();
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
      return BounceConjuringInfoOuterClass.internal_static_BounceConjuringInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BounceConjuringInfoOuterClass.internal_static_BounceConjuringInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BounceConjuringInfoOuterClass.BounceConjuringInfo.class, BounceConjuringInfoOuterClass.BounceConjuringInfo.Builder.class);
    }

    public static final int TOTALDESTROYEDMACHINECOUNT_FIELD_NUMBER = 5;
    private int totalDestroyedMachineCount_;
    /**
     * <code>uint32 totalDestroyedMachineCount = 5;</code>
     * @return The totalDestroyedMachineCount.
     */
    @java.lang.Override
    public int getTotalDestroyedMachineCount() {
      return totalDestroyedMachineCount_;
    }

    public static final int TOTALSCORE_FIELD_NUMBER = 4;
    private int totalScore_;
    /**
     * <code>uint32 totalScore = 4;</code>
     * @return The totalScore.
     */
    @java.lang.Override
    public int getTotalScore() {
      return totalScore_;
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
      if (totalScore_ != 0) {
        output.writeUInt32(4, totalScore_);
      }
      if (totalDestroyedMachineCount_ != 0) {
        output.writeUInt32(5, totalDestroyedMachineCount_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (totalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, totalScore_);
      }
      if (totalDestroyedMachineCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, totalDestroyedMachineCount_);
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
      if (!(obj instanceof BounceConjuringInfoOuterClass.BounceConjuringInfo)) {
        return super.equals(obj);
      }
      BounceConjuringInfoOuterClass.BounceConjuringInfo other = (BounceConjuringInfoOuterClass.BounceConjuringInfo) obj;

      if (getTotalDestroyedMachineCount()
          != other.getTotalDestroyedMachineCount()) return false;
      if (getTotalScore()
          != other.getTotalScore()) return false;
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
      hash = (37 * hash) + TOTALDESTROYEDMACHINECOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getTotalDestroyedMachineCount();
      hash = (37 * hash) + TOTALSCORE_FIELD_NUMBER;
      hash = (53 * hash) + getTotalScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static BounceConjuringInfoOuterClass.BounceConjuringInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static BounceConjuringInfoOuterClass.BounceConjuringInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static BounceConjuringInfoOuterClass.BounceConjuringInfo parseFrom(
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
    public static Builder newBuilder(BounceConjuringInfoOuterClass.BounceConjuringInfo prototype) {
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
     * Protobuf type {@code BounceConjuringInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BounceConjuringInfo)
        BounceConjuringInfoOuterClass.BounceConjuringInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return BounceConjuringInfoOuterClass.internal_static_BounceConjuringInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return BounceConjuringInfoOuterClass.internal_static_BounceConjuringInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                BounceConjuringInfoOuterClass.BounceConjuringInfo.class, BounceConjuringInfoOuterClass.BounceConjuringInfo.Builder.class);
      }

      // Construct using BounceConjuringInfoOuterClass.BounceConjuringInfo.newBuilder()
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
        totalDestroyedMachineCount_ = 0;

        totalScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return BounceConjuringInfoOuterClass.internal_static_BounceConjuringInfo_descriptor;
      }

      @java.lang.Override
      public BounceConjuringInfoOuterClass.BounceConjuringInfo getDefaultInstanceForType() {
        return BounceConjuringInfoOuterClass.BounceConjuringInfo.getDefaultInstance();
      }

      @java.lang.Override
      public BounceConjuringInfoOuterClass.BounceConjuringInfo build() {
        BounceConjuringInfoOuterClass.BounceConjuringInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public BounceConjuringInfoOuterClass.BounceConjuringInfo buildPartial() {
        BounceConjuringInfoOuterClass.BounceConjuringInfo result = new BounceConjuringInfoOuterClass.BounceConjuringInfo(this);
        result.totalDestroyedMachineCount_ = totalDestroyedMachineCount_;
        result.totalScore_ = totalScore_;
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
        if (other instanceof BounceConjuringInfoOuterClass.BounceConjuringInfo) {
          return mergeFrom((BounceConjuringInfoOuterClass.BounceConjuringInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(BounceConjuringInfoOuterClass.BounceConjuringInfo other) {
        if (other == BounceConjuringInfoOuterClass.BounceConjuringInfo.getDefaultInstance()) return this;
        if (other.getTotalDestroyedMachineCount() != 0) {
          setTotalDestroyedMachineCount(other.getTotalDestroyedMachineCount());
        }
        if (other.getTotalScore() != 0) {
          setTotalScore(other.getTotalScore());
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
        BounceConjuringInfoOuterClass.BounceConjuringInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (BounceConjuringInfoOuterClass.BounceConjuringInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int totalDestroyedMachineCount_ ;
      /**
       * <code>uint32 totalDestroyedMachineCount = 5;</code>
       * @return The totalDestroyedMachineCount.
       */
      @java.lang.Override
      public int getTotalDestroyedMachineCount() {
        return totalDestroyedMachineCount_;
      }
      /**
       * <code>uint32 totalDestroyedMachineCount = 5;</code>
       * @param value The totalDestroyedMachineCount to set.
       * @return This builder for chaining.
       */
      public Builder setTotalDestroyedMachineCount(int value) {
        
        totalDestroyedMachineCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 totalDestroyedMachineCount = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalDestroyedMachineCount() {
        
        totalDestroyedMachineCount_ = 0;
        onChanged();
        return this;
      }

      private int totalScore_ ;
      /**
       * <code>uint32 totalScore = 4;</code>
       * @return The totalScore.
       */
      @java.lang.Override
      public int getTotalScore() {
        return totalScore_;
      }
      /**
       * <code>uint32 totalScore = 4;</code>
       * @param value The totalScore to set.
       * @return This builder for chaining.
       */
      public Builder setTotalScore(int value) {
        
        totalScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 totalScore = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalScore() {
        
        totalScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BounceConjuringInfo)
    }

    // @@protoc_insertion_point(class_scope:BounceConjuringInfo)
    private static final BounceConjuringInfoOuterClass.BounceConjuringInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new BounceConjuringInfoOuterClass.BounceConjuringInfo();
    }

    public static BounceConjuringInfoOuterClass.BounceConjuringInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BounceConjuringInfo>
        PARSER = new com.google.protobuf.AbstractParser<BounceConjuringInfo>() {
      @java.lang.Override
      public BounceConjuringInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BounceConjuringInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BounceConjuringInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BounceConjuringInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public BounceConjuringInfoOuterClass.BounceConjuringInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BounceConjuringInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BounceConjuringInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031BounceConjuringInfo.proto\"M\n\023BounceCon" +
      "juringInfo\022\"\n\032totalDestroyedMachineCount" +
      "\030\005 \001(\r\022\022\n\ntotalScore\030\004 \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BounceConjuringInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BounceConjuringInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BounceConjuringInfo_descriptor,
        new java.lang.String[] { "TotalDestroyedMachineCount", "TotalScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
