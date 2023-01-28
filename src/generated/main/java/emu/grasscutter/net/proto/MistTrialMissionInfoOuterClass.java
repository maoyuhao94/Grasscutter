// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MistTrialMissionInfo.proto

public final class MistTrialMissionInfoOuterClass {
  private MistTrialMissionInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MistTrialMissionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MistTrialMissionInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 watcherListId = 14;</code>
     * @return The watcherListId.
     */
    int getWatcherListId();

    /**
     * <code>uint32 param = 7;</code>
     * @return The param.
     */
    int getParam();
  }
  /**
   * Protobuf type {@code MistTrialMissionInfo}
   */
  public static final class MistTrialMissionInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MistTrialMissionInfo)
      MistTrialMissionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MistTrialMissionInfo.newBuilder() to construct.
    private MistTrialMissionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MistTrialMissionInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MistTrialMissionInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MistTrialMissionInfo(
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
            case 56: {

              param_ = input.readUInt32();
              break;
            }
            case 112: {

              watcherListId_ = input.readUInt32();
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
      return MistTrialMissionInfoOuterClass.internal_static_MistTrialMissionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MistTrialMissionInfoOuterClass.internal_static_MistTrialMissionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MistTrialMissionInfoOuterClass.MistTrialMissionInfo.class, MistTrialMissionInfoOuterClass.MistTrialMissionInfo.Builder.class);
    }

    public static final int WATCHERLISTID_FIELD_NUMBER = 14;
    private int watcherListId_;
    /**
     * <code>uint32 watcherListId = 14;</code>
     * @return The watcherListId.
     */
    @java.lang.Override
    public int getWatcherListId() {
      return watcherListId_;
    }

    public static final int PARAM_FIELD_NUMBER = 7;
    private int param_;
    /**
     * <code>uint32 param = 7;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
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
      if (param_ != 0) {
        output.writeUInt32(7, param_);
      }
      if (watcherListId_ != 0) {
        output.writeUInt32(14, watcherListId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, param_);
      }
      if (watcherListId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, watcherListId_);
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
      if (!(obj instanceof MistTrialMissionInfoOuterClass.MistTrialMissionInfo)) {
        return super.equals(obj);
      }
      MistTrialMissionInfoOuterClass.MistTrialMissionInfo other = (MistTrialMissionInfoOuterClass.MistTrialMissionInfo) obj;

      if (getWatcherListId()
          != other.getWatcherListId()) return false;
      if (getParam()
          != other.getParam()) return false;
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
      hash = (37 * hash) + WATCHERLISTID_FIELD_NUMBER;
      hash = (53 * hash) + getWatcherListId();
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MistTrialMissionInfoOuterClass.MistTrialMissionInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MistTrialMissionInfoOuterClass.MistTrialMissionInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MistTrialMissionInfoOuterClass.MistTrialMissionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MistTrialMissionInfoOuterClass.MistTrialMissionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MistTrialMissionInfoOuterClass.MistTrialMissionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MistTrialMissionInfoOuterClass.MistTrialMissionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MistTrialMissionInfoOuterClass.MistTrialMissionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MistTrialMissionInfoOuterClass.MistTrialMissionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MistTrialMissionInfoOuterClass.MistTrialMissionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MistTrialMissionInfoOuterClass.MistTrialMissionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MistTrialMissionInfoOuterClass.MistTrialMissionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MistTrialMissionInfoOuterClass.MistTrialMissionInfo parseFrom(
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
    public static Builder newBuilder(MistTrialMissionInfoOuterClass.MistTrialMissionInfo prototype) {
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
     * Protobuf type {@code MistTrialMissionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MistTrialMissionInfo)
        MistTrialMissionInfoOuterClass.MistTrialMissionInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MistTrialMissionInfoOuterClass.internal_static_MistTrialMissionInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MistTrialMissionInfoOuterClass.internal_static_MistTrialMissionInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MistTrialMissionInfoOuterClass.MistTrialMissionInfo.class, MistTrialMissionInfoOuterClass.MistTrialMissionInfo.Builder.class);
      }

      // Construct using MistTrialMissionInfoOuterClass.MistTrialMissionInfo.newBuilder()
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
        watcherListId_ = 0;

        param_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MistTrialMissionInfoOuterClass.internal_static_MistTrialMissionInfo_descriptor;
      }

      @java.lang.Override
      public MistTrialMissionInfoOuterClass.MistTrialMissionInfo getDefaultInstanceForType() {
        return MistTrialMissionInfoOuterClass.MistTrialMissionInfo.getDefaultInstance();
      }

      @java.lang.Override
      public MistTrialMissionInfoOuterClass.MistTrialMissionInfo build() {
        MistTrialMissionInfoOuterClass.MistTrialMissionInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public MistTrialMissionInfoOuterClass.MistTrialMissionInfo buildPartial() {
        MistTrialMissionInfoOuterClass.MistTrialMissionInfo result = new MistTrialMissionInfoOuterClass.MistTrialMissionInfo(this);
        result.watcherListId_ = watcherListId_;
        result.param_ = param_;
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
        if (other instanceof MistTrialMissionInfoOuterClass.MistTrialMissionInfo) {
          return mergeFrom((MistTrialMissionInfoOuterClass.MistTrialMissionInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MistTrialMissionInfoOuterClass.MistTrialMissionInfo other) {
        if (other == MistTrialMissionInfoOuterClass.MistTrialMissionInfo.getDefaultInstance()) return this;
        if (other.getWatcherListId() != 0) {
          setWatcherListId(other.getWatcherListId());
        }
        if (other.getParam() != 0) {
          setParam(other.getParam());
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
        MistTrialMissionInfoOuterClass.MistTrialMissionInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MistTrialMissionInfoOuterClass.MistTrialMissionInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int watcherListId_ ;
      /**
       * <code>uint32 watcherListId = 14;</code>
       * @return The watcherListId.
       */
      @java.lang.Override
      public int getWatcherListId() {
        return watcherListId_;
      }
      /**
       * <code>uint32 watcherListId = 14;</code>
       * @param value The watcherListId to set.
       * @return This builder for chaining.
       */
      public Builder setWatcherListId(int value) {
        
        watcherListId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 watcherListId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearWatcherListId() {
        
        watcherListId_ = 0;
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 7;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 7;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {
        
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        
        param_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MistTrialMissionInfo)
    }

    // @@protoc_insertion_point(class_scope:MistTrialMissionInfo)
    private static final MistTrialMissionInfoOuterClass.MistTrialMissionInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MistTrialMissionInfoOuterClass.MistTrialMissionInfo();
    }

    public static MistTrialMissionInfoOuterClass.MistTrialMissionInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MistTrialMissionInfo>
        PARSER = new com.google.protobuf.AbstractParser<MistTrialMissionInfo>() {
      @java.lang.Override
      public MistTrialMissionInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MistTrialMissionInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MistTrialMissionInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MistTrialMissionInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public MistTrialMissionInfoOuterClass.MistTrialMissionInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MistTrialMissionInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MistTrialMissionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032MistTrialMissionInfo.proto\"<\n\024MistTria" +
      "lMissionInfo\022\025\n\rwatcherListId\030\016 \001(\r\022\r\n\005p" +
      "aram\030\007 \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MistTrialMissionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MistTrialMissionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MistTrialMissionInfo_descriptor,
        new java.lang.String[] { "WatcherListId", "Param", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
