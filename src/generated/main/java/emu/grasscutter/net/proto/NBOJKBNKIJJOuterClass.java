// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NBOJKBNKIJJ.proto

public final class NBOJKBNKIJJOuterClass {
  private NBOJKBNKIJJOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NBOJKBNKIJJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NBOJKBNKIJJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 loemgoiedea = 4;</code>
     * @return The loemgoiedea.
     */
    int getLoemgoiedea();
  }
  /**
   * Protobuf type {@code NBOJKBNKIJJ}
   */
  public static final class NBOJKBNKIJJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NBOJKBNKIJJ)
      NBOJKBNKIJJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NBOJKBNKIJJ.newBuilder() to construct.
    private NBOJKBNKIJJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NBOJKBNKIJJ() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NBOJKBNKIJJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NBOJKBNKIJJ(
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

              loemgoiedea_ = input.readUInt32();
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
      return NBOJKBNKIJJOuterClass.internal_static_NBOJKBNKIJJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NBOJKBNKIJJOuterClass.internal_static_NBOJKBNKIJJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NBOJKBNKIJJOuterClass.NBOJKBNKIJJ.class, NBOJKBNKIJJOuterClass.NBOJKBNKIJJ.Builder.class);
    }

    public static final int LOEMGOIEDEA_FIELD_NUMBER = 4;
    private int loemgoiedea_;
    /**
     * <code>uint32 loemgoiedea = 4;</code>
     * @return The loemgoiedea.
     */
    @java.lang.Override
    public int getLoemgoiedea() {
      return loemgoiedea_;
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
      if (loemgoiedea_ != 0) {
        output.writeUInt32(4, loemgoiedea_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (loemgoiedea_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, loemgoiedea_);
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
      if (!(obj instanceof NBOJKBNKIJJOuterClass.NBOJKBNKIJJ)) {
        return super.equals(obj);
      }
      NBOJKBNKIJJOuterClass.NBOJKBNKIJJ other = (NBOJKBNKIJJOuterClass.NBOJKBNKIJJ) obj;

      if (getLoemgoiedea()
          != other.getLoemgoiedea()) return false;
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
      hash = (37 * hash) + LOEMGOIEDEA_FIELD_NUMBER;
      hash = (53 * hash) + getLoemgoiedea();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NBOJKBNKIJJOuterClass.NBOJKBNKIJJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NBOJKBNKIJJOuterClass.NBOJKBNKIJJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NBOJKBNKIJJOuterClass.NBOJKBNKIJJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NBOJKBNKIJJOuterClass.NBOJKBNKIJJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NBOJKBNKIJJOuterClass.NBOJKBNKIJJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NBOJKBNKIJJOuterClass.NBOJKBNKIJJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NBOJKBNKIJJOuterClass.NBOJKBNKIJJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NBOJKBNKIJJOuterClass.NBOJKBNKIJJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NBOJKBNKIJJOuterClass.NBOJKBNKIJJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NBOJKBNKIJJOuterClass.NBOJKBNKIJJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NBOJKBNKIJJOuterClass.NBOJKBNKIJJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NBOJKBNKIJJOuterClass.NBOJKBNKIJJ parseFrom(
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
    public static Builder newBuilder(NBOJKBNKIJJOuterClass.NBOJKBNKIJJ prototype) {
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
     * Protobuf type {@code NBOJKBNKIJJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NBOJKBNKIJJ)
        NBOJKBNKIJJOuterClass.NBOJKBNKIJJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NBOJKBNKIJJOuterClass.internal_static_NBOJKBNKIJJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NBOJKBNKIJJOuterClass.internal_static_NBOJKBNKIJJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NBOJKBNKIJJOuterClass.NBOJKBNKIJJ.class, NBOJKBNKIJJOuterClass.NBOJKBNKIJJ.Builder.class);
      }

      // Construct using NBOJKBNKIJJOuterClass.NBOJKBNKIJJ.newBuilder()
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
        loemgoiedea_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NBOJKBNKIJJOuterClass.internal_static_NBOJKBNKIJJ_descriptor;
      }

      @java.lang.Override
      public NBOJKBNKIJJOuterClass.NBOJKBNKIJJ getDefaultInstanceForType() {
        return NBOJKBNKIJJOuterClass.NBOJKBNKIJJ.getDefaultInstance();
      }

      @java.lang.Override
      public NBOJKBNKIJJOuterClass.NBOJKBNKIJJ build() {
        NBOJKBNKIJJOuterClass.NBOJKBNKIJJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NBOJKBNKIJJOuterClass.NBOJKBNKIJJ buildPartial() {
        NBOJKBNKIJJOuterClass.NBOJKBNKIJJ result = new NBOJKBNKIJJOuterClass.NBOJKBNKIJJ(this);
        result.loemgoiedea_ = loemgoiedea_;
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
        if (other instanceof NBOJKBNKIJJOuterClass.NBOJKBNKIJJ) {
          return mergeFrom((NBOJKBNKIJJOuterClass.NBOJKBNKIJJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NBOJKBNKIJJOuterClass.NBOJKBNKIJJ other) {
        if (other == NBOJKBNKIJJOuterClass.NBOJKBNKIJJ.getDefaultInstance()) return this;
        if (other.getLoemgoiedea() != 0) {
          setLoemgoiedea(other.getLoemgoiedea());
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
        NBOJKBNKIJJOuterClass.NBOJKBNKIJJ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NBOJKBNKIJJOuterClass.NBOJKBNKIJJ) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int loemgoiedea_ ;
      /**
       * <code>uint32 loemgoiedea = 4;</code>
       * @return The loemgoiedea.
       */
      @java.lang.Override
      public int getLoemgoiedea() {
        return loemgoiedea_;
      }
      /**
       * <code>uint32 loemgoiedea = 4;</code>
       * @param value The loemgoiedea to set.
       * @return This builder for chaining.
       */
      public Builder setLoemgoiedea(int value) {
        
        loemgoiedea_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 loemgoiedea = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLoemgoiedea() {
        
        loemgoiedea_ = 0;
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


      // @@protoc_insertion_point(builder_scope:NBOJKBNKIJJ)
    }

    // @@protoc_insertion_point(class_scope:NBOJKBNKIJJ)
    private static final NBOJKBNKIJJOuterClass.NBOJKBNKIJJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NBOJKBNKIJJOuterClass.NBOJKBNKIJJ();
    }

    public static NBOJKBNKIJJOuterClass.NBOJKBNKIJJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NBOJKBNKIJJ>
        PARSER = new com.google.protobuf.AbstractParser<NBOJKBNKIJJ>() {
      @java.lang.Override
      public NBOJKBNKIJJ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NBOJKBNKIJJ(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NBOJKBNKIJJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NBOJKBNKIJJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NBOJKBNKIJJOuterClass.NBOJKBNKIJJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NBOJKBNKIJJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NBOJKBNKIJJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NBOJKBNKIJJ.proto\"\"\n\013NBOJKBNKIJJ\022\023\n\013lo" +
      "emgoiedea\030\004 \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NBOJKBNKIJJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NBOJKBNKIJJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NBOJKBNKIJJ_descriptor,
        new java.lang.String[] { "Loemgoiedea", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
