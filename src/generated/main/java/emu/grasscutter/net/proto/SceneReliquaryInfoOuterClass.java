// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneReliquaryInfo.proto

public final class SceneReliquaryInfoOuterClass {
  private SceneReliquaryInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneReliquaryInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneReliquaryInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 itemId = 1;</code>
     * @return The itemId.
     */
    int getItemId();

    /**
     * <code>uint64 guid = 2;</code>
     * @return The guid.
     */
    long getGuid();

    /**
     * <code>uint32 level = 3;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 promoteLevel = 4;</code>
     * @return The promoteLevel.
     */
    int getPromoteLevel();
  }
  /**
   * Protobuf type {@code SceneReliquaryInfo}
   */
  public static final class SceneReliquaryInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneReliquaryInfo)
      SceneReliquaryInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneReliquaryInfo.newBuilder() to construct.
    private SceneReliquaryInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneReliquaryInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneReliquaryInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneReliquaryInfo(
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

              itemId_ = input.readUInt32();
              break;
            }
            case 16: {

              guid_ = input.readUInt64();
              break;
            }
            case 24: {

              level_ = input.readUInt32();
              break;
            }
            case 32: {

              promoteLevel_ = input.readUInt32();
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
      return SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SceneReliquaryInfoOuterClass.SceneReliquaryInfo.class, SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder.class);
    }

    public static final int ITEMID_FIELD_NUMBER = 1;
    private int itemId_;
    /**
     * <code>uint32 itemId = 1;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public int getItemId() {
      return itemId_;
    }

    public static final int GUID_FIELD_NUMBER = 2;
    private long guid_;
    /**
     * <code>uint64 guid = 2;</code>
     * @return The guid.
     */
    @java.lang.Override
    public long getGuid() {
      return guid_;
    }

    public static final int LEVEL_FIELD_NUMBER = 3;
    private int level_;
    /**
     * <code>uint32 level = 3;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int PROMOTELEVEL_FIELD_NUMBER = 4;
    private int promoteLevel_;
    /**
     * <code>uint32 promoteLevel = 4;</code>
     * @return The promoteLevel.
     */
    @java.lang.Override
    public int getPromoteLevel() {
      return promoteLevel_;
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
      if (itemId_ != 0) {
        output.writeUInt32(1, itemId_);
      }
      if (guid_ != 0L) {
        output.writeUInt64(2, guid_);
      }
      if (level_ != 0) {
        output.writeUInt32(3, level_);
      }
      if (promoteLevel_ != 0) {
        output.writeUInt32(4, promoteLevel_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (itemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, itemId_);
      }
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, guid_);
      }
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, level_);
      }
      if (promoteLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, promoteLevel_);
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
      if (!(obj instanceof SceneReliquaryInfoOuterClass.SceneReliquaryInfo)) {
        return super.equals(obj);
      }
      SceneReliquaryInfoOuterClass.SceneReliquaryInfo other = (SceneReliquaryInfoOuterClass.SceneReliquaryInfo) obj;

      if (getItemId()
          != other.getItemId()) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (getLevel()
          != other.getLevel()) return false;
      if (getPromoteLevel()
          != other.getPromoteLevel()) return false;
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
      hash = (37 * hash) + ITEMID_FIELD_NUMBER;
      hash = (53 * hash) + getItemId();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + PROMOTELEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getPromoteLevel();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SceneReliquaryInfoOuterClass.SceneReliquaryInfo parseFrom(
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
    public static Builder newBuilder(SceneReliquaryInfoOuterClass.SceneReliquaryInfo prototype) {
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
     * Protobuf type {@code SceneReliquaryInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneReliquaryInfo)
        SceneReliquaryInfoOuterClass.SceneReliquaryInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SceneReliquaryInfoOuterClass.SceneReliquaryInfo.class, SceneReliquaryInfoOuterClass.SceneReliquaryInfo.Builder.class);
      }

      // Construct using SceneReliquaryInfoOuterClass.SceneReliquaryInfo.newBuilder()
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
        itemId_ = 0;

        guid_ = 0L;

        level_ = 0;

        promoteLevel_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SceneReliquaryInfoOuterClass.internal_static_SceneReliquaryInfo_descriptor;
      }

      @java.lang.Override
      public SceneReliquaryInfoOuterClass.SceneReliquaryInfo getDefaultInstanceForType() {
        return SceneReliquaryInfoOuterClass.SceneReliquaryInfo.getDefaultInstance();
      }

      @java.lang.Override
      public SceneReliquaryInfoOuterClass.SceneReliquaryInfo build() {
        SceneReliquaryInfoOuterClass.SceneReliquaryInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SceneReliquaryInfoOuterClass.SceneReliquaryInfo buildPartial() {
        SceneReliquaryInfoOuterClass.SceneReliquaryInfo result = new SceneReliquaryInfoOuterClass.SceneReliquaryInfo(this);
        result.itemId_ = itemId_;
        result.guid_ = guid_;
        result.level_ = level_;
        result.promoteLevel_ = promoteLevel_;
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
        if (other instanceof SceneReliquaryInfoOuterClass.SceneReliquaryInfo) {
          return mergeFrom((SceneReliquaryInfoOuterClass.SceneReliquaryInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SceneReliquaryInfoOuterClass.SceneReliquaryInfo other) {
        if (other == SceneReliquaryInfoOuterClass.SceneReliquaryInfo.getDefaultInstance()) return this;
        if (other.getItemId() != 0) {
          setItemId(other.getItemId());
        }
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
        }
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getPromoteLevel() != 0) {
          setPromoteLevel(other.getPromoteLevel());
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
        SceneReliquaryInfoOuterClass.SceneReliquaryInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SceneReliquaryInfoOuterClass.SceneReliquaryInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int itemId_ ;
      /**
       * <code>uint32 itemId = 1;</code>
       * @return The itemId.
       */
      @java.lang.Override
      public int getItemId() {
        return itemId_;
      }
      /**
       * <code>uint32 itemId = 1;</code>
       * @param value The itemId to set.
       * @return This builder for chaining.
       */
      public Builder setItemId(int value) {
        
        itemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 itemId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemId() {
        
        itemId_ = 0;
        onChanged();
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 2;</code>
       * @return The guid.
       */
      @java.lang.Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 2;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0L;
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>uint32 level = 3;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 3;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
      }

      private int promoteLevel_ ;
      /**
       * <code>uint32 promoteLevel = 4;</code>
       * @return The promoteLevel.
       */
      @java.lang.Override
      public int getPromoteLevel() {
        return promoteLevel_;
      }
      /**
       * <code>uint32 promoteLevel = 4;</code>
       * @param value The promoteLevel to set.
       * @return This builder for chaining.
       */
      public Builder setPromoteLevel(int value) {
        
        promoteLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 promoteLevel = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPromoteLevel() {
        
        promoteLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneReliquaryInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneReliquaryInfo)
    private static final SceneReliquaryInfoOuterClass.SceneReliquaryInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SceneReliquaryInfoOuterClass.SceneReliquaryInfo();
    }

    public static SceneReliquaryInfoOuterClass.SceneReliquaryInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneReliquaryInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneReliquaryInfo>() {
      @java.lang.Override
      public SceneReliquaryInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneReliquaryInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneReliquaryInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneReliquaryInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SceneReliquaryInfoOuterClass.SceneReliquaryInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneReliquaryInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneReliquaryInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030SceneReliquaryInfo.proto\"W\n\022SceneReliq" +
      "uaryInfo\022\016\n\006itemId\030\001 \001(\r\022\014\n\004guid\030\002 \001(\004\022\r" +
      "\n\005level\030\003 \001(\r\022\024\n\014promoteLevel\030\004 \001(\rb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneReliquaryInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneReliquaryInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneReliquaryInfo_descriptor,
        new java.lang.String[] { "ItemId", "Guid", "Level", "PromoteLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
