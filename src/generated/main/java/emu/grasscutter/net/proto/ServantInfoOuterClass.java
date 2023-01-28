// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServantInfo.proto

public final class ServantInfoOuterClass {
  private ServantInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServantInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ServantInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 masterEntityId = 1;</code>
     * @return The masterEntityId.
     */
    int getMasterEntityId();

    /**
     * <code>uint32 bornSlotIndex = 2;</code>
     * @return The bornSlotIndex.
     */
    int getBornSlotIndex();
  }
  /**
   * Protobuf type {@code ServantInfo}
   */
  public static final class ServantInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ServantInfo)
      ServantInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ServantInfo.newBuilder() to construct.
    private ServantInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServantInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ServantInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ServantInfo(
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

              masterEntityId_ = input.readUInt32();
              break;
            }
            case 16: {

              bornSlotIndex_ = input.readUInt32();
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
      return ServantInfoOuterClass.internal_static_ServantInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServantInfoOuterClass.internal_static_ServantInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServantInfoOuterClass.ServantInfo.class, ServantInfoOuterClass.ServantInfo.Builder.class);
    }

    public static final int MASTERENTITYID_FIELD_NUMBER = 1;
    private int masterEntityId_;
    /**
     * <code>uint32 masterEntityId = 1;</code>
     * @return The masterEntityId.
     */
    @java.lang.Override
    public int getMasterEntityId() {
      return masterEntityId_;
    }

    public static final int BORNSLOTINDEX_FIELD_NUMBER = 2;
    private int bornSlotIndex_;
    /**
     * <code>uint32 bornSlotIndex = 2;</code>
     * @return The bornSlotIndex.
     */
    @java.lang.Override
    public int getBornSlotIndex() {
      return bornSlotIndex_;
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
      if (masterEntityId_ != 0) {
        output.writeUInt32(1, masterEntityId_);
      }
      if (bornSlotIndex_ != 0) {
        output.writeUInt32(2, bornSlotIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (masterEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, masterEntityId_);
      }
      if (bornSlotIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, bornSlotIndex_);
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
      if (!(obj instanceof ServantInfoOuterClass.ServantInfo)) {
        return super.equals(obj);
      }
      ServantInfoOuterClass.ServantInfo other = (ServantInfoOuterClass.ServantInfo) obj;

      if (getMasterEntityId()
          != other.getMasterEntityId()) return false;
      if (getBornSlotIndex()
          != other.getBornSlotIndex()) return false;
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
      hash = (37 * hash) + MASTERENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getMasterEntityId();
      hash = (37 * hash) + BORNSLOTINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getBornSlotIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServantInfoOuterClass.ServantInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServantInfoOuterClass.ServantInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServantInfoOuterClass.ServantInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServantInfoOuterClass.ServantInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServantInfoOuterClass.ServantInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServantInfoOuterClass.ServantInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServantInfoOuterClass.ServantInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServantInfoOuterClass.ServantInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServantInfoOuterClass.ServantInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServantInfoOuterClass.ServantInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServantInfoOuterClass.ServantInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServantInfoOuterClass.ServantInfo parseFrom(
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
    public static Builder newBuilder(ServantInfoOuterClass.ServantInfo prototype) {
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
     * Protobuf type {@code ServantInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ServantInfo)
        ServantInfoOuterClass.ServantInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServantInfoOuterClass.internal_static_ServantInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServantInfoOuterClass.internal_static_ServantInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServantInfoOuterClass.ServantInfo.class, ServantInfoOuterClass.ServantInfo.Builder.class);
      }

      // Construct using ServantInfoOuterClass.ServantInfo.newBuilder()
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
        masterEntityId_ = 0;

        bornSlotIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServantInfoOuterClass.internal_static_ServantInfo_descriptor;
      }

      @java.lang.Override
      public ServantInfoOuterClass.ServantInfo getDefaultInstanceForType() {
        return ServantInfoOuterClass.ServantInfo.getDefaultInstance();
      }

      @java.lang.Override
      public ServantInfoOuterClass.ServantInfo build() {
        ServantInfoOuterClass.ServantInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServantInfoOuterClass.ServantInfo buildPartial() {
        ServantInfoOuterClass.ServantInfo result = new ServantInfoOuterClass.ServantInfo(this);
        result.masterEntityId_ = masterEntityId_;
        result.bornSlotIndex_ = bornSlotIndex_;
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
        if (other instanceof ServantInfoOuterClass.ServantInfo) {
          return mergeFrom((ServantInfoOuterClass.ServantInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServantInfoOuterClass.ServantInfo other) {
        if (other == ServantInfoOuterClass.ServantInfo.getDefaultInstance()) return this;
        if (other.getMasterEntityId() != 0) {
          setMasterEntityId(other.getMasterEntityId());
        }
        if (other.getBornSlotIndex() != 0) {
          setBornSlotIndex(other.getBornSlotIndex());
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
        ServantInfoOuterClass.ServantInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServantInfoOuterClass.ServantInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int masterEntityId_ ;
      /**
       * <code>uint32 masterEntityId = 1;</code>
       * @return The masterEntityId.
       */
      @java.lang.Override
      public int getMasterEntityId() {
        return masterEntityId_;
      }
      /**
       * <code>uint32 masterEntityId = 1;</code>
       * @param value The masterEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setMasterEntityId(int value) {
        
        masterEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 masterEntityId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMasterEntityId() {
        
        masterEntityId_ = 0;
        onChanged();
        return this;
      }

      private int bornSlotIndex_ ;
      /**
       * <code>uint32 bornSlotIndex = 2;</code>
       * @return The bornSlotIndex.
       */
      @java.lang.Override
      public int getBornSlotIndex() {
        return bornSlotIndex_;
      }
      /**
       * <code>uint32 bornSlotIndex = 2;</code>
       * @param value The bornSlotIndex to set.
       * @return This builder for chaining.
       */
      public Builder setBornSlotIndex(int value) {
        
        bornSlotIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bornSlotIndex = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBornSlotIndex() {
        
        bornSlotIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ServantInfo)
    }

    // @@protoc_insertion_point(class_scope:ServantInfo)
    private static final ServantInfoOuterClass.ServantInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServantInfoOuterClass.ServantInfo();
    }

    public static ServantInfoOuterClass.ServantInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServantInfo>
        PARSER = new com.google.protobuf.AbstractParser<ServantInfo>() {
      @java.lang.Override
      public ServantInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServantInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ServantInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServantInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServantInfoOuterClass.ServantInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServantInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServantInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ServantInfo.proto\"<\n\013ServantInfo\022\026\n\016ma" +
      "sterEntityId\030\001 \001(\r\022\025\n\rbornSlotIndex\030\002 \001(" +
      "\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ServantInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServantInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServantInfo_descriptor,
        new java.lang.String[] { "MasterEntityId", "BornSlotIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
