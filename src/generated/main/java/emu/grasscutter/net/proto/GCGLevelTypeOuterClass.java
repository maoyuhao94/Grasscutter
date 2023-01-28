// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGLevelType.proto

public final class GCGLevelTypeOuterClass {
  private GCGLevelTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGLevelTypeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGLevelType)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 levelId = 3;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 scenePointId = 2;</code>
     * @return The scenePointId.
     */
    int getScenePointId();

    /**
     * <code>uint32 id = 6;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * Protobuf type {@code GCGLevelType}
   */
  public static final class GCGLevelType extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGLevelType)
      GCGLevelTypeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGLevelType.newBuilder() to construct.
    private GCGLevelType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGLevelType() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGLevelType();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGLevelType(
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

              scenePointId_ = input.readUInt32();
              break;
            }
            case 24: {

              levelId_ = input.readUInt32();
              break;
            }
            case 48: {

              id_ = input.readUInt32();
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
      return GCGLevelTypeOuterClass.internal_static_GCGLevelType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GCGLevelTypeOuterClass.internal_static_GCGLevelType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GCGLevelTypeOuterClass.GCGLevelType.class, GCGLevelTypeOuterClass.GCGLevelType.Builder.class);
    }

    public static final int LEVELID_FIELD_NUMBER = 3;
    private int levelId_;
    /**
     * <code>uint32 levelId = 3;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int SCENEPOINTID_FIELD_NUMBER = 2;
    private int scenePointId_;
    /**
     * <code>uint32 scenePointId = 2;</code>
     * @return The scenePointId.
     */
    @java.lang.Override
    public int getScenePointId() {
      return scenePointId_;
    }

    public static final int ID_FIELD_NUMBER = 6;
    private int id_;
    /**
     * <code>uint32 id = 6;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (scenePointId_ != 0) {
        output.writeUInt32(2, scenePointId_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(3, levelId_);
      }
      if (id_ != 0) {
        output.writeUInt32(6, id_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (scenePointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, scenePointId_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, levelId_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, id_);
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
      if (!(obj instanceof GCGLevelTypeOuterClass.GCGLevelType)) {
        return super.equals(obj);
      }
      GCGLevelTypeOuterClass.GCGLevelType other = (GCGLevelTypeOuterClass.GCGLevelType) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getScenePointId()
          != other.getScenePointId()) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + LEVELID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + SCENEPOINTID_FIELD_NUMBER;
      hash = (53 * hash) + getScenePointId();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GCGLevelTypeOuterClass.GCGLevelType parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGLevelTypeOuterClass.GCGLevelType parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGLevelTypeOuterClass.GCGLevelType parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGLevelTypeOuterClass.GCGLevelType parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGLevelTypeOuterClass.GCGLevelType parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGLevelTypeOuterClass.GCGLevelType parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGLevelTypeOuterClass.GCGLevelType parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGLevelTypeOuterClass.GCGLevelType parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGLevelTypeOuterClass.GCGLevelType parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GCGLevelTypeOuterClass.GCGLevelType parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGLevelTypeOuterClass.GCGLevelType parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGLevelTypeOuterClass.GCGLevelType parseFrom(
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
    public static Builder newBuilder(GCGLevelTypeOuterClass.GCGLevelType prototype) {
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
     * Protobuf type {@code GCGLevelType}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGLevelType)
        GCGLevelTypeOuterClass.GCGLevelTypeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GCGLevelTypeOuterClass.internal_static_GCGLevelType_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GCGLevelTypeOuterClass.internal_static_GCGLevelType_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GCGLevelTypeOuterClass.GCGLevelType.class, GCGLevelTypeOuterClass.GCGLevelType.Builder.class);
      }

      // Construct using GCGLevelTypeOuterClass.GCGLevelType.newBuilder()
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
        levelId_ = 0;

        scenePointId_ = 0;

        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GCGLevelTypeOuterClass.internal_static_GCGLevelType_descriptor;
      }

      @java.lang.Override
      public GCGLevelTypeOuterClass.GCGLevelType getDefaultInstanceForType() {
        return GCGLevelTypeOuterClass.GCGLevelType.getDefaultInstance();
      }

      @java.lang.Override
      public GCGLevelTypeOuterClass.GCGLevelType build() {
        GCGLevelTypeOuterClass.GCGLevelType result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public GCGLevelTypeOuterClass.GCGLevelType buildPartial() {
        GCGLevelTypeOuterClass.GCGLevelType result = new GCGLevelTypeOuterClass.GCGLevelType(this);
        result.levelId_ = levelId_;
        result.scenePointId_ = scenePointId_;
        result.id_ = id_;
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
        if (other instanceof GCGLevelTypeOuterClass.GCGLevelType) {
          return mergeFrom((GCGLevelTypeOuterClass.GCGLevelType)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GCGLevelTypeOuterClass.GCGLevelType other) {
        if (other == GCGLevelTypeOuterClass.GCGLevelType.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getScenePointId() != 0) {
          setScenePointId(other.getScenePointId());
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
        GCGLevelTypeOuterClass.GCGLevelType parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GCGLevelTypeOuterClass.GCGLevelType) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 levelId = 3;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 levelId = 3;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 levelId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int scenePointId_ ;
      /**
       * <code>uint32 scenePointId = 2;</code>
       * @return The scenePointId.
       */
      @java.lang.Override
      public int getScenePointId() {
        return scenePointId_;
      }
      /**
       * <code>uint32 scenePointId = 2;</code>
       * @param value The scenePointId to set.
       * @return This builder for chaining.
       */
      public Builder setScenePointId(int value) {
        
        scenePointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scenePointId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearScenePointId() {
        
        scenePointId_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 6;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 6;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGLevelType)
    }

    // @@protoc_insertion_point(class_scope:GCGLevelType)
    private static final GCGLevelTypeOuterClass.GCGLevelType DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GCGLevelTypeOuterClass.GCGLevelType();
    }

    public static GCGLevelTypeOuterClass.GCGLevelType getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGLevelType>
        PARSER = new com.google.protobuf.AbstractParser<GCGLevelType>() {
      @java.lang.Override
      public GCGLevelType parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGLevelType(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGLevelType> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGLevelType> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public GCGLevelTypeOuterClass.GCGLevelType getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGLevelType_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGLevelType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022GCGLevelType.proto\"A\n\014GCGLevelType\022\017\n\007" +
      "levelId\030\003 \001(\r\022\024\n\014scenePointId\030\002 \001(\r\022\n\n\002i" +
      "d\030\006 \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGLevelType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGLevelType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGLevelType_descriptor,
        new java.lang.String[] { "LevelId", "ScenePointId", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
