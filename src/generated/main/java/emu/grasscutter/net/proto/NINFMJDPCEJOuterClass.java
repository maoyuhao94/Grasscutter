// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NINFMJDPCEJ.proto

public final class NINFMJDPCEJOuterClass {
  private NINFMJDPCEJOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NINFMJDPCEJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NINFMJDPCEJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float gookfcglmjd = 13;</code>
     * @return The gookfcglmjd.
     */
    float getGookfcglmjd();
  }
  /**
   * Protobuf type {@code NINFMJDPCEJ}
   */
  public static final class NINFMJDPCEJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NINFMJDPCEJ)
      NINFMJDPCEJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NINFMJDPCEJ.newBuilder() to construct.
    private NINFMJDPCEJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NINFMJDPCEJ() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NINFMJDPCEJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NINFMJDPCEJ(
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
            case 109: {

              gookfcglmjd_ = input.readFloat();
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
      return NINFMJDPCEJOuterClass.internal_static_NINFMJDPCEJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NINFMJDPCEJOuterClass.internal_static_NINFMJDPCEJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NINFMJDPCEJOuterClass.NINFMJDPCEJ.class, NINFMJDPCEJOuterClass.NINFMJDPCEJ.Builder.class);
    }

    public static final int GOOKFCGLMJD_FIELD_NUMBER = 13;
    private float gookfcglmjd_;
    /**
     * <code>float gookfcglmjd = 13;</code>
     * @return The gookfcglmjd.
     */
    @java.lang.Override
    public float getGookfcglmjd() {
      return gookfcglmjd_;
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
      if (java.lang.Float.floatToRawIntBits(gookfcglmjd_) != 0) {
        output.writeFloat(13, gookfcglmjd_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(gookfcglmjd_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(13, gookfcglmjd_);
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
      if (!(obj instanceof NINFMJDPCEJOuterClass.NINFMJDPCEJ)) {
        return super.equals(obj);
      }
      NINFMJDPCEJOuterClass.NINFMJDPCEJ other = (NINFMJDPCEJOuterClass.NINFMJDPCEJ) obj;

      if (java.lang.Float.floatToIntBits(getGookfcglmjd())
          != java.lang.Float.floatToIntBits(
              other.getGookfcglmjd())) return false;
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
      hash = (37 * hash) + GOOKFCGLMJD_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getGookfcglmjd());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NINFMJDPCEJOuterClass.NINFMJDPCEJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NINFMJDPCEJOuterClass.NINFMJDPCEJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NINFMJDPCEJOuterClass.NINFMJDPCEJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NINFMJDPCEJOuterClass.NINFMJDPCEJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NINFMJDPCEJOuterClass.NINFMJDPCEJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NINFMJDPCEJOuterClass.NINFMJDPCEJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NINFMJDPCEJOuterClass.NINFMJDPCEJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NINFMJDPCEJOuterClass.NINFMJDPCEJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NINFMJDPCEJOuterClass.NINFMJDPCEJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NINFMJDPCEJOuterClass.NINFMJDPCEJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NINFMJDPCEJOuterClass.NINFMJDPCEJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NINFMJDPCEJOuterClass.NINFMJDPCEJ parseFrom(
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
    public static Builder newBuilder(NINFMJDPCEJOuterClass.NINFMJDPCEJ prototype) {
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
     * Protobuf type {@code NINFMJDPCEJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NINFMJDPCEJ)
        NINFMJDPCEJOuterClass.NINFMJDPCEJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NINFMJDPCEJOuterClass.internal_static_NINFMJDPCEJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NINFMJDPCEJOuterClass.internal_static_NINFMJDPCEJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NINFMJDPCEJOuterClass.NINFMJDPCEJ.class, NINFMJDPCEJOuterClass.NINFMJDPCEJ.Builder.class);
      }

      // Construct using NINFMJDPCEJOuterClass.NINFMJDPCEJ.newBuilder()
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
        gookfcglmjd_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NINFMJDPCEJOuterClass.internal_static_NINFMJDPCEJ_descriptor;
      }

      @java.lang.Override
      public NINFMJDPCEJOuterClass.NINFMJDPCEJ getDefaultInstanceForType() {
        return NINFMJDPCEJOuterClass.NINFMJDPCEJ.getDefaultInstance();
      }

      @java.lang.Override
      public NINFMJDPCEJOuterClass.NINFMJDPCEJ build() {
        NINFMJDPCEJOuterClass.NINFMJDPCEJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NINFMJDPCEJOuterClass.NINFMJDPCEJ buildPartial() {
        NINFMJDPCEJOuterClass.NINFMJDPCEJ result = new NINFMJDPCEJOuterClass.NINFMJDPCEJ(this);
        result.gookfcglmjd_ = gookfcglmjd_;
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
        if (other instanceof NINFMJDPCEJOuterClass.NINFMJDPCEJ) {
          return mergeFrom((NINFMJDPCEJOuterClass.NINFMJDPCEJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NINFMJDPCEJOuterClass.NINFMJDPCEJ other) {
        if (other == NINFMJDPCEJOuterClass.NINFMJDPCEJ.getDefaultInstance()) return this;
        if (other.getGookfcglmjd() != 0F) {
          setGookfcglmjd(other.getGookfcglmjd());
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
        NINFMJDPCEJOuterClass.NINFMJDPCEJ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NINFMJDPCEJOuterClass.NINFMJDPCEJ) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float gookfcglmjd_ ;
      /**
       * <code>float gookfcglmjd = 13;</code>
       * @return The gookfcglmjd.
       */
      @java.lang.Override
      public float getGookfcglmjd() {
        return gookfcglmjd_;
      }
      /**
       * <code>float gookfcglmjd = 13;</code>
       * @param value The gookfcglmjd to set.
       * @return This builder for chaining.
       */
      public Builder setGookfcglmjd(float value) {
        
        gookfcglmjd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float gookfcglmjd = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGookfcglmjd() {
        
        gookfcglmjd_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:NINFMJDPCEJ)
    }

    // @@protoc_insertion_point(class_scope:NINFMJDPCEJ)
    private static final NINFMJDPCEJOuterClass.NINFMJDPCEJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NINFMJDPCEJOuterClass.NINFMJDPCEJ();
    }

    public static NINFMJDPCEJOuterClass.NINFMJDPCEJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NINFMJDPCEJ>
        PARSER = new com.google.protobuf.AbstractParser<NINFMJDPCEJ>() {
      @java.lang.Override
      public NINFMJDPCEJ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NINFMJDPCEJ(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NINFMJDPCEJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NINFMJDPCEJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NINFMJDPCEJOuterClass.NINFMJDPCEJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NINFMJDPCEJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NINFMJDPCEJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NINFMJDPCEJ.proto\"\"\n\013NINFMJDPCEJ\022\023\n\013go" +
      "okfcglmjd\030\r \001(\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NINFMJDPCEJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NINFMJDPCEJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NINFMJDPCEJ_descriptor,
        new java.lang.String[] { "Gookfcglmjd", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
