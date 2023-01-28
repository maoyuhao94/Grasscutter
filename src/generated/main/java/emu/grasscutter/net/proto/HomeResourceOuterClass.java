// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeResource.proto

public final class HomeResourceOuterClass {
  private HomeResourceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeResourceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeResource)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 storeLimit = 15;</code>
     * @return The storeLimit.
     */
    int getStoreLimit();

    /**
     * <code>uint32 storeValue = 10;</code>
     * @return The storeValue.
     */
    int getStoreValue();

    /**
     * <code>uint32 nextRefreshTime = 1;</code>
     * @return The nextRefreshTime.
     */
    int getNextRefreshTime();
  }
  /**
   * Protobuf type {@code HomeResource}
   */
  public static final class HomeResource extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeResource)
      HomeResourceOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeResource.newBuilder() to construct.
    private HomeResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeResource() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeResource();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeResource(
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

              nextRefreshTime_ = input.readUInt32();
              break;
            }
            case 80: {

              storeValue_ = input.readUInt32();
              break;
            }
            case 120: {

              storeLimit_ = input.readUInt32();
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
      return HomeResourceOuterClass.internal_static_HomeResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HomeResourceOuterClass.internal_static_HomeResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HomeResourceOuterClass.HomeResource.class, HomeResourceOuterClass.HomeResource.Builder.class);
    }

    public static final int STORELIMIT_FIELD_NUMBER = 15;
    private int storeLimit_;
    /**
     * <code>uint32 storeLimit = 15;</code>
     * @return The storeLimit.
     */
    @java.lang.Override
    public int getStoreLimit() {
      return storeLimit_;
    }

    public static final int STOREVALUE_FIELD_NUMBER = 10;
    private int storeValue_;
    /**
     * <code>uint32 storeValue = 10;</code>
     * @return The storeValue.
     */
    @java.lang.Override
    public int getStoreValue() {
      return storeValue_;
    }

    public static final int NEXTREFRESHTIME_FIELD_NUMBER = 1;
    private int nextRefreshTime_;
    /**
     * <code>uint32 nextRefreshTime = 1;</code>
     * @return The nextRefreshTime.
     */
    @java.lang.Override
    public int getNextRefreshTime() {
      return nextRefreshTime_;
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
      if (nextRefreshTime_ != 0) {
        output.writeUInt32(1, nextRefreshTime_);
      }
      if (storeValue_ != 0) {
        output.writeUInt32(10, storeValue_);
      }
      if (storeLimit_ != 0) {
        output.writeUInt32(15, storeLimit_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nextRefreshTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, nextRefreshTime_);
      }
      if (storeValue_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, storeValue_);
      }
      if (storeLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, storeLimit_);
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
      if (!(obj instanceof HomeResourceOuterClass.HomeResource)) {
        return super.equals(obj);
      }
      HomeResourceOuterClass.HomeResource other = (HomeResourceOuterClass.HomeResource) obj;

      if (getStoreLimit()
          != other.getStoreLimit()) return false;
      if (getStoreValue()
          != other.getStoreValue()) return false;
      if (getNextRefreshTime()
          != other.getNextRefreshTime()) return false;
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
      hash = (37 * hash) + STORELIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getStoreLimit();
      hash = (37 * hash) + STOREVALUE_FIELD_NUMBER;
      hash = (53 * hash) + getStoreValue();
      hash = (37 * hash) + NEXTREFRESHTIME_FIELD_NUMBER;
      hash = (53 * hash) + getNextRefreshTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HomeResourceOuterClass.HomeResource parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeResourceOuterClass.HomeResource parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeResourceOuterClass.HomeResource parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeResourceOuterClass.HomeResource parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeResourceOuterClass.HomeResource parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeResourceOuterClass.HomeResource parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeResourceOuterClass.HomeResource parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeResourceOuterClass.HomeResource parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeResourceOuterClass.HomeResource parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static HomeResourceOuterClass.HomeResource parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeResourceOuterClass.HomeResource parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeResourceOuterClass.HomeResource parseFrom(
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
    public static Builder newBuilder(HomeResourceOuterClass.HomeResource prototype) {
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
     * Protobuf type {@code HomeResource}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeResource)
        HomeResourceOuterClass.HomeResourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HomeResourceOuterClass.internal_static_HomeResource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HomeResourceOuterClass.internal_static_HomeResource_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HomeResourceOuterClass.HomeResource.class, HomeResourceOuterClass.HomeResource.Builder.class);
      }

      // Construct using HomeResourceOuterClass.HomeResource.newBuilder()
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
        storeLimit_ = 0;

        storeValue_ = 0;

        nextRefreshTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HomeResourceOuterClass.internal_static_HomeResource_descriptor;
      }

      @java.lang.Override
      public HomeResourceOuterClass.HomeResource getDefaultInstanceForType() {
        return HomeResourceOuterClass.HomeResource.getDefaultInstance();
      }

      @java.lang.Override
      public HomeResourceOuterClass.HomeResource build() {
        HomeResourceOuterClass.HomeResource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public HomeResourceOuterClass.HomeResource buildPartial() {
        HomeResourceOuterClass.HomeResource result = new HomeResourceOuterClass.HomeResource(this);
        result.storeLimit_ = storeLimit_;
        result.storeValue_ = storeValue_;
        result.nextRefreshTime_ = nextRefreshTime_;
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
        if (other instanceof HomeResourceOuterClass.HomeResource) {
          return mergeFrom((HomeResourceOuterClass.HomeResource)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HomeResourceOuterClass.HomeResource other) {
        if (other == HomeResourceOuterClass.HomeResource.getDefaultInstance()) return this;
        if (other.getStoreLimit() != 0) {
          setStoreLimit(other.getStoreLimit());
        }
        if (other.getStoreValue() != 0) {
          setStoreValue(other.getStoreValue());
        }
        if (other.getNextRefreshTime() != 0) {
          setNextRefreshTime(other.getNextRefreshTime());
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
        HomeResourceOuterClass.HomeResource parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HomeResourceOuterClass.HomeResource) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int storeLimit_ ;
      /**
       * <code>uint32 storeLimit = 15;</code>
       * @return The storeLimit.
       */
      @java.lang.Override
      public int getStoreLimit() {
        return storeLimit_;
      }
      /**
       * <code>uint32 storeLimit = 15;</code>
       * @param value The storeLimit to set.
       * @return This builder for chaining.
       */
      public Builder setStoreLimit(int value) {
        
        storeLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 storeLimit = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearStoreLimit() {
        
        storeLimit_ = 0;
        onChanged();
        return this;
      }

      private int storeValue_ ;
      /**
       * <code>uint32 storeValue = 10;</code>
       * @return The storeValue.
       */
      @java.lang.Override
      public int getStoreValue() {
        return storeValue_;
      }
      /**
       * <code>uint32 storeValue = 10;</code>
       * @param value The storeValue to set.
       * @return This builder for chaining.
       */
      public Builder setStoreValue(int value) {
        
        storeValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 storeValue = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearStoreValue() {
        
        storeValue_ = 0;
        onChanged();
        return this;
      }

      private int nextRefreshTime_ ;
      /**
       * <code>uint32 nextRefreshTime = 1;</code>
       * @return The nextRefreshTime.
       */
      @java.lang.Override
      public int getNextRefreshTime() {
        return nextRefreshTime_;
      }
      /**
       * <code>uint32 nextRefreshTime = 1;</code>
       * @param value The nextRefreshTime to set.
       * @return This builder for chaining.
       */
      public Builder setNextRefreshTime(int value) {
        
        nextRefreshTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 nextRefreshTime = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNextRefreshTime() {
        
        nextRefreshTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeResource)
    }

    // @@protoc_insertion_point(class_scope:HomeResource)
    private static final HomeResourceOuterClass.HomeResource DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HomeResourceOuterClass.HomeResource();
    }

    public static HomeResourceOuterClass.HomeResource getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeResource>
        PARSER = new com.google.protobuf.AbstractParser<HomeResource>() {
      @java.lang.Override
      public HomeResource parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeResource(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeResource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeResource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public HomeResourceOuterClass.HomeResource getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeResource_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeResource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022HomeResource.proto\"O\n\014HomeResource\022\022\n\n" +
      "storeLimit\030\017 \001(\r\022\022\n\nstoreValue\030\n \001(\r\022\027\n\017" +
      "nextRefreshTime\030\001 \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeResource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeResource_descriptor,
        new java.lang.String[] { "StoreLimit", "StoreValue", "NextRefreshTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
