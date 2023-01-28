// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonEntryCond.proto

public final class DungeonEntryCondOuterClass {
  private DungeonEntryCondOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonEntryCondOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonEntryCond)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.DungeonEntryBlockReason condReason = 14;</code>
     * @return The enum numeric value on the wire for condReason.
     */
    int getCondReasonValue();
    /**
     * <code>.DungeonEntryBlockReason condReason = 14;</code>
     * @return The condReason.
     */
    DungeonEntryBlockReasonOuterClass.DungeonEntryBlockReason getCondReason();

    /**
     * <code>uint32 param1 = 12;</code>
     * @return The param1.
     */
    int getParam1();
  }
  /**
   * Protobuf type {@code DungeonEntryCond}
   */
  public static final class DungeonEntryCond extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonEntryCond)
      DungeonEntryCondOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonEntryCond.newBuilder() to construct.
    private DungeonEntryCond(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonEntryCond() {
      condReason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonEntryCond();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonEntryCond(
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
            case 96: {

              param1_ = input.readUInt32();
              break;
            }
            case 112: {
              int rawValue = input.readEnum();

              condReason_ = rawValue;
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
      return DungeonEntryCondOuterClass.internal_static_DungeonEntryCond_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DungeonEntryCondOuterClass.internal_static_DungeonEntryCond_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DungeonEntryCondOuterClass.DungeonEntryCond.class, DungeonEntryCondOuterClass.DungeonEntryCond.Builder.class);
    }

    public static final int CONDREASON_FIELD_NUMBER = 14;
    private int condReason_;
    /**
     * <code>.DungeonEntryBlockReason condReason = 14;</code>
     * @return The enum numeric value on the wire for condReason.
     */
    @java.lang.Override public int getCondReasonValue() {
      return condReason_;
    }
    /**
     * <code>.DungeonEntryBlockReason condReason = 14;</code>
     * @return The condReason.
     */
    @java.lang.Override public DungeonEntryBlockReasonOuterClass.DungeonEntryBlockReason getCondReason() {
      @SuppressWarnings("deprecation")
      DungeonEntryBlockReasonOuterClass.DungeonEntryBlockReason result = DungeonEntryBlockReasonOuterClass.DungeonEntryBlockReason.valueOf(condReason_);
      return result == null ? DungeonEntryBlockReasonOuterClass.DungeonEntryBlockReason.UNRECOGNIZED : result;
    }

    public static final int PARAM1_FIELD_NUMBER = 12;
    private int param1_;
    /**
     * <code>uint32 param1 = 12;</code>
     * @return The param1.
     */
    @java.lang.Override
    public int getParam1() {
      return param1_;
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
      if (param1_ != 0) {
        output.writeUInt32(12, param1_);
      }
      if (condReason_ != DungeonEntryBlockReasonOuterClass.DungeonEntryBlockReason.DUNGEON_ENTRY_BLOCK_REASON_NONE.getNumber()) {
        output.writeEnum(14, condReason_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (param1_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, param1_);
      }
      if (condReason_ != DungeonEntryBlockReasonOuterClass.DungeonEntryBlockReason.DUNGEON_ENTRY_BLOCK_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(14, condReason_);
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
      if (!(obj instanceof DungeonEntryCondOuterClass.DungeonEntryCond)) {
        return super.equals(obj);
      }
      DungeonEntryCondOuterClass.DungeonEntryCond other = (DungeonEntryCondOuterClass.DungeonEntryCond) obj;

      if (condReason_ != other.condReason_) return false;
      if (getParam1()
          != other.getParam1()) return false;
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
      hash = (37 * hash) + CONDREASON_FIELD_NUMBER;
      hash = (53 * hash) + condReason_;
      hash = (37 * hash) + PARAM1_FIELD_NUMBER;
      hash = (53 * hash) + getParam1();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static DungeonEntryCondOuterClass.DungeonEntryCond parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DungeonEntryCondOuterClass.DungeonEntryCond parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DungeonEntryCondOuterClass.DungeonEntryCond parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DungeonEntryCondOuterClass.DungeonEntryCond parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DungeonEntryCondOuterClass.DungeonEntryCond parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DungeonEntryCondOuterClass.DungeonEntryCond parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DungeonEntryCondOuterClass.DungeonEntryCond parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DungeonEntryCondOuterClass.DungeonEntryCond parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static DungeonEntryCondOuterClass.DungeonEntryCond parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static DungeonEntryCondOuterClass.DungeonEntryCond parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static DungeonEntryCondOuterClass.DungeonEntryCond parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DungeonEntryCondOuterClass.DungeonEntryCond parseFrom(
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
    public static Builder newBuilder(DungeonEntryCondOuterClass.DungeonEntryCond prototype) {
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
     * Protobuf type {@code DungeonEntryCond}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonEntryCond)
        DungeonEntryCondOuterClass.DungeonEntryCondOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return DungeonEntryCondOuterClass.internal_static_DungeonEntryCond_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return DungeonEntryCondOuterClass.internal_static_DungeonEntryCond_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                DungeonEntryCondOuterClass.DungeonEntryCond.class, DungeonEntryCondOuterClass.DungeonEntryCond.Builder.class);
      }

      // Construct using DungeonEntryCondOuterClass.DungeonEntryCond.newBuilder()
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
        condReason_ = 0;

        param1_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return DungeonEntryCondOuterClass.internal_static_DungeonEntryCond_descriptor;
      }

      @java.lang.Override
      public DungeonEntryCondOuterClass.DungeonEntryCond getDefaultInstanceForType() {
        return DungeonEntryCondOuterClass.DungeonEntryCond.getDefaultInstance();
      }

      @java.lang.Override
      public DungeonEntryCondOuterClass.DungeonEntryCond build() {
        DungeonEntryCondOuterClass.DungeonEntryCond result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public DungeonEntryCondOuterClass.DungeonEntryCond buildPartial() {
        DungeonEntryCondOuterClass.DungeonEntryCond result = new DungeonEntryCondOuterClass.DungeonEntryCond(this);
        result.condReason_ = condReason_;
        result.param1_ = param1_;
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
        if (other instanceof DungeonEntryCondOuterClass.DungeonEntryCond) {
          return mergeFrom((DungeonEntryCondOuterClass.DungeonEntryCond)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(DungeonEntryCondOuterClass.DungeonEntryCond other) {
        if (other == DungeonEntryCondOuterClass.DungeonEntryCond.getDefaultInstance()) return this;
        if (other.condReason_ != 0) {
          setCondReasonValue(other.getCondReasonValue());
        }
        if (other.getParam1() != 0) {
          setParam1(other.getParam1());
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
        DungeonEntryCondOuterClass.DungeonEntryCond parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (DungeonEntryCondOuterClass.DungeonEntryCond) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int condReason_ = 0;
      /**
       * <code>.DungeonEntryBlockReason condReason = 14;</code>
       * @return The enum numeric value on the wire for condReason.
       */
      @java.lang.Override public int getCondReasonValue() {
        return condReason_;
      }
      /**
       * <code>.DungeonEntryBlockReason condReason = 14;</code>
       * @param value The enum numeric value on the wire for condReason to set.
       * @return This builder for chaining.
       */
      public Builder setCondReasonValue(int value) {
        
        condReason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.DungeonEntryBlockReason condReason = 14;</code>
       * @return The condReason.
       */
      @java.lang.Override
      public DungeonEntryBlockReasonOuterClass.DungeonEntryBlockReason getCondReason() {
        @SuppressWarnings("deprecation")
        DungeonEntryBlockReasonOuterClass.DungeonEntryBlockReason result = DungeonEntryBlockReasonOuterClass.DungeonEntryBlockReason.valueOf(condReason_);
        return result == null ? DungeonEntryBlockReasonOuterClass.DungeonEntryBlockReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.DungeonEntryBlockReason condReason = 14;</code>
       * @param value The condReason to set.
       * @return This builder for chaining.
       */
      public Builder setCondReason(DungeonEntryBlockReasonOuterClass.DungeonEntryBlockReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        condReason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.DungeonEntryBlockReason condReason = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCondReason() {
        
        condReason_ = 0;
        onChanged();
        return this;
      }

      private int param1_ ;
      /**
       * <code>uint32 param1 = 12;</code>
       * @return The param1.
       */
      @java.lang.Override
      public int getParam1() {
        return param1_;
      }
      /**
       * <code>uint32 param1 = 12;</code>
       * @param value The param1 to set.
       * @return This builder for chaining.
       */
      public Builder setParam1(int value) {
        
        param1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param1 = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam1() {
        
        param1_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonEntryCond)
    }

    // @@protoc_insertion_point(class_scope:DungeonEntryCond)
    private static final DungeonEntryCondOuterClass.DungeonEntryCond DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new DungeonEntryCondOuterClass.DungeonEntryCond();
    }

    public static DungeonEntryCondOuterClass.DungeonEntryCond getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonEntryCond>
        PARSER = new com.google.protobuf.AbstractParser<DungeonEntryCond>() {
      @java.lang.Override
      public DungeonEntryCond parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonEntryCond(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DungeonEntryCond> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonEntryCond> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public DungeonEntryCondOuterClass.DungeonEntryCond getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonEntryCond_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonEntryCond_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026DungeonEntryCond.proto\032\035DungeonEntryBl" +
      "ockReason.proto\"P\n\020DungeonEntryCond\022,\n\nc" +
      "ondReason\030\016 \001(\0162\030.DungeonEntryBlockReaso" +
      "n\022\016\n\006param1\030\014 \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          DungeonEntryBlockReasonOuterClass.getDescriptor(),
        });
    internal_static_DungeonEntryCond_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonEntryCond_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonEntryCond_descriptor,
        new java.lang.String[] { "CondReason", "Param1", });
    DungeonEntryBlockReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
