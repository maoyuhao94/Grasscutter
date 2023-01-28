// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3300_ADHENCIFKNI.proto

public final class Unk3300ADHENCIFKNI {
  private Unk3300ADHENCIFKNI() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3300_ADHENCIFKNIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3300_ADHENCIFKNI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 timeStamp = 14;</code>
     * @return The timeStamp.
     */
    long getTimeStamp();

    /**
     * <code>uint32 controllerId = 4;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>uint64 beginTime = 12;</code>
     * @return The beginTime.
     */
    long getBeginTime();
  }
  /**
   * Protobuf type {@code Unk3300_ADHENCIFKNI}
   */
  public static final class Unk3300_ADHENCIFKNI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3300_ADHENCIFKNI)
      Unk3300_ADHENCIFKNIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3300_ADHENCIFKNI.newBuilder() to construct.
    private Unk3300_ADHENCIFKNI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3300_ADHENCIFKNI() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3300_ADHENCIFKNI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3300_ADHENCIFKNI(
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

              controllerId_ = input.readUInt32();
              break;
            }
            case 96: {

              beginTime_ = input.readUInt64();
              break;
            }
            case 112: {

              timeStamp_ = input.readUInt64();
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
      return Unk3300ADHENCIFKNI.internal_static_Unk3300_ADHENCIFKNI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Unk3300ADHENCIFKNI.internal_static_Unk3300_ADHENCIFKNI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI.class, Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI.Builder.class);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 14;
    private long timeStamp_;
    /**
     * <code>uint64 timeStamp = 14;</code>
     * @return The timeStamp.
     */
    @java.lang.Override
    public long getTimeStamp() {
      return timeStamp_;
    }

    public static final int CONTROLLERID_FIELD_NUMBER = 4;
    private int controllerId_;
    /**
     * <code>uint32 controllerId = 4;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int BEGINTIME_FIELD_NUMBER = 12;
    private long beginTime_;
    /**
     * <code>uint64 beginTime = 12;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public long getBeginTime() {
      return beginTime_;
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
      if (controllerId_ != 0) {
        output.writeUInt32(4, controllerId_);
      }
      if (beginTime_ != 0L) {
        output.writeUInt64(12, beginTime_);
      }
      if (timeStamp_ != 0L) {
        output.writeUInt64(14, timeStamp_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, controllerId_);
      }
      if (beginTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(12, beginTime_);
      }
      if (timeStamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(14, timeStamp_);
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
      if (!(obj instanceof Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI)) {
        return super.equals(obj);
      }
      Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI other = (Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI) obj;

      if (getTimeStamp()
          != other.getTimeStamp()) return false;
      if (getControllerId()
          != other.getControllerId()) return false;
      if (getBeginTime()
          != other.getBeginTime()) return false;
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
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimeStamp());
      hash = (37 * hash) + CONTROLLERID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (37 * hash) + BEGINTIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBeginTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI parseFrom(
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
    public static Builder newBuilder(Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI prototype) {
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
     * Protobuf type {@code Unk3300_ADHENCIFKNI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3300_ADHENCIFKNI)
        Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Unk3300ADHENCIFKNI.internal_static_Unk3300_ADHENCIFKNI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Unk3300ADHENCIFKNI.internal_static_Unk3300_ADHENCIFKNI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI.class, Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI.Builder.class);
      }

      // Construct using Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI.newBuilder()
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
        timeStamp_ = 0L;

        controllerId_ = 0;

        beginTime_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Unk3300ADHENCIFKNI.internal_static_Unk3300_ADHENCIFKNI_descriptor;
      }

      @java.lang.Override
      public Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI getDefaultInstanceForType() {
        return Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI.getDefaultInstance();
      }

      @java.lang.Override
      public Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI build() {
        Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI buildPartial() {
        Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI result = new Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI(this);
        result.timeStamp_ = timeStamp_;
        result.controllerId_ = controllerId_;
        result.beginTime_ = beginTime_;
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
        if (other instanceof Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI) {
          return mergeFrom((Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI other) {
        if (other == Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI.getDefaultInstance()) return this;
        if (other.getTimeStamp() != 0L) {
          setTimeStamp(other.getTimeStamp());
        }
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (other.getBeginTime() != 0L) {
          setBeginTime(other.getBeginTime());
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
        Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long timeStamp_ ;
      /**
       * <code>uint64 timeStamp = 14;</code>
       * @return The timeStamp.
       */
      @java.lang.Override
      public long getTimeStamp() {
        return timeStamp_;
      }
      /**
       * <code>uint64 timeStamp = 14;</code>
       * @param value The timeStamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimeStamp(long value) {
        
        timeStamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 timeStamp = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimeStamp() {
        
        timeStamp_ = 0L;
        onChanged();
        return this;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controllerId = 4;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controllerId = 4;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controllerId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private long beginTime_ ;
      /**
       * <code>uint64 beginTime = 12;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public long getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>uint64 beginTime = 12;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(long value) {
        
        beginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 beginTime = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        
        beginTime_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:Unk3300_ADHENCIFKNI)
    }

    // @@protoc_insertion_point(class_scope:Unk3300_ADHENCIFKNI)
    private static final Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI();
    }

    public static Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3300_ADHENCIFKNI>
        PARSER = new com.google.protobuf.AbstractParser<Unk3300_ADHENCIFKNI>() {
      @java.lang.Override
      public Unk3300_ADHENCIFKNI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3300_ADHENCIFKNI(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3300_ADHENCIFKNI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3300_ADHENCIFKNI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3300_ADHENCIFKNI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3300_ADHENCIFKNI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3300_ADHENCIFKNI.proto\"Q\n\023Unk3300_A" +
      "DHENCIFKNI\022\021\n\ttimeStamp\030\016 \001(\004\022\024\n\014control" +
      "lerId\030\004 \001(\r\022\021\n\tbeginTime\030\014 \001(\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3300_ADHENCIFKNI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3300_ADHENCIFKNI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3300_ADHENCIFKNI_descriptor,
        new java.lang.String[] { "TimeStamp", "ControllerId", "BeginTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
