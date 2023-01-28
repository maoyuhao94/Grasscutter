// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AsterProgressDetailInfo.proto

public final class AsterProgressDetailInfoOuterClass {
  private AsterProgressDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AsterProgressDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AsterProgressDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 lastAutoAddTime = 14;</code>
     * @return The lastAutoAddTime.
     */
    int getLastAutoAddTime();

    /**
     * <code>uint32 count = 8;</code>
     * @return The count.
     */
    int getCount();
  }
  /**
   * Protobuf type {@code AsterProgressDetailInfo}
   */
  public static final class AsterProgressDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AsterProgressDetailInfo)
      AsterProgressDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AsterProgressDetailInfo.newBuilder() to construct.
    private AsterProgressDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AsterProgressDetailInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AsterProgressDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AsterProgressDetailInfo(
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
            case 64: {

              count_ = input.readUInt32();
              break;
            }
            case 112: {

              lastAutoAddTime_ = input.readUInt32();
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
      return AsterProgressDetailInfoOuterClass.internal_static_AsterProgressDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AsterProgressDetailInfoOuterClass.internal_static_AsterProgressDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo.class, AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo.Builder.class);
    }

    public static final int LASTAUTOADDTIME_FIELD_NUMBER = 14;
    private int lastAutoAddTime_;
    /**
     * <code>uint32 lastAutoAddTime = 14;</code>
     * @return The lastAutoAddTime.
     */
    @java.lang.Override
    public int getLastAutoAddTime() {
      return lastAutoAddTime_;
    }

    public static final int COUNT_FIELD_NUMBER = 8;
    private int count_;
    /**
     * <code>uint32 count = 8;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
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
      if (count_ != 0) {
        output.writeUInt32(8, count_);
      }
      if (lastAutoAddTime_ != 0) {
        output.writeUInt32(14, lastAutoAddTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, count_);
      }
      if (lastAutoAddTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, lastAutoAddTime_);
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
      if (!(obj instanceof AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo)) {
        return super.equals(obj);
      }
      AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo other = (AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo) obj;

      if (getLastAutoAddTime()
          != other.getLastAutoAddTime()) return false;
      if (getCount()
          != other.getCount()) return false;
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
      hash = (37 * hash) + LASTAUTOADDTIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastAutoAddTime();
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo parseFrom(
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
    public static Builder newBuilder(AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo prototype) {
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
     * Protobuf type {@code AsterProgressDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AsterProgressDetailInfo)
        AsterProgressDetailInfoOuterClass.AsterProgressDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AsterProgressDetailInfoOuterClass.internal_static_AsterProgressDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AsterProgressDetailInfoOuterClass.internal_static_AsterProgressDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo.class, AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo.Builder.class);
      }

      // Construct using AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo.newBuilder()
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
        lastAutoAddTime_ = 0;

        count_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AsterProgressDetailInfoOuterClass.internal_static_AsterProgressDetailInfo_descriptor;
      }

      @java.lang.Override
      public AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo getDefaultInstanceForType() {
        return AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo build() {
        AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo buildPartial() {
        AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo result = new AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo(this);
        result.lastAutoAddTime_ = lastAutoAddTime_;
        result.count_ = count_;
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
        if (other instanceof AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo) {
          return mergeFrom((AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo other) {
        if (other == AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo.getDefaultInstance()) return this;
        if (other.getLastAutoAddTime() != 0) {
          setLastAutoAddTime(other.getLastAutoAddTime());
        }
        if (other.getCount() != 0) {
          setCount(other.getCount());
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
        AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int lastAutoAddTime_ ;
      /**
       * <code>uint32 lastAutoAddTime = 14;</code>
       * @return The lastAutoAddTime.
       */
      @java.lang.Override
      public int getLastAutoAddTime() {
        return lastAutoAddTime_;
      }
      /**
       * <code>uint32 lastAutoAddTime = 14;</code>
       * @param value The lastAutoAddTime to set.
       * @return This builder for chaining.
       */
      public Builder setLastAutoAddTime(int value) {
        
        lastAutoAddTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 lastAutoAddTime = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastAutoAddTime() {
        
        lastAutoAddTime_ = 0;
        onChanged();
        return this;
      }

      private int count_ ;
      /**
       * <code>uint32 count = 8;</code>
       * @return The count.
       */
      @java.lang.Override
      public int getCount() {
        return count_;
      }
      /**
       * <code>uint32 count = 8;</code>
       * @param value The count to set.
       * @return This builder for chaining.
       */
      public Builder setCount(int value) {
        
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 count = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCount() {
        
        count_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AsterProgressDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:AsterProgressDetailInfo)
    private static final AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo();
    }

    public static AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AsterProgressDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<AsterProgressDetailInfo>() {
      @java.lang.Override
      public AsterProgressDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AsterProgressDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AsterProgressDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AsterProgressDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public AsterProgressDetailInfoOuterClass.AsterProgressDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AsterProgressDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AsterProgressDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035AsterProgressDetailInfo.proto\"A\n\027Aster" +
      "ProgressDetailInfo\022\027\n\017lastAutoAddTime\030\016 " +
      "\001(\r\022\r\n\005count\030\010 \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AsterProgressDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AsterProgressDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AsterProgressDetailInfo_descriptor,
        new java.lang.String[] { "LastAutoAddTime", "Count", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
