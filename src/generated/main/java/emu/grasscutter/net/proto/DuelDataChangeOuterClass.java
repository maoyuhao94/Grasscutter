// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DuelDataChange.proto

public final class DuelDataChangeOuterClass {
  private DuelDataChangeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DuelDataChangeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DuelDataChange)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 round = 8;</code>
     * @return The round.
     */
    int getRound();
  }
  /**
   * Protobuf type {@code DuelDataChange}
   */
  public static final class DuelDataChange extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DuelDataChange)
      DuelDataChangeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DuelDataChange.newBuilder() to construct.
    private DuelDataChange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DuelDataChange() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DuelDataChange();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DuelDataChange(
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
            case 64: {

              round_ = input.readUInt32();
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
      return DuelDataChangeOuterClass.internal_static_DuelDataChange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DuelDataChangeOuterClass.internal_static_DuelDataChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DuelDataChangeOuterClass.DuelDataChange.class, DuelDataChangeOuterClass.DuelDataChange.Builder.class);
    }

    public static final int ROUND_FIELD_NUMBER = 8;
    private int round_;
    /**
     * <code>uint32 round = 8;</code>
     * @return The round.
     */
    @java.lang.Override
    public int getRound() {
      return round_;
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
      if (round_ != 0) {
        output.writeUInt32(8, round_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (round_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, round_);
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
      if (!(obj instanceof DuelDataChangeOuterClass.DuelDataChange)) {
        return super.equals(obj);
      }
      DuelDataChangeOuterClass.DuelDataChange other = (DuelDataChangeOuterClass.DuelDataChange) obj;

      if (getRound()
          != other.getRound()) return false;
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
      hash = (37 * hash) + ROUND_FIELD_NUMBER;
      hash = (53 * hash) + getRound();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static DuelDataChangeOuterClass.DuelDataChange parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DuelDataChangeOuterClass.DuelDataChange parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DuelDataChangeOuterClass.DuelDataChange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DuelDataChangeOuterClass.DuelDataChange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DuelDataChangeOuterClass.DuelDataChange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DuelDataChangeOuterClass.DuelDataChange parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DuelDataChangeOuterClass.DuelDataChange parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DuelDataChangeOuterClass.DuelDataChange parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static DuelDataChangeOuterClass.DuelDataChange parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static DuelDataChangeOuterClass.DuelDataChange parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static DuelDataChangeOuterClass.DuelDataChange parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DuelDataChangeOuterClass.DuelDataChange parseFrom(
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
    public static Builder newBuilder(DuelDataChangeOuterClass.DuelDataChange prototype) {
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
     * Protobuf type {@code DuelDataChange}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DuelDataChange)
        DuelDataChangeOuterClass.DuelDataChangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return DuelDataChangeOuterClass.internal_static_DuelDataChange_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return DuelDataChangeOuterClass.internal_static_DuelDataChange_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                DuelDataChangeOuterClass.DuelDataChange.class, DuelDataChangeOuterClass.DuelDataChange.Builder.class);
      }

      // Construct using DuelDataChangeOuterClass.DuelDataChange.newBuilder()
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
        round_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return DuelDataChangeOuterClass.internal_static_DuelDataChange_descriptor;
      }

      @java.lang.Override
      public DuelDataChangeOuterClass.DuelDataChange getDefaultInstanceForType() {
        return DuelDataChangeOuterClass.DuelDataChange.getDefaultInstance();
      }

      @java.lang.Override
      public DuelDataChangeOuterClass.DuelDataChange build() {
        DuelDataChangeOuterClass.DuelDataChange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public DuelDataChangeOuterClass.DuelDataChange buildPartial() {
        DuelDataChangeOuterClass.DuelDataChange result = new DuelDataChangeOuterClass.DuelDataChange(this);
        result.round_ = round_;
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
        if (other instanceof DuelDataChangeOuterClass.DuelDataChange) {
          return mergeFrom((DuelDataChangeOuterClass.DuelDataChange)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(DuelDataChangeOuterClass.DuelDataChange other) {
        if (other == DuelDataChangeOuterClass.DuelDataChange.getDefaultInstance()) return this;
        if (other.getRound() != 0) {
          setRound(other.getRound());
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
        DuelDataChangeOuterClass.DuelDataChange parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (DuelDataChangeOuterClass.DuelDataChange) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int round_ ;
      /**
       * <code>uint32 round = 8;</code>
       * @return The round.
       */
      @java.lang.Override
      public int getRound() {
        return round_;
      }
      /**
       * <code>uint32 round = 8;</code>
       * @param value The round to set.
       * @return This builder for chaining.
       */
      public Builder setRound(int value) {
        
        round_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 round = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRound() {
        
        round_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DuelDataChange)
    }

    // @@protoc_insertion_point(class_scope:DuelDataChange)
    private static final DuelDataChangeOuterClass.DuelDataChange DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new DuelDataChangeOuterClass.DuelDataChange();
    }

    public static DuelDataChangeOuterClass.DuelDataChange getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DuelDataChange>
        PARSER = new com.google.protobuf.AbstractParser<DuelDataChange>() {
      @java.lang.Override
      public DuelDataChange parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DuelDataChange(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DuelDataChange> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DuelDataChange> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public DuelDataChangeOuterClass.DuelDataChange getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DuelDataChange_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DuelDataChange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024DuelDataChange.proto\"\037\n\016DuelDataChange" +
      "\022\r\n\005round\030\010 \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DuelDataChange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DuelDataChange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DuelDataChange_descriptor,
        new java.lang.String[] { "Round", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
