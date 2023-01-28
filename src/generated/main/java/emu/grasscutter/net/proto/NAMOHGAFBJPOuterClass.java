// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NAMOHGAFBJP.proto

public final class NAMOHGAFBJPOuterClass {
  private NAMOHGAFBJPOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NAMOHGAFBJPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NAMOHGAFBJP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 blockId = 14;</code>
     * @return The blockId.
     */
    int getBlockId();

    /**
     * <code>uint32 khhhdmmmcjn = 13;</code>
     * @return The khhhdmmmcjn.
     */
    int getKhhhdmmmcjn();
  }
  /**
   * Protobuf type {@code NAMOHGAFBJP}
   */
  public static final class NAMOHGAFBJP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NAMOHGAFBJP)
      NAMOHGAFBJPOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NAMOHGAFBJP.newBuilder() to construct.
    private NAMOHGAFBJP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NAMOHGAFBJP() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NAMOHGAFBJP();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NAMOHGAFBJP(
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
            case 104: {

              khhhdmmmcjn_ = input.readUInt32();
              break;
            }
            case 112: {

              blockId_ = input.readUInt32();
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
      return NAMOHGAFBJPOuterClass.internal_static_NAMOHGAFBJP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NAMOHGAFBJPOuterClass.internal_static_NAMOHGAFBJP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NAMOHGAFBJPOuterClass.NAMOHGAFBJP.class, NAMOHGAFBJPOuterClass.NAMOHGAFBJP.Builder.class);
    }

    public static final int BLOCKID_FIELD_NUMBER = 14;
    private int blockId_;
    /**
     * <code>uint32 blockId = 14;</code>
     * @return The blockId.
     */
    @java.lang.Override
    public int getBlockId() {
      return blockId_;
    }

    public static final int KHHHDMMMCJN_FIELD_NUMBER = 13;
    private int khhhdmmmcjn_;
    /**
     * <code>uint32 khhhdmmmcjn = 13;</code>
     * @return The khhhdmmmcjn.
     */
    @java.lang.Override
    public int getKhhhdmmmcjn() {
      return khhhdmmmcjn_;
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
      if (khhhdmmmcjn_ != 0) {
        output.writeUInt32(13, khhhdmmmcjn_);
      }
      if (blockId_ != 0) {
        output.writeUInt32(14, blockId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (khhhdmmmcjn_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, khhhdmmmcjn_);
      }
      if (blockId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, blockId_);
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
      if (!(obj instanceof NAMOHGAFBJPOuterClass.NAMOHGAFBJP)) {
        return super.equals(obj);
      }
      NAMOHGAFBJPOuterClass.NAMOHGAFBJP other = (NAMOHGAFBJPOuterClass.NAMOHGAFBJP) obj;

      if (getBlockId()
          != other.getBlockId()) return false;
      if (getKhhhdmmmcjn()
          != other.getKhhhdmmmcjn()) return false;
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
      hash = (37 * hash) + BLOCKID_FIELD_NUMBER;
      hash = (53 * hash) + getBlockId();
      hash = (37 * hash) + KHHHDMMMCJN_FIELD_NUMBER;
      hash = (53 * hash) + getKhhhdmmmcjn();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NAMOHGAFBJPOuterClass.NAMOHGAFBJP parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NAMOHGAFBJPOuterClass.NAMOHGAFBJP parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NAMOHGAFBJPOuterClass.NAMOHGAFBJP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NAMOHGAFBJPOuterClass.NAMOHGAFBJP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NAMOHGAFBJPOuterClass.NAMOHGAFBJP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NAMOHGAFBJPOuterClass.NAMOHGAFBJP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NAMOHGAFBJPOuterClass.NAMOHGAFBJP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NAMOHGAFBJPOuterClass.NAMOHGAFBJP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NAMOHGAFBJPOuterClass.NAMOHGAFBJP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NAMOHGAFBJPOuterClass.NAMOHGAFBJP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NAMOHGAFBJPOuterClass.NAMOHGAFBJP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NAMOHGAFBJPOuterClass.NAMOHGAFBJP parseFrom(
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
    public static Builder newBuilder(NAMOHGAFBJPOuterClass.NAMOHGAFBJP prototype) {
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
     * Protobuf type {@code NAMOHGAFBJP}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NAMOHGAFBJP)
        NAMOHGAFBJPOuterClass.NAMOHGAFBJPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NAMOHGAFBJPOuterClass.internal_static_NAMOHGAFBJP_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NAMOHGAFBJPOuterClass.internal_static_NAMOHGAFBJP_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NAMOHGAFBJPOuterClass.NAMOHGAFBJP.class, NAMOHGAFBJPOuterClass.NAMOHGAFBJP.Builder.class);
      }

      // Construct using NAMOHGAFBJPOuterClass.NAMOHGAFBJP.newBuilder()
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
        blockId_ = 0;

        khhhdmmmcjn_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NAMOHGAFBJPOuterClass.internal_static_NAMOHGAFBJP_descriptor;
      }

      @java.lang.Override
      public NAMOHGAFBJPOuterClass.NAMOHGAFBJP getDefaultInstanceForType() {
        return NAMOHGAFBJPOuterClass.NAMOHGAFBJP.getDefaultInstance();
      }

      @java.lang.Override
      public NAMOHGAFBJPOuterClass.NAMOHGAFBJP build() {
        NAMOHGAFBJPOuterClass.NAMOHGAFBJP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NAMOHGAFBJPOuterClass.NAMOHGAFBJP buildPartial() {
        NAMOHGAFBJPOuterClass.NAMOHGAFBJP result = new NAMOHGAFBJPOuterClass.NAMOHGAFBJP(this);
        result.blockId_ = blockId_;
        result.khhhdmmmcjn_ = khhhdmmmcjn_;
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
        if (other instanceof NAMOHGAFBJPOuterClass.NAMOHGAFBJP) {
          return mergeFrom((NAMOHGAFBJPOuterClass.NAMOHGAFBJP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NAMOHGAFBJPOuterClass.NAMOHGAFBJP other) {
        if (other == NAMOHGAFBJPOuterClass.NAMOHGAFBJP.getDefaultInstance()) return this;
        if (other.getBlockId() != 0) {
          setBlockId(other.getBlockId());
        }
        if (other.getKhhhdmmmcjn() != 0) {
          setKhhhdmmmcjn(other.getKhhhdmmmcjn());
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
        NAMOHGAFBJPOuterClass.NAMOHGAFBJP parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NAMOHGAFBJPOuterClass.NAMOHGAFBJP) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int blockId_ ;
      /**
       * <code>uint32 blockId = 14;</code>
       * @return The blockId.
       */
      @java.lang.Override
      public int getBlockId() {
        return blockId_;
      }
      /**
       * <code>uint32 blockId = 14;</code>
       * @param value The blockId to set.
       * @return This builder for chaining.
       */
      public Builder setBlockId(int value) {
        
        blockId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 blockId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearBlockId() {
        
        blockId_ = 0;
        onChanged();
        return this;
      }

      private int khhhdmmmcjn_ ;
      /**
       * <code>uint32 khhhdmmmcjn = 13;</code>
       * @return The khhhdmmmcjn.
       */
      @java.lang.Override
      public int getKhhhdmmmcjn() {
        return khhhdmmmcjn_;
      }
      /**
       * <code>uint32 khhhdmmmcjn = 13;</code>
       * @param value The khhhdmmmcjn to set.
       * @return This builder for chaining.
       */
      public Builder setKhhhdmmmcjn(int value) {
        
        khhhdmmmcjn_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 khhhdmmmcjn = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearKhhhdmmmcjn() {
        
        khhhdmmmcjn_ = 0;
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


      // @@protoc_insertion_point(builder_scope:NAMOHGAFBJP)
    }

    // @@protoc_insertion_point(class_scope:NAMOHGAFBJP)
    private static final NAMOHGAFBJPOuterClass.NAMOHGAFBJP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NAMOHGAFBJPOuterClass.NAMOHGAFBJP();
    }

    public static NAMOHGAFBJPOuterClass.NAMOHGAFBJP getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NAMOHGAFBJP>
        PARSER = new com.google.protobuf.AbstractParser<NAMOHGAFBJP>() {
      @java.lang.Override
      public NAMOHGAFBJP parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NAMOHGAFBJP(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NAMOHGAFBJP> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NAMOHGAFBJP> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NAMOHGAFBJPOuterClass.NAMOHGAFBJP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NAMOHGAFBJP_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NAMOHGAFBJP_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NAMOHGAFBJP.proto\"3\n\013NAMOHGAFBJP\022\017\n\007bl" +
      "ockId\030\016 \001(\r\022\023\n\013khhhdmmmcjn\030\r \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NAMOHGAFBJP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NAMOHGAFBJP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NAMOHGAFBJP_descriptor,
        new java.lang.String[] { "BlockId", "Khhhdmmmcjn", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
