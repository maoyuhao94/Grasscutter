// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NALEOFHPMKN.proto

public final class NALEOFHPMKNOuterClass {
  private NALEOFHPMKNOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NALEOFHPMKNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NALEOFHPMKN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 aeppldffjcf = 5;</code>
     * @return The aeppldffjcf.
     */
    int getAeppldffjcf();

    /**
     * <code>uint32 ilhofemcpji = 7;</code>
     * @return The ilhofemcpji.
     */
    int getIlhofemcpji();
  }
  /**
   * Protobuf type {@code NALEOFHPMKN}
   */
  public static final class NALEOFHPMKN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NALEOFHPMKN)
      NALEOFHPMKNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NALEOFHPMKN.newBuilder() to construct.
    private NALEOFHPMKN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NALEOFHPMKN() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NALEOFHPMKN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NALEOFHPMKN(
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
            case 40: {

              aeppldffjcf_ = input.readUInt32();
              break;
            }
            case 56: {

              ilhofemcpji_ = input.readUInt32();
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
      return NALEOFHPMKNOuterClass.internal_static_NALEOFHPMKN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NALEOFHPMKNOuterClass.internal_static_NALEOFHPMKN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NALEOFHPMKNOuterClass.NALEOFHPMKN.class, NALEOFHPMKNOuterClass.NALEOFHPMKN.Builder.class);
    }

    public static final int AEPPLDFFJCF_FIELD_NUMBER = 5;
    private int aeppldffjcf_;
    /**
     * <code>uint32 aeppldffjcf = 5;</code>
     * @return The aeppldffjcf.
     */
    @java.lang.Override
    public int getAeppldffjcf() {
      return aeppldffjcf_;
    }

    public static final int ILHOFEMCPJI_FIELD_NUMBER = 7;
    private int ilhofemcpji_;
    /**
     * <code>uint32 ilhofemcpji = 7;</code>
     * @return The ilhofemcpji.
     */
    @java.lang.Override
    public int getIlhofemcpji() {
      return ilhofemcpji_;
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
      if (aeppldffjcf_ != 0) {
        output.writeUInt32(5, aeppldffjcf_);
      }
      if (ilhofemcpji_ != 0) {
        output.writeUInt32(7, ilhofemcpji_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (aeppldffjcf_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, aeppldffjcf_);
      }
      if (ilhofemcpji_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, ilhofemcpji_);
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
      if (!(obj instanceof NALEOFHPMKNOuterClass.NALEOFHPMKN)) {
        return super.equals(obj);
      }
      NALEOFHPMKNOuterClass.NALEOFHPMKN other = (NALEOFHPMKNOuterClass.NALEOFHPMKN) obj;

      if (getAeppldffjcf()
          != other.getAeppldffjcf()) return false;
      if (getIlhofemcpji()
          != other.getIlhofemcpji()) return false;
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
      hash = (37 * hash) + AEPPLDFFJCF_FIELD_NUMBER;
      hash = (53 * hash) + getAeppldffjcf();
      hash = (37 * hash) + ILHOFEMCPJI_FIELD_NUMBER;
      hash = (53 * hash) + getIlhofemcpji();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NALEOFHPMKNOuterClass.NALEOFHPMKN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NALEOFHPMKNOuterClass.NALEOFHPMKN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NALEOFHPMKNOuterClass.NALEOFHPMKN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NALEOFHPMKNOuterClass.NALEOFHPMKN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NALEOFHPMKNOuterClass.NALEOFHPMKN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NALEOFHPMKNOuterClass.NALEOFHPMKN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NALEOFHPMKNOuterClass.NALEOFHPMKN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NALEOFHPMKNOuterClass.NALEOFHPMKN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static NALEOFHPMKNOuterClass.NALEOFHPMKN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static NALEOFHPMKNOuterClass.NALEOFHPMKN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NALEOFHPMKNOuterClass.NALEOFHPMKN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static NALEOFHPMKNOuterClass.NALEOFHPMKN parseFrom(
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
    public static Builder newBuilder(NALEOFHPMKNOuterClass.NALEOFHPMKN prototype) {
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
     * Protobuf type {@code NALEOFHPMKN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NALEOFHPMKN)
        NALEOFHPMKNOuterClass.NALEOFHPMKNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NALEOFHPMKNOuterClass.internal_static_NALEOFHPMKN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NALEOFHPMKNOuterClass.internal_static_NALEOFHPMKN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NALEOFHPMKNOuterClass.NALEOFHPMKN.class, NALEOFHPMKNOuterClass.NALEOFHPMKN.Builder.class);
      }

      // Construct using NALEOFHPMKNOuterClass.NALEOFHPMKN.newBuilder()
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
        aeppldffjcf_ = 0;

        ilhofemcpji_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NALEOFHPMKNOuterClass.internal_static_NALEOFHPMKN_descriptor;
      }

      @java.lang.Override
      public NALEOFHPMKNOuterClass.NALEOFHPMKN getDefaultInstanceForType() {
        return NALEOFHPMKNOuterClass.NALEOFHPMKN.getDefaultInstance();
      }

      @java.lang.Override
      public NALEOFHPMKNOuterClass.NALEOFHPMKN build() {
        NALEOFHPMKNOuterClass.NALEOFHPMKN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public NALEOFHPMKNOuterClass.NALEOFHPMKN buildPartial() {
        NALEOFHPMKNOuterClass.NALEOFHPMKN result = new NALEOFHPMKNOuterClass.NALEOFHPMKN(this);
        result.aeppldffjcf_ = aeppldffjcf_;
        result.ilhofemcpji_ = ilhofemcpji_;
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
        if (other instanceof NALEOFHPMKNOuterClass.NALEOFHPMKN) {
          return mergeFrom((NALEOFHPMKNOuterClass.NALEOFHPMKN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NALEOFHPMKNOuterClass.NALEOFHPMKN other) {
        if (other == NALEOFHPMKNOuterClass.NALEOFHPMKN.getDefaultInstance()) return this;
        if (other.getAeppldffjcf() != 0) {
          setAeppldffjcf(other.getAeppldffjcf());
        }
        if (other.getIlhofemcpji() != 0) {
          setIlhofemcpji(other.getIlhofemcpji());
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
        NALEOFHPMKNOuterClass.NALEOFHPMKN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (NALEOFHPMKNOuterClass.NALEOFHPMKN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int aeppldffjcf_ ;
      /**
       * <code>uint32 aeppldffjcf = 5;</code>
       * @return The aeppldffjcf.
       */
      @java.lang.Override
      public int getAeppldffjcf() {
        return aeppldffjcf_;
      }
      /**
       * <code>uint32 aeppldffjcf = 5;</code>
       * @param value The aeppldffjcf to set.
       * @return This builder for chaining.
       */
      public Builder setAeppldffjcf(int value) {
        
        aeppldffjcf_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 aeppldffjcf = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAeppldffjcf() {
        
        aeppldffjcf_ = 0;
        onChanged();
        return this;
      }

      private int ilhofemcpji_ ;
      /**
       * <code>uint32 ilhofemcpji = 7;</code>
       * @return The ilhofemcpji.
       */
      @java.lang.Override
      public int getIlhofemcpji() {
        return ilhofemcpji_;
      }
      /**
       * <code>uint32 ilhofemcpji = 7;</code>
       * @param value The ilhofemcpji to set.
       * @return This builder for chaining.
       */
      public Builder setIlhofemcpji(int value) {
        
        ilhofemcpji_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ilhofemcpji = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIlhofemcpji() {
        
        ilhofemcpji_ = 0;
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


      // @@protoc_insertion_point(builder_scope:NALEOFHPMKN)
    }

    // @@protoc_insertion_point(class_scope:NALEOFHPMKN)
    private static final NALEOFHPMKNOuterClass.NALEOFHPMKN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NALEOFHPMKNOuterClass.NALEOFHPMKN();
    }

    public static NALEOFHPMKNOuterClass.NALEOFHPMKN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NALEOFHPMKN>
        PARSER = new com.google.protobuf.AbstractParser<NALEOFHPMKN>() {
      @java.lang.Override
      public NALEOFHPMKN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NALEOFHPMKN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NALEOFHPMKN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NALEOFHPMKN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public NALEOFHPMKNOuterClass.NALEOFHPMKN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NALEOFHPMKN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NALEOFHPMKN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NALEOFHPMKN.proto\"7\n\013NALEOFHPMKN\022\023\n\013ae" +
      "ppldffjcf\030\005 \001(\r\022\023\n\013ilhofemcpji\030\007 \001(\rb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NALEOFHPMKN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NALEOFHPMKN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NALEOFHPMKN_descriptor,
        new java.lang.String[] { "Aeppldffjcf", "Ilhofemcpji", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
