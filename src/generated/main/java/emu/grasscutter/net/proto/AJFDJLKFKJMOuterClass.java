// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AJFDJLKFKJM.proto

public final class AJFDJLKFKJMOuterClass {
  private AJFDJLKFKJMOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AJFDJLKFKJMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AJFDJLKFKJM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float cjiphccaobe = 9;</code>
     * @return The cjiphccaobe.
     */
    float getCjiphccaobe();
  }
  /**
   * Protobuf type {@code AJFDJLKFKJM}
   */
  public static final class AJFDJLKFKJM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AJFDJLKFKJM)
      AJFDJLKFKJMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AJFDJLKFKJM.newBuilder() to construct.
    private AJFDJLKFKJM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AJFDJLKFKJM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AJFDJLKFKJM();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AJFDJLKFKJM(
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
            case 77: {

              cjiphccaobe_ = input.readFloat();
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
      return AJFDJLKFKJMOuterClass.internal_static_AJFDJLKFKJM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AJFDJLKFKJMOuterClass.internal_static_AJFDJLKFKJM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AJFDJLKFKJMOuterClass.AJFDJLKFKJM.class, AJFDJLKFKJMOuterClass.AJFDJLKFKJM.Builder.class);
    }

    public static final int CJIPHCCAOBE_FIELD_NUMBER = 9;
    private float cjiphccaobe_;
    /**
     * <code>float cjiphccaobe = 9;</code>
     * @return The cjiphccaobe.
     */
    @java.lang.Override
    public float getCjiphccaobe() {
      return cjiphccaobe_;
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
      if (java.lang.Float.floatToRawIntBits(cjiphccaobe_) != 0) {
        output.writeFloat(9, cjiphccaobe_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(cjiphccaobe_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(9, cjiphccaobe_);
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
      if (!(obj instanceof AJFDJLKFKJMOuterClass.AJFDJLKFKJM)) {
        return super.equals(obj);
      }
      AJFDJLKFKJMOuterClass.AJFDJLKFKJM other = (AJFDJLKFKJMOuterClass.AJFDJLKFKJM) obj;

      if (java.lang.Float.floatToIntBits(getCjiphccaobe())
          != java.lang.Float.floatToIntBits(
              other.getCjiphccaobe())) return false;
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
      hash = (37 * hash) + CJIPHCCAOBE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCjiphccaobe());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AJFDJLKFKJMOuterClass.AJFDJLKFKJM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AJFDJLKFKJMOuterClass.AJFDJLKFKJM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AJFDJLKFKJMOuterClass.AJFDJLKFKJM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AJFDJLKFKJMOuterClass.AJFDJLKFKJM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AJFDJLKFKJMOuterClass.AJFDJLKFKJM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AJFDJLKFKJMOuterClass.AJFDJLKFKJM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AJFDJLKFKJMOuterClass.AJFDJLKFKJM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AJFDJLKFKJMOuterClass.AJFDJLKFKJM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static AJFDJLKFKJMOuterClass.AJFDJLKFKJM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static AJFDJLKFKJMOuterClass.AJFDJLKFKJM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AJFDJLKFKJMOuterClass.AJFDJLKFKJM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AJFDJLKFKJMOuterClass.AJFDJLKFKJM parseFrom(
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
    public static Builder newBuilder(AJFDJLKFKJMOuterClass.AJFDJLKFKJM prototype) {
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
     * Protobuf type {@code AJFDJLKFKJM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AJFDJLKFKJM)
        AJFDJLKFKJMOuterClass.AJFDJLKFKJMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AJFDJLKFKJMOuterClass.internal_static_AJFDJLKFKJM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AJFDJLKFKJMOuterClass.internal_static_AJFDJLKFKJM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AJFDJLKFKJMOuterClass.AJFDJLKFKJM.class, AJFDJLKFKJMOuterClass.AJFDJLKFKJM.Builder.class);
      }

      // Construct using AJFDJLKFKJMOuterClass.AJFDJLKFKJM.newBuilder()
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
        cjiphccaobe_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AJFDJLKFKJMOuterClass.internal_static_AJFDJLKFKJM_descriptor;
      }

      @java.lang.Override
      public AJFDJLKFKJMOuterClass.AJFDJLKFKJM getDefaultInstanceForType() {
        return AJFDJLKFKJMOuterClass.AJFDJLKFKJM.getDefaultInstance();
      }

      @java.lang.Override
      public AJFDJLKFKJMOuterClass.AJFDJLKFKJM build() {
        AJFDJLKFKJMOuterClass.AJFDJLKFKJM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public AJFDJLKFKJMOuterClass.AJFDJLKFKJM buildPartial() {
        AJFDJLKFKJMOuterClass.AJFDJLKFKJM result = new AJFDJLKFKJMOuterClass.AJFDJLKFKJM(this);
        result.cjiphccaobe_ = cjiphccaobe_;
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
        if (other instanceof AJFDJLKFKJMOuterClass.AJFDJLKFKJM) {
          return mergeFrom((AJFDJLKFKJMOuterClass.AJFDJLKFKJM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AJFDJLKFKJMOuterClass.AJFDJLKFKJM other) {
        if (other == AJFDJLKFKJMOuterClass.AJFDJLKFKJM.getDefaultInstance()) return this;
        if (other.getCjiphccaobe() != 0F) {
          setCjiphccaobe(other.getCjiphccaobe());
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
        AJFDJLKFKJMOuterClass.AJFDJLKFKJM parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (AJFDJLKFKJMOuterClass.AJFDJLKFKJM) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float cjiphccaobe_ ;
      /**
       * <code>float cjiphccaobe = 9;</code>
       * @return The cjiphccaobe.
       */
      @java.lang.Override
      public float getCjiphccaobe() {
        return cjiphccaobe_;
      }
      /**
       * <code>float cjiphccaobe = 9;</code>
       * @param value The cjiphccaobe to set.
       * @return This builder for chaining.
       */
      public Builder setCjiphccaobe(float value) {
        
        cjiphccaobe_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float cjiphccaobe = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCjiphccaobe() {
        
        cjiphccaobe_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:AJFDJLKFKJM)
    }

    // @@protoc_insertion_point(class_scope:AJFDJLKFKJM)
    private static final AJFDJLKFKJMOuterClass.AJFDJLKFKJM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AJFDJLKFKJMOuterClass.AJFDJLKFKJM();
    }

    public static AJFDJLKFKJMOuterClass.AJFDJLKFKJM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AJFDJLKFKJM>
        PARSER = new com.google.protobuf.AbstractParser<AJFDJLKFKJM>() {
      @java.lang.Override
      public AJFDJLKFKJM parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AJFDJLKFKJM(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AJFDJLKFKJM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AJFDJLKFKJM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public AJFDJLKFKJMOuterClass.AJFDJLKFKJM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AJFDJLKFKJM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AJFDJLKFKJM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021AJFDJLKFKJM.proto\"\"\n\013AJFDJLKFKJM\022\023\n\013cj" +
      "iphccaobe\030\t \001(\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AJFDJLKFKJM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AJFDJLKFKJM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AJFDJLKFKJM_descriptor,
        new java.lang.String[] { "Cjiphccaobe", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
