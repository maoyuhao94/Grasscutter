// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EntityConfigHashEntry.proto

public final class EntityConfigHashEntryOuterClass {
  private EntityConfigHashEntryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EntityConfigHashEntryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EntityConfigHashEntry)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entityId = 3;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 jobId = 12;</code>
     * @return The jobId.
     */
    int getJobId();

    /**
     * <code>int32 hashValue = 6;</code>
     * @return The hashValue.
     */
    int getHashValue();
  }
  /**
   * Protobuf type {@code EntityConfigHashEntry}
   */
  public static final class EntityConfigHashEntry extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EntityConfigHashEntry)
      EntityConfigHashEntryOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EntityConfigHashEntry.newBuilder() to construct.
    private EntityConfigHashEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EntityConfigHashEntry() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EntityConfigHashEntry();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EntityConfigHashEntry(
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
            case 24: {

              entityId_ = input.readUInt32();
              break;
            }
            case 48: {

              hashValue_ = input.readInt32();
              break;
            }
            case 96: {

              jobId_ = input.readUInt32();
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
      return EntityConfigHashEntryOuterClass.internal_static_EntityConfigHashEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EntityConfigHashEntryOuterClass.internal_static_EntityConfigHashEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EntityConfigHashEntryOuterClass.EntityConfigHashEntry.class, EntityConfigHashEntryOuterClass.EntityConfigHashEntry.Builder.class);
    }

    public static final int ENTITYID_FIELD_NUMBER = 3;
    private int entityId_;
    /**
     * <code>uint32 entityId = 3;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int JOBID_FIELD_NUMBER = 12;
    private int jobId_;
    /**
     * <code>uint32 jobId = 12;</code>
     * @return The jobId.
     */
    @java.lang.Override
    public int getJobId() {
      return jobId_;
    }

    public static final int HASHVALUE_FIELD_NUMBER = 6;
    private int hashValue_;
    /**
     * <code>int32 hashValue = 6;</code>
     * @return The hashValue.
     */
    @java.lang.Override
    public int getHashValue() {
      return hashValue_;
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
      if (entityId_ != 0) {
        output.writeUInt32(3, entityId_);
      }
      if (hashValue_ != 0) {
        output.writeInt32(6, hashValue_);
      }
      if (jobId_ != 0) {
        output.writeUInt32(12, jobId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, entityId_);
      }
      if (hashValue_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, hashValue_);
      }
      if (jobId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, jobId_);
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
      if (!(obj instanceof EntityConfigHashEntryOuterClass.EntityConfigHashEntry)) {
        return super.equals(obj);
      }
      EntityConfigHashEntryOuterClass.EntityConfigHashEntry other = (EntityConfigHashEntryOuterClass.EntityConfigHashEntry) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getJobId()
          != other.getJobId()) return false;
      if (getHashValue()
          != other.getHashValue()) return false;
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
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + JOBID_FIELD_NUMBER;
      hash = (53 * hash) + getJobId();
      hash = (37 * hash) + HASHVALUE_FIELD_NUMBER;
      hash = (53 * hash) + getHashValue();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static EntityConfigHashEntryOuterClass.EntityConfigHashEntry parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EntityConfigHashEntryOuterClass.EntityConfigHashEntry parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EntityConfigHashEntryOuterClass.EntityConfigHashEntry parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EntityConfigHashEntryOuterClass.EntityConfigHashEntry parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EntityConfigHashEntryOuterClass.EntityConfigHashEntry parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EntityConfigHashEntryOuterClass.EntityConfigHashEntry parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EntityConfigHashEntryOuterClass.EntityConfigHashEntry parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EntityConfigHashEntryOuterClass.EntityConfigHashEntry parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static EntityConfigHashEntryOuterClass.EntityConfigHashEntry parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static EntityConfigHashEntryOuterClass.EntityConfigHashEntry parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static EntityConfigHashEntryOuterClass.EntityConfigHashEntry parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EntityConfigHashEntryOuterClass.EntityConfigHashEntry parseFrom(
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
    public static Builder newBuilder(EntityConfigHashEntryOuterClass.EntityConfigHashEntry prototype) {
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
     * Protobuf type {@code EntityConfigHashEntry}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EntityConfigHashEntry)
        EntityConfigHashEntryOuterClass.EntityConfigHashEntryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EntityConfigHashEntryOuterClass.internal_static_EntityConfigHashEntry_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return EntityConfigHashEntryOuterClass.internal_static_EntityConfigHashEntry_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EntityConfigHashEntryOuterClass.EntityConfigHashEntry.class, EntityConfigHashEntryOuterClass.EntityConfigHashEntry.Builder.class);
      }

      // Construct using EntityConfigHashEntryOuterClass.EntityConfigHashEntry.newBuilder()
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
        entityId_ = 0;

        jobId_ = 0;

        hashValue_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return EntityConfigHashEntryOuterClass.internal_static_EntityConfigHashEntry_descriptor;
      }

      @java.lang.Override
      public EntityConfigHashEntryOuterClass.EntityConfigHashEntry getDefaultInstanceForType() {
        return EntityConfigHashEntryOuterClass.EntityConfigHashEntry.getDefaultInstance();
      }

      @java.lang.Override
      public EntityConfigHashEntryOuterClass.EntityConfigHashEntry build() {
        EntityConfigHashEntryOuterClass.EntityConfigHashEntry result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public EntityConfigHashEntryOuterClass.EntityConfigHashEntry buildPartial() {
        EntityConfigHashEntryOuterClass.EntityConfigHashEntry result = new EntityConfigHashEntryOuterClass.EntityConfigHashEntry(this);
        result.entityId_ = entityId_;
        result.jobId_ = jobId_;
        result.hashValue_ = hashValue_;
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
        if (other instanceof EntityConfigHashEntryOuterClass.EntityConfigHashEntry) {
          return mergeFrom((EntityConfigHashEntryOuterClass.EntityConfigHashEntry)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EntityConfigHashEntryOuterClass.EntityConfigHashEntry other) {
        if (other == EntityConfigHashEntryOuterClass.EntityConfigHashEntry.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getJobId() != 0) {
          setJobId(other.getJobId());
        }
        if (other.getHashValue() != 0) {
          setHashValue(other.getHashValue());
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
        EntityConfigHashEntryOuterClass.EntityConfigHashEntry parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (EntityConfigHashEntryOuterClass.EntityConfigHashEntry) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 3;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 3;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int jobId_ ;
      /**
       * <code>uint32 jobId = 12;</code>
       * @return The jobId.
       */
      @java.lang.Override
      public int getJobId() {
        return jobId_;
      }
      /**
       * <code>uint32 jobId = 12;</code>
       * @param value The jobId to set.
       * @return This builder for chaining.
       */
      public Builder setJobId(int value) {
        
        jobId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 jobId = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearJobId() {
        
        jobId_ = 0;
        onChanged();
        return this;
      }

      private int hashValue_ ;
      /**
       * <code>int32 hashValue = 6;</code>
       * @return The hashValue.
       */
      @java.lang.Override
      public int getHashValue() {
        return hashValue_;
      }
      /**
       * <code>int32 hashValue = 6;</code>
       * @param value The hashValue to set.
       * @return This builder for chaining.
       */
      public Builder setHashValue(int value) {
        
        hashValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 hashValue = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearHashValue() {
        
        hashValue_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EntityConfigHashEntry)
    }

    // @@protoc_insertion_point(class_scope:EntityConfigHashEntry)
    private static final EntityConfigHashEntryOuterClass.EntityConfigHashEntry DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new EntityConfigHashEntryOuterClass.EntityConfigHashEntry();
    }

    public static EntityConfigHashEntryOuterClass.EntityConfigHashEntry getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EntityConfigHashEntry>
        PARSER = new com.google.protobuf.AbstractParser<EntityConfigHashEntry>() {
      @java.lang.Override
      public EntityConfigHashEntry parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EntityConfigHashEntry(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EntityConfigHashEntry> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EntityConfigHashEntry> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public EntityConfigHashEntryOuterClass.EntityConfigHashEntry getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityConfigHashEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityConfigHashEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033EntityConfigHashEntry.proto\"K\n\025EntityC" +
      "onfigHashEntry\022\020\n\010entityId\030\003 \001(\r\022\r\n\005jobI" +
      "d\030\014 \001(\r\022\021\n\thashValue\030\006 \001(\005b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EntityConfigHashEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EntityConfigHashEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityConfigHashEntry_descriptor,
        new java.lang.String[] { "EntityId", "JobId", "HashValue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
